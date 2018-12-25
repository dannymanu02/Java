public class outer {
    void di0(){
        System.out.println("Outer");
    }
    class inner {
        void di(){
            System.out.println("Inner");
        }
    }
}

class my{
    public static void main(String [] args){
        outer.inner in = new outer().new inner();
        in.di();
        outer ou = new outer();
        ou.di0();
    }
}
