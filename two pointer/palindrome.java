package everydayExercise_2022_11;

import java.util.Locale;

public class palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = "0P";
        s=s.toLowerCase(Locale.ROOT);
        String news = s.replaceAll("[^0-9a-zA-Z]", "");
        char[] charnews = news.toCharArray();

        int len = charnews.length;
        int left=0;
        int right = len-1;
        while (left<right){
            if (charnews[left]!=charnews[right])
                return false;
            left++;
            right--;
        }
        return true;
//        System.out.println(charnews);
//        if (len % 2 == 0) {
//            for (int i = 0; i < len / 2; i++) {//java中的除法是地板除
//                for (int j = len-1; j >=len/2; j--) {
//                    if (charnews[i]!=charnews[j])
//                        return false;
//                }
//            }
//            return true;
//        }
//        else {
//            for (int i = 0; i < len / 2; i++) {//java中的除法是地板除
//                for (int j = len-1; j >len/2; j--) {
//                    if (charnews[i]!=charnews[j])
//                        return false;
//                }
//            }
//            return true;
//        }
    }
}
