
    
import java.util.Scanner;

public class UltimatePatternMaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 5; // Default size for patterns
        
        while (true) {
            System.out.println("\n===== ULTIMATE JAVA PATTERN MENU =====");
            System.out.println("--- STAR PATTERNS ---");
            System.out.println("1. Solid Square          2. Hollow Square");
            System.out.println("3. Right Triangle        4. Inverted Right Triangle");
            System.out.println("5. Left-Mirrored Tri     6. Pyramid");
            System.out.println("7. Diamond               8. Hourglass");
            System.out.println("--- NUMBER & LETTER PATTERNS ---");
            System.out.println("9. Number Increment      10. Floyd's Triangle");
            System.out.println("11. Binary (0-1) Tri     12. Alphabet Triangle");
            System.out.println("0. Exit");
            System.out.print("Choose a pattern (0-12): ");
            
            int choice = scanner.nextInt();
            if (choice == 0) {
                System.out.println("Exiting... Happy coding!");
                break;
            }
            
            System.out.println("\n--- Result ---");
            switch (choice) {
                case 1 -> printSolidSquare(rows);
                case 2 -> printHollowSquare(rows);
                case 3 -> printRightTriangle(rows);
                case 4 -> printInvertedTriangle(rows);
                case 5 -> printLeftMirroredTriangle(rows);
                case 6 -> printPyramid(rows);
                case 7 -> printDiamond(rows);
                case 8 -> printHourglass(rows);
                case 9 -> printNumberIncrement(rows);
                case 10 -> printFloydsTriangle(rows);
                case 11 -> printBinaryTriangle(rows);
                case 12 -> printAlphabetTriangle(rows);
                default -> System.out.println("Invalid choice! Choose between 0 and 12.");
            }
        }
        scanner.close();
    }

    // 1. Solid Square
    static void printSolidSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 2. Hollow Square
    static void printHollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 3. Right-Angled Triangle
    static void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 4. Inverted Right-Angled Triangle
    static void printInvertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 5. Left-Mirrored Triangle
    static void printLeftMirroredTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print("  ");
            for (int k = 1; k <= i; k++) System.out.print("* ");
            System.out.println();
        }
    }

    // 6. Centered Pyramid
    static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }
    }

    // 7. Full Diamond
    static void printDiamond(int n) {
        // Top half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }
        // Bottom half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }
    }

    // 8. Hourglass
    static void printHourglass(int n) {
        // Top Inverted Pyramid
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }
        // Bottom Upright Pyramid
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
            System.out.println();
        }
    }

    // 9. Standard Number Increment Triangle
    static void printNumberIncrement(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print(j + " ");
            System.out.println();
        }
    }

    // 10. Floyd's Triangle (Continuous numbers)
    static void printFloydsTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // 11. Binary (0-1) Triangle
    static void printBinaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // If sum of coordinates is even, print 1, else 0
                if ((i + j) % 2 == 0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    // 12. Alphabet Triangle
    static void printAlphabetTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

