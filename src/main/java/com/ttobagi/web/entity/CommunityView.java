package com.ttobagi.web.entity;

import java.sql.Date;

public class CommunityView extends Community {
	private String communityType;
	private String memName;
	private String memNicName;
	private String memLoginId;
	private int fileId;
	private String fileName;
	
	public CommunityView() {
		// TODO Auto-generated constructor stub
	}
	
	public CommunityView(int id, String title, String content, int memberId, int categoryId, Date regDate, int hit,
			int recomCnt, String communityType, String memName, String memNicName, String memLoginId, int fileId,
			String fileName) {
		super(id, title, content, memberId, categoryId, regDate, hit, recomCnt);
		this.communityType = communityType;
		this.memName = memName;
		this.memNicName = memNicName;
		this.memLoginId = memLoginId;
		this.fileId = fileId;
		this.fileName = fileName;
	}

	public String getCommunityType() {
		return communityType;
	}

	public void setCommunityType(String communityType) {
		this.communityType = communityType;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemNicName() {
		return memNicName;
	}

	public void setMemNicName(String memNicName) {
		this.memNicName = memNicName;
	}

	public String getMemLoginId() {
		return memLoginId;
	}

	public void setMemLoginId(String memLoginId) {
		this.memLoginId = memLoginId;
	}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "CommunityView [communityType=" + communityType + ", memName=" + memName + ", memNicName=" + memNicName
				+ ", memLoginId=" + memLoginId + ", fileId=" + fileId + ", fileName=" + fileName + "]";
	}
}
