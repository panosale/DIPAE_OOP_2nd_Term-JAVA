// 2.II
public interface A {
    String aMessage();
    default int getA() {
        return 1;
    };
}
