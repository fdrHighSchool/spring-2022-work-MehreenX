public class MetroCard{

  private int Time;
  private int numUses;
  private boolean Vaild;

  public MetroCard(int Time, int numUses, boolean Vaild){
    this.Time = Time;
    this.numUses = 3;
    this.Vaild = Vaild;

  }//end constructor
  public void setVaild(boolean e){
    this.Vaild = e ;
  }
  public int setnumUses(){
    this.numUses = 3;
  }
  
  public boolean getVaild(){
    return this.Vaild;
  }//end getVaild

  public int getnumUses(){
    return this.numUses;
  } //end getnumUses

  public boolean Vaildcard(){
    if((this.Time < 2031 && this.Time > 529) && numUses > 0){
      System.out.println("Vaild");
    }// end if
    else{
      System.out.println( "Not vaild! 5am-8pm Only.");
    }// end else

  }//end Vaildcard

 public void numUses(){
   if(this.numUses == 3){
     System.out.println( "No more rides");
   }//
 }//end


}//end class
