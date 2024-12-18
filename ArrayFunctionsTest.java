import java.util.Scanner;

public class ArrayFunctionsTest {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int[] num = { 187, 137, 188, 450, 77 };

        while (true) {
            System.out.println("Menu of Operations\n");
            System.out.println("1 : Original Array");
            System.out.println("2 : Sum of Array");
            System.out.println("3 : Even Numbers");
            System.out.println("4 : Odd Numbers");
            System.out.println("5 : Largest Number");
            System.out.println("6 : Smallest Number");
            System.out.println("7 : Search Elements\n");
            System.out.print("Enter Your Choice: ");
            Scanner console = new Scanner(System.in);
            int option = console.nextInt();

            switch (option) {
                case 1:
                    ArrayFunctions.OrgArray(num);
                    break;

                case 2:
                    ArrayFunctions.SumOfArray(num);
                    break;

                case 3:
                    ArrayFunctions.EvenNumbers(num);
                    break;

                case 4:
                    ArrayFunctions.OddNumbers(num);
                    break;

                case 5:
                    ArrayFunctions.LargestNumber(num);
                    break;

                case 6:
                    ArrayFunctions.SmallestNumber(num);
                    break;

                case 7:
                    System.out.print("Enter the Element you want to Search: ");
                    int data = console.nextInt();
                    ArrayFunctions.SearchElement(num, data);
                    break;

                default:
                    System.out.println("Invalid Option - Choose Again \n");
                    break;
            }
        }
    }
}