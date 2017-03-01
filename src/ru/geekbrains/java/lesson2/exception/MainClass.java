package ru.geekbrains.java.lesson2.exception;

/**
 * Created by Евгений on 26.02.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        String[][] testArray = new String[4][4];
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray[i].length; j++) {
                testArray[i][j] = "4";
            }
        }
        try {
            System.out.println(convertArray(testArray));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработанное исключение. Массив не того размера");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Обработанное исключение.");
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static int convertArray(String[][] array){
        int [][] numArray = new int[array.length][array.length];
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 || array[j].length !=4) throw new ArrayIndexOutOfBoundsException ("MyArraySizeException");
                if (!array[i][j].matches("\\d+")) throw new RuntimeException("Элемент под номером array[" + i + "][" + j + "] не может быть преобразован в тип int");
                numArray[i][j] = Integer.parseInt(array[i][j]);
                summ += numArray[i][j];
            }
        }
        return summ;
    }
}
