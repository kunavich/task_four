package by.kunavich.task4.data;

public class AirplaneCreator {
    public Airplane createAirplane(String type) throws Exception {
        Airplane airplane = new Airplane();
        PassangerCreator passangerCreator = new PassangerCreator();
        for (int i=0;i<5;i++ ) {
            airplane.addPassenger(passangerCreator.createPassanger(type));
        }
        return airplane;
    }
}
