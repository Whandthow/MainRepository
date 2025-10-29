public class MyQueue {
    private MyList.Node BaseNode;
    public void offer(Element el){
        MyList.LinkedList.add(new MyList.Node(el.getValue().Data,el.getNext().next));
    }
    public Element peek(){
        return new Element(BaseNode.Data,BaseNode.next);
    }
    public Element poll(){
        MyList.Node tmp = BaseNode;
        BaseNode=BaseNode.next;
        return new Element(tmp.Data,tmp.next);
    }
}
