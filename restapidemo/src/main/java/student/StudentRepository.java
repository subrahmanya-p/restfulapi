package student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	List<Student> students;

	public StudentRepository() {
		students = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setAge(12);
		s1.setName("Su brahmhyaa");
		s1.setId(123);
		Student s2 = new Student();
		s2.setAge(12);
		s2.setName("Su brahmhyaa");
		s2.setId(12);
		Student s3 = new Student();
		s3.setAge(123);
		s3.setName("Subrahmhyaa");
		s3.setId(123);
		Student s4 = new Student();
		s4.setAge(12);
		s4.setName("Su brahmhyaa");
		s4.setId(1256);
		students.add(s1);
		students.add(s2);
		students.add(s4);
		students.add(s3);

	}
	

	public String toString() {
		return "StudentRepository [students=" + students + "]";
	}


	public List<Student> getAllStudents() {
		return students;
	}

	public Student getStudent(int id) {
		for (Student student : students) {
			if (student.getId() == id) {
				return student;
			}

		}
		return null;

	}

	public void create(Student s1) {
		students.add(s1);
	}

}
