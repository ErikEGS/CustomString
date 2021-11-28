public class Main {

  public static void main(String[] args) {

    CustomString cs = new CustomString("  Hello World  ");

    // length
    System.out.println("Method length :\n" + cs.length());
    // charAt
    System.out.println("Method charAt :\n" + cs.charAt(2));
    // valueOf
    System.out.println("Method valueOf :\n" + cs.valueOf(10));
    // indexOf
    System.out.println("Method indexOf :\n" + cs.indexOf('e'));
    // isEmpty
    System.out.println("Method isEmpty :\n" + cs.isEmpty());
    // trim
    System.out.println("Method trim :\n" + cs.trim());
    // subString
    System.out.println("Method substring :\n" + cs.substring(5));
    System.out.println(cs.substring(2, 11));
    // contains
    System.out.println("Method contains :\n" + cs.contains("Hello"));


  }
}
