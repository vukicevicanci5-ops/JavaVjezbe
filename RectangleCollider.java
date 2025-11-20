
public class RectangleCollider implements Collidable {

    private int x;
    private int y;

    private final int width;
    private final int height;

    
    public RectangleCollider(int x, int y, int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException(
                    "RectangleCollider dimenzije moraju biti pozitivne: width=" + width + ", height=" + height);
        }
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public int getX() { return x; }

    @Override
    public int getY() { return y; }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    @Override
    public String getDescription() {
        return "Rectangle " + width + "x" + height;
    }

    @Override
    public boolean intersects(Collidable other) {
        if (other == null) return false;

        if (other instanceof RectangleCollider rect) {
            return intersectsRectangle(rect);
        }
        return false;
    }

    private boolean intersectsRectangle(RectangleCollider other) {
        return x < other.x + other.width &&
               x + width > other.x &&
               y < other.y + other.height &&
               y + height > other.y;
    }
}