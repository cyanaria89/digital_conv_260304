package Collection_Set실습;

public class Book {
    int isbn;
    String title;
    String author;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public int getIsbn() { return isbn; }
    public void setIsbn(int isbn) { this.isbn = isbn; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public void showBook() {
        System.out.println(
                "[ISBN : " + isbn + "]\n[제목 : " + title + "]\n[저자 : " + author + "]\n--------------------"
        );
    }

    @Override
    public String toString() {
        return "[도서번호 - " + isbn + "]\n[제목 - " + title + "]\n[저자 - " + author + "]\n";
    }

    @Override
    public int hashCode() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            if (this.isbn == book.isbn) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
