package ex_10_Array;

public class Lab_049_2D_Array {
    public static void main(String[] args) {

        int[][] marks =new int[2][2]; //rows,columns .Equal rows and columns is matrix

        // other way

        int[][] names={{1,2,3},{1,3,44},{1,1,1}};

        for(int i=0;i<names.length;i++)
        {
            for(int j=0;j<names[i].length;j++)
            {
                System.out.print(names[i][j]+"  ");
            }
            System.out.println();
        }
        // Jagged array means each rows can have differnt length

        int[][] jaggedArray={{1,2,3},{1,3,44,35},{12}};
    }
}
