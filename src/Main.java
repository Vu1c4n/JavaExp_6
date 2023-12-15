public class Main {
    public static void main(String[] args) {
        String s1 = "cJy12321";
        String s2 = "12321";
        String s3 = "11451411";
        String s4 = "helloWorldHelloWorld";
        System.out.println(MyString.convertCase(s1));
        System.out.println("此字符串是否为回文？："+(MyString.isPalindrome(s2)));
        System.out.println("s1-s2的内容为：" + MyString.removeSubstring(s1,s2));
        System.out.println(MyString.removeDuplicates(s3));
        System.out.println(MyString.countFrequency(s4,"World"));
        System.out.println(MyString.formatNumber(s3));
    }
}
