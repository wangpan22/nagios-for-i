package com.ibm.nagios;

public class Version {
	private static String VERSION = "2.1.0";
	
	public static void main(String[] argv) {
		System.out.println("Nagios plugin for i version: " + VERSION);
		System.out.println("Released on 04/11/2019");
	}
}