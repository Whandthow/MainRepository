import java.util.Random;

public class Cat extends PatAnimal implements Comparable<Cat>{
    public int caughtMiceCount;
    {
        caughtMiceCount=new Random().nextInt(getAge()^2+1);
    }
    public Cat(String name,int age){
        super(name,age);
    }
    @Override
    public String toString(){
        return  "name "+getName()+" age "+getAge()+" caughtMiceCount "+caughtMiceCount;
    }
    @Override
    public int compareTo(Cat other) {
        return Integer.compare(this.caughtMiceCount,other.caughtMiceCount);
    }
}
