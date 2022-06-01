package com.company;


    public class Node<Item> {

        private int data;
        private Node next_node;

        public Node(int data, Node next_node) {
            this.data = data;
            this.next_node = next_node;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext_node() {
            return next_node;
        }

        public void setNext_node(Node next_node) {
            this.next_node = next_node;
        }
    }

