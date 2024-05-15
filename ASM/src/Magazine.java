
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
public class Magazine extends Doc{
    int vol;

    public Magazine() {
    }

    public Magazine(int ID, String NXB, int vol) {
        super(ID, NXB);
        this.vol = vol;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    @Override
    public String toString() {
        return "Magazine: " +super.toString() + ", vol=" + vol ;
    }
    public void inputMag(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Vol: ");
        vol=sc.nextInt();
    }
    
}
