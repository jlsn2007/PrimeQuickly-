package Modelo;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class Encriptacion {
    
    public static String Sha256(String password) {
        
	try {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
                
                byte[] hashBytes = digest.digest(password.getBytes());
                
                StringBuilder sb = new StringBuilder();
                
                for(byte b : hashBytes) {
		sb.append(String.format("%02x", b));
	}
                
                return sb.toString();
                
	}
	catch (NoSuchAlgorithmException e) {
		throw new RuntimeException("No se encriptó la contraseña debido a este error:", e);
	}
	
	
    }
}
