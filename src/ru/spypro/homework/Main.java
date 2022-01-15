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
        exerciseTwo();
        //exerciseThree();
        //exerciseFour();
        }

    public static void exerciseOne(){ // сумма случайных чисел 30 раз
        System.out.println("Задача 1: ");
        int arraySum = 0;
        for(int a = 0;  a < generateRandomArray().length; a++ ) {
            arraySum = arraySum + generateRandomArray()[a];
        }
        System.out.println("Сумма трат за месяц составила " + arraySum + " рублей");
    }

    public static void exerciseTwo(){ // максимальное и минимальное число
        System.out.println("Задача 2: ");
        int[] sumArray = generateRandomArray();
        int maxNum = sumArray[0];
        int minNum = 0;
        for (int i = 0; i<sumArray.length; i++) {
           if (maxNum == Math.max(maxNum, sumArray[i]));
            System.out.println(maxNum);
        }
    }

    public static void exerciseThree(){ //средняя сумма за 30 дней
        System.out.println("Задача 3: ");
        int[] averageArray = generateRandomArray();
        double generalSum = 0;
        for(int i =0; i<averageArray.length; i++){
            generalSum = generalSum + averageArray[i];
            double averageSum = generalSum / averageArray.length;
            System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");
        }
    }

    public static void exerciseFour(){  // в обратном порядке массив
        System.out.println("Задача 4: ");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }

    }





}
