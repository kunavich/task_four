/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task4;

import by.kunavich.task4.data.*;
import by.kunavich.task4.logic.Calculator;
import by.kunavich.task4.view.ConcoleResultPrinter;
import by.kunavich.task4.view.ResultPrinter;


/**
 *
 * @author Lord
 */
public class Main {
     public static void main(String[] args) throws Exception {

         // get
         AirplaneCamponyCreator airplaneCamponyCreator = new AirplaneCamponyCreator();
         AirplaneCampony airplaneCampony =airplaneCamponyCreator.createAirplaneCompany("FILE");

         //count
         Calculator calculator = new Calculator();
         int amount= calculator.calculatePassgers(airplaneCampony,0);

         //out
         ResultPrinter printer= new ConcoleResultPrinter();
         printer.printResult(amount);


    }
}
