public class StepTracker{

  private int activeDays;
  private int min;
  private int steps;
  private int days;

  public StepTracker(int m) {
    this.activeDay = 0;
    this.steps = 0;
    this.days = 0;
    this.min = m;
  }//end StepTracker

  public int steps(){
    return this.steps;
  }//end steps

  public int day(){
    return this.days;
  }// end days

  public int activeDays() {
    return activeDay;
  }//end activeDays

  public double averageSteps() {
    if (days == 0){
      return 0.0;
    }
    else{
      return ((double) steps / days);
    }
  }//end averageSteps

  public void addDailySteps(int m) {
    this.step += m;
    this.day++;
    if (m >= this.min) {
      this.activeDay++;
    }
  }//end addDailySteps
}//end class
