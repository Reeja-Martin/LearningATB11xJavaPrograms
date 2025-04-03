package ex_10_Array;

import java.util.Scanner;

public class Lab_043_array_userInput {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=scanner.nextInt();

        int[] marks=new int[size];


        for(int i=0;i<marks.length;i++) {
            System.out.println("enter marks");
             marks[i]=scanner.nextInt();
        }

        int max_num = max_fun(marks);
        int min_num = min_fun(marks);
        System.out.println(max_num);
        System.out.println(min_num);

        scanner.close();

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
