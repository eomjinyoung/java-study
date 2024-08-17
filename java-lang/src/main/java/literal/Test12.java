package literal;

public class Test12 {
  public static void main(String[] args) {
    // 문자열 리터럴(literal) - 이스케이프 문자(escape character)
    System.out.println("Hello\nworld!"); // linefeed(LF)
    System.out.println("Hello\rabc"); // carrage return(CR)
    System.out.println("Hello\tworld!"); // horizontal tab
    System.out.println("Hello\bworld!"); // backspace
    System.out.println("Hello\fworld!"); // form feed
    System.out.println("Hello\\world!"); // backslash
    System.out.println("Hello\"world!"); // double quote
    System.out.println("Hello\'world!"); // single quote
    System.out.println("Hello'world!"); // single quote
  }
}
