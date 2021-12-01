public class Main {

  public static void main(String[] args) {

    char[] str = new char[]{' ', 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', ' '};
    CustomString cs = new CustomString(str);
    CustomString def = new CustomString();

    // length
    System.out.println("Method length :\n" + cs.length());
    // charAt
    System.out.println("Method charAt :\n" + cs.charAt(2));
    // valueOf
    System.out.println("Method valueOf :");
    System.out.println(cs.valueOf(10));
    // indexOf
    System.out.println("Method indexOf :\n" + cs.indexOf('e'));
    // isEmpty
    System.out.println("Method isEmpty :\n" + cs.isEmpty());
    // trim
    System.out.println("Method trim :");
    System.out.println(cs.trim());
    // subString
    System.out.println("Method substring :");
    System.out.println(cs.substring(5));
    System.out.println(cs.substring(2, 8));
    // contains
    System.out.println("Method contains :\n" + cs.contains(new char[]{'W', 'o', 'r', 'l', 'd'}));


  }
}
