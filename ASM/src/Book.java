
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIET
 */
public class Book extends Doc{
    private String author;
    private int page;

    public Book() {
    }

    public Book(int ID, String NXB ,String author, int page) {
        super(ID, NXB);
        this.author = author;
        this.page = page;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the page
     */
    public int getPage() {
        return page;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @param page the page to set
     */
    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book : " + super.toString() + ", author=" + author + ", page=" + page + '}';
    }
    public void inputBook(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Author: ");
        author=sc.nextLine();
        System.out.print("Page: ");
        page=sc.nextInt();
    }
    
    
}
