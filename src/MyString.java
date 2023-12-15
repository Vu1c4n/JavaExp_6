import java.text.DecimalFormat;
public class MyString {
    public static String convertCase(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
    public static String removeSubstring(String mainString, String subString) {
        return mainString.replace(subString, "");
    }
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[256]; // 用ASCII码作为index,数组记录是否以存在字符

        for (char c : input.toCharArray()) {
            if (!visited[c]) {
                visited[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }
    public static int countFrequency(String input, String subString) {
        int count = 0;
        int index = input.indexOf(subString);

        while (index != -1) {
            count++;
            index = input.indexOf(subString, index + 1);
        }

        return count;
    }
//    public static String formatNumber(String input) {
//        long number = Long.parseLong(input);
//        DecimalFormat formatter = new DecimalFormat("#,###");
//
//        return formatter.format(number);
//    }
    public static String formatNumber(String input){
        int length = input.length();
        if(length <= 3){
            return input;
        }
        StringBuilder sb = new StringBuilder(input);
        int ptr = length%3;
        sb.insert(ptr,',');
        while(ptr+4 < length){
            ptr += 4;
            sb.insert(ptr,',');
        }
        return sb.toString();
    }
}
