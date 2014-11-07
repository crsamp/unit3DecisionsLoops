import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 17;
    private final int COLS = 17;
    
    // constants for the location of the three cells initially alive
    private final int X1 = 4, Y1 = 3;
    private final int X2 = 5, Y2 = 3;
    private final int X3 = 6, Y3 = 3;
    private final int X4 = 10, Y4 = 3;
    private final int X5 = 11, Y5 = 3;
    private final int X6 = 12, Y6 = 3;
    private final int X7 = 3, Y7 = 4;
    private final int X8 = 7, Y8 = 4;
    private final int X9 = 9, Y9 = 4;
    private final int X10 = 13, Y10 = 4;
    private final int X11 = 3, Y11 = 5;
    private final int X12 = 7, Y12 = 5;
    private final int X13 = 9, Y13 = 5;
    private final int X14 = 13, Y14 = 5;
    private final int X15 = 3, Y15 = 6;
    private final int X16 = 7, Y16 = 6;
    private final int X17 = 9, Y17 = 6;
    private final int X18 = 13, Y18 = 6;
    private final int X19 = 4, Y19 = 7;
    private final int X20 = 5, Y20 = 7;
    private final int X21 = 6, Y21 = 7;
    private final int X22 = 10, Y22 = 7;
    private final int X23 = 11, Y23 = 7;
    private final int X24 = 12, Y24 = 7;
    private final int X25 = 4, Y25 = 9;
    private final int X26 = 5, Y26 = 9;
    private final int X27 = 6, Y27 = 9;
    private final int X28 = 10, Y28 = 9;
    private final int X29 = 11, Y29 = 9;
    private final int X30 = 12, Y30 = 9;
    private final int X31 = 3, Y31 = 10;
    private final int X32 = 7, Y32 = 10;
    private final int X33 = 9, Y33 = 10;
    private final int X34 = 13, Y34 = 10;
    private final int X35 = 3, Y35 = 11;
    private final int X36 = 7, Y36 = 11;
    private final int X37 = 9, Y37 = 11;
    private final int X38 = 13, Y38 = 11;
    private final int X39 = 3, Y39 = 12;
    private final int X40 = 7, Y40 = 12;
    private final int X41 = 9, Y41 = 12;
    private final int X42 = 13, Y42 = 12;
    private final int X43 = 4, Y43 = 13;
    private final int X44 = 5, Y44 = 13;
    private final int X45 = 6, Y45 = 13;
    private final int X46 = 10, Y46 = 13;
    private final int X47 = 11, Y47 = 13;
    private final int X48 = 12, Y48 = 13;
    

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, rock6);
         
        Rock rock7 = new Rock();
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(X8, Y8);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(X9, Y9);
        grid.put(loc9, rock9);
         
        Rock rock10 = new Rock();
        Location loc10 = new Location(X10, Y10);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(X11, Y11);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(X12, Y12);
        grid.put(loc12, rock12);
         
        Rock rock13 = new Rock();
        Location loc13 = new Location(X13, Y13);
        grid.put(loc13, rock13);
        
        Rock rock14 = new Rock();
        Location loc14 = new Location(X14, Y14);
        grid.put(loc14, rock14);
        
        Rock rock15 = new Rock();
        Location loc15 = new Location(X15, Y15);
        grid.put(loc15, rock15);
         
        Rock rock16 = new Rock();
        Location loc16 = new Location(X16, Y16);
        grid.put(loc16, rock16);
        
        Rock rock17 = new Rock();
        Location loc17 = new Location(X17, Y17);
        grid.put(loc17, rock17);
        
        Rock rock18 = new Rock();
        Location loc18 = new Location(X18, Y18);
        grid.put(loc18, rock18);
         
        Rock rock19 = new Rock();
        Location loc19 = new Location(X19, Y19);
        grid.put(loc19, rock19);
        
        Rock rock20 = new Rock();
        Location loc20 = new Location(X20, Y20);
        grid.put(loc20, rock20);
        
        Rock rock21 = new Rock();
        Location loc21 = new Location(X21, Y21);
        grid.put(loc21, rock21);
         
        Rock rock22 = new Rock();
        Location loc22 = new Location(X22, Y22);
        grid.put(loc22, rock22);
        
        Rock rock23 = new Rock();
        Location loc23 = new Location(X23, Y23);
        grid.put(loc23, rock23);
        
        Rock rock24 = new Rock();
        Location loc24 = new Location(X24, Y24);
        grid.put(loc24, rock24);
         
        Rock rock25 = new Rock();
        Location loc25 = new Location(X25, Y25);
        grid.put(loc25, rock25);
        
        Rock rock26 = new Rock();
        Location loc26 = new Location(X26, Y26);
        grid.put(loc26, rock26);
        
        Rock rock27 = new Rock();
        Location loc27 = new Location(X27, Y27);
        grid.put(loc27, rock27);
         
        Rock rock28 = new Rock();
        Location loc28 = new Location(X28, Y28);
        grid.put(loc28, rock28);
        
        Rock rock29 = new Rock();
        Location loc29 = new Location(X29, Y29);
        grid.put(loc29, rock29);
        
        Rock rock30 = new Rock();
        Location loc30 = new Location(X30, Y30);
        grid.put(loc30, rock30);
         
        Rock rock31 = new Rock();
        Location loc31 = new Location(X31, Y31);
        grid.put(loc31, rock31);
        
        Rock rock32 = new Rock();
        Location loc32 = new Location(X32, Y32);
        grid.put(loc32, rock32);
        
        Rock rock33 = new Rock();
        Location loc33 = new Location(X33, Y33);
        grid.put(loc33, rock33);
         
        Rock rock34 = new Rock();
        Location loc34 = new Location(X34, Y34);
        grid.put(loc34, rock34);
        
        Rock rock35 = new Rock();
        Location loc35 = new Location(X35, Y35);
        grid.put(loc35, rock35);
        
        Rock rock36 = new Rock();
        Location loc36 = new Location(X36, Y36);
        grid.put(loc36, rock36);
         
        Rock rock37 = new Rock();
        Location loc37 = new Location(X37, Y37);
        grid.put(loc37, rock37);
        
        Rock rock38 = new Rock();
        Location loc38 = new Location(X38, Y38);
        grid.put(loc38, rock38);
        
        Rock rock39 = new Rock();
        Location loc39 = new Location(X39, Y39);
        grid.put(loc39, rock39);
         
        Rock rock40 = new Rock();
        Location loc40 = new Location(X40, Y40);
        grid.put(loc40, rock40);
        
        Rock rock41 = new Rock();
        Location loc41 = new Location(X41, Y41);
        grid.put(loc41, rock41);
        
        Rock rock42 = new Rock();
        Location loc42 = new Location(X42, Y42);
        grid.put(loc42, rock42);
         
        Rock rock43 = new Rock();
        Location loc43 = new Location(X43, Y43);
        grid.put(loc43, rock43);
        
        Rock rock44 = new Rock();
        Location loc44 = new Location(X44, Y44);
        grid.put(loc44, rock44);
        
        Rock rock45 = new Rock();
        Location loc45 = new Location(X45, Y45);
        grid.put(loc45, rock45);
         
        Rock rock46 = new Rock();
        Location loc46 = new Location(X46, Y46);
        grid.put(loc46, rock46);
        
        Rock rock47 = new Rock();
        Location loc47= new Location(X47, Y47);
        grid.put(loc47, rock47);
        
        Rock rock48 = new Rock();
        Location loc48 = new Location(X48, Y48);
        grid.put(loc48, rock48);
       
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    private void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // insert magic here...
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
    }

}
