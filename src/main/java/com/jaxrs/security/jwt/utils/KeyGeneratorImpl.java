package com.jaxrs.security.jwt.utils;

import java.security.Key;

import javax.crypto.spec.SecretKeySpec;
import javax.enterprise.inject.Model;
/**
 * Generates the Key for the token
 * @author cmichaud
 *
 */
@Model
public class KeyGeneratorImpl implements KeyGenerator{
	 @Override
	    public Key generateKey() {
	        String keyString = "key";
	        Key key = new SecretKeySpec(keyString.getBytes(), 0, keyString.getBytes().length, "DES");
	        return key;
	    }

}
