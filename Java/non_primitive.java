public class non_primitive{
    public static void main(String[] args){
        //non primitive data type
        // string is a emmutable

        String name = "Deepak verma";
        System.out.println(name.length());
        
        //concatinate string
        String friend = "Sita";
        String fri = "Ram";
        String make =  friend +" " + fri;
        System.out.println(make);

        //CharAt to find the charcater with index number
        String name1 = "Shyam";
        System.out.println(name1.charAt(2));

        //replace  singl char replace use '' and mulitple replace use " "
        String aa="ram";
        String aa1= aa.replace("ram", "shyam");
        System.out.println(aa1);

        //substring
        String bb= "ram and shyam";
        System.out.println(bb.substring(0,4));

    }
}