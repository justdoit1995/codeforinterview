package jwttest;

import java.util.Date;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

//加密
public final class Encrypt {
	public String getToken(final boolean isVip
			,final String username
			,final String name) {
		String token = null;
		try {
			Date expiresAt=new Date(System.currentTimeMillis()+24L*60L*3600L*100L);
			token=JWT.create().withIssuer("auth0")
					.withClaim("isVip", isVip)
					.withClaim("username", username)
					.withClaim("name", name)
					.withExpiresAt(expiresAt)
					.sign(Algorithm.HMAC256("mysecret"));
		}catch(Exception e) {
			
					
		}
		
		
		return token;
		
	}
}
