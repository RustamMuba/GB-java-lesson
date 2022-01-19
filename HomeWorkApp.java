package Lesson01;

public class HomeWorkApp {

    public static void main(String[] args)
    {
/*
       printThreeWords();

       System.out.println("**************");
       if (checkSumSign(a:25, b:21)){
            System.out.println("Sum positive");
        } else {
            System.out.println("Sum negative");
        }

       System.out.println("*********************");
       System.out.println(printColor(value: 10));
       System.out.println(printColor(value: 52));

        System.out.println("*******************");
        System.out.println(compareNumbers(a:6, b:8));
*/

        public static void printThreeWords()  {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
    }


        public static boolean checkSumSign ( int a, int b ) {
            return (a + b) >= 0;
        }
        public static void check() {
            int a = 25;
            int b = 21;
            int sum = a + b;
            if (sum >= 0) {
                System.out.println("Sum positive");
            } else {
                System.out.println("Sum negative");
            }
        }

        public static String printColor(int value) {
            if (value <= 0) {
                return "Red";
            } else if (value > 0 && value <= 100) {
                return "Yellow";
        } else {
                return "Green";
            }
    }

        public static String compareNumbers(int a, int b) {
            if (a >= b) {
                return "a >= b";
            } else {
                return "a < b";
            }
        }
}





