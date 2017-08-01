package com.nexus7.encrptRSA;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
//import javax.crypto.*;


public class RSACipher {

    private final String RSA_ALGORITHM = "RSA";
    private final int KEY_SIZE = 2048;

    /** @return KeyPair */
    public static KeyPair generateRSAKeyPair() throws Exception {
    	
        KeyPairGenerator generator = KeyPairGenerator.getInstance(RSA_ALGORITHM);
        generator.initialize(KEY_SIZE);
        return generator.genKeyPair();
    }

    /** @return encryptData */
    public static byte[] encode(Key key, String plainData) {
    
    	/*public static KeyPairGenerator  getInstance(String  algorithm)
                throws NoSuchAlgorithmException 
        */ 
    	Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);

        return cipher.doFinal(plainData.getBytes("UTF-8"));
    }

    /** @return decryptData(plainData)  */
    public static String decode(Key key, String encryptData, String iv) {
        Cipher cipher = Cipher.getInstance(RSA_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(iv.getBytes()));

        return new String(cipher.doFinal(encryptData.getBytes(), "UTF-8");
    }

    public static void main(String[] args) {
        String data = "This is a original string.";

        KeyPair rsaKeyPair = generateRSAKeyPair();
        byte[] encrypted = encode(rsaKeyPair.getPrivate(), data);
        String decrypted = decode(rsaKeyPair.getPublic(), encrypted);

        assertEquals(data, decrypted);
    }
}