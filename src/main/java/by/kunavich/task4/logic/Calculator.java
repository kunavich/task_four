/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task4.logic;


import by.kunavich.task4.model.Array;

/**
 *
 * @author Lord
 */
public class Calculator {

    public Array findFibonachi(Array array)
    {
        array.mergeSort();
        int firstFibonachi=0;
        int secondFibonachi=1;
        Array fibonachi =new Array();
        for (int element:array.getData()) {
            while (element>=secondFibonachi)
            {
                int temp=secondFibonachi;
                secondFibonachi+=firstFibonachi;
                firstFibonachi=temp;

            }
            if( element == firstFibonachi) {
                fibonachi.add(element);
            }
        }
        return fibonachi;
    }



}
