package ru.spypro.homework;

public class Main {




    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
	// write your code here
        //int[] arr = generateRandomArray();
       // exerciseOne();
        exerciseTwo();
        //exerciseThree();
        //exerciseFour();
        }

    public static void exerciseOne(){ // сумма случайных чисел 30 раз
        System.out.println("Задача 1: ");
        int arraySum = 0;
        int[] arr = generateRandomArray();
        for (int a = 0; a < arr.length; a++) {
            arraySum = arraySum + arr[a];
        }
        System.out.println("Сумма трат за месяц составила " + arraySum + " рублей");
    }

    public static void exerciseTwo() { // максимальное и минимальное число
        System.out.println("Задача 2: ");
        int[] array = generateRandomArray();
        // обозначение переменных которые должны работать для разных массивов
        int min = array[0];
        int max = array.length - 1;
        /*  обозначение по примеры 14 минуты лекции урока массив ч2
        int min = 300_00;
        int max = - 1;*/

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            } else {
                if (array[i] > max) {
                    max = array[i];

                }
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

    }

    public static void exerciseThree(){ //средняя сумма за 30 дней
        System.out.println("Задача 3: ");
        int[] averageArray = generateRandomArray();
        double generalSum = 0;
        for (int i = 0; i < averageArray.length; i++) {
            generalSum = generalSum + averageArray[i];

        }
        double averageSum = generalSum / averageArray.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
    }

    public static void exerciseFour(){  // в обратном порядке массив
        System.out.println("Задача 4: ");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }





}
