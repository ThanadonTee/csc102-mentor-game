package School;

import java.util.Objects;

public class School {
    private Classroom[] classroomStore;
    private String schoolName;
    private int capacity;
    private String address;

    public School(String schoolName, int capacity, String address) {
        this.schoolName = schoolName;
        this.capacity = capacity;
        this.address = address;
        this.classroomStore = new Classroom[capacity];
    }

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    public Classroom[] getAllClassroom() {
        return this.classroomStore;
    }

    public void addClassroom(Classroom c1) {
        for (int i = 0; i < classroomStore.length; i++) {
            if (Objects.isNull(classroomStore[i])) {
                classroomStore[i] = c1;
                return;
            }
        }
        System.out.println("This School is full.");
    }
}
