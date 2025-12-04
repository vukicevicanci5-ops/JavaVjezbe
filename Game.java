import java.util.ArrayList;
import java.util.List;

public class Game {

    private Player player;
    private List<Enemy> enemies;
    private List<String> log;

    public Game(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("Player cannot be null");
        }
        this.player = player;
        this.enemies = new ArrayList<>();
        this.log = new ArrayList<>();
    }

    public Player getPlayer() {
        return player;
    }
    public List<Enemy> getEnemies() {
        return enemies;
    }

    public List<String> getLog() {
        return log;
    }

    // Dodavanje neprijatelja i logovanje
    public void addEnemy(Enemy e) {
        if (e == null) {
            throw new IllegalArgumentException("Enemy cannot be null");
        }
        enemies.add(e);
        log.add("Added enemy: " + e);
    }
    public boolean checkCollision(Player p, Enemy e) {
        if (p == null || e == null) {
            return false;
        }
        return p.intersects(e);
    }

    public void decreaseHealth(Player p, Enemy e) {
        if (p == null || e == null) {
            return;
        }
        int damage = e.getEffectiveDamage();
        int oldHealth = p.getHealth();
        int newHealth = oldHealth - damage;
        if (newHealth < 0) {
            newHealth = 0;
        }
        p.setHealth(newHealth);
        log.add("Player damaged by " + e.getDisplayName() +
                " for " + damage + " (from " + oldHealth + " to " + newHealth + ").");
    }
    public List<Enemy> findByType(String query) {
        List<Enemy> result = new ArrayList<>();
        if (query == null) {
            return result;
        }
        String lower = query.toLowerCase();
        for (Enemy e : enemies) {
            if (e.getType() != null &&
                e.getType().toLowerCase().contains(lower)) {
                result.add(e);
            }
        }
        return result;
    }
    public List<Enemy> collidingWithPlayer() {
        List<Enemy> result = new ArrayList<>();
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) {
                result.add(e);
            }
        }
        return result;
    }
    public void resolveCollisions() {
        for (Enemy e : enemies) {
            if (checkCollision(player, e)) {
                log.add("Collision detected between player and " + e.getDisplayName());
                decreaseHealth(player, e);
            }
        }
    }
}
