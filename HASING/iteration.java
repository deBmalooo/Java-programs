package HASING;
import java.util.*;
public class iteration {
    public static void main(String[] args){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("india",160);
        hm.put("bhutan",16);
        hm.put("usa",10);

        //Iteration
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k: keys){
            System.out.println("keys="+k+ "values="+hm.get(k));
        }
    }
}
