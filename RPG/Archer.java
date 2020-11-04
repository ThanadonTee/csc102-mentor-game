package RPG;

public class Archer extends Character {

    public Archer(String name) {
        super(name, "Archer", 12);
    }

	@Override
	public void upgradeHP() {
		if (super.getStatsPoint() > 0) {
            super.setStatsPoint(super.getStatsPoint() - 1);
            super.setHP(super.getHP()+70);
        } else {
            return;
        }
	}

	@Override
	public void upgradeStatus() {
		if (this.getStatsPoint() > 0) {
            this.setStatsPoint(this.getStatsPoint() - 1);
            this.setAttribute(this.getAttribute()+4);
        } else {
            return;
        }
	}
    
    @Override
    public double attack() {
        return 0.9 * super.getAttribute();
    }

	@Override
	public double skill() {
		System.out.println("Poison");
        return 1.8 * super.getAttribute();
	}
    
    
}
