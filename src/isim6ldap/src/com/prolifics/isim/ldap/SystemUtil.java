package com.prolifics.isim.ldap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import org.cote.accountmanager.beans.SecurityBean;
import org.cote.accountmanager.factory.SecurityFactory;
import org.cote.accountmanager.util.BinaryUtil;
import org.cote.accountmanager.util.SecurityUtil;

public class SystemUtil {
	private static final String cipherWrapper = "dGRwVmx0MnZaVTBVNHBoWQ==";
	
	public static boolean emitFile(String contents, String path){
		File aF = new File(path);
		boolean out_bool = false;

		try {
			if(aF.exists()) aF.delete();
			aF.createNewFile();
			FileOutputStream fos = new FileOutputStream(aF);
			fos.write(contents.getBytes("UTF-8"));
			fos.flush();
			fos.close();
			out_bool = true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error accessing file '" + path + "'");
			e.printStackTrace();
		}
		return out_bool;
	}
	
	
	public static void setEncryptedProperty(Properties props, String keyName, String keyVal){
		SecurityBean wbean = new SecurityBean();
		
		byte[] encBytes = new byte[0];
		try {
			byte[] key = BinaryUtil.fromBase64(cipherWrapper.getBytes("UTF-8"));
			SecurityFactory.getSecurityFactory().setPassKey(wbean,  key, false);
			encBytes = keyVal.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String encVal = BinaryUtil.toBase64Str(SecurityUtil.encipher(wbean, encBytes));

		props.setProperty(keyName, encVal);
	}
	
	public static String getEncryptedProperty(Properties props, String keyName){
		if(props.getProperty(keyName) == null){
			System.out.println("Null property");
			return null;
		}
		String encVal = props.getProperty(keyName);
		String decVal = null;
		SecurityBean wbean = new SecurityBean();
		try {
			byte[] key = BinaryUtil.fromBase64(cipherWrapper.getBytes("UTF-8"));
			byte[] encBytes = BinaryUtil.fromBase64(encVal.getBytes("UTF-8"));
			SecurityFactory.getSecurityFactory().setPassKey(wbean,  key, false);
			
			decVal = new String(SecurityUtil.decipher(wbean, encBytes));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		return decVal;
		
	}
	public static boolean saveProps(Properties props, String path){
		File f =new File(path);
		boolean out_bool = false;
			try {
				if(f.exists()) f.delete();
				FileOutputStream fos = new FileOutputStream(f);
				props.store(fos, "SystemUtil");
				fos.flush();
				fos.close();
				out_bool = true;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return out_bool;
	}
	public static Properties getProps(String path){
		
		File f =new File(path);
		Properties props = new Properties();
			try {
				if(f.exists() == false) f.createNewFile();
				FileInputStream fis = new FileInputStream(f);
				props.load(fis);
				fis.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return props;
	}
	
	public static Properties getLogProps(){
		Properties logProps = new Properties();
		try {
			logProps.load(ClassLoader.getSystemResourceAsStream("logging.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return logProps;
	}
}
