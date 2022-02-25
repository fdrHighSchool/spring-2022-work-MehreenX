public class MetroCard{

  private int Time;
  private int numUses;
  private boolean Vaild;

  public MetroCard(int Time, int numUses, boolean Vaild){
    this.Time = Time;
    this.numUses = numUses;
    this.Vaild = Vaild;

  }//end constructor

  public boolean getVaild(){
    return this.Vaild;
  }//end getVaild

  public int getnumUses(){
    return this.numUses;
  } //end getnumUses

  public boolean Vaildcard(){
    if((this.Time < 2031 && this.Time > 529) && numUses > 0){
      return true;
    }// end if
    else{
      return false;
    }// end else

  }//end Vaildcard

 public void numUses(){
   if(){

   }
 }//end 


}//end class
