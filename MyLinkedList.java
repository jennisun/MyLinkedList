public class MyLinkedList{
  private int size;
  private Node start,end;

  public MyLinkedList(){
    size = 0;
  }

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
    else if (index == size) {
      add(value);
    }
    else {
      Node n = start;
      for (int i = 0; i < index; i ++) {
        n = n.getNext();
        if (n == null)  throw new IndexOutOfBoundsException();
      }

      Node a = new Node(value);

      a.setPrev(n.getPrev());
      a.setNext(n);

      if (index > 0) n.getPrev().setNext(a);
      else start = a;

      n.setPrev(a);

      size ++;
    }
  }

  public String get(int index) throws IndexOutOfBoundsException {
    Node n = start;
    for (int i = 0; i < index; i ++) {
      n = n.getNext();
      if (n == null) throw new IndexOutOfBoundsException();
    }
    return n.getData();
  }

  public String set(int index, String value) throws IndexOutOfBoundsException {
    Node n = start;
    for (int i = 0; i < index; i ++) {
      n = n.getNext();
      if (n == null) throw new IndexOutOfBoundsException();
    }

    String s = n.getData();
    n.setData(value);
    return s;
  }

  public String toString() {
    if (size == 0) return "[]";
    String ans = "[";
    Node a = start;
    while (a != end) {
      ans += a.getData() + ", ";
      a = a.getNext();
    }
    return ans + a.getData() + "]";
  }
  // Any helper method that returns a Node object MUST BE PRIVATE!
}
