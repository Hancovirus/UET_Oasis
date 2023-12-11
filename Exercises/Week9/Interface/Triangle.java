
public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Hello, I am a JavaDoc.
     */
    public Triangle(Point p1, Point p2, Point p3) {
        if ((p1.getPointX() * (p2.getPointY() - p3.getPointY())
            + p2.getPointX() * (p3.getPointY() - p1.getPointY())
            + p3.getPointX() * (p1.getPointY() - p2.getPointY())) == 0
            || p1.equals(p2) || p2.equals(p3) || p1.equals(p3)) {
            throw new RuntimeException("");
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getPerimeter() {
        double ans;
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        ans = (a + b + c);
        return ans;
    }

    @Override
    public double getArea() {
        double ans = 0;
        ans += p1.getPointX() * (p2.getPointY() - p3.getPointY());
        ans += p2.getPointX() * (p3.getPointY() - p1.getPointY());
        ans += p3.getPointX() * (p1.getPointY() - p2.getPointY());
        ans = Math.abs(ans);
        ans /= 2;
        return ans;
    }

    @Override
    public String getInfo() {
        String ans = "";
        ans += String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]",
                p1.getPointX(), p1.getPointY(),
                p2.getPointX(), p2.getPointY(),
                p3.getPointX(), p3.getPointY());
        return ans;
    }
}
