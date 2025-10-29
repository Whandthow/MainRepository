public class MyList {
    public static class Node {
        int Data;
        Node next;
        public Node(int data) {
            this.Data = data;
            this.next = null;
        }
        public Node(int data, Node next) {
            this.Data = data;
            this.next = next;
        }

    }
    public static class LinkedList {
        static Node BaseNode;

        public static void add(int data){
            Node newNode = new Node(data);
            if(BaseNode == null){
                BaseNode = newNode;
            }
            else{
                Node tmp = BaseNode;
                while(tmp.next != null){
                    tmp = tmp.next;
                }
                tmp.next = newNode;
            }
        }

        public static void add(Node node) {
            Node newNode = node;
            if(BaseNode == null){
                BaseNode = newNode;
            }
            else{
                Node tmp = BaseNode;
                while(tmp.next != null){
                    tmp = tmp.next;
                }
                tmp.next = newNode;
            }
        }

        public void add(int index, int data){
            Node newNode = new Node(data);
            if(BaseNode == null){BaseNode = newNode;}
            else{
                Node tmp = BaseNode;
                for(int i =0;i<index;i++){
                    tmp=tmp.next;
                }
                newNode.next = tmp.next;
                tmp=newNode;
            }
        }
        public void addFirst(int data){
            Node newNode = new Node(data);
            newNode.next = BaseNode;
            BaseNode = newNode;
        }
        public void addLast(int data){
            add(data);
        }
        public int indexGet(int index){
            Node tmp= BaseNode;
            for (int i =0 ;i<index ;i++){
                tmp=tmp.next;
            }
            return tmp.Data;
        }
        public int getFirst(){
            return BaseNode.Data;
        }
        public int getLast(){
            Node tmp = BaseNode;
            while(tmp.next !=null){
                tmp=tmp.next;
            }
            return tmp.Data;
        }
        public void removeIndex(int index){
            Node tmp = BaseNode;
            for(int i =0;i<index-1;i++){
                tmp=tmp.next;
            }
            tmp.next = tmp.next.next;
        }
        public void removeFirst(){
            BaseNode=BaseNode.next;
        }
        public void removeLast(){
            Node tmp = BaseNode;
            while(tmp.next.next !=null){
                tmp=tmp.next;
            }
            tmp.next=null;
        }
        public void set(int index,int data){
            Node tmp = BaseNode;
            for(int i =0;i<index;i++){
                tmp=tmp.next;
            }
            tmp.Data=data;
        }
        public int size(){
            if(BaseNode==null){return 0;}
            else{
                Node tmp = BaseNode;
                int count=1;
                while(tmp.next!=null){
                    tmp=tmp.next;
                    count++;
                }
                return count;
            }
        }
        public int IndexOf(int data){
            Node tmp =BaseNode;
            int i=0;
            while(data!=tmp.Data){
                tmp=tmp.next;
                i++;
            }
            return i;
        }
    }
}
