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
        int[] arr = generateRandomArray();
       // exerciseOne();
        //exerciseTwo();
        exerciseThree();
        //exerciseFour();
        }

    public static void exerciseOne(){ // сумма случайных чисел 30 раз
        System.out.println("Задача 1: ");
        int arraySum = 0;
        int[] arr = generateRandomArray();
        for(int a = 0;  a < arr.length; a++ ) {
            arraySum = arraySum + arr[a];
        }
        System.out.println("Сумма трат за месяц составила " + arraySum + " рублей");
    }

    public static void exerciseTwo(){ // максимальное и минимальное число
        System.out.println("Задача 2: ");
        int[] array = generateRandomArray();
        int min = generateRandomArray()[0];
        int max = generateRandomArray().length - 1;
        for (int i = 0; i < array.length; i++) {
            if (generateRandomArray()[i] < min) {
                min = generateRandomArray()[i];
                System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
            } else {
                if (generateRandomArray()[i] > max) {
                    max = generateRandomArray()[i];
                    System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
                }
            }
        }
    }

    public static void exerciseThree(){ //средняя сумма за 30 дней
        System.out.println("Задача 3: ");
        int[] averageArray = generateRandomArray();
        double generalSum = 0;
        for(int i =0; i<averageArray.length; i++){
            generalSum = generalSum + averageArray[i];

        }
        double averageSum = generalSum / averageArray.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
    }

    public static void exerciseFour(){  // в обратном порядке массив
        System.out.println("Задача 4: ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }

    }





}
