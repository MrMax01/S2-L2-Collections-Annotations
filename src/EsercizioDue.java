import java.util.*;

public class EsercizioDue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = askNumber(in);
        List<Integer> myList= new ArrayList<>(createRandomIntList(num));
        System.out.println(myList);
        List<Integer> allList = new ArrayList<>();
        allList.addAll(myList);
        allList.addAll(createReverseList(myList));
        System.out.println(createReverseList(myList));
        System.out.println(allList);
        printEvenOrOdd(myList, true);
        in.close();
    }

    public static int askNumber(Scanner in){
        int num;

        System.out.println("quanti elementi desideri nella tua lista....");
        try{
            num = Integer.parseInt(in.nextLine());
            return num;
        }catch(Exception ex){
            System.out.println("il numero inserito non è un intero");
            return askNumber(in);
        }

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
