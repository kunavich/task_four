/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.kunavich.task4.data.dataAcquirer;

import by.kunavich.task4.data.DataException;
import by.kunavich.task4.model.Array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Lord
 */
public class FileDataAcquirer implements DataAcquirer{

    private static final String FILE_NAME = "text.txt";

    @Override
    public Array getData() throws DataException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));

            String data = (reader.readLine());
            return Array.parseArray(data);
        }
        catch (IOException e) {
            throw new DataException(e.getMessage(), e);
        }


    }
}
