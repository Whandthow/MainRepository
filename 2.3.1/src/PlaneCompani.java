import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlaneCompani {
    public List<Plane> planes;
    public PlaneCompani(){
        planes = new ArrayList<>();
    }
    public void addPlane(Plane plane){
        planes.add(plane);
    }
    public double calculateAllWeightsUp(){
        double result = 0;
        for(Plane plane: planes){
            result+=plane.getWidthUp();
        }
        return result;
    }
    public int calculateAllMember(){
        int result = 0;
        for(Plane plane: planes){
            result+=plane.getMember();
        }
        return result;
    }
    public void sortByLengthFly(){
        Collections.sort(planes,
                (a,b)->
                        Integer.compare((int)a.getLengthFly(),(int)b.getLengthFly()));
    }
    public void foundByCostFor100Km(double cost){
        for(Plane plane: planes){
            if(plane.getCostFor100KmFly()==cost)
                    System.out.println(plane);
        }
    }
}
