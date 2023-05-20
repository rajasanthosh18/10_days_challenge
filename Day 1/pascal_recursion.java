import java.util.Scanner;

// Here we follow recursive approach 

public class pascal_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j <= i; j++) {
                System.out.printf("%d ", pascal(i,j)); 
            }
            System.out.println();
        }
    }
    public static int pascal(int i,int j) {
        if(j==0 || j==i) return 1;
        return pascal(i-1, j-1)+pascal(i-1, j)  ;      
    }
}
