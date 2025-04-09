public class Monster {
    private String name;
    private int health;
    private int attackPower;

    private static int totalMonsters = 0;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        totalMonsters++;
    }

    public void attack(Monster otherMonster) {
        otherMonster.health -= attackPower;
    }

    public boolean isDefeated() {
        if (health <= 0) {
            return true;
        } else if (health > 0) {
            return false;
        }
    }

    public String toString() {
        System.out.println(this.name);
        System.out.println(this.health);
        System.out.println(this.attackPower);
        return name + health + attackPower;
    }

    public static int getTotalMonsters() {
        return totalMonsters;
    }
}