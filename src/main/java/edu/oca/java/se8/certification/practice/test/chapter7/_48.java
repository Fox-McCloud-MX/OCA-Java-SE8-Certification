package edu.oca.java.se8.certification.practice.test.chapter7;

public class _48 extends StringInstrument implements MusicCreator {

    @Override
    public Long play() {
        return 12L; //add L
    }
}

interface MusicCreator {

    public Number play();
}

abstract class StringInstrument {

    public Long play() {
        return 3L;
    }
}
