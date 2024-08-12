import java.util.Scanner;

public class charArray {
    public String transformation(String a){
        char array[] = a.toCharArray();
        for(int i=0;i<a.length();i++ ){
            if(array[i]=='a'){
                array[i]='b';
            }
            else if(array[i]=='b'){
                array[i]='a';
            }
        }
        return new String(array);
    }
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
String a ="aabbcc";
 charArray obj= new charArray();
 System.out.println(obj.transformation(a));
    }
}

