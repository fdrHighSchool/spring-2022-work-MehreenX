import java.util.*;
public class World{

  public static void  main (String [] args){
    Cell[][] grid = new Cell[10][10];
    Scanner s = new Scanner(System.in);

  }//end main

  public static void Board(Cell[][] grid){
    for(int r = 0; r < grid.length; r++){
      for(int c= 0; c < grid[0].length; c++){
        grid[r][c] = new Cell[1];
      }
    }
  }

  public static Display(Cell[][] grid){
    for(int r = 0; r < grid.length; r++){
      for(int c= 0; c < grid[0].length; c++){
        System.out.println(grid[r][c] + " ");
      }
      System.out.println();
    }
  }

 public int countneighbors(int r, int c){
  int count = 0;

  for(int i(row) = -1; i <= 1; i++){
    for(int j(col) = -1; j<=; j++){
      if (world[r + i][c + j].getStatus() == 1){
        count++;

      }
    }
  }
  if[world[r][c].getStatus == 1{
    count--;
  }
  return count;
 }

 public 

}//end class
