package RPG;

public class Swordman extends Character {

    public Swordman(String name) {
        super(name, "Swordman", 10);
    }

	@Override
	public void upgradeHP() {
		if (super.getStatsPoint() > 0) {
            super.setStatsPoint(super.getStatsPoint() - 1);
            super.setHP(super.getHP()+100);
        } else {
            return;
        }
	}

	@Override
	public void upgradeStatus() {
		if (this.getStatsPoint() > 0) {
            this.setStatsPoint(this.getStatsPoint() - 1);
            this.setAttribute(this.getAttribute()+3);
        } else {
            return;
        }
	}
    
    @Override
    public double attack() {
        return 1 * super.getAttribute();
    }

	@Override
	public double skill() {
		System.out.println("SLASSSHHHHHH");
        return 1.5 * super.getAttribute();
	}
    
    
}
