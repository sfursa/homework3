package com.company;

public class Main {

    public static void main(String[] args) {

        int month = 9;
        if (month >= 3 && month <= 5) {
            System.out.println("весна");
        } else if (month >= 6 && month <= 8) {
            System.out.println("лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("осень");
        } else if (month > 0 && month <= 2) {
            System.out.println("зима");
        } else if (month == 12) {
            System.out.println("зима");
        } else {
            System.out.println("!error!");
        }
        System.out.println();


        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
        }
        System.out.println();


        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 113};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();


        int[][] squareArray = new int[2][3];
        squareArray[0][0] = 11;
        squareArray[0][1] = 12;
        squareArray[0][2] = 13;
        squareArray[1][0] = 14;
        squareArray[1][1] = 15;
        squareArray[1][2] = 16;
//        System.out.print(squareArray[0][0] + "[" + 0 + "]" + "[" + 0 + "] ");
//        System.out.print(squareArray[0][1] + "[" + 0 + "]" + "[" + 1 + "] ");
//        System.out.println(squareArray[0][2] + "[" + 0 + "]" + "[" + 2 + "] ");
//        System.out.print(squareArray[1][0] + "[" + 1 + "]" + "[" + 0 + "] ");
//        System.out.print(squareArray[1][1] + "[" + 1 + "]" + "[" + 1 + "] ");
//        System.out.println(squareArray[1][1] + "[" + 1 + "]" + "[" + 2 + "] ");
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray[i].length; j++) {

                System.out.print(squareArray[i][j] + "[" + i + "]" + "[" + j + "]" + " ");
            }
            System.out.println();
        }


    }
}
