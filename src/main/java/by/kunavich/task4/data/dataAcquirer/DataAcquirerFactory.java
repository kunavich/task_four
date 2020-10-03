package by.kunavich.task4.data.dataAcquirer;

public class DataAcquirerFactory {

    public DataAcquirer getDataAcquirer(String type)    {
        switch (type)        {
            case "CONSOLE":
                return new ConsoleDataAcquirer();
            case "FILE":
                return  new FileDataAcquirer();
            case "RANDOM":
                return  new RandomDataAcquirer();

            default:
                throw new RuntimeException("wrong type : "+type);
        }
    }
}
