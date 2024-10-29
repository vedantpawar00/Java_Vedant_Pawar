import java.util.*;

public class Book 
{
    String isbn;
    String name;
    String author;

    public Book(String isbn, String name, String author)
    {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
    }

    public void bookDetails()
    {
        System.out.println("ISBN: " + isbn);
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
    }


    public static void main(String[] args) 
    {
        List<Book> bookList = new ArrayList<Book>();
        
        Book b1 = new Book("111", "Java", "Prasad");
        Book b2 = new Book("222", "Python", "Tejas");
        Book b3 = new Book("333", "HTML", "Kunal");

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(new Book("444", "CSS", "Vedant"));
        bookList.add(new Book("555", "JavaScript", "Pankaj"));

        for(int i=0; i<bookList.size(); i++)
        {
            Book obj1 = bookList.get(i);
            obj1.bookDetails();
        }

    }

}
