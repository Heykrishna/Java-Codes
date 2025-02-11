// hashmaps are unordered maps in java, they do not follow any order  

// import java.util.*;

// class Classroom {
//     public static void main(String[] args){

//         // create
//         HashMap<String, Integer> hm = new HashMap<>();

//         // insert - O(1)
//         hm.put("India", 100);
//         hm.put("China", 150);
//         hm.put("US", 50);

//         System.out.println(hm);


//         // get - O(1)
//         int population = hm.get("India");

//         System.out.println(population);

//         System.out.println(hm.get("Indonesia"));       // returns null values if keys are not present

//         // contains - O(1)
//         System.out.println(hm.containsKey("India"));        // true
//         System.out.println(hm.containsKey("Indonesia"));        // false


//         // remove - O(n)
//         System.out.println(hm.remove("China"));     // after deleting it will return the value of key corresponding to that key 
//         System.out.println(hm);

//         System.out.println(hm.remove("Indonesia"));         // it will return null value 


//         // size 
//         System.out.println(hm.size());      // 3

//         // is empty
//         System.out.println(hm.isEmpty());   // false


//         // clear 
//         hm.clear();
//         System.out.println(hm.isEmpty());   // true

//     }
// }



///////////////////////////////////////////////////////////////////////////////////////

// Iteration on jashmap 

import java.util.*;


class Classroom {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Indonesia", 30);
        hm.put("US", 90);
        hm.put("Nepal", 5);

        System.out.println(hm);

        // iterate  
        Set<String> keys = hm.keySet();     // iteration over keys 
        System.out.println(keys);

        for (String k : keys) {    // iterate over arrays or iterables  
            System.out.println("Key = " + k + ", Values = " + hm.get(k));
        }


        // entryset 
        
    }
}