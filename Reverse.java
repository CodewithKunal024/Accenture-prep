import java.util.*;
public class Reverse 
{
public static void main (String args[])
{
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("ENter number ");
    n=sc.nextInt();
    Reverse ob = new Reverse();
    System.out.println(ob.ReverseNum(n));
}
public int ReverseNum(int n){
    int digit;
    int reverse=0;
    while(n>0){
        digit=n%10;
        reverse=(reverse*10)+digit;
        n=n/10;
    }
    return reverse;
}
}
