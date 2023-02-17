package com.mifel.servicio.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.servicio.model.JwtUser;
import com.mifel.servicio.model.Token;
import com.mifel.servicio.security.JwtGenerator;

@RestController
@RequestMapping("/token")
public class TokenRest {

	private JwtGenerator jwtGenerator;

	public TokenRest(JwtGenerator jwtGenerator) {
		this.jwtGenerator = jwtGenerator;
	}

	@PostMapping
	public ResponseEntity<Token> generate(@RequestBody final JwtUser jwtUser) {
		try {
			Token token = new Token();
			String tokenF =jwtGenerator.generate(jwtUser); 
			token.setToken(tokenF);
			token.setUserName(jwtUser.getUserName());
			token.setId(jwtUser.getId());
			token.setRole(jwtUser.getRole());
			return new ResponseEntity<Token>(token,null,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Token>(null,null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
