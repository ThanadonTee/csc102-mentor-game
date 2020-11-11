package School;

public class People {
    private String name;
    private String role;
    private int age;
    private int fatigue;

    public People(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.fatigue = 0;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    public int getFatigue() {
        return fatigue;
    }
    
    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }
    
    public boolean isExhausted() {
        return fatigue > 70;
    }
}
