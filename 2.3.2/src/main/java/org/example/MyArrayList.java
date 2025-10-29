package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
//    List<Box> boxes = new ArrayList<Box>();
//    public MyArrayList(){
//        for (int i = 0; i < 10; i++) {
//            boxes.add(new Box());
//        }
//    }
//    public MyArrayList(int size){
//        for (int i = 0; i < size; i++) {
//            boxes.add(new Box());
//        }
//    }
//    public void add(Box box){
//        boxes.add(box);
//    }
//    public void remove(int index){
//        boxes.remove(index);
//    }
//    public Box get(int index){
//        return boxes.get(index);
//    }
//    public int size(){
//        return boxes.size();
//    }
//    public void set(int index, Box box){
//        boxes.set(index, box);
//    }
//    public void addAll(Box[] box){
//        for(var bob: box) {
//            add(bob);
//        }
//    }
//    public void addAll(int index, Box[] box){
//        for(int i=0;i<box.length;i++) {
//            if(i==index) {
//                for(var bob: box) {
//                    boxes.add(index,bob);
//                }
//        }}
//    }
    private Box[] boxes;
    private int size;

    public MyArrayList() {
        boxes = new Box[10];
        size = 0;
    }

    public MyArrayList(int initialCapacity) {
        boxes = new Box[initialCapacity];
        size = 0;
    }

    public void add(Box box) {
        ensureCapacity(size + 1);
        boxes[size++] = box;
    }

    public void add(int index, Box element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            boxes[i] = boxes[i - 1];
        }
        boxes[index] = element;
        size++;
    }

    public void addAll(Box[] c) {
        ensureCapacity(size + c.length);
        for (Box box : c) {
            boxes[size++] = box;
        }
    }

    public void addAll(int index, Box[] c) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        ensureCapacity(size + c.length);
        for (int i = size - 1; i >= index; i--) {
            boxes[i + c.length] = boxes[i];
        }
        for (int i = 0; i < c.length; i++) {
            boxes[index + i] = c[i];
        }
        size += c.length;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > boxes.length) {
            int newCapacity = Math.max(boxes.length * 2, minCapacity);
            Box[] newBoxes = new Box[newCapacity];
            for (int i = 0; i < size; i++) {
                newBoxes[i] = boxes[i];
            }
            boxes = newBoxes;
        }
    }

    public Box get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return boxes[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            boxes[i] = boxes[i + 1];
        }
        boxes[--size] = null;

        if (size < boxes.length / 2) {
            int newCapacity = boxes.length / 2;
            Box[] newBoxes = new Box[newCapacity];
            for (int i = 0; i < size; i++) {
                newBoxes[i] = boxes[i];
            }
            boxes = newBoxes;
        }
    }

    public void set(int index, Box element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        boxes[index] = element;
    }

    public int size() {
        return size;
    }
}