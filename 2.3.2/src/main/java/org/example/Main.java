package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Демонстрація роботи MyArrayList ===\n");

        MyArrayList list = new MyArrayList(2);
        System.out.println("Створено новий список. Початковий розмір = " + list.size());

        list.add(new Box("Box A"));
        list.add(new Box("Box B"));
        list.add(new Box("Box C")); // тут спрацює автоматичне збільшення масиву
        System.out.println("\nПісля додавання трьох елементів:");
        printList(list);

        list.add(1, new Box("Inserted Box"));
        System.out.println("\nПісля вставки елемента у позицію 1:");
        printList(list);

        System.out.println("\nЕлемент з індексом 2: " + list.get(2));

        list.set(0, new Box("Replaced Box"));
        System.out.println("\nПісля зміни елемента в позиції 0:");
        printList(list);

        Box[] moreBoxes = { new Box("Extra1"), new Box("Extra2") };
        list.addAll(moreBoxes);
        System.out.println("\nПісля addAll у кінець:");
        printList(list);

        Box[] insertBoxes = { new Box("Mid1"), new Box("Mid2") };
        list.addAll(2, insertBoxes);
        System.out.println("\nПісля addAll з позиції 2:");
        printList(list);

        list.remove(3);
        System.out.println("\nПісля видалення елемента з позиції 3:");
        printList(list);

        System.out.println("\nКінцева кількість елементів у списку: " + list.size());

        System.out.println("\n=== Кінець демонстрації ===");
    }

    public static void printList(MyArrayList list) {
        System.out.print("Список: [ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("]");
    }
}
