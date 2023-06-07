// Nested classes, Inner classes
// ergastirio 12.1
public class Outer {
  private String inString = "Outer inString";
  private String outString = "Outer outString";
  public interface Printable {
    public void print(); 
  }
  public Outer() {
    // Default constructor
    ConInner ci = new ConInner();
    ci.method();

    class AnonymousInner implements Printable {
      public void print() {
        System.out.println("Panos.");
      }
    }
    AnonymousInner p = new AnonymousInner();
    p.print();
  }
  public class Inner {
    private String inString = "Inner inString";
    public String getInString() {
      return this.inString; 
    }
    public String getOutString() {
      return outString;
    }
  }
  public class StaticMan {
    public void method1() {}
    void method2() {} 
    private void method3() {}
    protected void method4() {}
    public String getOutString() {
      String result = "";
      //result = outString;
      return result;
    }
  }
  public class ConInner {
    public void method() {
      System.out.println( "ConInner: " + outString );
      System.out.println( "ConInner: " + inString );
    }
  }
  public static void main(String[] args) {
    Outer out = new Outer();
    Inner inn = out.new Inner();
    inn.getInString();
    inn.getOutString();

    StaticMan sm = out.new StaticMan();
    sm.method1();
    sm.method2();
    sm.method3();
    sm.method4();

    ConInner ci = out.new ConInner();
  }
}
