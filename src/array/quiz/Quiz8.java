package array.quiz;

/*
 * 학생(Student)을 정의하는 클래스를 만드세요.
 * 속성: 학번, 이름
 * 3개 크기의 Student형 배열을 생성하세요.
 * 배열에 3명의 학생정보를 저장하세요.
 * 그리고 배열에 저장된 모든 학생의 정보를 출력하세요.
 * */
public class Quiz8 {
	
	public static void main(String[] args) {
		
		Student[] students = new Student[3]; 
		students[0] = new Student(1001, "James"); 
		students[1] = new Student(1002, "Tomas");
		students[2] = new Student(1003, "Edward");
		
		for(int i =0; i<students.length; i++) { 
			students[i].showInfo();
		}
	}
}

class Student {
	
	int studentID; 
	String name; 
	
	public Student(int studentID, String name) {
		
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showInfo() {
		
		System.out.println( "학생의 학번 : " + studentID + ", " + "학생의 이름 :" + name);
		
	}
}
