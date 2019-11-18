/*<exercise chapter="8" type="programming-project" number="8">*/
package KW.CH08.dutchnationalflag;

import KW.CH08.dutchnationalflag.Thread;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/**
 * The class Flag represents the flag in the Dutch
 * National Flag problem.
 * @author Koffman and Wolfgang */
public class Flag extends JPanel {

    /** The array of threads */
    private final Thread[] threads;
    /** The width of the flag */
    private final int width;
    /** The height of the flag */
    private final int height;

    // Constructor
    /**
     * Construct a Flag of the given size
     * @param width - The width of the flag
     * @param height - The height of the flag */
    public Flag(int width, int height) {
        this.width = width;
        this.height = height;
        threads = new Thread[height];
        for (int i = 0; i != height / 3; ++i) {
            threads[i] = new Thread(Color.RED);
        }
        for (int i = height / 3; i != 2 * height / 3; ++i) {
            threads[i] = new Thread(Color.WHITE);
        }
        for (int i = 2 * height / 3; i != height; ++i) {
            threads[i] = new Thread(Color.BLUE);
        }
        randomize();
    }

    // Methods
    /** Randomize the order of the threads */
    public final void randomize() {
        for (int i = 0; i != height; ++i) {
            int j = (int) (Math.random() * height);
            Thread temp = threads[i];
            threads[i] = threads[j];
            threads[j] = temp;
        }
    }
    /*</exercise>*/

    /*<listing chapter="8" number="12">*/
    /**
     * Sort the threads
     */
    public void sort() {
        int red = 0;
        int white = height - 1;
        int blue = height - 1;
        // Invariant:
        // 0 <= i < red      ==> threads[i].getColor() == Color.RED
        // red <= i <= white ==> threads[i].getColor() is unknown
        // white < i < blue  ==> threads[i].getColor() == Color.WHITE
        // blue < i < height ==> threads[i].getColor() == Color.BLUE
        while (red <= white) {
            if (threads[white].getColor() == Color.WHITE) {
                --white;
            } else if (threads[white].getColor() == Color.RED) {
                swap(red, white);
                ++red;
            } else { // threads[white].getColor() == Color.BLUE
                swap(white, blue);
                --white;
                --blue;
            }
            repaint();
        }
        // red == white so unknown region is now empty
    }
    /*</listing>*/

    /*<exercise chapter="8" type="programming-project" number="8">*/
    /**
     * Swap two threads and re-draw them
     * @param i - Index of one thread
     * @param j - Index of other thread
     * @param g - Graphics environment */
    private void swap(int i, int j) {
        Thread temp = threads[i];
        threads[i] = threads[j];
        threads[j] = temp;
    }

    /**
     * Paint the whole flag
     * @param g - The graphics environment 
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i != height; ++i) {
            threads[i].draw(i, width, g);
        }
    }
}
/*</exercise>*/
