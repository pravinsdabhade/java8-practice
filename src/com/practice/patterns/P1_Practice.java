package src.com.practice.patterns;

//https://www.youtube.com/watch?v=xzstcj3Cuso&t=1000s
public class P1_Practice {
    public static void main(String[] args) {

        // main outer loop for each row
        for (int i = 1; i < 5; i++) {

            // Decreasing Space triangle
            for (int j = i; j <= 5; j++) {
                System.out.print("  ");
            }

            // Increasing Star triangle
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Increasing Star Triangle
            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // main outer loop for each row
        for (int i = 1; i <= 5; i++) {
            // Increasing Star Triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // Decreasing star Triangle
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }

            // Decreasing star Triangle
            for (int j = i; j < 5; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
