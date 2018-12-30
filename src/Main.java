import java.util.Scanner;

public class Main {

    // Write a program that initializes an array with ten random integers and then prints four lines of output, containing
    //• Every element at an even index.
    //• Every even element.
    //• All elements in reverse order.
    //• Only the first and last element.
    public static void exercise_P6_1()
    {
        System.out.println("this is P6.1");

        int [] arr = new int[10];

        // initializes an array with ten random integers
        for (int i = 0; i < 10; i ++)
            arr[i] = (int)(Math.random() * 65536);

        // Every element at an even index.
        for (int i = 0; i < 10; i += 2)
            System.out.print(arr[i] + " ");
        System.out.println();

        // Every even element.
        for (int i = 0; i < 10; i ++)
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        System.out.println();

        // All elements in reverse order.
        for (int i = 9; i >= 0; i --)
            System.out.print(arr[i] + " ");
        System.out.println();

        //• Only the first and last element.
        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }

    // work on P6.2 here
    public static void exercise_P6_2()
    {
        System.out.println("this is P6.2");

    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int choice;
        String menu = "0 - quit\n" +
                "1 - P6.1 - Write a program that initializes an array with ten random integers..\n" +
                "2 - P6.2 - Write array methods that carry out the following tasks for an array of integers..\n";

        System.out.println(menu);
        while ((choice = in.nextInt()) != 0) {
            switch(choice) {
                case 1:
                    exercise_P6_1();
                    break;
                case 2:
                    exercise_P6_2();
                    break;
                default:
                    System.out.println("unknown command");
            }
            System.out.println(menu);
        }
        System.out.println("Bye-bye");
    }
}
