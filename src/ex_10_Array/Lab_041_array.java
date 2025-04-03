package ex_10_Array;

import java.util.Arrays;

public class Lab_041_array {
    public static void main(String[] args) {

        int[] marks={12,34,45,23};

        String[] name=new String[5];
        name[0]="zReeja";
        name[1]="Re";
        name[2]="Reesdcsc";
        name[3]="Reeja aartin";
        name[4]="Reeja Prince";
        System.out.println(name[0]);
        System.out.println("length of array is :"+ name.length);

        for(int i=0;i< name.length;i++)
        {
            System.out.println(name[i]);
        }

        System.out.println("---------------------------");
        Arrays.sort(name);

        for(int i=0;i< name.length;i++)
        {
            System.out.println(name[i]);
        }
    }
}
