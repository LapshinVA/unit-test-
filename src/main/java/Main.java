public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Книга джунглей", 1893, new Author("Редьярд","Киплинг", 7), 140);
        Book book2 = new Book("Война и мир", 1863, new Author("Лев"," Толстой",6), 1300);
        Book book3 = new Book("Скотный двор", 1945, new Author("Джордж","Оруэлл",8), 256);


        test(book1);
        test(book2);
        test(book3);

    }

    /**
     * Демонстрирует работоспособность методов переданного в параметре объекта типа Book
     * @param book объект типа Book
     */
    public static void test(Book book) {
        System.out.println(book);
        System.out.println("Это большая книга?: " + book.isBig());
        System.out.println("В описании книги есть слово \"Киплинг\"?: " + book.matches("Киплинг"));
        System.out.println("В описании книги есть слово \"мир\"?: " + book.matches("мир"));
        System.out.println("Оценка стоимости книги составляет: " + book.estimatePrice() + " руб.");
        System.out.println();
    }
}
