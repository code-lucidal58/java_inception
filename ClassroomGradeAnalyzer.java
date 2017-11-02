// a simple tool to help analyze classroom grades stored in an ArrayList
// the analyzer you build will be able to retrieve the classroom average

import java.util.ArrayList;
import java.util.Collections;

class ClassroomGradeAnalyzer{
  public ClassroomGradeAnalyzer(){
    
  }
  
  public int getAverage(ArrayList<Integer> grades){
    if(grades.size() <1){
      System.out.println("The lkst is empty");
      return 0;
    } else {
      int sum = 0;
      for(Integer grade:grades){
        sum+=grade;
      }
      int average = sum/grades.size();
      System.out.println("Average is "+average);
      return average;
    }
  }
  
  public int getHighestGrade(ArrayList<Integer> grades){
    ArrayList<Integer> d = grades;
    Collections.sort(d); //sorts in ascending order
    System.out.println("Highest Grade is "+d.get(d.size()-1));
    return d.get(d.size()-1);
  }
  
  public int getLowestGrade(ArrayList<Integer> grades){
    ArrayList<Integer> d = grades;
    Collections.sort(d); //sorts in ascending order
    System.out.println("Lowest Grade is "+d.get(0));
    return d.get(0);
  }
  
  public static void main(String[] args){
    ArrayList<Integer> myClassroom = new ArrayList<Integer>();
    myClassroom.add(98);
    myClassroom.add(92);
    myClassroom.add(88);
    myClassroom.add(75);
    myClassroom.add(61);
    myClassroom.add(89);
    myClassroom.add(95);
    ClassroomGradeAnalyzer myAnalyzer = new ClassroomGradeAnalyzer();
    myAnalyzer.getAverage(myClassroom);
    myAnalyzer.getHighestGrade(myClassroom);
    myAnalyzer.getLowestGrade(myClassroom);
  }
}