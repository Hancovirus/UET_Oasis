import org.junit.Test;

import static org.example.Week4.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        int a = 1, b = 2;
        assertEquals(2, max2Int(a,b));
    }

    @Test
    public void testMax2Int2(){
        int a = 2, b = 2;
        assertEquals(2, max2Int(a,b));
    }

    @Test
    public void testMax2Int3(){
        int a = 1, b = 124142;
        assertEquals(124142, max2Int(a,b));
    }

    @Test
    public void testMax2Int4(){
        int a = 34, b = 2;
        assertEquals(34, max2Int(a,b));
    }

    @Test
    public void testMax2Int5(){
        int a = 35, b = 2;
        assertEquals(35, max2Int(a,b));
    }

    @Test
    public void testMinArray1(){
        int[] test = new int [1];
        test[0] = 1;
        assertEquals(1,minArray(test));
    }

    @Test
    public void testMinArray2(){
        int[] test = new int [1];
        test[0] = 1;
        assertEquals(1,minArray(test));
    }

    @Test
    public void testMinArray3(){
        int[] test = new int [1];
        test[0] = 1;
        assertEquals(1,minArray(test));
    }

    @Test
    public void testMinArray4(){
        int[] test = new int [1];
        test[0] = 1;
        assertEquals(1,minArray(test));
    }

    @Test
    public void testMinArray5(){
        int[] test = new int [1];
        test[0] = 1;
        assertEquals(1,minArray(test));
    }

    @Test
    public void testCalculateBMI1(){
        int h = 1;
        int w = 100;
        assertEquals("Béo phì", calculateBMI(w,h));
    }

    @Test
    public void testCalculateBMI2(){
        int h = 1;
        int w = 100;
        assertEquals("Béo phì", calculateBMI(w,h));
    }

    @Test
    public void testCalculateBMI3(){
        int h = 1;
        int w = 100;
        assertEquals("Béo phì", calculateBMI(w,h));
    }

    @Test
    public void testCalculateBMI4(){
        int h = 1;
        int w = 100;
        assertEquals("Béo phì", calculateBMI(w,h));
    }

    @Test
    public void testCalculateBMI5(){
        int h = 1;
        int w = 100;
        assertEquals("Béo phì", calculateBMI(w,h));
    }
}