package entities;

import java.util.Objects;

public class Student {

	private int student;

	public Student(int student) {
		this.student = student;
	}

	public int getStudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	@Override
	public int hashCode() {
		return Objects.hash(student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return student == other.student;
	}
	
	
	
	
	
	
}
