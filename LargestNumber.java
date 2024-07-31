import java.util.*;
class LargestNumber{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int ar[]= new int [n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        LargestNumber ob  = new LargestNumber();
        System.out.println(ob.Largest(ar, n));
        
    }
    public int Largest( int ar[],int size ){
        Arrays.sort(ar);
        return ar[size-1];
    }
}