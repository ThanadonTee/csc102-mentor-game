package RPG;

public class Character {
    private String name;
    private double HP;
    private int attribute;
    private int statsPoint;
    private int level;
    private String role;

    Character() {
        this("DEFAULT_NAME", "Novice", 1);
    }

    Character(String name, String role, int attribute) {
        this.name = name;
        this.HP = 100;
        this.attribute = attribute;
        this.statsPoint = 0;
        this.level = 1;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHP() {
        return HP;
    }

    public void setHP(double hP) {
        HP = hP;
    }

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }

    public int getStatsPoint() {
        return statsPoint;
    }

    public void setStatsPoint(int statsPoint) {
        this.statsPoint = statsPoint;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void levelUp() {
        this.setLevel(this.getLevel() + 1);
        this.setStatsPoint(this.getStatsPoint() + 2);
    }

    public void upgradeHP() {
        if (this.getStatsPoint() > 0) {
            this.setStatsPoint(this.getStatsPoint() - 1);
            this.setHP(this.getHP() + 1);
        } else {
            return;
        }
    }

    public void upgradeStatus() {
        if (this.getStatsPoint() > 0) {
            this.setStatsPoint(this.getStatsPoint() - 1);
            this.setAttribute(this.getAttribute() + 1);
        } else {
            return;
        }
    }

    public double attack() {
        return 1;
    }
    
    public double skill() {
        System.out.print("It does nothing");
        return 0;
    }

    @Override
    public String toString() {
        return this.name + " | " + this.getRole();
    }
}
