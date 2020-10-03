/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task4.data.dataAcquirer;

import by.kunavich.task4.data.DataException;
import by.kunavich.task4.model.Array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lord
 */
public class RandomDataAcquirer implements DataAcquirer{

    @Override
    public Array getData() throws DataException {
        Random rnd = new Random();
        int length = (Math.abs(rnd.nextInt()%25));
        Array array =new Array();
        for (int i=0;i<length;i++)
        {
            array.add(Math.abs(rnd.nextInt()%150));
        }
        return array;


    }
}
