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
        
        Rock rock1 = new Rock();
        Location loc1 = new Location(X4, Y4);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X5, Y5);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X6, Y6);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X7, Y7);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X8, Y8);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X9, Y9);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X10, Y10);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X11, Y11);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X12, Y12);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X13, Y13);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X14, Y14);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X15, Y15);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X16, Y16);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X16, Y16);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X17, Y17);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X17, Y17);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X18, Y18);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X19, Y19);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X20, Y20);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X21, Y21);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X22, Y22);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X23, Y23);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X24, Y24);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X25, Y25);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X26, Y26);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X27, Y27);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
         
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
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
