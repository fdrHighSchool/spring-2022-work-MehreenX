public class Student {
// feilds, instance varaibles (data)
private String id;
private String name;
private boolean closeContact;
private int [] grades;

//constructor method
public student(String id, String
 n, boolean cc, int[] g){
  tpublic double getAverage() {
    int total = 0;

    for (int grade : this.grades) {
      total += grade;
    } // end for-each loop
    return total / grades.length;
  } // end getAverage method

//behaviors (methods)

//get the close closeContact status of thr student
public boolean isCloseContact(){

}//end isCloseContact

public void setCloseContact(boolean value) {

}//end setCloseContact


//see if student is failing
public boolean isFailing(){


}//end isFailing

public String getName(){

}//end getName

public double getAverage() {
    int total = 0;

    for (int grade : this.grades) {
      total += grade;
    } // end for-each loop
    return total / grades.length;
  } // end getAverage method
}//end class
