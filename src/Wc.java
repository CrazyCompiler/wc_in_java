import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

class Wc {
  public static void main(String[] args) throws FileNotFoundException,IOException{
    ArgumentSeperator arguments = new ArgumentSeperator(args);
    String[] fileNames = arguments.getFileNames();
    String[] options = arguments.getOptions();
    Accumulator tl = new Accumulator();
    

    for(int index=0;index<fileNames.length;index++){
      File fl = new File(fileNames[index]);
      InputStream is = new FileInputStream(fl);
      int size = is.available();
      String data="";
      for(int i=0; i< size; i++)
        data += (char)is.read();
      Executor ex = new Executor(options,data);
      int[] result = ex.getExecutedCount();
      System.out.println("\t"+result.toString()+" "+fileNames[index]);
    }

  }
}
