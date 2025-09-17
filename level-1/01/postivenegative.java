import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number:");
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (n == 0) {
                System.out.println("Number is Zero");
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                String type = (n % 2 == 0) ? "Even" : "Odd";
                System.out.println(n + " is Positive and " + type);
            }
        }

        int first = arr[0], last = arr[arr.length - 1];
        if (first == last) {
            System.out.println("First and Last numbers are Equal");
        } else {
            System.out.println("First number is " + (first > last ? "Greater" : "Smaller") + " than Last number");
        }
    }
}
