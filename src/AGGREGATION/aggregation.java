//aggregation: it represents a has-a reln b/w objs.
//one obj contains another as a part of its strct, but the contained objs can exist independently.
package AGGREGATION;
public class aggregation
{
    public static void main(String[] args)
    {
        Book book1=new Book("Harry Potter", 400);
        Book book2=new Book("Percy Jackson", 300);
        Book book3=new Book("Butter", 200);

        Book[] books={book1,book2,book3};

        for(Book book : books)
            System.out.println(book.displayinfo());

        Library library=new Library("National Library", 1896,books);//aggregation
        library.displayinfo();

    }
}
