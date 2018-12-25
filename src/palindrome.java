import java.util.*;

public class palindrome{
    public static void main(String [] args){
        String s;
        int i,j,l;

        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        j = s.length();
        l = j-1;
        for(i=0;i<=j/2;i++){
            if(s.charAt(i)==s.charAt(l)){
                l--;
            }

            else{
                System.out.println("Not a Palindrome");
                System.exit(0);
            }

        }

        System.out.println("Is a Palindrome");
    }
}
