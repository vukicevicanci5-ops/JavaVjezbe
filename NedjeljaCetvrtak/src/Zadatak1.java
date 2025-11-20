class Player {                                                    //* Preklapanje igraca i enemija  
    private int x, y;                                             //* pravljenje medote da se povjeri ima li sudara
    private int width, height;
    private int health;
    public Player(int x, int y, int width, int height, int health) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.health = health;}
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public int getHealth() { return health; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public void setHealth(int health) {
	    if (health >= 0 && health <= 100) {
		    this.health = health;}
		else {System.out.println("Health mora biti u opsegu 0-100!");}}
	public void ispisi() {
		System.out.println("Player na (" + x + "," + y + "), health: " + health);}}
class Enemy {
	private int x, y;
	private int width, height;
	private int damage;
	public Enemy(int x, int y, int width, int height, int damage) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
			this.damage = damage
			}
			// Getteri
			public int getX() { return x; }
			public int getY() { return y; }
			public int getWidth() { return width; }
			public int getHeight() { return height; }
			public int getDamage() { return damage; }
			// Setteri
			public void setX(int x) { this.x = x; }
			public void setY(int y) { this.y = y; }
			public void setWidth(int width) { this.width = width; }
			public void setHeight(int height) { this.height = height; }
			public void setDamage(int damage) {
			    if (damage >= 0 && damage <= 100) {
			        this.damage = damage;
			} else {
			    System.out.println("Damage mora biti u opsegu 0-100!");}}
		    public void ispisi() {
			    System.out.println("Enemy na (" + x + "," + y + "), damage: " +
			damage);}}
		public class Game {
			// Provjera kolizije
			public static boolean checkCollision(Player p, Enemy e) {
			    return (p.getX() < e.getX() + e.getWidth() &&
		    	p.getX() + p.getWidth() > e.getX() &&
		    	p.getY() < e.getY() + e.getHeight() &&
			    p.getY() + p.getHeight() > e.getY());
			}
			// Ako ima kolizije/sudara, smanji health
		public static void decreaseHealth(Player p, Enemy e) {
			if (checkCollision(p, e)) {
		    int novoHealth = p.getHealth() - e.getDamage();
			if (novoHealth < 0) novoHealth = 0;
			p.setHealth(novoHealth);
		    System.out.println("Kolizija! Health smanjen na: " + p.getHealth());}}
		
			// Testiranje
			public static void main(String[] args) {
			Player igrac = new Player(10, 10, 20, 20, 100);
			Enemy neprijatelj1 = new Enemy(15, 15, 20, 20, 30);
			Enemy neprijatelj2 = new Enemy(100, 100, 20, 20, 40);
			
			igrac.ispisi();
			neprijatelj1.ispisi();
			neprijatelj2.ispisi();
			// Test sudara
			decreaseHealth(igrac, neprijatelj1); // sudar -> health smanjuje
			decreaseHealth(igrac, neprijatelj2); // nema sudara -> ništa
			igrac.ispisi();
			}
			}