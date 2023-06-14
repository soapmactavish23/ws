package com.hkprogrammer.ws.providers;

import java.security.PublicKey;

public interface KeyProvider {

	PublicKey getPublicKey(String keyId);
	
}
