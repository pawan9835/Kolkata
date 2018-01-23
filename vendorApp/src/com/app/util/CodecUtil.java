package com.app.util;

import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Component;

@Component
public class CodecUtil {

	/**
	 * This method is used to
	 * convert readable str to
	 * unreadable str
	 */
	public String doEncode(String normalStr){
		byte[] arr=normalStr.getBytes();
		byte[] encArr=Base64.encodeBase64(arr);
		String encStr=new String(encArr);
		return encStr;
	}
	/**
	 * This method is used to
	 * convert unreadable str
	 * to readable str 
	 */
	public String doDecode(String encStr){
		byte[] encArr=encStr.getBytes();
		byte[] arr=Base64.decodeBase64(encArr);
		String nrmlStr=new String(arr);
		return nrmlStr;
	}
}
