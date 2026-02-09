package Questions;

public class No_3_SwapTwoNumbers {

    /*

    # Write a program to swap to numbers with one another.
    # Example: If a = 88, b = 99 after swap output should be a = 99, b = 88;

     */

    public static void approach1(int firstNum, int secondNum) {

        System.out.println("Using temporary variable");

        System.out.println("Before Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;

        System.out.println("After Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

    }

    public static void approach2(int firstNum, int secondNum) {

        System.out.println("Using Addition and Subtraction");

        System.out.println("Before Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;

        System.out.println("After Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

    }


    public static void approach3(int firstNum, int secondNum) {

        System.out.println("Using Division and Multiplication");

        /*
        Limitation: firstNum and SecondNum should not be zero;
         */

        System.out.println("Before Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

        firstNum = firstNum * secondNum;
        secondNum = firstNum / secondNum;
        firstNum = firstNum / secondNum;

        System.out.println("After Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

    }

    public static void approach4(int firstNum, int secondNum) {

        System.out.println("Using XOR Operator (^)");

        //a^a = 0
        //a^0 = a

        System.out.println("Before Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

        firstNum = firstNum ^ secondNum;
        secondNum = secondNum ^ (firstNum);
        firstNum = (firstNum) ^ secondNum;

        System.out.println("After Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

    }

    public static void approach5(int firstNum, int secondNum) {

        System.out.println("One line solution");

        System.out.println("Before Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

        secondNum = firstNum + secondNum - (firstNum = secondNum);


        System.out.println("After Swapping Numbers are: \n" +
                "First Number = " + firstNum + '\n' +
                "Second Number = " + secondNum);

    }

    public static void main(String[] args) {

        //approach1(88, 99);
        //approach2(88, 99);
        //approach3(88, 99);
        //approach4(40, 50);
        //approach4(40, 0);
        approach5(40, 89);


    }
}
