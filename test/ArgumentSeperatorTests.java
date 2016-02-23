import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArgumentSeperatorTests {
  @Test
  public void test_getFileNames_for_one_file_name_provided_without_options(){
    String[] arguments = {"todo.txt"};
    ArgumentSeperator args = new ArgumentSeperator(arguments);
    String[] fileNames = {"todo.txt"};
    assertArrayEquals("failure - byte arrays not same",fileNames,args.getFileNames());
  }

  @Test
  public void test_getFileNames_for_more_than_one_file_name_provided_without_options(){
    String[] arguments = {"todo.txt","demo.txt"};
    ArgumentSeperator args = new ArgumentSeperator(arguments);
    String[] fileNames = {"todo.txt","demo.txt"};
    assertArrayEquals("failure - byte arrays not same",fileNames,args.getFileNames());
  }

  @Test
  public void test_getFileNames_for_one_file_name_provided_with_single_option(){
    String[] arguments = {"-c","todo.txt"};
    ArgumentSeperator args = new ArgumentSeperator(arguments);
    String[] fileNames = {"todo.txt"};
    assertArrayEquals("failure - byte arrays not same",fileNames,args.getFileNames());
  }

  @Test
  public void test_getFileNames_for_one_file_name_provided_with_more_than_one_options(){
    String[] arguments = {"-c","-l","todo.txt"};
    ArgumentSeperator args = new ArgumentSeperator(arguments);
    String[] fileNames = {"todo.txt"};
    assertArrayEquals("failure - byte arrays not same",fileNames,args.getFileNames());
  }

  @Test
  public void test_getOptions_for_only_file_name(){
    String[] arguments = {"todo.txt"};
    ArgumentSeperator args = new ArgumentSeperator(arguments);
    String[] options = {};
    assertArrayEquals("failure - byte arrays not same",options,args.getOptions());
  }

  @Test
  public void test_getOptions_for_one_file_name_and_one_option(){
    String[] arguments = {"-l","todo.txt"};
    ArgumentSeperator args = new ArgumentSeperator(arguments);
    String[] options = {"-l"};
    assertArrayEquals("failure - byte arrays not same",options,args.getOptions());
  }

  @Test
  public void test_getOptions_for_more_than_one_file_names_and_more_than_one_options(){
    String[] arguments = {"-l","-w","todo.txt","demo.txt"};
    ArgumentSeperator args = new ArgumentSeperator(arguments);
    String[] options = {"-l","-w"};
    assertArrayEquals("failure - byte arrays not same",options,args.getOptions());
  }

}
