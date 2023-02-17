package com.mifel.servicio.security;

import org.springframework.stereotype.Component;

import com.mifel.servicio.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {

	public String generate(JwtUser jtwUser) {
		Claims claims = Jwts.claims()
				.setSubject(jtwUser.getUserName());
		claims.put("userId", String.valueOf(jtwUser.getId()));
		claims.put("role", jtwUser.getRole());
				
		return Jwts.builder().setClaims(claims)
				.signWith(SignatureAlgorithm.HS512,"youtube")
				.compact();
	}

}
