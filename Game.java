public class Game {
    static Character fight(Character c1, Character c2) {
        int turn = 0;
        while (true) {
            turn++;
            if (turn == 3) {
                c2.setHP(c2.getHP() - c1.skill());
                if (c1.getHP() < 0 || c2.getHP() < 0) {
                    break;
                }
                c1.setHP(c1.getHP() - c2.skill());
                if (c1.getHP() < 0 || c2.getHP() < 0) {
                    break;
                }
                turn = 0;
            } else {
                c2.setHP(c2.getHP() - c1.attack());
                if (c1.getHP() < 0 || c2.getHP() < 0) {
                    break;
                }
                c1.setHP(c1.getHP() - c2.attack());
                if (c1.getHP() < 0 || c2.getHP() < 0) {
                    break;
                }
            }
        }
        if (c1.getHP() > 0) {
            return c1;
        } else {
            return c2;
        }
    }
}
