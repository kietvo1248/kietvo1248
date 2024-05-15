
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
public class News extends Doc{
    private int post;

    public News() {
    }

    public News(int ID, String NXB, int post) {
        super(ID, NXB);
        this.post = post;
    }

    /**
     * @return the post
     */
    public int getPost() {
        return post;
    }

    /**
     * @param post the post to set
     */
    public void setPost(int post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "News: "+super.toString() + ", post= " + post ;
    }
    public void inputNews(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Day Posted: ");
        post=sc.nextInt();
    }
}
