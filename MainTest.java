
package pkg6;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    
    public MainTest() {
    }
    @Test
    public void testMaxValueOfArray() {
        Main main = new Main();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(7);
        array.add(8);
        assertEquals(8,main.maxValueOfArray(array));
        
    }
        @Test
    public void testMaxValueOfArrayWithMinus() {
        Main main = new Main();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(-7);
        array.add(8);
        assertEquals(8,main.maxValueOfArray(array));
    }
        @Test
    public void testMaxValueOfArrayBothMinus() {
        Main main = new Main();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(-7);
        array.add(-8);
        assertEquals(-7,main.maxValueOfArray(array));
        
    }
    
}
