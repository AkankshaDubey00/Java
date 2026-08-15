import java.util.*;
import java.util.ArrayList;

public class multiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Intilizatiion

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //add elemrnts 
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
   }
}
