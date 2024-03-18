package homeworks.homework38.task3;

public class PalindromeDemo {
    public static void main(String[] args) {
        Palindrome<String> stringPalindrome = s -> {
            String cleanStr = arrayString(s);
//            return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
            return cleanStr.contentEquals(new StringBuilder(cleanStr).reverse());
        };


        System.out.println(stringPalindrome.check("Madam")); // true
        System.out.println(stringPalindrome.check("piy-piy")); // true


    }
    private static String arrayString(String str) {
        StringBuilder cleanStrBuilder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanStrBuilder.append(Character.toLowerCase(ch));
            }
        }
        return cleanStrBuilder.toString();
    }

}
