package ch07.ex3;

import java.util.Objects;

public class Student {
	private String name;
	private double av;

	public Student() {
		this(null, 0.0);
	}

	public Student(String name, double av) {
		this.name = name;
		this.av = av;
	}

	public String getName() {
		return name;
	}

	public double getAv() {
		return av;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, av);
	}

	@Override
	public boolean equals(Object obj) {
		Student sut = null;
		if (!(obj instanceof Student)) {
			return false;
		}
		sut = (Student)obj;
		if(this.name.equals(sut.name)&&this.av == sut.av) {
			return true;
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "name=" + name + ", av=" + av + "\n";
	}
	

}
