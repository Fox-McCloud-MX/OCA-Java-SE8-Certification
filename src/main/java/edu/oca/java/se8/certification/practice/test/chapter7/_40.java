package edu.oca.java.se8.certification.practice.test.chapter7;

public class _40 extends ComplexMath {

    public final double secret = 8;

    public static void main(String[] numbers) {
        Math math = new _40();
        System.out.print(math.secret); //2.0
    }

}

class Math {

    public final double secret = 2;
    
    public final double getSecret() {
        return this.secret;
    }
}

class ComplexMath extends Math {

    public final double secret = 4;
    
    //getSecret() in ComplexMath cannot override getSecret() in Math 
    //overridden method is final
    /*public final double getSecret() { 
        return this.secret;
    }*/
}
