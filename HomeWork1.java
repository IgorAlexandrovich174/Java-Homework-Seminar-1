import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        startProgram();
    }

    static int task1() {
//        Вычислить n-ое треугольного число (сумма чисел от 1 до n)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение, треугольное число которого хотите вычислить: ");

        int inputValue = scanner.nextInt();
        int result = 0;
        int count = 1;

        if (inputValue <= 0 || inputValue == 1) {
            return result;
        } else {
            while (count <= inputValue) {
                result += count;
                count++;
            }
        }
        System.out.printf("Результат равен %d \n",result);
        System.out.print("Закрытие task1");
        return result;
    }

    static int task2() {
//        Вычислить n! (произведение чисел от 1 до n)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число, факториал которого хотите найти: ");
        int inputValue = scanner.nextInt();
        int result = 1;
        if (inputValue == 0 || inputValue == 1) {
            return result;
        } else {
            for (int i = 2; i <= inputValue; i++) {
                result *= i;
            }
        }
        System.out.printf("Результат факториала: %d\n",result);
        System.out.println("Закрытие task2");
        return result;
    }

    static void task3() {
//        Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
        int count = 0;
        for (int i = 2; i < 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
            count = 0;

        }
        System.out.println("Завершение работы task3");
    }

    static int task4() {
//        Реализовать простой калькулятор (введите первое число, введите второе число,
//        введите требуемую операцию, ответ)
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        System.out.println("Вводите операцию в формате '1+1'");
        System.out.print("Вводите: ");


        String operation = scanner.nextLine();
        int firstValue;
        int secondValue;
        char operator;


        for (int i = 0; i < operation.length(); i++) {
            operator = operation.charAt(i);
            switch (operator) {
                case '/' -> {
                    firstValue = Integer.parseInt(operation.substring(0, operation.indexOf(operator)));
                    secondValue = Integer.parseInt(operation.substring(operation.indexOf(operator) + 1));
                    result = firstValue / secondValue;
                }
                case '*' -> {
                    firstValue = Integer.parseInt(operation.substring(0, operation.indexOf(operator)));
                    secondValue = Integer.parseInt(operation.substring(operation.indexOf(operator) + 1));
                    result = firstValue * secondValue;
                }
                case '+' -> {
                    firstValue = Integer.parseInt(operation.substring(0, operation.indexOf(operator)));
                    secondValue = Integer.parseInt(operation.substring(operation.indexOf(operator) + 1));
                    result = firstValue + secondValue;
                }
                case '-' -> {
                    firstValue = Integer.parseInt(operation.substring(0, operation.indexOf(operator)));
                    secondValue = Integer.parseInt(operation.substring(operation.indexOf(operator) + 1));
                    result = firstValue - secondValue;
                }
            }
        }

        System.out.printf("Результат операции: %d\n", result);
        System.out.println("Завершение task4");
        return result;
    }

    static void startProgram() {
        boolean flag = false;
        while (!flag) {
            System.out.print("""
                    
                    Введите число в соответствии с задачей, которую хотите проверить.
                    * 1 - Задача на вычисление n-треугольного числа.
                    * 2 - Задача на вычисление n!.
                    * 3 - Вывод простых чисел от 1 до 1000.
                    * 4 - Калькулятор.
                    * 0 - Выход из программы.
                    
                    >>>>>\s""");
            Scanner scanner = new Scanner(System.in);
            char result = scanner.nextLine().charAt(0);
            if (!Character.isDigit(result)) {
                System.out.println("Константин, вы ввели некорректные данные!)))");
            } else {
                switch (result) {
                    case '1' -> task1();
                    case '2' -> task2();
                    case '3' -> task3();
                    case '4' -> task4();
                    case '0' -> {System.out.println("Завершение работы программы");
                                flag = true;}
                    default -> System.out.println("Константин, вы ввели некорректные данные! >_<");
                }
            }
        }
    }
}
