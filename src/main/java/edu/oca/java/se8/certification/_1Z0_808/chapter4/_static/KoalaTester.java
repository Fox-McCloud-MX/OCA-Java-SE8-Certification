
package edu.oca.java.se8.certification._1Z0_808.chapter4._static;

public class KoalaTester {
    public static void main(String[] args) {
        KoalaTester koalaTester = new KoalaTester();
        
        //koalaTester.stillKoala();
        koalaTester.setCountKoala();
    }
    
    public void stillKoala() {
        Koala k = new Koala();
        
        System.out.println(k.count); //k is a Koala
        k = null;
        
        System.out.println(k.count); //k is still a Koala
    }
    
    public void setCountKoala() {
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        
        System.out.println(Koala.count);
    }
}
