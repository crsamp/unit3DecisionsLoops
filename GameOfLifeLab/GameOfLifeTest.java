
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
         *  0 - - - - - - - - - -  -  -  -  -  -  -  -
         *  1 - - - - - - - - - -  -  -  -  -  -  -  -
         *  2 - - - - - - - - - -  -  -  -  -  -  -  -
         *  3 - - - - x x x - - -  x  x  x  -  -  -  -
         *  4 - - - x - - - x - x  -  -  -  x  -  -  -
         *  5 - - - x - - - x - x  -  -  -  x  -  -  -
         *  6 - - - x - - - x - x  -  -  -  x  -  -  -
         *  7 - - - - x x x - - -  x  x  x  -  -  -  -
         *  8 - - - - - - - - - -  -  -  -  -  -  -  -
         *  9 - - - - x x x - - -  x  x  x  -  -  -  -
         *  10- - - x - - - x - x  -  -  -  x  -  -  -
         *  11- - - x - - - x - x  -  -  -  x  -  -  -
         *  12- - - x - - - x - x  -  -  -  x  -  -  -
         *  13- - - - x x x - - -  x  x  x  -  -  -  -
         *  14- - - - - - - - - -  -  -  -  -  -  -  -
         *  15- - - - - - - - - -  -  -  -  -  -  -  -
         *  16- - - - - - - - - -  -  -  -  -  -  -  -
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = 8;
        final int COLS = 8;

        for(int row = 0; row < ROWS ; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 3 && col == 4) ||
                        (row == 3 && col == 5) ||
                        (row == 3 && col == 6) ||
                        (row == 4 && col == 3) ||
                        (row == 4 && col == 7) ||
                        (row == 5 && col == 3) ||
                        (row == 5 && col == 7) ||
                        (row == 6 && col == 3) ||
                        (row == 6 && col == 7) ||
                        (row == 7 && col == 4) ||
                        (row == 7 && col == 5) ||
                        (row == 7 && col == 6))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    
    {
        GameOfLife games = new GameOfLife();
        games.createNextGeneration();
        games.createNextGeneration();
        games.createNextGeneration();
        games.createNextGeneration();
        games.createNextGeneration();
        games.createNextGeneration();
        games.createNextGeneration();
        games.createNextGeneration();
        
        
        
        /* verify that the actual pattern matches the expected pattern after 8 generations 
            0 1 2 3 4 5 6 7 8
          0 - - - - - - - - -
          1 - - - - - - - - -
          2 - - - x x x - - -
          3 - - - - - - - - -
          4 - - x - - - - x -
          5 - - x - - - - x -
          6 - - x - - - - x -
          7 - - - - x x x - -
          8 - - - - - - - - - 
          
          
         */ 
        for (int rows = 0; rows<9; rows++)
        {
            for (int column = 0; column<9; column++)
            {
                Actor cells = games.getActor(rows, column);
                
                if(     (rows == 4 && column == 2) ||
                        (rows == 5 && column == 2) ||
                        (rows == 6 && column == 2) ||
                        (rows == 2 && column == 4) ||
                        (rows == 7 && column == 4) ||
                        (rows == 2 && column == 5) ||
                        (rows == 7 && column == 5) ||
                        (rows == 2 && column == 6) ||
                        (rows == 7 && column == 6) ||
                        (rows == 4 && column == 7) ||
                        (rows == 5 && column == 7) ||
                        (rows == 6 && column == 7))
                        
                {
                    assertNotNull("expected alive cell at (" +rows+", "+column+ ")", cells);
                }
                else
                {
                    assertNull("expected dead cell at ("+rows+", "+column+")",cells);
                }
            }
        }
    }
}

       
    


