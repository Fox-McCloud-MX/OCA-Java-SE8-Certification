package edu.oca.java.se8.certification.practice.test.chapter8;

public class _18 implements Printer {

    /*public int printData() throws PaperPrintException {
        return 0;
    }*/ //allowed

    /*public int printData() throws Exception {
        return 0;
    }*/ //overridden method does not throw Exception

    /*public int printData() {
        return 0;
    }*/ //allowed
    //extra
    @Override
    public int printData() throws PaperPrintException {
        return 0;
    }

    @Override
    public int printData2() throws PaperPrintException {
        return 0;
    }

    @Override
    public int printData3() throws PrintException {
        return 0;
    }

}

class PrintException extends Exception {
}

class PaperPrintException extends PrintException {
}

interface Printer {

    abstract int printData() throws PrintException;

    //extra
    abstract int printData2() throws PaperPrintException;

    abstract int printData3() throws Exception;
}
