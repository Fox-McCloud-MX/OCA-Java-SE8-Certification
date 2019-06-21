package edu.oca.java.se8.certification._1Z0_808.chapter3;

/*public*/ final class Immutable {

    public static void main(String[] args) {
        Immutable immutable = new Immutable();
        
        System.out.println(immutable.getS());
        //immutable.setS("i"); //POSSIBLE
        //System.out.println(immutable.getS());
        
        immutable.concat();

        
    }

    private String s = "name";

    public String getS() {
        return s;
    }

    // POSSIBLE
    /*
    public void setS(String s) {
        this.s = s;
    }
     */
    
    public void concat() {
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
    }
}
