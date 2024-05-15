
import java.util.ArrayList;
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
public class Manage {

    ArrayList<Doc> list;
    int numOfItem;
    Scanner sc = new Scanner(System.in);

    public Manage() {
        list = new ArrayList<Doc>();
        numOfItem = 0;
    }

    public boolean addItem(Doc doc) {
        if (doc == null) {
            return false;
        }
        list.add(doc);
        numOfItem++;
        return true;
    }

    public void displayAll() {
        if (numOfItem == 0) {
            System.out.println("Out of Stock, please buy something to sell");
        } else {
            for (Doc doc : list) {
                System.out.println(doc);
            }
        }
    }

    public void foundID() {

        System.out.println("Nhập ID để tìm: ");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == id) {
                System.out.println(list.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Item not found");
        }
    }
}
