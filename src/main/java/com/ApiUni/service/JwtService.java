package com.ApiUni.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

	@Value("${jwt.secret.key}")
	private String secretKey;
	@Value("${jwt.secret.time.expiration}")
	private Long jwtExpiration;
	

}
