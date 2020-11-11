package RPG;

public class Runner {
    public static void main(String[] args) {
        System.out.println("\n\n\n\n================================");
        Swordman s1 = new Swordman("Jerry");
        Archer a1 = new Archer("John");
        // s1.levelUp();
        // s1.upgradeStatus();
        Character winner = Game.fight(s1, a1);
        System.out.println("Winner : " + winner);
    }
}