package com.careerit.cj.day18;

public final class MaskUtil {

	private MaskUtil() {
	}

	public static String maskAccountNumber(long accNumber) {
		String str = Long.valueOf(accNumber).toString();
		String maskedValue = "*************" + str.substring(str.length() - 3);
		return maskedValue;
	}

	public static String maskMobileNumber(long mobile) {
		String str = Long.valueOf(mobile).toString();
		String maskedValue = "*************" + str.substring(str.length() - 4);
		return maskedValue;
	}

}
