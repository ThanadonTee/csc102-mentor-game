package School;

public class Student extends People{
    private String hobby;

    public Student(String name, int age, String hobby) {
        super(name, "Student", age);
        this.hobby = hobby;
    }
    
    public void study(int hour) {
        this.setFatigue(hour*10);
    }
}
