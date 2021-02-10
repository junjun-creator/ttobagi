package com.ttobagi.web.service.social;

import com.ttobagi.web.social.SocialLoginType;

public interface SocialOauth {
	   /**
     * 각 Social Login 페이지로 Redirect 처리할 URL Build
     * 사용자로부터 로그인 요청을 받아 Social Login Server 인증용 code 요
     */
    String getOauthRedirectURL();
 
    /**
     * API Server로부터 받은 code를 활용하여 사용자 인증 정보 요청
     * @param code API Server 에서 받아온 code
     * @return API 서버로 부터 응답받은 Json 형태의 결과를 string으로 반
     */
    String requestAccessToken(String code);
    
    
    //장황한 소셜타입 코드를 리팩토링하기위한 과정... 롬복이 안되서 이건 일단 보류하자...
    default SocialLoginType type() {
        if (this instanceof FacebookOauth) {
            return SocialLoginType.FACEBOOK;
        } else if (this instanceof GoogleOauth) {
            return SocialLoginType.GOOGLE;
        } else if (this instanceof NaverOauth) {
            return SocialLoginType.NAVER;
        } else if (this instanceof KakaoOauth) {
            return SocialLoginType.KAKAO;
        } else {
            return null;
        }
    }

	String requestUserInfo(String access_token);
}
