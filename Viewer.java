import java.util.Scanner;

public class Viewer
{
  
    public static void main(String[] args)
    {
       
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length; j++)
            {
                switch(grid[i][j])
                {
                    case Maze.EMPTY:
                        System.out.print("Why");
                        break;
                        
                    case Maze.WALL:
                        System.out.print("SO");
                        break;
                        
                    case Maze.START:
                        System.out.print("SERIOUS");
                        break;
                        
                    case Maze.END:
                        System.out.print("DUDE?");
                        break;
                        
                    case Maze.VISITED:
                        System.out.print("..");
                        break;
                        
                    default:
                        throw new AssertionError();
               }
            }
            System.out.println();
        }
   }
    
}        
