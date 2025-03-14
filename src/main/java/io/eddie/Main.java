package io.eddie;

public class Main {
    public static void main(String[] args) {

//        int a = 1;
//        int b = 2;
//        int c = 3;
//        int d = 4;
//        int e = 5;

        int[] integerArray1 = new int[5];

        integerArray1[0] = 1;
        integerArray1[1] = 2;
        integerArray1[2] = 3;
        integerArray1[3] = 4;
        integerArray1[4] = 5;

        for ( int i = 0; i < 5; i++ ) {
            integerArray1[i] = i + 1;
        }

        int[] integerArray2 = {1,2,3,4,5};

        for ( int i = 0; i < 5; i++ ) {
            System.out.printf("integerArray1[%d] = %d\n", i, integerArray1[i]);
        }

        for ( int i = 0; i < 5; i++ ) {
            System.out.printf("integerArray2[%d] = %d\n", i, integerArray2[i]);
        }


    }
}