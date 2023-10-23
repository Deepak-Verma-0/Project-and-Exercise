
            //Constructor

class A{
    int  a; String  name;
    A()  {
        a=0; name=null;

    }
    void show()
    {
        System.out.print(a+" "+name);
    }
}
class Constructor_c
{
    public static void main(String[] args){
        A ref=new  A();
        ref.show();
    }
}