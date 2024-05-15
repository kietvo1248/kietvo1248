
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
public class Doc {
    private int ID;
    private String NXB;

    public Doc() {
    }

    public Doc(int ID, String NXB) {
        this.ID = ID;
        this.NXB = NXB;
    }
    
    

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @return the NXB
     */
    public String getNXB() {
        return NXB;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @param NXB the NXB to set
     */
    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    @Override
    public String toString() {
        return  "ID=" + ID + ", NXB=" + NXB;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NXB: ");
        NXB = sc.nextLine();
        System.out.print("ID: ");
        ID= sc.nextInt();
        
    }
}
