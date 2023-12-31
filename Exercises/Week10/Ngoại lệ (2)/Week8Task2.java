import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

    public void nullPointerEx() throws NullPointerException {
        String str = null;
        System.out.println(str.length());
    }
    
    /**
     * Hello, I am a JavaDoc.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] arr = {0};
        System.out.println(arr[1]);
    }
    
    /**
     * Hello, I am a JavaDoc.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    public void arithmeticEx() throws ArithmeticException {
        int ans = 1 / 0;
    }
 

    /**
     * Hello, I am a JavaDoc.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileInputStream fileIn = new FileInputStream("input.txt");
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }
    
    public void ioEx() throws IOException {
        FileInputStream fileIn = new FileInputStream("input.txt");
    }

    /**
     * Hello, I am a JavaDoc.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
