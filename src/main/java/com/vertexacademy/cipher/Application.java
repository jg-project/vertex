package com.vertexacademy.cipher;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.Key;
import java.security.MessageDigest;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import static javax.crypto.Cipher.*;

/**
 * Created by user on 28.05.16.
 */
public class Application {

    public static String decrypt(String fileName, String password) {
        try {
            Cipher aes = getInstance("AES");
            byte[] pass = MessageDigest.getInstance("MD5").digest(password.getBytes());
            Key key = new SecretKeySpec(pass, "AES");

            aes.init(DECRYPT_MODE, key);
            GZIPInputStream zis = new GZIPInputStream(new CipherInputStream(new FileInputStream(fileName), aes));
            BufferedReader in = new BufferedReader(new InputStreamReader(zis, "UTF-8"));

            StringBuffer result = new StringBuffer();
            String s = null;
            while ((s = in.readLine()) != null) {
                result.append(s + "\n");
            }
            in.close();
            return result.toString();
        } catch (Exception e) {
            System.out.println("We don't care but:" + e.getMessage());
            throw new RuntimeException(e);
        }

    }


    public static void encrypt(String fileName, String password, String message) {
        try {
            Cipher aes = getInstance("AES");
            byte[] pass = MessageDigest.getInstance("MD5").digest(password.getBytes());
            Key key = new SecretKeySpec(pass, "AES");

            aes.init(ENCRYPT_MODE, key);
            GZIPOutputStream zos = new GZIPOutputStream(
                    new CipherOutputStream(
                            new FileOutputStream(fileName), aes));

            zos.write(message.getBytes("UTF-8"));
            zos.flush();
            zos.close();
        } catch (Exception e) {
            System.out.println("We don't care but:" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String message = "1234567890\n0987654321";
        System.out.println(message);
        encrypt("ciphered", "pass", message);
        System.out.println(">" + decrypt("ciphered", "pass") + "<");
    }


    public static String decrypt(ByteArrayInputStream bais, String password) {
        try {
            Cipher aes = getInstance("AES");
            byte[] pass = MessageDigest.getInstance("MD5").digest(password.getBytes());
            Key key = new SecretKeySpec(pass, "AES");

            aes.init(DECRYPT_MODE, key);
            GZIPInputStream zis = new GZIPInputStream(new CipherInputStream(bais, aes));
            BufferedReader in = new BufferedReader(new InputStreamReader(zis));

            StringBuffer result = new StringBuffer();
            String s = null;
            while ((s = in.readLine()) != null) {
                result.append(s + "\n");
            }
            in.close();
            return result.toString();
        } catch (Exception e) {
            System.out.println("We don't care but:" + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
