package edu.oca.java.se8.certification._1Z0_808.chapter4.reviewQuestions._7.city;

import edu.oca.java.se8.certification._1Z0_808.chapter4.reviewQuestions._7.school.*;

/*
Given the following my.school.ClassRoom and my.city.School class definitions, which
line numbers in main() generate a compiler error? (Choose all that apply)

A. None, the code compiles fine.
B. Line 5
C. Line 6
D. Line 7
E. Line 8
F. Line 9
 */
public class School {

    public static void main(String[] args) {
        //System.out.println(Classroom.globalKey); //globalKey is not public in Classroom; cannot be accessed from outside package
        //Classroom room = new Classroom(101, ""Mrs.Anderson"); -> syntax error & Classroom(int,String) is not public in Classroom; cannot be accessed from outside package
        //System.out.println(room.roomNumber); cann't find symbol room
        //System.out.println(room.floor);
        //System.out.println(room.teacherName);
    }
}
