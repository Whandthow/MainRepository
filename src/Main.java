import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(List.of(new Cat("Tom", 7), new Cat("Murca", 9), new Cat("Murzic", 5)));
        Collections.sort(cats);
        for (Cat cat : cats){
            System.out.println(cat);
        }

        List<Dog> dogs = new ArrayList<>(List.of(new Dog("Shuric", 6), new Dog("Zver", 10), new Dog("Luna", 4)));
        Collections.sort(dogs);
        for (Dog dog : dogs){
            System.out.println(dog);
        }

        List<PatAnimal> rancho = new ArrayList<>();
        rancho.addAll(cats);
        rancho.addAll(dogs);
        //rancho.sort( new AnimalByAgeComparator(Order.ascending).compare());
        Order order = Order.ascending;
        rancho.sort((Pat1,Pat2)->
                (order==Order.ascending)
                        ?Integer.compare(Pat1.getAge(),Pat2.getAge())
                        :-(Integer.compare(Pat1.getAge(),Pat2.getAge())));

        for (PatAnimal animal : rancho){
            System.out.println(animal.getName() + " " + animal.getAge() + " years");
        }

    }
}