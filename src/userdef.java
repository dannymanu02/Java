public class userdef extends Exception {
    public userdef(String s){
        super(s);
        //System.out.println(s);
    }
}

class death{
    public static void main(String [] args){
        try{
            throw new userdef("Error Detected");
        }
        catch(userdef e){
            System.out.println(e.getMessage());
        }
    }
}
