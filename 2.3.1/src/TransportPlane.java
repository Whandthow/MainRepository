public class TransportPlane extends Plane {

    public TransportPlane(String name,double lengthFly,double costFor100KmFly, double widthUp, int member, double speed) {
        super(name,lengthFly,costFor100KmFly,(widthUp*widthUp),member,speed);
    }
    @Override
    public void iCreateFor(){
        System.out.println("I create for transport material");
    }
}
