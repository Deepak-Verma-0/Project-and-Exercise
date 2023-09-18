public class Exception_handling{
    public static void  main(String[] args){
        // try- cath in exception handling
        int[] array = {4,3,5};
        
        try{
                System.out.println(array[5]);
        }catch(Exception aa){
            System.out.println("code error");
        }
        System.out.println("hello world");
    }

}