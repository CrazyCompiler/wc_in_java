import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
    WcLib wc = new WcLib("hello man");
    assertEquals(wc.getCharacterCount(),9);
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
  public void test_getLineCount_for_single_line(){
    WcLib wc = new WcLib("Hello how are you ?");
    assertEquals(wc.getLineCount(),1);
  }

  @Test
  public void test_getLineCount(){
    WcLib wc = new WcLib("Hello how are you ?\nwhats up");
    assertEquals(wc.getLineCount(),2);
  }

  


}
