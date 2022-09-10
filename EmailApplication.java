package emailapp;

import java.util.Scanner;

public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name: ");
		 String f=sc.nextLine();
		 System.out.println("Enter Last Name: ");
		 String l=sc.nextLine();
		EmailApp xy= new EmailApp(f, l);
		
		

	}

}
