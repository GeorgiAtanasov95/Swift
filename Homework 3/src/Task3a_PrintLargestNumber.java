import java.util.Scanner;
public class Task3a_PrintLargestNumber {
    public static void main(String args[]){
        


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int current = sc.nextInt();
        int max = current;
        for (int i = 1; i < n; i++) {
            current = sc.nextInt();
            
                
              if (current > max) {
                max = current;
            }
        }

        System.out.println(max);
    }
}

    

