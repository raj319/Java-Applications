package studentdatabase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Student {
	private String name;
	private int gradeLevel;
	private String uniqueId;
	private List<String> courses;
	private List<String> enrolled;
	private static int seq=1234;
	private int balance;
	String getUniqueID(int gradeLevel){
		seq++;
		return gradeLevel+"" +seq;
	}
	Student(String name,int gradeLevel){
		this.name=name;
		this.balance=0;
		this.enrolled=new LinkedList<>();
		this.gradeLevel=gradeLevel;
		this.uniqueId=getUniqueID(gradeLevel);
		this.courses=new ArrayList<>();
		this.courses.add("History");
		this.courses.add("Mathematics");
		this.courses.add("English");
		this.courses.add("Chemistry");
		this.courses.add("Computer Science");
		System.out.println("Courses offered are");
		System.out.println("1) History");
		System.out.println("2) Mathematics");
		System.out.println("3) English");
		System.out.println("4) Chemistry");
		System.out.println("5) Computer Science");

	}
	public void enrollCourse(int ch){
		System.out.println("Enrolled in class: "+courses.get(ch-1));
		enrolled.add(courses.get(ch-1));
		balance=balance+600;
	}
	public void dropCourse(int ch){
		if(enrolled.contains(courses.get(ch-1))){
			System.out.println("Dropped class: "+courses.get(ch-1));
			enrolled.remove(courses.get(ch-1));
			balance=balance-600;
		}
	}
	public void payTuition(int amount){
		balance=balance-amount;
		System.out.println("Remaining balance is "+balance);
	}
	private void displayEnrolled(){
		for(String i: enrolled){
			System.out.println(i);
		}
	}
	public int getBalance(){
		return this.balance;
	}
	public void status(){
		System.out.println("Unique ID is: "+uniqueId);
		System.out.println( "name: "+name+"\ngrade level: "+gradeLevel);
		System.out.println("Courses enrolled are: ");
		displayEnrolled();
		System.out.println("Balance to be paid is: "+getBalance()+"\n");
	}
}