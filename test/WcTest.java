import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class WcTest {
  @Test
  public void test_getCharacterCount_for_no_data(){
    WcLib wc = new WcLib("");
    assertEquals(wc.getCharacterCount(),0);
  }
  @Test
  public void test_getCharacterCount_for_single_word() {
    WcLib wc = new WcLib("Hello");
    assertEquals(wc.getCharacterCount(),5);
  }
  @Test
  public void test_getCharacterCount_for_a_line(){
    WcLib wc = new WcLib("Hello how are you ?");
    assertEquals(wc.getCharacterCount(),19);
  }
  @Test
  public void test_getWordCount_for_empty_string(){
    WcLib wc = new WcLib("");
    assertEquals(0,wc.getWordCount());
  }
  @Test
  public void test_getWordCount_for_single_string(){
    WcLib wc = new WcLib("Hello how are you ?");
    assertEquals(5,wc.getWordCount());
  }
  @Test
  public void test_getWordCount_for_many_string(){
    WcLib wc = new WcLib("Hello how are you ? \n  whats up dude..?");
    assertEquals(8,wc.getWordCount());
  }

  @Test
  public void test_getLineCount_for_empty_string(){
    WcLib wc = new WcLib("");
    assertEquals(0,wc.getLineCount());
  }

  @Test
  public void test_getLineCount_for_single_line(){
    WcLib wc = new WcLib("Hello how are you ?");
    assertEquals(1,wc.getLineCount());
  }

  @Test
  public void test_getLineCount_for_more_than_one_line(){
    WcLib wc = new WcLib("Hello how are you ?\nwhats up");
    assertEquals(2,wc.getLineCount());
  }

  @Test
  public void test_getByteCount_for_empty_string(){
    WcLib wc = new WcLib("");
    assertEquals(0,wc.getByteCount());
  }

  @Test
  public void test_getByteCount_for_non_empty_string(){
    WcLib wc = new WcLib("Hello how are you");
    assertEquals(17,wc.getByteCount());
  }

  @Test
  public void test_getLinesWordsBytes_for_empty_string(){
    WcLib wc = new WcLib("");
    int[] result = {0,0,0};
    assertArrayEquals("Arrays were not equal",result,wc.getLinesWordsBytes());
  }

  @Test
  public void test_getLinesWordsBytes_for_two_string(){
    WcLib wc = new WcLib("Hello how are you ?\nwhats up");
    int[] result = {2,7,28};
    assertArrayEquals("failure - byte arrays not same",result,wc.getLinesWordsBytes());
  }

}
