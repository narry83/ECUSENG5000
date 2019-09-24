package KW.CH04.AirlineSim;

import java.util.Random;

/** A class to represent a passenger.
 *  @author Koffman & Wolfgang
 * */
public class Passenger {

    // Data Fields
    /** The ID number for this passenger. */
    private final int passengerId;
    /** The time needed to process this passenger. */
    private final int processingTime;
    /** The time this passenger arrives. */
    private final int arrivalTime;
    /** The maximum time to process a passenger. */
    private static int maxProcessingTime;
    /** The sequence number for passengers. */
    private static int idNum = 0;
    /** A random number generator instance */
    private static Random random = new Random();

    /** Create a new passenger.
    @param arrivalTime The time this passenger arrives */
    public Passenger(int arrivalTime) {
        this.arrivalTime = arrivalTime;
        processingTime = 1 + random.nextInt(maxProcessingTime);
        passengerId = idNum++;
    }

    /**
     * Create a new passenger with a specified processing time
     * @param arrivalTime The time this passenger arrives
     * @param processingTime The time required to process this passenger
     */
    public Passenger(int arrivalTime, int processingTime) {
        this.arrivalTime = arrivalTime;
        this.processingTime = processingTime;
        passengerId = idNum++;
    }

    /**
     * Get the arrival time.
     * @return The arrival time
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Get the processing time.
     * @return The processing time
     */
    public int getProcessingTime() {
        return processingTime;
    }

    /**
     * Get the passenger ID.
     * @return The passenger ID
     */
    public int getId() {
        return passengerId;
    }

    /**
     * Set the maximum processing time
     * @param maxProcessTime The new value
     */
    public static void setMaxProcessingTime(int maxProcessTime) {
        maxProcessingTime = maxProcessTime;
    }

    /**
     * Get the maximum processing time
     * @return the maximum processing time
     */
    public static int getMaxProcessingTime() {
        return maxProcessingTime;
    }
}
