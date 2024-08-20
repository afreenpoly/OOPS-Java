import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        String name="Afreen";
        int code = name.hashCode();
        System.out.println(code);
        //1958590433

        HashMap<String,Integer> map= new HashMap<>();
        map.put("Afreen",2);
        System.out.println(map.get("Afreen"));
        //2

        map.getOrDefault("Navin",69); 
        System.out.println(map);
        //{Afreen=2}

        map.putIfAbsent("Jyothi", 7);
        System.out.println(map);
 
    }

    
}
