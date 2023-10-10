import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EsercizioTre {
    public static void main(String[] args) {
        Map<String, Integer> addressBook= new HashMap<>();
        addressBook.put("Massimo", 346785166);
        addressBook.put("Andrea",534782879);
        addressBook.put("Jack", 438743809);
        System.out.println(addressBook);
        addressBook.remove("Massimo");
        System.out.println(addressBook);
        findFromValue(addressBook, 346785166);

    }

    public static void findFromValue (Map myMap, int value){
        Set<String> chiavi = myMap.keySet();
        String keyResult;
        for (String chiave : chiavi) {
            if((int)myMap.get(chiave)==value) keyResult= chiave;
        //da risolvere un atitmo

        }
       // System.out.println(myMap.get(keyResult));
    }
}
