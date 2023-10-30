class P_Constructor
{
    int x,y;
    P_Constructor(int a,int b){
        x=a; y=b;
    }
    P_Constructor(int a, String b){
        System.out.println(a+" "+b);
    }
    void show()
    {
        System.out.println(x+" "+y);
    }

    public static void main(String args[])
    {
        P_Constructor r=new P_Constructor(100,200);
        r.show();

        P_Constructor ref = new P_Constructor(4,"Ram");
    }
}