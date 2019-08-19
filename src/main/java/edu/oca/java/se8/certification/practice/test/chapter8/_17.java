package edu.oca.java.se8.certification.practice.test.chapter8;

public class _17 {

    public int travel() throws Exception {
        return 4;
    } // j1

    public static void main(String... distance) throws Exception {
        /*try {
            System.out.print(new _17().travel());
        } catch (Exception e) (System.out.print(8); //(
            )
        }*/
    }

    class CapsizedException extends Exception {
    }

    class Transport {

        public int travel() throws CapsizedException {
            return 2;
        }
    }
}
