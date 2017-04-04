/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Task1e_Print2dArray {

    public static void main(String args[]) {
        int counter = 1;
        int[][] arr = new int[4][4];
        for (int[] arr1 : arr) {
            for (int col = 0; col < arr.length; col++) {
                arr1[col] = counter;
                counter++;
                System.out.print(arr1[col] + " ");

            }

            System.out.println();
        }

    }
}
