package everydayExercise_2022_11;

public class palindrome2 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
    s = s.toLowerCase();
    int len = s.length();
    int left=0;
    int right = len-1;
    while (left<right){
        if (!ischaraOrNum(s.charAt(left))){
            left++;
            continue;}// continue ������������ѭ����������һ��ѭ����ֱ��������η���ĸ���ֵıȽ�
        if (!ischaraOrNum(s.charAt(right))) {
            right--;continue;
        }
        if (s.charAt(left)!=s.charAt(right))
            return false;
        left++;
        right--;
    }
    return true;
    }
    public static boolean ischaraOrNum(char c){
        return ('a'<=c&&c<='z')||('A'<=c&&c<='Z')||('0'<=c&&c<='9');
    }
}
