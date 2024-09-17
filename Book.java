/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author David DiBenedetto
 * @version 09-17-2024
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Constructor to initialize the author, title, and pages fields.
     * The reference number is initialized to an empty string.
     *
     * @param bookAuthor The author of the book.
     * @param bookTitle The title of the book.
     * @param numPages The number of pages in the book.
     */
    public Book(String bookAuthor, String bookTitle, int numPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages;
        refNumber = "";
    }

    /**
     * Get the author of the book.
     * @return The author of the book.
     */
    public String getAuthor() 
    {
        return author;
    }

    /**
     * Get the title of the book.
     * @return The title of the book.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Print the author of the book to the console.
     */
    public void printAuthor()
    {
        System.out.println(author);
    }

    /**
     * Print the title of the book to the console.
     */
    public void printTitle()
    {
        System.out.println(title);
    }

    /**
     * Get the number of pages in the book.
     * @return The number of pages.
     */
    public int getPages()
    {
        return pages;
    }

    /**
     * Exercise 2.87: Print details of the book, including title, author, and pages.
     * Additionally, print the reference number. If the reference number is not set,
     * print "ZZZ" instead.
     */
    public void printDetails()
    {
        System.out.println("****************************");
        System.out.println("********Book*Details********");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        String ref = "ZZZ";
        if (refNumber.length() > 0)
        {
            ref = refNumber;
        }
        System.out.println("Reference Number: " + ref);
        System.out.println("****************************");
    }

    /**
     * Exercise 2.88: Set the reference number for the book if it meets the required length.
     * Reference number must be at least 3 characters long.
     *
     * @param ref The reference number to be set.
     */
    public void setRefNumber(String ref)
    {
        if (ref.length() < 3) {
            System.err.println("Reference Number Length must be at least 3");
        }
        else
        {
            refNumber = ref;
        }
    }

    /**
     * Get the reference number of the book.
     * @return The reference number of the book.
     */
    public String getRefNumber()
    {
        return refNumber;
    }
}