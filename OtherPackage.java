package assignment1.other;

import assignment1.protect.ProtectedMethod;

public class OtherPackage extends ProtectedMethod{
	
	public OtherPackage() {
		System.out.println("Class OtherPackage in package \'assignment1.other\'");
	}
	
	public void callMethod() {
		System.out.println("Calling protected method.");
		super.protectMethod();
	}
	
	public static void main(String[] args) {
		OtherPackage p = new OtherPackage();
		p.callMethod();
	}
}

