package application;

import java.util.Date;

import model.entities.Student;
import model.entities.Teacher;

public class Program {

	public static void main(String[] args) {
		
		Teacher obj = new Teacher(1, "Francisco", new Date(), "12345678921", "987456231", 12000.00 );
		
		Student student = new Student(21, "Bob", new Date(), "12345678954", "985647521", "10");
		
		System.out.println(obj);
		System.out.println(student);

	}

}
