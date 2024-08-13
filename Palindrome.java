import java.util.Scanner;

public class Palindrome {
    boolean isPalindrome(String a){
        int first= 0;
        int last=a.length()-1;
        while(first<=last){
            char start=a.charAt(first);
            char end=a.charAt(last);
            if(!Character.isLetterOrDigit(start))
            {first++;
                continue;
            }
            else if(!Character.isLetterOrDigit(end)){
                last--;
                continue;
            }
            if(Character.toLowerCase(start)!=Character.toLowerCase(end)){
                return false;
            }
            first++;
            last--;
        }
            return true;
        }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a= "A man, a plan, a canal: Panama";
        Palindrome obj=new Palindrome();
        if(obj.isPalindrome(a)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
