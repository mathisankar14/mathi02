package org.school;

import java.util.Scanner;

public class scann {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name");
		sc.nextLine();
		System.out.println("Gender");
		sc.next();
		System.out.println("Address");
		sc.nextLine();
		System.out.println(sc);
	}

}
