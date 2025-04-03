package ex_10_Array;

import java.util.Arrays;

public class Lab_042_array_operations {
    public static void main(String[] args) {

        int[] marks = {12, 34, 45, 23, 120, 11, 11, 12, 234, 13};

        int max_num = max_fun(marks);
        int min_num = min_fun(marks);
        System.out.println(max_num);
        System.out.println(min_num);

    }
    static int max_fun(int[] marks)
    {
        int max=marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max=marks[i];
            }
        }
        return max;
    }

    static int min_fun(int[] marks)
    {
        int min=marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
            }
        }
        return min;
    }
}
