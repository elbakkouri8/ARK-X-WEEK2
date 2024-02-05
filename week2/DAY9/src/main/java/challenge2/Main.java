package challenge2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        boolean existe=false;
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("mohamed","brahim", "said", "mohamed","mouad"));
        list1.add("elbakkouri");


        System.out.println("list = " + list1);

        System.out.println("Remove  brahim .....");
        list1.remove("brahim");


        System.out.println("Searching  mohamed .....");
        for(String s : list1){
            String x= "mohamed";
            if(s.equals(x)){
                System.out.println(x + " exist in the list");
                existe  = true;
                break;
            }
        }
        if(!existe){
            System.out.println("mohamed not exist in the list");
        }


        System.out.println("list = " + list1);
    }
}
