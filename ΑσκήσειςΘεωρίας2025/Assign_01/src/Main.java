public class Main {
    public static void main(String[] args) {
        System.out.println("Give a number: ");
        Book[] bookArr = new Book[10];
        for (int i = 0; i < bookArr.length; i++) {
            bookArr[i] = new Book();
            System.out.println(bookArr[i].toString());
        }
    }
}
