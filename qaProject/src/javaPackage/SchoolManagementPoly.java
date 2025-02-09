package javaPackage;

public class SchoolManagementPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new PrimaryStudent();
        Student student2 = new HighSchoolStudent();
        Student student3 = new CollegeStudent();
        
     // Method Overriding: Call describe method (Polymorphism: each subclass provides its own implementation)
        student1.describe();
        student2.describe();
        student3.describe();
        
     // Method Overloading: Calculate study hours
        System.out.println("Primary student study hours (5 subjects): " + student1.studyHours(5));
        System.out.println("High school student study hours (5 subjects): " + student2.studyHours(5));
        System.out.println("College student study hours (5 subjects, 4 hours per subject): " + student3.studyHours(5, 4));
	}

}

	class Student
	{
		 public void describe() {
		     System.out.println("I am a student.");
		 }
		 public int studyHours(int subjects) {
		     return subjects * 2;  // Assuming each subject takes 2 hours
		 }
		 public int studyHours(int subjects, int hoursPerSubject) {
		     return subjects * hoursPerSubject;
		 }
		 
	}
	
	
	
	class PrimaryStudent extends Student
	{
		 public void describe() {
		     System.out.println("I am a PrimaryStudent.");
		 }
		 
		 
	}
	
	
	
	class HighSchoolStudent extends Student
	{
		 public void describe() {
		     System.out.println("I am a HighSchoolStudent.");
		 }
		
		 
	}
	
	
	
	class CollegeStudent extends Student
	{
		 public void describe() {
		     System.out.println("I am a CollegeStudent.");
		 }
		 
		 
	}
	
	