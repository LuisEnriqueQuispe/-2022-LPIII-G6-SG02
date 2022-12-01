
package apppair;

import java.util.*;
public class AppPair {

   
    public static void main(String[] args) {
        
        OrderedPair<String, Integer> p1 = OrderedPair.of("Casa", 26);
        OrderedPair<String, String> p2 = OrderedPair.of("Tom", "Ball");
        OrderedPair<Integer, String> p3 = OrderedPair.of(26, "Mono");
 
        List<OrderedPair<String, Integer>> pairs1 = new ArrayList<>();
        List<OrderedPair<String, String>> pairs2 = new ArrayList<>();
        List<OrderedPair<Integer, String>> pairs3 = new ArrayList<>();
        pairs1.add(p1);
        pairs2.add(p2);
        pairs3.add(p3);
 
        System.out.println(pairs1);
        System.out.println(pairs2);
        System.out.println(pairs3);

    }
    
}



 

