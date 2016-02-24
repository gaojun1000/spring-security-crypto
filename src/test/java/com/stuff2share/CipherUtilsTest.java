package com.stuff2share;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.security.crypto.keygen.KeyGenerators;

import java.security.Security;

/**
 * Unit test for simple CipherUtils.
 */
public class CipherUtilsTest {

    @Test
    public void testEncryptDecrypt() {
        final String salt = KeyGenerators.string().generateKey();
        final String password = "secret-key";

        final String plainText = "somethingSuperSecret";
        String encryptedText = CipherUtils.encrypt(plainText, password, salt);

        assertEquals(plainText, CipherUtils.decrypt(encryptedText, password, salt));
    }

}
