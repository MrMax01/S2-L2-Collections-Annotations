import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EsercizioDue {
    public static void main(String[] args) {

        List<Integer> myList= new ArrayList<>(createRandomIntList(5));
        System.out.println(myList);
        System.out.println(createReverseList(myList));
        printEvenOrOdd(myList, false);
    }
    public static List<Integer> createRandomIntList(int n){
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            output.add((int) (Math.random()*100));
        }
        Collections.sort(output);
        return  output;
    }
    public static List <Integer> createReverseList(List<Integer> listToReverse){
        List <Integer> output= new ArrayList<>(listToReverse);
        Collections.reverse(output);
        return output;
    }

    public static void printEvenOrOdd(List<Integer> myList, boolean flag){
        Iterator<Integer> i = myList.iterator();
        if(flag){
            while(i.hasNext()){
                int current= i.next();
                if(myList.indexOf(current)%2==0) System.out.println(current);
            }
        }else{
            while(i.hasNext()){
                int current= i.next();
                if(myList.indexOf(current)%2 !=0) System.out.println(current);
            }
        }
    }
}
