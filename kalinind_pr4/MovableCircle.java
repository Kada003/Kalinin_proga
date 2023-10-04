package kalinind;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(1,1,1,1);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    @Override
    public void moveDown() {
        this.center.y -= this.center.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= this.center.xSpeed;
    }

    @Override
    public void moveRight() {
        this.center.x += this.center.xSpeed;
    }

    @Override
    public void moveUP() {
        this.center.y += this.center.ySpeed;
    }
}

