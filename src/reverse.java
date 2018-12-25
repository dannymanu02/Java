import java.util.*;

public class reverse {
    public static void main(String[] args) {
        int n, i,rev=0;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        i = n;
        while(n!=0){
            rev = rev*10+n%10;
            n = n/10;
        }

        System.out.println("reverse of the number " +i+ " is "+rev);
    }
}