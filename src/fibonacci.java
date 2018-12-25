import java.util.*;

public class fibonacci {
    public static void main(String [] args){
        int n,i,j,a,b,c;
        System.out.println("Enter the number of elements :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        a=1;
        b=1;

        for(i=1;i<=n;i++){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
