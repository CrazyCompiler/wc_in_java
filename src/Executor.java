class Executor{

    private String[] options;
    private String data;

    public Executor(String[] options,String data){
      this.data = data;
      this.options = options;
    }

    private int[] push(int[] array, int push) {
        int[] longer = new int[array.length + 1];
        for (int index = 0; index < array.length; index++)
            longer[index] = array[index];
        longer[array.length] = push;
        return longer;
    }

    private int performAction(String option){
      WcLib lib = new WcLib(this.data);
      if(option.equals("-c"))
          return lib.getByteCount();
      if(option.equals("-l"))
          return lib.getLineCount();
      if(option.equals("-w"))
          return lib.getWordCount();
      return lib.getCharacterCount();
    }


    public int[] getExecutedCount(){
      int[] result = new int[0];
      WcLib lib = new WcLib(this.data);
      if(this.options.length == 0)
        return lib.getLinesWordsBytes();
        for (String option : this.options) {
            result = this.push(result, this.performAction(option));
        }
      return result;
    }


}
