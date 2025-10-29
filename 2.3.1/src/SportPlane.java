public class SportPlane extends Plane {
    private double  speed;
    public SportPlane(String name,double lengthFly,double costFor100KmFly, double widthUp, int member, double speed) {
        super(name,lengthFly,(costFor100KmFly*2),widthUp,1,(speed*speed));
    }
    @Override
    public void iCreateFor(){
        System.out.println("I create for speed fling");
    }
}
