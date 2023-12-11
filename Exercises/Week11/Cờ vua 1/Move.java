import java.util.HashMap;
import java.util.Map;

public class Move {

    private int startX;
    private int startY;
    private int endX;
    private int endY;

    private Piece movedPiece;
    private Piece killedPiece;

    private Map<Integer, String> maps = new HashMap<Integer, String>() {
        {
            put(1, "a");
            put(2, "b");
            put(3, "c");
            put(4, "d");
            put(5, "e");
            put(6, "f");
            put(7, "g");
            put(8, "h");
        }
    };

    /**
     * Hello, I am a JavaDoc.
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public Move(int startX, int startY, int endX, int endY, Piece movedPiece, Piece killedPiece) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.movedPiece = movedPiece;
        this.killedPiece = killedPiece;
    } 

    /**
     * Hello, I am a JavaDoc.
     */
    public String toString() {
        String ans = this.movedPiece.getColor() + "-";
        ans += this.movedPiece.getSymbol();
        ans += maps.get(this.endX);
        ans += Integer.toString(this.endY);
        return ans;
    }

    public int getStartX() {
        return startX;
    }
    
    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }
    
    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }
    
    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }
    
    public void setEndY(int endY) {
        this.endY = endY;
    }

    public Piece getMovedPiece() {
        return movedPiece;
    }
    
    public void setMovedPiece(Piece movedPiece) {
        this.movedPiece = movedPiece;
    }
    
    public Piece getKilledPiece() {
        return killedPiece;
    }

    public void setKilledPiece(Piece killedPiece) {
        this.killedPiece = killedPiece;
    }
}