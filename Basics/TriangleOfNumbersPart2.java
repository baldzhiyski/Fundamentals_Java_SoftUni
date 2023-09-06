import java.util.Scanner;

public class TriangleOfNumbersPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int currentnum = 1;
        boolean isBigger = false;
        for ( int i = 1; i<=num;i++){
            for(int j = 1; j<=i ; j++){
                if(currentnum>num){
                    isBigger =true;
                    break;
                }
                System.out.print(currentnum + "");
                currentnum++;
            }
            if(isBigger){
                break;
            }
            System.out.println();
        }
    }
}
//In this code, the outer loop iterates over the rows of the triangle, starting at i = 1 and going up to n.
// The inner loop iterates over the numbers in each row, starting at j = 1 and going up to i
//  In each iteration of the inner loop, the variable num is printed, then incremented by 1.
//  This ensures that each number in the triangle is unique and follows the pattern you described.
//In the second row, the inner loop runs twice because i = 2. In the first iteration, j = 1, so the number num is printed
// as 2,then incremented to 3 with num++.
// In the second iteration, j = 2, so the number num is printed as 3.
//So the inner loop prints the values of num from 2 to 3 in the second row, which is 2 3.
