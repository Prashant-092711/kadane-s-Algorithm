package company.com;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        int  a[]= new int[5];
        int maxSum=0;
        int curSum=0;
        Scanner A= new Scanner(System.in);
        System.out.println("Enter the Element: ");

        for(int i=0;i<a.length;i++){
            a[i]= A.nextInt();
        }
        for (int i=0;i<a.length;i++){
            curSum= curSum+a[i];
            if (curSum>maxSum){
                maxSum=curSum;
            }
            if (curSum<0){
                curSum=0;
            }
        }
        System.out.println(maxSum+" ");
    }
}
