public class Circle {

    private Point centralPoint;
    private double radius;


    public Circle(Point centralPoint, double radius) {
        this.centralPoint = centralPoint;
        this.radius = radius;
    }

    public Point getCentralPoint() {
        return centralPoint;
    }

    public void setCentralPoint(Point centralPoint) {
        this.centralPoint = centralPoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
