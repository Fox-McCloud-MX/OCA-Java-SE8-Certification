package edu.oca.java.se8.certification._1Z0_808.chapter2;

public class NestedLoops {
    public static void main(String[] args) {
        NestedLoops nestedLoops = new NestedLoops();
        
//        nestedLoops.nestedLoopFor();
//        nestedLoops.nestedLoopDoWhile();
//        nestedLoops.loopLabels();
//        nestedLoops.searchWithLabels(13);
        nestedLoops.nestedForLoopStatementWithOnlyContinue();
        
        
    }
    
    public void nestedLoopFor() {
        int[][] myComplexArray = {
            {5, 2, 1, 3},
            {3, 9, 8, 9},
            {5, 7, 12, 7}
        };

        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }

    public void nestedLoopDoWhile() {
        int x = 20;
        while (x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.print(x + "\t"); //output 3    0
        }
    }

    public void loopLabels() {
        int[][] myComplexArray = {
            {5, 2, 1, 3},
            {3, 9, 8, 9},
            {5, 7, 12, 7}
        };

        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }

    public void searchWithLabels(int searchValue) {
        int[][] list = {
            {1, 13, 5},
            {1, 2, 5},
            {2, 7, 2}
        };

        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }

        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found");
        } 
        else {
            System.out.println("Value " + searchValue + " found at: "
                + "(" + positionX + "," + positionY + ")");
        }
    }
    
    //continue statement with FIRST_CHAR_LOOP
    public void nestedForLoopStatementWith_FIRST_CHAR_LOOP() {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b') {
                    continue FIRST_CHAR_LOOP;
                }
                System.out.print(" " + a + x); //1a 3a 4a
            }
        }
    }
    
    //continue statement with only continue
    public void nestedForLoopStatementWithOnlyContinue() {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b') {
                    continue; //FIRST_CHAR_LOOP;
                }
                System.out.print(" " + a + x); //1a 1c 3a 3c 4a 4c
            }
        }
    }
    
    //continue statement without continue
    public void nestedForLoopStatementWithoutContinue() {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b') {
                    //continue;
                }
                System.out.print(" " + a + x); //1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c
            }
        }
    }
    
    public void ifStatementWithConinue(){
        int x = 0;
        
        FIRST_LABEL:
        if (x >= 0) {
            //do something
        } 
        //SECON_LABEL: -> ERROR
        else if(x < 0) {
            
        }
    }
    
    //Labels
    /*
   -------------------------------------------------------------------------------------------
   | statement | Allows optional labels | Allows break statement | Allows continue statement |
   -------------------------------------------------------------------------------------------
   |  if       |          Yes *         |          No            |              No           |    
   |  while    |          Yes           |          Yes           |              Yes          |    
   |  do while |          Yes           |          Yes           |              Yes          |
   |  for      |          Yes           |          Yes           |              Yes          |
   |  switch   |          Yes           |          Yes           |              No           |
   -------------------------------------------------------------------------------------------
    *Labels are allowed for any block statement, including those that are 
    preceded with an if-then statement.
    */
        
}
