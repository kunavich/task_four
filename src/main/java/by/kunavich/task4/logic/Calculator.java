/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task4.logic;


/**
 *
 * @author Lord
 */
public class Calculator {


    public  void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] leftPart = new int[mid];
        int[] rightPart = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            leftPart[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            rightPart[i - mid] = array[i];
        }
        mergeSort(leftPart, mid);
        mergeSort(rightPart, length - mid);

        merge(array, leftPart, rightPart, mid, length - mid);
    }
    private void merge(int[] array, int[] leftPart, int[] rightPart, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (leftPart[i] <= rightPart[j]) {
                array[k++] = leftPart[i++];
            }
            else {
                array[k++] = rightPart[j++];
            }
        }

        while (i < left) {
            array[k++] = leftPart[i++];
        }

        while (j < right) {
            array[k++] = rightPart[j++];
        }
    }
}
