/*
How to implement a Stack?
URL: https://www.youtube.com/watch?v=wjI1WNcIntg&list=PLI1t_8YX-Apv-UiRlnZwqqrRT8D1RhriX&index=3
*/

public class Stack{
  private static class Node{
    private int data;
    private Node next;
    private Node (int data){
      this.data = data;
    }
  }

  private Node top;

  public boolean isEmpty(){
    return top == null;
  }

  public int peek(){
    return top.data;
  }

  public void push (int data){
    Node node = new Node (data);
    node.next = top;
    top = node;
  }

  public int pop(){
    int data = top.data;
    top = top.next;
    return data;
  }

}
