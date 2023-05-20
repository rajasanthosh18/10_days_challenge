import java.util.*;
public class day1_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int [][]pascal;
        pascal = PascalTriangle(num);
        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", pascal[i][j]); 
            }
            
            System.out.println();
        }
    }
    public static int[][] PascalTriangle(int num) {
        int[][] triangle = new int[num][];
        for (int i = 0; i < num; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; 
                
                
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
                
            triangle[i][i] = 1;
        }
        return triangle;
    }
}

