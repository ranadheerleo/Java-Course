package java.online.course;
import java.util.*;

public class SearchForElement {
    public static void main(String args[]){
        List <Integer> numbers = new ArrayList <Integer>();
             numbers.add(12);
             numbers.add(22);
             numbers.add(32);
             numbers.add(42);
             numbers.add(52); 
             numbers.add(62);
             numbers.add(72);
             numbers.add(82);
             numbers.add(92);
             numbers.add(102);
             numbers.add(112);  
        List <Integer> numbers2 = new ArrayList <Integer>(); 
        List numbers3 =new ArrayList();
             numbers3.add("Maths");
        System.out.println("Get the 4th element from Numbers:" + numbers.get(3));
        System.out.println("Compare 4th & 6th elements equal or not:" +numbers.get(3).equals(numbers.get(5)));
        System.out.println("Copy all elements from numbers to numbers2:"+numbers2.addAll(numbers));
        System.out.println("Copy all elements from numbers2 to numbers3:" + numbers3.addAll(numbers2));
        System.out.println("Elements in Numbers2:"+numbers2);
        System.out.println("Elements in Numbers3:"+numbers3);
        System.out.println("Before removing elements size of Numbers:"+numbers.size());
        System.out.println("Remove 11th element from Numbers:"+numbers.remove(10));
        System.out.println("After removing 11th element in Numbers:"+numbers);
             
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)==72)
                System.out.println("seraching and removing the element:"+numbers.remove(i));
        }
        System.out.println("Elements in Numbers"+numbers);
        System.out.println("After removing elements size of Numbers:"+numbers.size());             
        System.out.println("Elements in Numbers2"+numbers2);
        System.out.println("Elements in Numbers3"+numbers3);
             
    }
   
    
    
}
