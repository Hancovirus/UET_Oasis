public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Hello i am a java doc.
      */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle newSc = (Circle) obj;
            if (newSc.getRadius() + 0.001 >= this.radius 
            && newSc.getRadius() - 0.001 <= this.radius) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center.toString()
                + ",radius=" + radius
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + "]";
    }
}
