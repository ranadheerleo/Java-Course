package java.online.course;
import java.util.*;

public class CommonElements {
    
    public List <String> CommonArray (List <String> batsman, List <String> bowlers){
        
        List <String> allRounders = new ArrayList();
        for(int i=0;i<batsman.size();i++){
            if(bowlers.contains(batsman.get(i))){
                allRounders.add(batsman.get(i));
            }
        }
        return allRounders;
    }
    void RemoveCommonElements(List <String> batsman, List <String> bowlers){
        List<String> allRounders = CommonArray(batsman,bowlers);
        
        for(int i=0;i<allRounders.size();i++){
            batsman.remove(allRounders.get(i));
            bowlers.remove(allRounders.get(i));
            
        }             
    }   
}
