import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean checkPalindrome (String str) {
        Stack<String> stackString = new Stack<>();
        Queue<String> queueString = new LinkedList<>();
        String string = str.toLowerCase();
        System.out.println("After convert to lowercase: " + string);
        for (int i = 0; i < string.length(); i++) {
            stackString.push(string.charAt(i) + "");
            queueString.offer(string.charAt(i) + "");
        }
        int length = string.length();
        boolean result = true;
        for (int i = 0; i < length ; i++) {
            if (!stackString.pop().equals(queueString.poll())) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        String str1 = "Kien";
        System.out.println(Palindrome.checkPalindrome(str));
        System.out.println(Palindrome.checkPalindrome(str1));
    }
}
