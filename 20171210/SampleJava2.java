import java.util.*;

public class SampleJava2{
    public static void main(String[] args){

        //HashMap
        Map<String,Integer> profs = new HashMap<String,Integer>();

        profs.put("佐藤",40);
        profs.put("スズキ",20);
        profs.put("Tanaka",15);

        System.out.println(profs);
        /* {スズキ=20, Tanaka=15, 佐藤=40} */

        for(String key: profs.keySet()){
            System.out.println(key+"さん "+profs.get(key)+"歳");
            /*
            スズキさん20歳
            Tanakaさん15歳
            佐藤さん40歳
            */
        }

        //TreeMap
        Map<String,Integer> profs2 = new TreeMap<String,Integer>();

        profs2.put("い、佐藤",40);
        profs2.put("あ、スズキ",20);
        profs2.put("う、Tanaka",15);

        System.out.println(profs2);
        /* {あ、スズキ=20, い、佐藤=40, う、Tanaka=15} */

        for(String key: profs2.keySet()){
            System.out.println(key+"さん "+profs2.get(key)+"歳");
            /*
            あ、スズキさん 20歳
            い、佐藤さん 40歳
            う、Tanakaさん 15歳
            */
        }
    }
}
