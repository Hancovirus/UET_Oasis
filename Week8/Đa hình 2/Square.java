public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square newSq = (Square) obj;
            if (newSq.getSide() + 0.001 >= this.getSide() 
            && newSq.getSide() - 0.001 <= this.getSide()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[topLeft=" + super.topLeft.toString()
                + ",side=" + getSide()
                + ",color=" + super.getColor()
                + ",filled=" + super.isFilled() + "]";
    }
}
