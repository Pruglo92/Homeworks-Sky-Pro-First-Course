public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Л.Н.Толстой");
        Author author2 = new Author("Ф.М.Достоевский");

        Book book1 = new Book("Война и мир", author1, 1867);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        System.out.println(author1);
        System.out.println(book1);
    }
}