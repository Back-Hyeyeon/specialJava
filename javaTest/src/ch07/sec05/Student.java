package ch07. sec05;

import java.util.Objects;

public class Student {

	private int id;
	private String tel;

	public Student() {
		
	}

	public Student(int id, String tel) {
		super();
		this.id = id;
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}

	@Override
	public String toString() {
		return "id=" + id + ", tel=" + tel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, tel);
	}

	@Override
	public boolean equals(Object obj) {
		Student student = new Student();
		if (obj instanceof Student) {
			student = (Student)obj;
		}else {
			return false;
		}
		return this.id == student.id && this.tel == student.tel;
	}

}
