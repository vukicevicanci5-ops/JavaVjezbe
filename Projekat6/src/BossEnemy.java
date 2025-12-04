
public class BossEnemy {
	public BossEnemy(int x, int y, Collidable collider,
            String type, int damage, int health) {
		super(x, y, collider, type, damage, health);
}

    @Override
    public int getEffectiveDamage() {
    	return super.getEffectiveDamage() * 2;
}
    @Override
    public String toString() {
    return "BossEnemy{" +
           "type='" + getType() + '\'' +
           ", x=" + getX() +
           ", y=" + getY() +
           ", damage=" + getDamage() +
           ", health=" + getHealth() +
           '}';
}
	private String getHealth() {
		return null;
	}
	private String getDamage() {
		return null;
	}
	private String getY() {
		return null;
	}
	private String getX() {
		return null;
	}
	private String getType() {
		return null;
	}
}

}
