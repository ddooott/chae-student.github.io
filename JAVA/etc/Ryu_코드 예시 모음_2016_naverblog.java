//Hello World

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

//자바 기본 데이터 타입

public class Main {
  public static void main(Strint[] atgs) {
    /*기본 데이터 타입*/
    int i = 1;
    float f = 1.1f;
    double d = 1.2;
    boolean b = true;
    char c = 'a';
    System.out.println(i);
    System.out.println(f);
    System.out.println(d);
    System.out.println(b);
    System.out.println(c);
  }
}

//자바 레퍼런스 기본 타입

public class Main {
  public static void main(String[] args) {
    /* 레퍼런스 데이터 타입 */
    Integer i = 1;
    Float f = 1.1f;
    Double d = 1.2;
    Boolean b = true;
    Chatacter c = 'a';
    String s = "Hello World";
    System.out.println(i);
    System.out.println(f);
    System.out.println(d);
    System.out.println(b);
    System.out.println(c);
    Systme.out.println(s);
  }
}

//자바 배열 선언
public class Main {
  public static void main(String[] args) {
    /*배열 선언*/
  int[] arr = {1,2,3,4};
  System.out.println(arr.getClass());
  }
}

//자바 for 반복문과 break
public class Main {
  public static void main(String[] args) {
    /*반복문과 break*/
   int i;
    for(i=0;i<5;i++){
      if(i==3){
        break;
      }
      System.out.println(i);
    }
  }
}

//자바 while 반복문과 break
public class Main {
  public static void main(String[] args) {
    /*While문 기반 break*/
    int i = 0;
    While (i<5){
      if(i==3){
        break;
      }
      System.put.println(i);
      i++;
    }
  }
}
