public class Bishop extends Piece {

    public Bishop(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Bishop(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    public String getSymbol() {
        return "B";
    }
    
    /**
     * Hello, I am a JavaDoc.
     */
    public boolean canMove(Board board, int x, int y) {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }
        if (board.getAt(x, y) != null) {
            if (board.getAt(x, y).getColor().equals(this.getColor())) {
                return false;
            }
        }
        if (Math.abs(x - this.getCoordinatesX()) == Math.abs(y - this.getCoordinatesY())) {
            if (x > this.getCoordinatesX()) {
                if (y > this.getCoordinatesY()) {
                    for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                        for (int j = this.getCoordinatesY() + 1; j < y; j++) {
                            if (board.getAt(i, j) != null) {
                                return false;
                            }
                        }
                    }
                    return true;
                } else {
                    for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                        for (int j = this.getCoordinatesY() - 1; j > y; j--) {
                            if (board.getAt(i, j) != null) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } else {
                if (y > this.getCoordinatesY()) {
                    for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                        for (int j = this.getCoordinatesY() + 1; j < y; j++) {
                            if (board.getAt(i, j) != null) {
                                return false;
                            }
                        }
                    }
                    return true;
                } else {
                    for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                        for (int j = this.getCoordinatesY() - 1; j > y; j--) {
                            if (board.getAt(i, j) != null) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
        } else {
            return false;
        }
    }
}