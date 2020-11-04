package Classroom;

public class Classroom {
    private String nameOfClassroom;
    private Student[] memberOfClassroom;
    private static int countStudent = 0;
    private int currentIndex;

    public Classroom() {
        this("Default");
    }

    public Classroom(String nameOfClassroom) {
        this(nameOfClassroom, new Student[30]);
    }

    public Classroom(String nameOfClassroom, Student[] memberOfClassroom) {
        this.nameOfClassroom = nameOfClassroom;
        this.memberOfClassroom = memberOfClassroom;
        this.currentIndex = 0;
    }
    
    public String getNameOfClassroom() {
        return nameOfClassroom;
    }
    
    public static int getCountStudent() {
        return countStudent;
    }

    public static void setCountStudent(int countStudent) {
        Classroom.countStudent = countStudent;
    }

    public void setNameOfClassroom(String nameOfClassroom) {
        this.nameOfClassroom = nameOfClassroom;
    }
    
    public void addStudent(Student s1) {
        this.memberOfClassroom[this.currentIndex] = s1;
        this.currentIndex++;
    }

    public void getAllStudent() {
        for (Student x : this.memberOfClassroom) {
            System.out.println(x);
        }
    }
}
