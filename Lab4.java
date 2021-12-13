import java.util.Arrays;
import java.util.Scanner;

public class Lab4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int array[], length;
        int[] arr = null;
        System.out.print("Enter the length of the array:");
        if (s.hasNextInt()){;
           length = s.nextInt();
           array = new int[length];
           for (int i = 0; i < array.length; i++) {
               System.out.print("Enter the elements of the array:");
               array[i] =s.nextInt();
           }
            System.out.println("Enter an integer:");
            int x = s.nextInt();
           for (int i = 0; i < array.length; i++) {
               if (array[i] == x){
                   arr = new int[array.length-1];
                   for (int index = 0; index < 1; index ++){
                       arr[index] = array[index];
                   }
                   for (int k = i; k < array.length-1; k++){
                       arr[k] = array[k+1];
                   }
                   break;
               }
           }
            System.out.println("Massive:" +Arrays.toString(array));
            System.out.println(Arrays.toString(arr));
        }else{
            System.out.println("Error");
        }
        s.close();
    }
}