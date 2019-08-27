package edu.oca.java.se8.certification.practice.test.chapter7;

//public class _19 extends Woodwind implements Horn { //Integer and Short aren't compatibles
public class _19 implements HornSubClass{

    @Override
    public Number play() {
        return null;
    }

}

interface Horn {

    public Integer play(); //Integer isn't a subclass
}

abstract class Woodwind {

    public Short play() { //Short isn't a subclass
        return 3;
    }
}

//extra
//the return type must be a subclass
interface HornSubClass {
    public default Number play() { return null; };
}
