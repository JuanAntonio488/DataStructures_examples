  
/*
How to implement a Queue?
URL: https://www.youtube.com/watch?v=wjI1WNcIntg&list=PLI1t_8YX-Apv-UiRlnZwqqrRT8D1RhriX&index=3
*/

public class Queue{
  private static class Node{
    private int data;
    private Node next;
    private Node (int data){
      this.data = data;
    }
  }

  private Node head; //remove from head
  private Node tail; //add things here

  public boolean isEmpty(){
    return head == null;
  }

  public int peek(){
    return head.data;
  }

  public void add (int data){
    Node node = Node(data);
    if(tail != null){
      tail.next = node;
    }
    tail = node;
    if(head == null){
      head = node;
    }
  }

  public int remove(){
    int data = head.data;
    head = head.next;
    if(head == null){
      tail = null;
    }
    return data;
  }
}
