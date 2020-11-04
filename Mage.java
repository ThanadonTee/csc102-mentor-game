public class Mage extends Character {

    public Mage(String name) {
        super(name, "Mage", 15);
    }

	@Override
	public void upgradeHP() {
		if (super.getStatsPoint() > 0) {
            super.setStatsPoint(super.getStatsPoint() - 1);
            super.setHP(super.getHP()+60);
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
        return 0.8 * super.getAttribute();
    }

	@Override
	public double skill() {
		System.out.println("FIREBALLLL!");
        return 2 * super.getAttribute();
	}
    
    
}
