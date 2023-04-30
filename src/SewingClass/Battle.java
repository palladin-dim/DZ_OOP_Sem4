package SewingClass;

public class Battle {
    private Warrior attacker;
    private Warrior defender;

    public Battle(Warrior attacker, Warrior defender) {
        this.attacker = attacker;
        this.defender = defender;
    }
    public Warrior run () {
        Warrior winner = null;
        while (true) {
            int attak = attacker.harm();
            defender.reduceHp(attak);
            System.out.printf("Воин %s наносит %d очков урона \nY воина %s осталось %d hp\n", attacker.getName(), attak, defender.getName(), defender.getHp());
            if (!defender.isAlive()) {
                System.out.printf("Воин %s погиб\n", defender.getName());
                System.out.printf("Победтель: \n%s", attacker);
                return attacker;
            }
            int response = defender.harm();
            attacker.reduceHp(response);
            System.out.printf("Воин %s дал в ответку %d очков урона \nY война %s осталось %d hp", defender.getName(), response, attacker.getName(), attacker.getHp());
            if (!attacker.isAlive()) {
                System.out.printf("Воин %s погиб\n", attacker.getName());
                System.out.printf("Победтель: \n%s", defender);
                return defender;
            }
        }
    }
}
