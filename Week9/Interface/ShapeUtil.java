import java.util.List;

public class ShapeUtil {
    /**
     * Hello, I am a JavaDoc.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String ans = "Circle:\n";
        for (GeometricObject obj : shapes) {
            if (obj instanceof Circle) {
                Circle temp = (Circle) obj;
                ans += temp.getInfo();
                ans += "\n";
            }
        }
        ans += "Triangle:\n";
        for (GeometricObject obj : shapes) {
            if (obj instanceof Triangle) {
                Triangle temp = (Triangle) obj;
                ans += temp.getInfo();
                ans += "\n";
            }
        }
        return ans;
    }
}
