import java.io.*;

public class files {
    public void main(String[] args) throws IOException {
        String s = "Don't Mess With Him.";
        try {
            FileOutputStream fop = new FileOutputStream("/C:/Users/danie/OneDrive/Desktop/software programs/1.txt", true);
            int l = s.length();
            int i = 0;
            for (i = 0; i < l; i++) {
                fop.write(s.charAt(i));
            }
        } catch (Exception e) {

        }
    }
}