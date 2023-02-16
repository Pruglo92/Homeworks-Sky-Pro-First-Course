public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Л.Н.Толстой");
        Author author2 = new Author("Ф.М.Достоевский");

        Book book1 = new Book("Война и мир", author1, 0);
        Book book2 = new Book("Преступление и наказание", author2, 1866);

        book1.setPublishingYear(1867);
    }
}