/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task4.view;

import by.kunavich.task4.model.Array;

/**
 *
 * @author Lord
 */
public class ConcoleResultPrinter implements ResultPrinter{

    @Override
    public void printResult(Array array) {
        System.out.println("Fibonachi numbers in array: "+ array.toString());

    }
}
