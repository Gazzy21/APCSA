public class monster {
    private String name;
    private int health;
    private int attackPower;

    int totalMonsters;

    public Monster(name, health, attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Monster, otherMonster) {
        
    }

    public boolean isDefeated() {
        if (monster.health() == 0) {
            return true;
        }
    }

    public String toString() {
        System.out.println(this.name);
        System.out.println(this.health);
        System.out.println(this.attackPower);
    }

    public static int getTotalMonsters() {
        return totalMonsters;
    }
}