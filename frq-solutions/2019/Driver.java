public class Driver{
  public static void main (String[] args) {
    StepTracker person1 = new StepTracker (10000);
    person1.addDailySteps(9999);
    person1.addDailySteps(11000);
    person1.addDailySteps(13300);
    person1.addDailySteps(19000);
    person1.addDailySteps(22200);
    System.out.println("Active days: " + person1.activeDays());
    System.out.println("Total days: " + person1.day());
    System.out.println("Average steps: " + person1.averageSteps());
    System.out.println("Total steps: " + person1.steps());
    System.out.println();
  }
}
