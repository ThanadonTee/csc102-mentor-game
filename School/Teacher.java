package School;

public class Teacher extends People{

	public Teacher(String name, int age) {
		super(name, "Teacher", age);
	}
    
    public void teach(int hour) {
        this.setFatigue(20*hour);
    }
}
