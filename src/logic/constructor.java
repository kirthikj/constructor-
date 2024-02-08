package logic;

public class constructor {
	
	public constructor() {
		System.out.println("default constructor");
		}
	
	public constructor(int id) {
		System.out.println("integer constructor");
		}
	
	public constructor(String name) {
		System.out.println("String constructor");
		}

	public constructor(float value) {
		System.out.println("float constructor");
		}

	public constructor(boolean condition) {
		System.out.println("boolean constructor");
		}

	public static void main(String[]args) {
		
		constructor a= new constructor();
		constructor a1= new constructor(253);
		constructor a2= new constructor("kirthik");
		constructor a3= new constructor(1235.213f);
		constructor a4= new constructor(false);
		
		
	}

	
	
	

}
