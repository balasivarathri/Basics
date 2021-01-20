package Constructor;

public class Student {
int rollno;
float avg;
String name;
Student(int r, float a, String n){
	rollno = r;
	avg = a;
	name = n;
}
Student(int r,String n){
	rollno = r;
	name = n;
}
Student(int r){
	rollno = r;
	}
void display() {
	System.out.println("Student Details are :" + rollno + " "+ avg+" "+ name);
}
}

