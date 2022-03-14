public class Cell{

  private int status;

  public cell(int s){
    this.status = s;
  }
  
  public int getStatus() {
    return this.status;
  }

  public void setStatus(int s) {
    this.status = s;
  }

  public void getStatus(int s){
    if(status){
        return "*";
      }
      else{
        return "-";
      }
    }



}
