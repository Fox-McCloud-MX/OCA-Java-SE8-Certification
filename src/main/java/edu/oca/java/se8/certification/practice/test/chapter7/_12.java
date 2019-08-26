package edu.oca.java.se8.certification.practice.test.chapter7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class _12 extends School {

    @Override
    public int getNumberOfStudentsPerClassroom() throws FileNotFoundException {
        return 2;
    }

    public static void main(String[] students) throws IOException {
        School school = new _12();
        System.out.print(school.getNumberOfStudentsPerClassroom());
    }
}

class School {

    public int getNumberOfStudentsPerClassroom(String... students) throws IOException {
        return 3;
    }

    public int getNumberOfStudentsPerClassroom() throws IOException {
        return 9;
    }
}
