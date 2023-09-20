//static method access without creating object
//public method not access without creating object
public class Static_vs_Public{
    static void my(){
        System.out.println("Static mathod");
    }

    public static void make(){
        System.out.println("publicc method");

    }

    //main method

    public static void  main(String[] args){
        my();
        Static_vs_Public  myo =new Static_vs_Public();
        myo.make();
    }
}