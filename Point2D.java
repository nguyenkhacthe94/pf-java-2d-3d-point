public class Point2D {
    private float x = 0, y = 0;

    public Point2D() {
    }

    public Point2D(float x, float y) {
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] point2D = {x, y};
        return point2D;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
