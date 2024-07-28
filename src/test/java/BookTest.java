import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class BookTest {
    static Book book;
    @BeforeAll
    static void before(){
        book = new Book("Война и мир", 1863, new Author("Лев"," Толстой",6), 1300);
    }

    @Test
    void isBigTest() {
        Assertions.assertTrue(book.isBig());
    }

    @Test
    void matchesTestSuccessful() {
        String word = "мир";
        Assertions.assertTrue(book.matches(word));
    }

    @Test
    void matchesTestUnsuccessful() {
        String word = "книга";
        Assertions.assertFalse(book.matches(word));
    }

    @Test
    void estimatePriceTest() {
        Assertions.assertEquals(9553, book.estimatePrice());
    }
}
