package primary.string;

import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {
        String lengthStr = "abba";
        System.out.println(new LongestSubstring().lengthOfLongestSubstringA(lengthStr));
    }

    public int lengthOfLongestSubstringB(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        List<String> reBuildStr = new ArrayList<>();
        int curMaxSize = 0;
        int repeatIndex = -1;
        int maxValue = 0;
        for (int i = 0; i < s.length(); i++) {
            String curNum = String.valueOf(s.charAt(i));
            if (reBuildStr.contains(curNum)) {
                int lastIndex = reBuildStr.lastIndexOf(curNum);
                if (lastIndex > repeatIndex) {
                    curMaxSize = i - lastIndex - 1;
                    repeatIndex = lastIndex;
                }
            }
            reBuildStr.add(curNum);
            curMaxSize++;
            maxValue = Math.max(curMaxSize, maxValue);
        }
        return maxValue;
    }

    public int lengthOfLongestSubstringA(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> buildMap = new HashMap<>();
        int maxLength = 0;
        int leftIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (buildMap.containsKey(curChar)) {
                leftIndex = Math.max(leftIndex, buildMap.get(curChar) + 1);
            }
            buildMap.put(curChar, i);
            maxLength = Math.max(maxLength, i - leftIndex + 1);
        }
        return maxLength;
    }

}
