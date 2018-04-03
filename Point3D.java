public class Point3D extends Point2D {
    private float z = 0;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXY(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public float[] getXYZ() {
        float[] point3D = {getX(), getY(), z};
        return point3D;
    }
}
