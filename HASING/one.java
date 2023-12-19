package HASING;
import java.util.HashMap;
public class one {
    public static void main(String args[]){
        //create
        HashMap<String,Integer> hm = new HashMap<>();
        
        //insertion
        hm.put("india",160);
        hm.put("bhutan",16);
        hm.put("usa",10);
        System.out.println(hm);

        //Get - O(1)
       int pop = hm.get("india");
       System.out.println(pop);

       //containskey
       System.out.println(hm.containsKey("india"));

        //removekey
        System.out.println(hm.remove("usa"));

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm.isEmpty());


    }
}
