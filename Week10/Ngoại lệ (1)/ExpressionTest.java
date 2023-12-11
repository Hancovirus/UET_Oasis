
public class ExpressionTest {

    /**
     * Hello, I am a JavaDoc.
     */
    public static void main(String[] args) {
        Numeral number10 = new Numeral(10);
        Numeral number3 = new Numeral(3);
        Numeral number4 = new Numeral(4);
        
        Square square10 = new Square(number10);
        Multiplication multiplication43 = new Multiplication(number4, number3);
        Subtraction subtraction1023 = new Subtraction(square10, number3);
        Addition addition = new Addition(subtraction1023, multiplication43);
        Square ans = new Square(addition);
        
        System.out.println(ans.evaluate());
        System.out.println(ans.toString());
    }
}
