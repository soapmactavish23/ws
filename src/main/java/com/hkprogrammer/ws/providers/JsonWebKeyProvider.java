package com.hkprogrammer.ws.providers;

import java.net.URL;
import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;

import com.auth0.jwk.Jwk;
import com.auth0.jwk.UrlJwkProvider;

public class JsonWebKeyProvider implements KeyProvider {

	private final UrlJwkProvider provider;
	
	public JsonWebKeyProvider(@Value("${app.auth.jwks-url}") final String jwksUrl) {
		try {
			
			this.provider = new UrlJwkProvider(new URL(jwksUrl));
			
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	@Cacheable("public-key")
	@Override
	public PublicKey getPublicKey(String keyId) {
		try {
			final Jwk jwk = provider.get(keyId);
			return jwk.getPublicKey();
		} catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	
	
}
