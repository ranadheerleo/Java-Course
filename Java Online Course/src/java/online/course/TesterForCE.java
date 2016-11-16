
package java.online.course;
import java.util.*;

public class TesterForCE {
    public static void main(String args[]){
        List <String> batsman = new ArrayList <String>();
             batsman.add("Dhoni");
             batsman.add("Kohli");
             batsman.add("Rohit Sharma");
             batsman.add("Yuvraj");
             batsman.add("Jadeja");
                                       
        List <String> bowlers= new ArrayList <String>(); 
             bowlers.add("Shami");
             bowlers.add("Umesh Yadav");
             bowlers.add("Jadeja");
             bowlers.add("Yuvraj");
             bowlers.add("Ishant Sharma");
                          
      System.out.println("Batsman list(Before removing): " +batsman);
      System.out.println("Bowlers list(Before removing): " +bowlers);
      CommonElements commonElements = new CommonElements();
      List<String> allRounders = commonElements.CommonArray(batsman,bowlers);
      System.out.println("All Rounders in Batsman & Bowlers lists: " +allRounders);
      commonElements.RemoveCommonElements(batsman,bowlers);
      System.out.println("Batsman list(After removing): " +batsman);
      System.out.println("Bowlers list(After removing): " +bowlers);
    
    }       
}   