public class MyStack {
    private MyList.Node BaseNode;
    public void push(Element el){
        MyList.LinkedList.add(new MyList.Node(el.getValue().Data,el.getNext().next));
    }
    public Element pop(){
        MyList.Node tmp = BaseNode;
        while(tmp != null){
            tmp=tmp.next;
        }
        return new Element(tmp.Data,tmp.next);
    }
}
