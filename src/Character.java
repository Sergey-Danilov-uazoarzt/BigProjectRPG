public abstract class Character {

    private String name;
    private int agility;
    private int healthPoints;
    private int experience;
    private int coins;
    private int strength;

    public Character(String name, int agility, int healthPoints, int experience, int coins, int strength) {
        this.name = name;
        this.agility = agility;
        this.healthPoints = healthPoints;
        this.experience = experience;
        this.coins = coins;
        this.strength = strength;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public int getCoins() {
        return coins;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int attack() {
        if (agility * 3 > (int) (Math.random() * 100)) {
            System.out.println("Удар!");
            return strength;
            } else {
            System.out.println("Промах!");
            return 0;
        }
    }

    public String toString() {
        return String.format("%s здоровье: %d", name, healthPoints);
    }
}