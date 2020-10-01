package by.kunavich.task4.data;

import by.kunavich.task4.data.dataAcquirer.DataAcquirer;
import by.kunavich.task4.data.dataAcquirer.DataAcquirerFactory;

public class PassangerCreator {
    public Passanger createPassanger(String type) throws Exception {
        DataAcquirerFactory dataAcquirerFactory = new DataAcquirerFactory();
        DataAcquirer dataAcquirer =dataAcquirerFactory.getDataAcquirer(type);
        Passanger passanger= new Passanger(dataAcquirer.getData());
        return passanger;



    }
}
