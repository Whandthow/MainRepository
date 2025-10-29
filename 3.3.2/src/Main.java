 public class Main {

            // Допоміжний метод: друк усього списку від BaseNode
            static void printList(String title) {
                System.out.print(title + " [ ");
                MyList.Node cur = MyList.LinkedList.BaseNode;
                while (cur != null) {
                    System.out.print(cur.Data);
                    cur = cur.next;
                    if (cur != null) System.out.print(" -> ");
                }
                System.out.println(" ]");
            }

            public static void main(String[] args) {
                // 1) Порожній список
                printList("Стартовий список");

                // 2) addLast / add
                MyList.LinkedList.add(10);
                MyList.LinkedList.add(20);
                MyList.LinkedList.add(30);
                printList("Після add(10), add(20), add(30)");

                // 3) addFirst
                new MyList.LinkedList().addFirst(5);
                printList("Після addFirst(5)");

                // 4) addLast (ще раз)
                new MyList.LinkedList().addLast(40);
                printList("Після addLast(40)");

                // 5) getFirst / getLast / indexGet / size
                int first = new MyList.LinkedList().getFirst();
                int last  = new MyList.LinkedList().getLast();
                int at2   = new MyList.LinkedList().indexGet(2); // 0..N-1
                int size1 = new MyList.LinkedList().size();
                System.out.println("getFirst() = " + first);
                System.out.println("getLast()  = " + last);
                System.out.println("indexGet(2)= " + at2);
                System.out.println("size()     = " + size1);

                // 6) set(index, value)
                new MyList.LinkedList().set(2, 99);
                printList("Після set(2, 99)");

                // 7) IndexOf(value)
                int idx99 = new MyList.LinkedList().IndexOf(99);
                System.out.println("IndexOf(99) = " + idx99);

                // 8) removeIndex
                new MyList.LinkedList().removeIndex(1);
                printList("Після removeIndex(1)");

                // 9) removeFirst
                new MyList.LinkedList().removeFirst();
                printList("Після removeFirst()");

                // 10) removeLast
                new MyList.LinkedList().removeLast();
                printList("Після removeLast()");

                // 11) size() фінальний
                int size2 = new MyList.LinkedList().size();
                System.out.println("Фінальний size() = " + size2);

                // --- (необов'язково) ДЕМОНСТРАЦІЯ add(Node) ---
                // створимо вузол і додамо готовим Node
                MyList.Node external = new MyList.Node(777);
                MyList.LinkedList.add(external);
                printList("Після add(Node{777})");
            }
        }
