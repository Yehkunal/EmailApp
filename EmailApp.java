package emailapp;

import java.util.Scanner;
public class EmailApp {
	public static String capsule;
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternameEmail;
	private int defaultLength=8;
	private String companyPrefix=".companyname.com";
	
	public EmailApp(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ACCOUNT CREATED: "+this.firstname+" "+this.lastname);
		
		this.department=setDepartment();
		System.out.println("Your Department: "+department);
		String pass=this.SetPassword(defaultLength); 
		System.out.println("Your Default Password: "+pass);
		
		
		String email= firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department.toLowerCase()+companyPrefix;
		System.out.println("Your EMAIL ID: "+email);
		
		
		System.out.println("Do you want to change password? (y/n)");
		String ch=sc.nextLine();
		
		if(ch.toLowerCase().charAt(0)=='y') {
			String newPassword=changePassword(pass);
			
			System.out.println("Your new password: "+newPassword);
		}
	}
	
	
	public static String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n 1 for Sales \n2 for Development \n3 for Accounting \n0 for None");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your code: ");
		int code=sc.nextInt();
		
		if(code==1) return "sales";
		else if(code==2) return "Development";
		else if(code==3) return "Accounting";
		else  return "";
		
	}
	
	public static String SetPassword(int len) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&!";
		char[] pass=new char[len];
		
		for(int i=0;i<len;i++) {
			int rand= (int) (Math.random()*passwordSet.length());
			pass[i]=passwordSet.charAt(rand);
		}
		return new String(pass);
	}
	
	public String changePassword(String pass) {
		Scanner sc=new Scanner(System.in);
		String ask="yes";		
		while(ask.toLowerCase().charAt(0)=='y') {
			System.out.println("Enter default Password:");
			String dpass= sc.nextLine();
		if(dpass.equals(pass)) {
			System.out.println("Enter your new Password");
			pass=sc.nextLine();
			System.out.println("Congratulations!! your password has been sucessfuly updated");	
			ask="no";
			}
		else {
			System.out.println("Sorry wrong Password!! Do you want to try again?");
			 ask=sc.nextLine(); 
			}
		}
		
		return pass;
	}
}
