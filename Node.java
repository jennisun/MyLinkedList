public class Node{

  private String data;
  private Node next,prev;
  //write get/set methods for all three instance variables.
  Node(String value){
    data = value;
  }

  public String getData(){
    return data;
  }

  public void setData(String s){
    data = s;
  }

  public Node getNext(){
    return next;
  }

  public void setNext(Node a){
    next = a;
  }

  public Node getPrev(){
    return prev;
  }

  public void setPrev(Node a){
    prev = a;
  }


}
