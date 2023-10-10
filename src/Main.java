import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = askNumber(in);
        String[] myArr = new String[num];


        for (int i = 0; i < num; i++) {
            System.out.println("Inserire parola N°"+(i+1)+":");
            while(true){
                try{
                    myArr[i]=in.nextLine();
                    break;
                }catch (Exception ex){
                    System.err.println(ex.getMessage());
                }
            }
        }
        Set<String> myList = new HashSet<>(Arrays.asList(myArr));


        System.out.println(findDuplicates(myArr));

        System.out.println(myList.size());
      /*
        * for (String word: myList) {
        *   System.out.println(word);
        * }
        * */
        System.out.println(myList);
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
    public static List<String> findDuplicates(String[] myArr) {

        HashSet<String> store = new HashSet<>();
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < myArr.length; i++) {
            String current = myArr[i];
            if (store.contains(current)) {
                output.add(current);
            } else {
                store.add(current);
            }
        }
        return output;
    }
}
