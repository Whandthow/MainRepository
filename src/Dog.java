import java.util.Random;

public class Dog extends PatAnimal implements Comparable<Dog> {
    public int scaredAwayThievesCount;
    {
        scaredAwayThievesCount=new Random().nextInt(getAge()^2)+1;
    }
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "name "+getName()+" age "+getAge()+" scaredAwayThievesCount "+scaredAwayThievesCount;
    }
    @Override
    public int compareTo(Dog other) {
        return Integer.compare(this.scaredAwayThievesCount,other.scaredAwayThievesCount);
    }
}
