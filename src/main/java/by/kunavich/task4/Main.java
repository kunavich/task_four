/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task4;

import by.kunavich.task4.data.*;
import by.kunavich.task4.data.dataAcquirer.DataAcquirer;
import by.kunavich.task4.data.dataAcquirer.DataAcquirerFactory;
import by.kunavich.task4.logic.Calculator;
import by.kunavich.task4.model.Array;
import by.kunavich.task4.view.ConcoleResultPrinter;
import by.kunavich.task4.view.ResultPrinter;


/**
 *
 * @author Lord
 */
public class Main {
     public static void main(String[] args) throws Exception {

         // get
         DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactory();
         DataAcquirer dataAcquirer = dataAcquirerFactory.getDataAcquirer("RANDOM");

         Array array = dataAcquirer.getData();
         System.out.println(array.toString());
         //count
         Calculator calculator = new Calculator();
         Array fibonachi= calculator.findFibonachi(array);
         System.out.println(array.toString());
         //out
         ResultPrinter printer= new ConcoleResultPrinter();
         printer.printResult(fibonachi);


    }
}
