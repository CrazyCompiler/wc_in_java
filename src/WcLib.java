import java.lang.*;

class WcLib{
    private String givenData;
    public WcLib(String givenString){
      this.givenData = givenString;
    }

    public int getCharacterCount(){
      return this.givenData.length();
    }

    public int getWordCount(){
      if(this.givenData.length() == 0)
        return 0;
      return this.givenData.split("\\s+").length;
    }

    public int getLineCount(){
      if(this.givenData.length() == 0)
        return 0;
      return this.givenData.split("\n").length;
    }

    public int getByteCount(){
      if(this.getLineCount()>0)
        return this.givenData.getBytes().length+(this.getLineCount()-1);
      return this.givenData.getBytes().length;
    }

    public int[] getLinesWordsBytes(){
      int[] result = {this.getLineCount(),this.getWordCount(),this.getByteCount()};
      return result;
    }
    
}
