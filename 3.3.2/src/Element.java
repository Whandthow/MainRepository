public class Element {
    private MyList.Node value;
    private MyList.Node next;
    public Element (MyList.Node value) {
        this.value = value;
        this.next = value.next;
    }

    public Element(int data, MyList.Node next) {
        this .value = new MyList.Node(data);
        this.next = next;
    }

    public MyList.Node getValue() {
        return value;
    }
    public MyList.Node getNext() {
        return next;
    }
    public boolean hesNext(){
        return next != null;
    }
    public MyList.Node getElement(){
        return value;
    }
    public void setElement(MyList.Node value){
        this.value = value;
    }
    public MyList.Node Next(){
        MyList.Node  tmp = next;
        value=next;
        return tmp;
    }
}
