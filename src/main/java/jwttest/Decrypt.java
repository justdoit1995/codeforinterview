package jwttest;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

//解密
public final class Decrypt {
	public DecodedJWT deToken(final String token) {
		DecodedJWT jwt=null;
		try {
			JWTVerifier verifier=JWT
					.require(Algorithm.HMAC256("mysecret"))
					.withIssuer("auth0")
					.build();
			jwt=verifier.verify(token);
		}catch(Exception e) {
			
		}
		return jwt;
	}
}
