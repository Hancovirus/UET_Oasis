import java.util.ArrayList;

public class Game {
    
    private Board board;
    private ArrayList<Move> moveHistory;

    public Game(Board board) {
        this.board = board;
        this.moveHistory = new ArrayList<Move>();
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(this.board, x, y)) {
            Move newMove = new Move(piece.getCoordinatesX(), x, piece.getCoordinatesY(), y, piece);
            if (this.board.getAt(x, y) != null) {
                Piece killedPiece = this.board.getAt(x, y);
                newMove.setKilledPiece(killedPiece);
                this.board.removeAt(x, y);
            }                
            this.board.removeAt(piece.getCoordinatesX(), piece.getCoordinatesY());
            piece.setCoordinatesX(x);
            piece.setCoordinatesY(y);
            this.board.addPiece(piece);
            this.moveHistory.add(newMove);
        }
    }
    
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }
}