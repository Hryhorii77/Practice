package hw_10;

public class A {
    public static void main(String[] args) {
        String[] str = new String[5];
        String commonPrefix = longestPrefix(str);
        System.out.println(commonPrefix);

    }

    public static String longestPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

}
