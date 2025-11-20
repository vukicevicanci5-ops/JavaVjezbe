public class Player extends GameObject {
    private String name;
    private int health;

    public Player(String name, int x, int y, Collidable collider, int health) {
        super(x, y, collider);

        name = name.trim();
        if (name.isEmpty()) 
            throw new IllegalArgumentException("Ime je prazno");

        if (health < 0 || health > 100)
            throw new IllegalArgumentException("Health mora biti 0-100");

        this.name = name;
        this.health = health;
    }

    public void setHealth(int h) {
        if (h < 0 || h > 100)
            throw new IllegalArgumentException("HP mora biti 0-100");
        this.health = h;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String getDisplayName() {
        return this.name; // ispravno
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", health=" + health + ", getHealth()=" + getHealth() + ", getDisplayName()=" + getDisplayName() + "]";
    }
}
		


	