import java.time.LocalDate;
public abstract class PatAnimal {
    public String name;
    public int yearOfBirth=0;
    public PatAnimal(String name,int yearOfBirth) {
        this.name=name;
        this.yearOfBirth=yearOfBirth;
    }
    public int getAge(){
        return yearOfBirth;
    }
    public String getName(){
        return name;
    }
    public void sleep(){

    }
    public void makeSound(){

    }
    public void ToString(){}
}
