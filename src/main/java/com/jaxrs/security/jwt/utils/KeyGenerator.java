package com.jaxrs.security.jwt.utils;

import java.security.Key;

/**
 * Key Generator interface for the token generation
 * @author cmichaud
 *
 */
public interface KeyGenerator {

    Key generateKey();
    
}
