package Lesson02;

public class HomeWorkApp2 {

    public static void main(String[] args) {
//        System.out.println("Результат задания > " + checkNumbers(1, 15));
//        System.out.println("**************");
//
//        isPositive1(variable: 12);
//        System.out.println("**************");
//
//        String result = (isPositive2(variable: 9)) ? "Number is positive" : "Number is negative";
//        System.out.println(result);
//        System.out.println("**************");
//
//        methodPrintStringCount( value: "Hello string" , count: 5);
//        System.out.println("***************");


    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий,
//    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//    в противном случае – false.
    public static boolean checkNumbers(int first, int second) {
        int sym = first + second;
        return (first + second <= 20) && (first + second >= 10);
    }


//        2. Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.

    public static void isPositive1(int variable) {
        if (variable >= 0) {
            System.out.println(variable + "is positive");
        } else {
            System.out.println(variable + "is negative");
        }
    }


//        3. Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static boolean isPositive2(int variable) {
        return variable <= 0;
    }




//        4. Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;
public static void methodPrintStringCount(String value, int count){
    for (int i=1; i <= count; i++ ) {
        System.out.println("String #" + i + ": " + value);
    }
    }
}
