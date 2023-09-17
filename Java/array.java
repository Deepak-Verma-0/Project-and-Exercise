import java.util.*;
public class array{
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0]=45;
        marks[1]=66;
        marks[2]=44;
        

        // length
        System.out.println(marks.length);

        //sort to use sorting data accending and deaccending

        System.out.println(marks[0]);

        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[0] + marks[1]);

        int[] arks ={34,43,22};
        System.out.println(arks[2]);

        // mulitdimensanal array

        int[][] multi = {{33,22,55},{44,66,64}};
        System.out.println(multi[0][2]);
        System.out.println(multi[1][2]);

        

    }
}