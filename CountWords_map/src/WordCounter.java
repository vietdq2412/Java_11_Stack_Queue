import java.util.Scanner;
import java.util.TreeMap;

public class WordCounter {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        String string = "từ ngày em ra đi Anh đi ra đi vào ra em đi";

        //System.out.println(string.charAt(string.length()));
        String key = "";
        int index = 0;
        while (index <= string.length()) {
            if (index == string.length()) {
                if (map.containsKey(key)) {
                    map.replace(key, map.get(key) + 1);
                }else map.put(key,1);
                break;
            }
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
                System.out.println("replace "+index);
                key = "";
                index++;
                continue;
            }
            String point = String.valueOf(string.charAt(index));
            if (point.equals(" ") || point.equals(".")) {
                System.out.println("PUt "+index);
                map.put(key, 1);
                key = "";
                index ++;
                continue;
            }
            key += string.charAt(index);
            System.out.println("add "+index);
            index++;
        }
//        while (index < string.length()) {
//            while (i <= string.length()) {
//                if (i == string.length()) {
//                    index = i;
//                    break;
//                }
//                if (string.charAt(i) == ' ') {
//                    index = i;
//                    break;
//                }
//                key += string.charAt(i);
//                i++;
//            }
//            i = ++index;
//
//            if (map.containsKey(key)) {
//                map.replace(key, map.get(key) + 1);
//                System.out.println("replace");
//                key = "";
//                continue;
//            }
//            map.put(key, 1);
//            key = "";
//        }
        System.out.println(map);
    }

}
