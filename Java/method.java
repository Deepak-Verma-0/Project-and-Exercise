public class method{
    
    //method 
        public static void printJava(){
            System.out.println("hello world");
        }

        public static void printName(String name){
            System.out.println(name);
        }

        public static void printSum(int  a,int b){
            int  sum=a+b;
            System.out.println(sum);
        }


    public static void main(String[] args){
        printJava();
        printJava();
        printName("deepak verma");

        printSum(2,3);
        printSum(5,4);
    }
}