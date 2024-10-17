package org.codecademy;

public class Node {

    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode(){
        return this.next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + '\'' +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
//        Node firstNode  = new Node("I am the first Node!");
//        Node secondNode = new Node("I am the second Node!");
//        firstNode.setNextNode(secondNode);
//        System.out.println(firstNode.next.data);
//
//        System.out.println(firstNode.getNextNode().data);

        System.out.println("==================");

        Node strawberry = new Node("Berry Tasty");
        Node banana = new Node("Banana-rama");
        Node coconut = new Node("Nuts for Coconut");

        strawberry.setNextNode(banana);
        banana.setNextNode(coconut);

        Node currentNode = strawberry;
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.getNextNode();
        }

        System.out.println("============");
        Node oldest = new Node("John");
        Node middle = new Node("Jacob");
        Node youngest = new Node("Jingleheimer");

        youngest.setNextNode(middle);
        middle.setNextNode(oldest);

        Node currentSibling = youngest;
        String oldestName = "";
        while(currentSibling != null) {
            oldestName = currentSibling.data;
            currentSibling = currentSibling.getNextNode();
        }

        System.out.println("There goes " + oldestName + "!");

    }
}
