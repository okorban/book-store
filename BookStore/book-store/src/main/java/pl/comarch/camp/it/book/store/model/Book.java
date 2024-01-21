package pl.comarch.camp.it.book.store.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Book implements Cloneable {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private double price;
    private int quantity;


    @Override
    public Book clone() {
        /*try {
            Book clone = (Book) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }*/
        Book book = new Book();
        book.setId(this.id);
        book.setTitle(this.title);
        book.setAuthor(this.author);
        book.setIsbn(this.isbn);
        book.setPrice(this.price);
        book.setQuantity(this.quantity);
        return book;
    }
}