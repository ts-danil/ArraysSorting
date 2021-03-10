/*
Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив.
Массивы могут быть любой длины, в том числе нулевой.
Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность:
он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив.
Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] Array1 = createArray();
        int[] Array2 = createArray();
        int[] Array3 = mergeArrays(Array1,Array2);
        printArray(Array1);
        printArray(Array2);
        printArray(Array3);
    }

    public static int[] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Введите количество элементов в массиве : ");
        int n = sc.nextInt();
        int[] Arr = new int [n];
        System.out.println("Введите элементы: ");
        for ( int i = 0; i < Arr.length; i++){
            Arr[i] = sc.nextInt();
        }
        return Arr;
    }

    public static void printArray(int[] Arr){
        for (int value : Arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int i = 0;
        int j = 0;
        int[] Arr = new int[a1.length + a2.length];
        for(int k = 0; k < Arr.length; k++){
            if((i < a1.length) && (j < a2.length)){
                if (a1[i] < a2[j]){
                    Arr[k] = a1[i];
                    i++;
                } else {
                    Arr[k] = a2[j];
                    j++;
                }
            }
            else if (j == a2.length){
                Arr[k] = a1[i];
                i++;
            }
            else if (i == a1.length){
                Arr[k] = a2[j];
                j++;
            }
        }
        return Arr;
    }

}
