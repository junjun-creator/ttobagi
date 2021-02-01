package com.ttobagi.web.controller.user;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ttobagi.web.entity.Couple;
import com.ttobagi.web.entity.Memory;
import com.ttobagi.web.service.CoupleService;
import com.ttobagi.web.service.MemoryService;

@Controller
@RequestMapping("/user/memory")
public class MemoryController {
	
	@Autowired
	private MemoryService service;
	
	@Autowired
	private CoupleService coupleService;
	
	@RequestMapping("list")
	public String list(Model model, HttpSession session){
		int id= (int)session.getAttribute("id");
		List<Couple> coupleList = coupleService.getList(id);
		int coupleId = coupleList.get(0).getId();
		
		List<Memory> list = service.getList(coupleId);
		
		model.addAttribute("coupleId",coupleId);
		model.addAttribute("list", list);
		
		return "user.memory.list";
	}
	
	public static String getUuid() {
		return UUID.randomUUID().toString().replaceAll("-", ""); 
	}
	
	@PostMapping("reg")
	public String regs(HttpServletRequest request, 
			@RequestParam("file") MultipartFile mfile, 
			@RequestParam("content") String content,
			@RequestParam("coupleId") int cId) throws IllegalStateException, IOException{
		//웹서비스 디렉토리의 물리적 경로 구하기
		String realPath = request.getSession().getServletContext().getRealPath("/resources/static/images/user/memory/upload");
		//받아온 파일의 이름
		String OriginFileName= mfile.getOriginalFilename();
		//파일이름 암호화하기
		String saveFileName = getUuid() + OriginFileName;
		//물리적 경로에 파일 저장하기
		mfile.transferTo(new File(realPath+File.separator+saveFileName));
		
		content = content.replace("\r\n", "<br >");
		
		service.insert(content,saveFileName,cId); 
		
	
		return "redirect:list";
	}
}
