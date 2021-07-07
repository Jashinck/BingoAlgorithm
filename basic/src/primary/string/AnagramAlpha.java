package primary.string;

import java.util.HashMap;

/**
 * 有效的字母异位词
 */
public class AnagramAlpha {

    public static void main(String[] args){
        System.out.println(isAnagram("aacc", "ccac"));

        String string = "A man, a plan, a canal: Panama";
        System.out.println(string.toLowerCase());
        System.out.println(string.replaceAll("[^A-Za-z]","").toLowerCase());
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<String, Integer> sMap = new HashMap<>();
        HashMap<String, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String currentS = String.valueOf(s.charAt(i));
            String currentT = String.valueOf(t.charAt(i));
            sMap.merge(currentS, 1, Integer::sum);
            tMap.merge(currentT, 1, Integer::sum);
        }
        for(String sKey: sMap.keySet()){
            if (sMap.get(sKey).equals(tMap.get(sKey))) {
                continue;
            }
            return false;
        }
        return true;
    }
}
