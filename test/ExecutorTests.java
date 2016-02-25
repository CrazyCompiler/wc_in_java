import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ExecutorTests {
    @Test
    public void test_getExecutedCount_for_only_data_provided_using_to_string() {
        String data = "hello how are you";
        String[] options = {};
        Executor ex = new Executor(options, data);
        String result = "1 4 17 ";
        ex.getExecutedCount();
        assertEquals(result, ex.toString());
    }

    @Test
    public void test_getExecutedCount_for_only_data_provided_using_return_value() {
        String data = "hello how are you";
        String[] options = {};
        Executor ex = new Executor(options, data);
        int[] result = {1,4,17};
        assertArrayEquals(result,ex.getExecutedCount());
    }


    @Test
    public void test_getExecutedCount_for_single_option_and_data_provided() {
        String data = "hello how are you";
        String[] options = {"-l"};
        Executor ex = new Executor(options, data);
        String result = "1 ";
        ex.getExecutedCount();
        assertEquals(result, ex.toString());
    }

    @Test
    public void test_getExecutedCount_for_2_option_and_data_provided() {
        String data = "hello how are you";
        String[] options = {"-l", "-w"};
        Executor ex = new Executor(options, data);
        String result = "1 4 ";
        ex.getExecutedCount();
        assertEquals(result, ex.toString());
    }

    @Test
    public void test_getExecutedCount_for_3_option_and_data_provided() {
        String data = "hello how are you";
        String[] options = {"-l", "-w", "-m"};
        Executor ex = new Executor(options, data);
        String result = "1 4 17 ";
        ex.getExecutedCount();
        assertEquals(result, ex.toString());
    }

}

