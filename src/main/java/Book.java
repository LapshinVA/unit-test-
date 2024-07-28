public class Book {
    private String title;
    private int releaseYear;
    private Author author;
    private int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    /**
     * Проверяет, является ли книга большой
     *
     * @return true, если книга является большой; false в противном случае
     */
    public boolean isBig() {
        return pages > 500;
    }

    /**
     * Проверяет, содержится ли в описании книги переданное параметром слово
     *
     * @param word переданное слово
     * @return true, если в описании книги содержится переданное параметром слово; false в противном случае
     */
    public boolean matches(String word) {
        if (word == null) return false;
        else return title.contains(word) || author.getName().contains(word) || author.getSurname().contains(word);
    }

    /**
     * Возвращает оценку стоимости книги
     *
     * @return стоимость книги
     */
    public int estimatePrice() {
        int priceOfBook = (int) Math.floor(pages * 3 * Math.sqrt(author.getRating()));
        if (priceOfBook > 250) return priceOfBook;
        return 0;
    }


    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", author=" + author +
                ", pages=" + pages +
                '}';
    }
}
