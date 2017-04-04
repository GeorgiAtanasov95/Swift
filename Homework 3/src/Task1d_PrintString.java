/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Task1d_PrintString {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String read = sc.nextLine();
for(int  i = 0;i<read.length();i++){
    System.out.println(read.charAt(i));
}
    }
}
