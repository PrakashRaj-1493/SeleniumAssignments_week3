package week3.day1.assignments;

public class StudentDetails {

	public void getStudentInfo() {
		System.out.println("Provide the essential student details");
	}

	public void getStudentInfo(int id) {
		System.out.println("The student id is"+" "+id);

	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("The student id is"+" "+id);
		System.out.println("Student Name is "+name);


	}

	public void getStudentInfo(String name) {
		System.out.println("Student Name is Ram");

	}

	public void getStudentInfo(String email, Long mob) {
		System.out.println("Email of the student is"+" "+email);
		System.out.println("Mobile number of the student is"+" "+mob);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails obj=new StudentDetails();
		obj.getStudentInfo();
		obj.getStudentInfo(56897);
		obj.getStudentInfo(555, "Vidhya");
		obj.getStudentInfo("name");
		obj.getStudentInfo("ram@gmail.com", 7708888280l);
	}

}
