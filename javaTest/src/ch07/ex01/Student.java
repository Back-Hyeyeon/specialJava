package ch07.ex01;

public class Student {
	private String name;
	private String major;
	private String num;
	private String avg;

	public Student() {
		super();
	}

	public Student( String major, String num, String avg) {
		super();
		this.major = major;
		this.num = num;
		this.avg = avg;
	}
	public Student(String name, String major, String num, String avg) {
		super();
		this.name = name;
		this.major = major;
		this.num = num;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public String getNum() {
		return num;
	}

	public String getAvg() {
		return avg;
	}

	@Override
	public String toString() {
		return "이름: " + name + "\n학과: " + major + "\n학번: " + num + "\n학점평균: " + avg +"\n" ;
	}

	public void findStudent(String name) {
		if(name.equals(this.name)) {
			System.out.printf("%s, %s, %s, %s\n",this.name,this.major,this.num,this.avg);
		}
	}



	

	
	
}
