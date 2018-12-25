import java.io.*;

public class File {
    public static void main(String[] args)throws IOException {
        String s = "Manoj";
        String st[];
        char i;
        int j=0,k=0;
        st = new String[100];
        try {
            //File f = new File("/C:/Users/danie/Desktop/software programs/1.txt");
            //st = new String[100];
            FileInputStream f = new FileInputStream("/C:/Users/danie/OneDrive/Desktop/software programs/1.txt");
            j=0;
            while(f.available()>0){
                 i = (char)f.read();
                 st[j] = i+"";
                 j= j+1;
            }
            f.close();
        }

        catch(Exception e){

        }

        try{
            FileWriter fr = new FileWriter("/C:/Users/danie/OneDrive/Desktop/software programs/2.txt");
            while(k!=j){
                fr.write(st[k]);
                k=k+1;
            }
            fr.close();
        }
        catch(Exception ef){

        }
    }

}