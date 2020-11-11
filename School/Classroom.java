package School;

import java.util.Objects;

public class Classroom {
    private People[] people;
    private int capacity;
    private int maxTeacher;
    private int count;
    
    public Classroom(int capacity, int maxTeacher) {
        this.capacity = capacity;
        this.maxTeacher = maxTeacher;
        this.people = new People[capacity];
    }
    
    public int getClassroomCapacity() {
        return this.capacity;
    }

    public void getAllStudent() {
        for (People p : people) {
            if (p.getRole().equals("Student")) {
                System.out.println(p.getName());
            }
        }
    }

    public void getAllTeacher() {
        for (People p : people) {
            if (p.getRole().equals("Teacher")) {
                System.out.println(p.getName());
            }
        }
    }
    
    public int getTeacherCount() {
        int count = 0;
        for (People p : people) {
            if (p.getRole().equals("Teacher")) {
                count++;
            }
        }
        return count;
    }
    
    public void addPeople(People p1) {
        if (count > capacity) {
            System.out.println("This Classroom is at full capacity.");
            return;
        }
        if (getTeacherCount() >= maxTeacher) {
            System.out.println("This Classroom already have maximum amount of Teacher");
            return;
        }
        for (int i = 0; i < people.length; i++) {
            if (Objects.isNull(people[i])) {
                people[i] = p1;
                return;
            }
        }
    }
}
