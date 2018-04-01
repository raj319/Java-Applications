package studentdatabase;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Student s1=new Student("raj kiran",1);
		System.out.println("Enter your input");
		Scanner sn=new Scanner(System.in);
		int ch=sn.nextInt();
		s1.enrollCourse(ch);
		s1.status();
		s1.dropCourse(ch);
		s1.status();
	}
}
