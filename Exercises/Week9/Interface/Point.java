
public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point newPoint) {
        return Math.sqrt((pointX - newPoint.getPointX()) * (pointX - newPoint.getPointX())
                + (pointY - newPoint.getPointY()) * (pointY - newPoint.getPointY()));
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point mp = (Point) obj;
            if (mp.getPointX() == pointX && mp.getPointY() == pointY) {
                return true;
            }
        }
        return false;
    }
}
