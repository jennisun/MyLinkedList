public class tester{
  public static void main(String[]args){
    MyLinkedList words = new MyLinkedList();

    for(int i = 0; i < 10; i++){
      words.add(i+"");
    }

    MyLinkedList a = new MyLinkedList();

    for(int i = 1; i < 10; i++){
      a.add(i+"");
    }


    words.add(0,"head");
    words.add(words.size(),"tail");
    System.out.println(words.toString());
    System.out.println(a.toString());
    System.out.println("/n");

    words.extend(a);
    System.out.println(words.toString());
    System.out.println(a.toString());
  }
}
