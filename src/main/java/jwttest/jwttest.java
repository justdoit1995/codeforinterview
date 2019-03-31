package jwttest;

import com.auth0.jwt.interfaces.DecodedJWT;

public class jwttest {
	public static void main(String args[]) {
		Encrypt encrypt=new Encrypt();
		String token=encrypt
				.getToken(true, "chenguanfeng", "陈关锋");
		System.out.println("token:"+token);
		Decrypt decrypt=new Decrypt();
		DecodedJWT jwt=decrypt.deToken(token);
		System.out.println("issuer:"+jwt.getIssuer());
		System.out.println("isVip:"+jwt.getClaim("isVip").asBoolean());
		System.out.println("username:"+jwt.getClaim("username").asString());
		System.out.println("name:"+jwt.getClaim("name").asString());
		System.out.println("过期时间 :"+jwt.getExpiresAt());
	}
}
