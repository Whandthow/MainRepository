public class AnimalByAgeComparator implements Comparator<PatAnimal>{
    private Order order;

    public AnimalByAgeComparator(Order order) {
        this.order = order;
    }

//
//    @Override
//    public int compare(Object o1, Object o2) {
//        if (!(o1 instanceof PatAnimal) || !(o2 instanceof PatAnimal)) {
//            throw new ClassCastException("Expected PatAnimal");
//        }
//        PatAnimal p1 = (PatAnimal) o1;
//        PatAnimal p2 = (PatAnimal) o2;
//        return (order==Order.ascending)?(Integer.compare (p1.getAge(),p2.getAge())):Integer.compare(p2.getAge(),p1.getAge());
//    }

    @Override
    public int compare(PatAnimal o1, PatAnimal o2) {
        return (order==Order.ascending)?(Integer.compare (o1.getAge(),o2.getAge()) ):Integer.compare(o2.getAge(),o1.getAge());
    }

}
