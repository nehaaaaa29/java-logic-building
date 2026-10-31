
    
public class PyramidPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Loop to print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            // Loop to print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/* Output:
    *
   ***
  *****
 *******
*********
*/

