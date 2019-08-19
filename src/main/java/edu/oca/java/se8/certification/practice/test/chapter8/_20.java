package edu.oca.java.se8.certification.practice.test.chapter8;

public class _20 extends Element{
public int getSymbol() {
            return 8;
        } // g2

        public void printData() {
            /*try {
                System.out.print(getSymbol());
            } catch  { // g3 //does not compile
                System.out.print("Unable to read data");
            }*/
        }
}

    class GasException extends Exception {
    }

    class Element {

        public int getSymbol() throws GasException {
            return -1;
        } // g1
    }
