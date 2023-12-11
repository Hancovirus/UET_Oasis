import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    
    /**
     * Hello i am a java doc.
      */
    public void removeCircles() {
        int n = shapes.size();
        for (int i = n - 1; i >= 0; i--) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /**
     * Hello i am a java doc.
      */
    public String getInfo() {
        String ans = "Layer of crazy shapes:\n";
        for (Object obj : shapes) {
            ans += obj.toString();
            ans += "\n";
        }
        return ans;
    }

    /**
     * Hello i am a java doc.
      */
    public void removeDuplicates() {
        int n = shapes.size();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = shapes.size() - 1; j > i; j--) {
                Object obj1 = shapes.get(i);
                Object obj2 = shapes.get(j);
                if (obj1 instanceof Circle && obj2 instanceof Circle) {
                 Circle sh1 = (Circle) obj1;
                 Circle sh2 = (Circle) obj2;
                    if (sh1.equals(sh2) && sh1.getCenter().equals(sh2.getCenter())) {
                     shapes.remove(j);
                    }
                } else if (obj1 instanceof Square && obj2 instanceof Square) {
                 Square sh1 = (Square) obj1;
                 Square sh2 = (Square) obj2;
                    if (sh1.equals(sh2) && sh1.getTopLeft().equals(sh2.getTopLeft())) {
                     shapes.remove(j);
                    }
                } else if (obj1 instanceof Rectangle && obj2 instanceof Rectangle) {
                 Rectangle sh1 = (Rectangle) obj1;
                 Rectangle sh2 = (Rectangle) obj2;
                    if (sh1.equals(sh2) && sh1.getTopLeft().equals(sh2.getTopLeft())) {
                     shapes.remove(j);
                    }
                }
            }
        }
    }
}
