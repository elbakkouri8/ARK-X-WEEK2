package challenge6;

public class Main {
    public static void main(String[] args) {

        int[] table = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        boolean existe=false;
        int value = 20;

        for(int i = 0; i < table.length; i++) {
            if(table[i] == value) {
                System.out.println("the index of element " + value + " is : " + i);
                existe  = true;
                break;
            }
        }
        if(!existe)System.out.println("the element " + value + " is not existe");




    }
}
