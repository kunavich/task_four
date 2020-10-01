package by.kunavich.task4.data;

public class AirplaneCamponyCreator {
    public AirplaneCampony createAirplaneCompany(String type) throws Exception {
        AirplaneCampony airplaneCampony = new AirplaneCampony();
        AirplaneCreator airplaneCreator = new AirplaneCreator();

        airplaneCampony.addAirplane(airplaneCreator.createAirplane(type));

        return airplaneCampony;
    }
}
