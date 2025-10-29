public class TravelPlane extends Plane{
    private int member;
    public TravelPlane(String name,double lengthFly,double costFor100KmFly, double widthUp, int member, double speed) {
        super(name,lengthFly,costFor100KmFly,widthUp,(member*2),speed);
    }
    @Override
    public void iCreateFor(){
        System.out.println("I create for transport people");
    }
}
