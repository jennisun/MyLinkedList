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

  public void add(int index, String value) throws IndexOutOfBoundsException {
    if (index < 0 || index > size) throw new IndexOutOfBoundsException();
    else if (index == size) add(value);
    else {
      Node n = start;
      for (int i = 0; i < index; i ++) {
        n = n.getNext();
        if (n == null)  throw new IndexOutOfBoundsException();
      }

    Node prev = n.getPrev();
    Node next = n.getNext();

    Node a = new Node(value);
    
    a.setPrev(n.getPrev());
    a.setNext(n.getNext());

    prev.setNext(a);
    next.setPrev(a);

    }
  }

  public String get(int index) {
    Node n = start;
    for (int i = 0; i < index; i ++) {
      n = start.getNext();
      if (n == null) throw new IndexOutOfBoundsException();
    }
    return n.getData();
  }
  // public String set(int index, String value);
  // public String toString();
  // Any helper method that returns a Node object MUST BE PRIVATE!
}
