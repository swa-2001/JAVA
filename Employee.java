package org.demo;
import java.util.*;
class Employee{
	String name;
	String jobTitle;
	int salary;	
	
	Employee(String n,String j,int s){
		this.name=n;
		this.jobTitle=j;
		this.salary=s;
	}
	boolean isVowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			return true;
		}
		else {
			return false;
		}
	}
	void updateJobRole() {
		ArrayList<String> JobTitles=new ArrayList<>(1);
		JobTitles.add("Associate");
		JobTitles.add("Senior");
		JobTitles.add("Team Lead");
		JobTitles.add("Scrum master");
		JobTitles.add("Manager");
		JobTitles.add("Director");
		JobTitles.add("VicePresident");
		int idx=JobTitles.indexOf(jobTitle);
		jobTitle=JobTitles.get(idx+1);
		String Article1="an";
		String Article2="a";
		String use;
		if(isVowel(this.name.charAt(0))) {
			use=Article1;
		}
		else {
			use=Article2;
		}
		System.out.println(this.name+" is "+use+" "+jobTitle);
		
	}
	void updateSalary() {
		int raise= (salary*5)/100;
		this.salary=salary+raise;
		System.out.println(this.name+"\'s salary is "+salary+" now");
	}
}
public class demo8 {

	public static void main(String[] args) {
		Employee e1=new Employee("Swathi","Associate",600000);
		e1.updateJobRole();
		e1.updateSalary();
		Employee e2=new Employee("Sonam","Team Lead",900000);
		e2.updateJobRole();
		e2.updateSalary();
	}

}
