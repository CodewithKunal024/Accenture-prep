import java.util.*;
public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ar[]={-2,1,-3,4,-1,2,1,-5,4};
        int max =0;
        int sum = 0;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
            max=Math.max(max, sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);

    }

}
