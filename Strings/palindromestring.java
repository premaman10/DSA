
public class palindromestring{
    public static void isPalindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println("False");
            }
        }
        System.out.println("True");
    }
    public static void main (String args[]){
        String str="racecar";
        isPalindrome(str);
    }
}