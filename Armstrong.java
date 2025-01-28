import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + ":");
        printArmstrongNumbers(lowerBound, upperBound);

        scanner.close();
    }

    
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digitCount = countDigits(num);

        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == originalNum;
    }

    
    public static int countDigits(int num) {
        int digitCount = 0;
        while (num != 0) {
            digitCount++;
            num /= 10;
        }
        return digitCount;
    }

    
    public static void printArmstrongNumbers(int lowerBound, int upperBound) {
        for (int i = lowerBound; i <= upperBound; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}


