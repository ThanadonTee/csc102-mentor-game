package Classroom;

public class Student {
    private String name;
    private int age;

    public Student() {
        this("DEFAULT", 0);
    }

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "This student name is " + this.getName() + ", Age : " + this.getAge();
	}
}
