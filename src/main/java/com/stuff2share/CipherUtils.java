package com.stuff2share;

import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;

/**
 * Encryption Demo
 *
 */
public class CipherUtils {

    public static String encrypt (String plainText, String password, String salt) {
        TextEncryptor encryptor = Encryptors.text(password, salt);
        return  encryptor.encrypt(plainText);
    }


    public static String decrypt (String encryptedText, String password, String salt) {
        TextEncryptor encryptor = Encryptors.text(password, salt);
        return  encryptor.decrypt(encryptedText);
    }

}
