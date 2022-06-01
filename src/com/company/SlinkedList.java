package com.company;
public class SlinkedList <Item> {


    private Node Head;
    private Node<Item> first;
    private int size;

    public SlinkedList() {
        size = 0;
        first = null;
    }

    public void delete(int data) {
        Node deleteNode = Head;
        Node prev = null;
        if (deleteNode != null && deleteNode.getData() == data) {
            Head = deleteNode.getNext_node();
            return;
        }
        while ((deleteNode != null && deleteNode.getData() != data)) {
            prev = deleteNode;
            deleteNode = deleteNode.getNext_node();
        }
        if (deleteNode == null) {
            return;
        }
        prev.setNext_node(deleteNode.getNext_node());
    }

    public void add(int data) {
        Node node = new Node(data, null);
        if (Head == null) {
            Head = node;
        } else {
            Node temp = Head;
            while (temp.getNext_node() != null) {
                temp = temp.getNext_node();
            }
            temp.setNext_node(node);
        }
    }


    @Override
    public String toString() {
        String linkedList = "";
        Node temp = Head;

        while (temp != null) {
            linkedList += temp.getData()+"\t";
            temp = temp.getNext_node();
        }
        return linkedList;
    }

    public boolean isEmpty() {
        Node temp = Head;
        return temp == null;
    }

    public void search(int data) {
        int linkedList = 0;
        Node temp = Head;

        while (temp != null) {

            if (temp.getData() == data) {
                System.out.println("true");
                linkedList =temp.getData();
                break;
            }
            temp = temp.getNext_node();
        }

            if (linkedList != data) {
            System.out.println("false");
        }
    }
}

    //public Iterator<Item> iterator() {
    //        return new ListIterator<Item>(first);
    //    }





