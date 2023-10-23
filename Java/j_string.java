public class j_string{
    public static void main(String[] args){
        String str="Ramesh ";
       // String  str1 = new String ("Ramesh");
       String str1=str.concat("Kumar");

       System.out.println(str1);

       if(str.equals(str1)){
        System.out.println("both are  equal");
       }
       else
       {
        System.out.println("not equle");
       }
    }
}