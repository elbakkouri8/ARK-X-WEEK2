package challenge1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int s=0;
        int max,min;

        int[] numbers = {12,19,25,52,18};
        int[] T=new int[numbers.length];

        System.out.print("numbers  = {  ");
        for(int i:numbers  ){
            System.out.print(i + "   ");
        }
        System.out.println("} ");

        for(int i:numbers){
            s+=i;
        }

        max=numbers[0];
        for(int i : numbers){
            if( max<i){
                max=i;
            }
        }
        min=numbers[0];
        for(int i : numbers){
            if( min>i){
                min=i;
            }
        }

        int j=numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            T[j]= numbers[i];
            j--;
        }
        numbers=T;

        System.out.println("SUM : " + s );
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);

        System.out.print("numbers inverse = {  ");
        for(int i:numbers  ){
            System.out.print(i + "   ");
        }
        System.out.print("} ");
    }
}

