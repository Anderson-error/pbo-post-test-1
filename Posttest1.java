package com.mycompany.posttest1;

import java.util.ArrayList;
        
public class Posttest1 {
    public static void main (String[] args){
        ArrayList<bis> terminal = new ArrayList();
        
        terminal.add(new bis ("pagi" ,6 ,"AC", 55000));
        terminal.add(new bis ("pagi" ,9 ,"non AC", 45000));
        terminal.add(new bis ("Siang", 12, "AC", 55000));
        terminal.add(new bis ("siang" ,15 ,"non AC", 45000));
        terminal.add(new bis ("malam", 18, "AC", 55000));
        terminal.add(new bis ("malam" ,20 ,"non AC", 45000));
        
        for (bis Bis : terminal){
            String pernyataan = "Bis dengan keberangkatan " + Bis.getWaktu() + " jam " + Bis.getJam()+ " " + "tipe bis " + Bis.getTipe()+ " " + "dengan harga " + Bis.getHarga();
            System.out.println(pernyataan);
        }
    }
}
