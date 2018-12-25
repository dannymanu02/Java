import java.util.*;

public class prime {
    public static void main(String [] args){
        int i,j,n;
        System.out.println("Enter the number of primes :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("2\n3");
        for(i=2;i<=n;i++){
            for(j=2;j<=i/2;j++){
                if(i%j==0)
                    break;
                else if(j == i/2){
                    System.out.println(i);
                }
            }

        }
    }
}
