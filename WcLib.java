class WcLib{
    private String givenData;
    public WcLib(String givenString){
      givenData = givenString;
    }

    public int getCharacterCount(){
      return givenData.length();
    }

    public int getWordCount(){
      if(givenData.length() == 0)
        return 0;
      return givenData.split("\\s+").length;
    }

    public int getLineCount(){
      return givenData.split("\n").length;
    }

}
