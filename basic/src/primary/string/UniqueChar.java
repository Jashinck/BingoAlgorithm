package primary.string;

/**
 * 唯一不同的字符
 * @author Amboo
 */
public class UniqueChar {

    public static void main(String[] args){
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s){
        String visited = "";
        char[] array = s.toCharArray();
        for(int i = 0; i< array.length; i++){
            char currentValue = array[i];
            if(visited.contains(String.valueOf(currentValue))){
                continue;
            }
            int j = i + 1;
            while (j < array.length) {
                if(array[i] == array[j++]){
                    j--;
                    break;
                }
            }
            if(j == array.length){
                return i;
            }
            visited += array[i];
        }
        return -1;
    }
}
