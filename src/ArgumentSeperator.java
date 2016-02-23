class ArgumentSeperator{
  private String[] arguments;

  public ArgumentSeperator(String[] arguments){
      this.arguments = arguments;
  }

  private String[] push(String[] array, String push) {
    String[] longer = new String[array.length + 1];
    for (int index = 0; index < array.length; index++)
        longer[index] = array[index];
    longer[array.length] = push;
    return longer;
  }

  public String[] getFileNames(){
    String[] fileNames = new String[0];
    for(int index=0;index<this.arguments.length ;index++){
      if(this.arguments[index].indexOf("-")==-1)
        fileNames = this.push(fileNames,arguments[index]);
    }
    return fileNames;
  }

  public String[] getOptions(){
    String[] options = new String[0];
    for(int index=0;index<this.arguments.length ;index++){
      if(this.arguments[index].indexOf("-")!=-1)
        options = this.push(options,arguments[index]);
    }
    return options;
  }

}
