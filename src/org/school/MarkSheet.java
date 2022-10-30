package org.school;

import java.util.Scanner;

public class MarkSheet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String UrName = scan.nextLine();
		String UrId = scan.nextLine();
		long tamil = scan.nextLong();
		long english = scan.nextLong();
		long math = scan.nextLong();
		long science = scan.nextLong();
		long social = scan.nextLong();
		long Ai = scan.nextLong();
		
		System.out.println("Your Name:"+UrName);
		System.out.println("Your Id  :"+UrId);
		System.out.println("Tamil    :"+tamil);
		System.out.println("English  :"+english);
		System.out.println("Math     :"+math);
		System.out.println("Science  :"+science);
		System.out.println("Social   :"+social);
		System.out.println("AI   :"+Ai);
		
		System.out.println("Total    :"+(tamil+english+math+science+social+Ai));
		System.out.println("Avg      :"+((tamil+english+math+science+social+Ai)/6));
		
	}

}
