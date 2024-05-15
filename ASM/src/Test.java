/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIET
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manage doc = new Manage();
        
        System.out.println("Thêm hàng để bán");
        System.out.println("Thêm Sách:");
        Book book = new Book();
        book.inputBook();
        doc.addItem(book);
        System.out.println("Thêm Tạp chí");
        Magazine mag = new Magazine();
        mag.inputMag();
        doc.addItem(mag);
        System.out.println("Thêm Báo");
        News news = new News();
        news.inputNews();
        doc.addItem(news);
        System.out.println("Show Hàng: ");
        doc.displayAll();
        System.out.println("Tìm gì? ");
      
        doc.foundID();
    }
    
}
