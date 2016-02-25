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
      return (this.givenData.length() == 0) ? 0 : this.givenData.split("\\s+").length;
    }

    public int getLineCount(){
      return (this.givenData.length() == 0) ? 0: this.givenData.split("\n").length;
    }

    public int getByteCount(){
      return this.givenData.getBytes().length;
    }

    public int[] getLinesWordsBytes(){
      int[] result = {this.getLineCount(),this.getWordCount(),this.getByteCount()};
      return result;
    }
}
