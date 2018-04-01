package emailapp;

public class EmailUtil {
	private StringBuilder fName;
	private StringBuilder lName;
	private StringBuilder department;
	private StringBuilder email;
	final String company="Oracle";
	private StringBuilder alternateEmail;
	private StringBuilder password;
	private int mailBoxCapacity;
	EmailUtil(StringBuilder fName,StringBuilder lName,StringBuilder department){
		this.fName=new StringBuilder(fName);
		this.lName=new StringBuilder(lName);
		this.department=new StringBuilder(department);
		alternateEmail=new StringBuilder();
		password=new StringBuilder();
	}
	void createEmail(){
		email=new StringBuilder();
		email.append(fName);
		email.append(".");
		email.append(lName);
		email.append("@");
		if(!(department.length()==0)){
			email.append(department);
			email.append(".");
		}
		email.append(company);
		email.append(".com");
		password=createPassword(fName,lName);
		System.out.println("Your password is "+password);
		mailBoxCapacity=10;
	}
	private StringBuilder createPassword(StringBuilder fName2, StringBuilder lName2) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder();
		for(int i=10;i<20;i++){
			sb.append(i%fName2.length());
		}
		return new StringBuilder().append(fName2.charAt(0)+lName2.charAt(0)).append(sb);
	}
	public void setPassword(StringBuilder sb){
		password=sb;
		System.out.println("Password changed to "+password);
	}
	public void setMailBoxCapacity(int capacity){
		mailBoxCapacity=capacity;
	}
	public void setAlternateEmail(StringBuilder alternate){
		alternateEmail=alternate;
	}
	public StringBuilder getName(){
		return new StringBuilder().append(fName+" ").append(lName);
	}
	public StringBuilder getEmail(){
		return new StringBuilder().append(email);
	}
	public int getMailBoxCapacity(){
		return mailBoxCapacity;
	}
	public StringBuilder getAlternateEmail() {
		return alternateEmail;
	}
	public String showInfo() {
		// TODO Auto-generated method stub
		return "Name is: "+fName.toString()+" "+lName.toString()+"\n"+"Company: "+company+"\n"+"Mail Box Capacity: "+mailBoxCapacity;
		
	}
}
