public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){/*create a constructor*/}

  public int size() {
    return size;
  }

  public boolean add(String value) {
    if (size == 0) {
      Node n = new Node(value);
      start = n;
      end = n;
      size ++;
    }
    else {
      Node n = new Node(value);
      n.setPrev(end);
      end.setNext(n);
      end = n;
      size ++;
    }
    return true;
  }
  // public boolean add(int index, String value);
  // public String get(int index);
  // public String set(int index, String value);
  // public String toString();
  //Any helper method that returns a Node object MUST BE PRIVATE!
}
