package edu.oca.java.se8.certification.others.exam._1ZO_808.A.basics.acces_modifier.protected_access_modifier.building;

import edu.oca.java.se8.certification.others.exam._1ZO_808.A.basics.acces_modifier.protected_access_modifier.library.Book;

public class StoryBook extends Book{

  public StoryBook() {
    author = "ABC";
    modifyTemplate();
    super.modifyTemplate();
  }
}
