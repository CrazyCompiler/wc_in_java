class Accumulator {
  private int[] number;

  public Accumulator(int[] number){
    this.number = number;
  }

  public void add(int[] addend){
    for (int index=0;index<this.number.length;index++){
      this.number[index] += addend[index];
    }
  }

  public String toString ()
  {
    String stringRepresentation = "";
    for (int index=0; index<this.number.length;index++){
      stringRepresentation += this.number[index]+" ";
    }
    return stringRepresentation;
  }
}
