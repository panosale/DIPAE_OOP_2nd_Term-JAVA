public class Outer {
  private String inString = "Outer inString";
  private String outString = "Outer outString";
  public interface Printable {
    public void print(); 
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
  public static class StaticMan {
    public void method1() {}
    void method2() {} 
    private void method3() {}
    protected void method4() {}
    public String getOutString() {
      String result = "";
      result = outString;
      return result;
    }
  }
}
