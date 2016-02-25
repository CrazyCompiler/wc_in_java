import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccumulatorTests {
    @Test
    public void test_getTotal_for_array_of_single_number() {
        int[] numbers = {20};
        Accumulator tl = new Accumulator(numbers);
        tl.add(numbers);
        String result = "40 ";
        assertEquals(result, tl.toString());
    }

    @Test
    public void test_getTotal_for_array_of_more_than_one_number() {
        int[] numbers = {20,10,20};
        Accumulator tl = new Accumulator(numbers);
        int[] addent = {10,10,10};
        tl.add(addent);
        String result = "30 20 30 ";
        assertEquals(result, tl.toString());
    }
}
