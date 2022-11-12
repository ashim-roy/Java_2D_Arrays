import java.util.Scanner;

public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] [] arr = new int[n][m];

        for (int i = 0; i< n; i++){
            for (int j = 0; j< m; j++){
                arr[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i< n; i++){
            for (int j = 0; j< m; j++){
                System.out.println(arr[i][j] + “ “);
            }
            System.out.println();
        }
    }
}
