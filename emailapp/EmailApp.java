package emailapp;

public class EmailApp {
	public static void main(String[] args){
		StringBuilder firstName=new StringBuilder("Raj");
		StringBuilder lastName=new StringBuilder("Uppari");
		StringBuilder department=new StringBuilder("");
		EmailUtil eu=new EmailUtil(firstName,lastName,department);
		eu.createEmail();
		eu.setMailBoxCapacity(100);
		eu.setPassword(new StringBuilder("rajkiran1223"));
		eu.setAlternateEmail(new StringBuilder("raj.kiran@yahoo.com"));
		
		System.out.println(eu.showInfo());
	} 
}
