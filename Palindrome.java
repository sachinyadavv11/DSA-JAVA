import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    public static int isPalindrome(int num) {
        int temp = num;
        int result = 0;

        while (num != 0) {
            int rem = num % 10;
            result = result * 10 + rem;
            num = num / 10;
        }

        if (result == temp) {
            return 1;
        }

        return -1;
    }

    public static int factorialOfNumber(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }

        return result;

    }

    public static List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("FizzBuzz");
            } else if (i % 3 == 0) {
                output.add("Fizz");
            } else if (i % 5 == 0) {
                output.add("Buzz");
            } else output.add(String.valueOf(i));

        }
        return output;
    }

    public static int[] rearrangeArray(int[] array) {
        List<Integer> positive = new ArrayList<Integer>();
        List<Integer> negative = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positive.add(array[i]);
            } else negative.add(array[i]);

        }
        int[] result = new int[array.length];
        int i = 0, j = 0, k = 0;

        while (i < positive.size() && j < negative.size()) {
            result[k++] = positive.get(i++);
            result[k++] = negative.get(j++);
        }

        return result;
    }

    public static void sumEvenOdd(int[] arr) {
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenSum = evenSum + arr[i];
            } else oddSum = oddSum + arr[i];
        }

        System.out.println("Even numbers sum : " + evenSum + "\n" + "Odd Numbers sum : " + oddSum);

    }

    public static void main(String[] args) {

        sumEvenOdd(new int[]{1, 5, 3, 4, 5, 7, 8});

//        int[] result = rearrangeArray(new int[]{1, 3, -3, -2, 5, -9, 7});
//        System.out.println(Arrays.toString(result));

//        int result = isPalindrome(211);
//        if (result == 1)
//            System.out.println("The number is a Palindrome number");
//        else System.out.println("Number is not Palindrome");
//    }

//        int result = factorialOfNumber(4);
//        System.out.println(result);

//        List<String> result = fizzBuzz(15);
//        System.out.println(result);

    }
}