public class Plane {
    private String name;
    private double lengthFly;
    private double costFor100KmFly;
    private double widthUp;
    private int member;
    private double  speed;
    public Plane(String name,double lengthFly,double costFor100KmFly, double widthUp, int member, double speed) {
        this.name = name;
        this.lengthFly = lengthFly;
        this.costFor100KmFly = costFor100KmFly;
        this.widthUp = widthUp;
        this.member = member;
        this.speed = speed;
    }
    public String getName() {
        return name;
    }
    public double getLengthFly() {
        return lengthFly;
    }
    public double getCostFor100KmFly() {
        return costFor100KmFly;
    }
    public double getWidthUp() {
        return widthUp;
    }
    public int getMember() {
        return member;
    }
    public double getSpeed() {
        return speed;
    }
     public void iCreateFor(){
        System.out.println("I create for fly");
    }
    @Override
    public String toString(){
        return name;
    }
}
