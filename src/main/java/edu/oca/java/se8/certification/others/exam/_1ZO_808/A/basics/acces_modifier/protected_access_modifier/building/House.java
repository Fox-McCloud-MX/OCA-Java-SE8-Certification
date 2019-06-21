package edu.oca.java.se8.certification.others.exam._1ZO_808.A.basics.acces_modifier.protected_access_modifier.building;

import edu.oca.java.se8.certification.others.exam._1ZO_808.A.basics.acces_modifier.protected_access_modifier.library.Book;

public class House {
  public House() {
    Book book = new Book();
    //book.author = "ABC";        //<- ERROR
    //book.modifyTemplate();      //<- ERROR
  }
}
