class Accumulator {
  private int number;

  public Accumulator(){
    this.number = 0;
  }

  public void add(int addend){
    this.number += addend;
  }

  public int getSum(){
    return this.number;
  }
}
