package org.test;

public class Web {
	private void login() {
		System.out.println("user has successfully logged in the application");
	}
	private void Signup() {
		System.out.println("Username");
		System.out.println("password");
	}
	private void Logout() {
		System.out.println("Closing the browser");
	}
	
	
	public static void main(String[] args) {
		Web w=new Web();
		w.login();
		w.Signup();
	}
	

}
