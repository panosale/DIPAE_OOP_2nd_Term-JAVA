// 2.II
public interface B {
    String bMessage();
    default int getB() {
        return 2;
    };
}
