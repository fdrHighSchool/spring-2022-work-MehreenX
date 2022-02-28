public class MetroCard{

  private int Time;
  private int numUses = 0;
  private boolean Vaild;

  public MetroCard(int Time, int numUses, boolean Vaild){
    this.Time = Time;
    this.numUses = numUses;
    this.Vaild = Vaild;

  }//end constructor
  public void setVaild(boolean e){
    this.Vaild = e ;
  }

  public boolean getVaild(){
    return this.Vaild;
  }//end getVaild

  public int getnumUses(){
    return this.numUses;
  } //end getnumUses

  public boolean Vaildcard(){
    if((this.Time < 2031 && this.Time > 529) && numUses > 0){
      return "Vaild";
    }// end if
    else{
      return "Not vaild! 5am-8pm Only.";
    }// end else

  }//end Vaildcard

 public void numUses(){
   if(this.numUses == 3){
     System.out.println ("No more rides")
   }//
 }//end


}//end class
