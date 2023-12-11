public class Rook extends Piece {
    public Rook(int coordinatesX, int coordinatesY) {
        super(coordinatesX, coordinatesY);
    }

    public Rook(int coordinatesX, int coordinatesY, String color) {
        super(coordinatesX, coordinatesY, color);
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean canMove(Board board, int x, int y) {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return false;
        }
        if (board.getAt(x, y) != null) {
            if (board.getAt(x, y).getColor().equals(this.getColor())) {
                return false;
            }
        }
        if (x == this.getCoordinatesX() || y == this.getCoordinatesY()) {
            if (x == this.getCoordinatesX()) {
                if (y > this.getCoordinatesY()) {
                    for (int i = this.getCoordinatesY() + 1; i < y; i++) {
                        if (board.getAt(x, i) != null) {
                            return false;
                        }
                    }
                    return true;
                } else {
                    for (int i = this.getCoordinatesY() - 1; i > y; i--) {
                        if (board.getAt(x, i) != null) {
                            return false;
                        }
                    }
                    return true;
                }
            } else {
                if (x > this.getCoordinatesX()) {
                    for (int i = this.getCoordinatesX() + 1; i < x; i++) {
                        if (board.getAt(i, y) != null) {
                            return false;
                        }
                    }
                    return true;
                } else {
                    for (int i = this.getCoordinatesX() - 1; i > x; i--) {
                        if (board.getAt(i, y) != null) {
                            return false;
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
