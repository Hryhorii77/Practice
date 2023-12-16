package hw_11;

public class A {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        //ABA - true
        //ACCA - true
        //AB $ %A - true
        //CADA - false
        isPalindrome(s);
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String lowerCased = s.toLowerCase();
        String removedCharacters =lowerCased.replaceAll("[^a-z0-9]", "");
        for (int i = 0; i < removedCharacters.length() / 2; i++) {
            char leftChar = removedCharacters.charAt(i);
            char rightChar = removedCharacters.charAt(removedCharacters.length() - 1 - i);
            if (rightChar != leftChar) {
                return false;
            }
        }
        return true;
    }
}
