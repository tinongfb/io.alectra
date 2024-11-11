package com.mycompany.app;

public class StringUtils 
{
	public boolean equalStrings(String str1, String str2) {
		if(str1 == null || str2 == null) {
			return false;
		}
		return str1.equals(str2);
    }
}

