package com.hkprogrammer.ws.providers;

import java.security.PublicKey;

import org.springframework.stereotype.Component;
	
public interface KeyProvider {

	PublicKey getPublicKey(String keyId);
	
}
