public class CircleCollider implements Collidable {

    private int x, y;
    private final int radius;

    public CircleCollider(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Poluprečnik mora biti > 0");
        }
        this.radius = radius;
    }

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() { return x; }

    @Override
    public int getY() { return y; }

    public int getRadius() { return radius; }

    @Override
    public boolean intersects(Collidable other) {
        if (other == null) return false;

           // presjek pravouganik pravouganik  
        if (other instanceof RectangleCollider r) {
            int cx = Math.max(r.getX(), Math.min(x, r.getX() + r.getWidth()));
            int cy = Math.max(r.getY(), Math.min(y, r.getY() + r.getHeight()));

            int dx = x - cx;
            int dy = y - cy;

            return dx * dx + dy * dy <= radius * radius;
        }

        // opresjek pravouganoik krug 
        if (other instanceof CircleCollider c) {
            int dx = x - c.getX();
            int dy = y - c.getY();
            int radiiSum = radius + c.getRadius();
            return dx * dx + dy * dy <= radiiSum * radiiSum;
        }

        return false;
    }
}