//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PlaneCompani company = new PlaneCompani();

        Plane transport = new TransportPlane("Boeing C-17", 45.0, 8.5, 40.0, 5, 850);
        Plane travel = new TravelPlane("Airbus A320", 35.0, 6.2, 38.0, 150, 780);
        Plane sport = new SportPlane("Falcon X", 20.0, 4.5, 15.0, 2, 1200);

        company.addPlane(transport);
        company.addPlane(travel);
        company.addPlane(sport);

        System.out.println("=== Demonstration of polymorphism ===");
        transport.iCreateFor();
        travel.iCreateFor();
        sport.iCreateFor();

        System.out.println("\nTotal capacity of company: " + company.calculateAllWeightsUp());

        System.out.println("Total members/passengers: " + company.calculateAllMember());

        System.out.println("\nPlanes sorted by lengthFly:");
        company.sortByLengthFly();
        for (Plane plane : company.planes) {
            System.out.println(plane.getName() + " — lengthFly: " + plane.getLengthFly());
        }

        System.out.println("\nPlane(s) with costFor100KmFly == 6.2:");
        company.foundByCostFor100Km(6.2);

        System.out.println("\nTesting toString():");
        System.out.println(transport);
        System.out.println(travel);
        System.out.println(sport);
    }
}