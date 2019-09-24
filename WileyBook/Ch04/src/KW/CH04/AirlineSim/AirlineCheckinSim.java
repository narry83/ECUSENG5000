package KW.CH04.AirlineSim;

import java.util.Scanner;

/** AirlineCheckinSim.java
 *  Simulate the check-in process of an airline.
 *  @author Koffman and Wolfgang
 */
public class AirlineCheckinSim {

    // Data fields
    /** Queue of frequent flyers */
    private final PassengerQueue frequentFlyerQueue =
            new PassengerQueue("Frequent Flyer");
    /** Queue of regular passengers */
    private final PassengerQueue regularPassengerQueue =
            new PassengerQueue("Regular Passenger");
    /** Maximum number of frequent flyers to be served 
     *  before a regular passenger gets served */
    private int frequentFlyerMax;
    /** The maximum time to service a passenger */
    private int maxPocessingTime;
    /** Total simulated time */
    private int totalTime;
    /** If set true, print additional output */
    private boolean showAll;
    /** Simulated clock */
    private int clock = 0;
    /** Time that the agent is done with the current passenger */
    private int timeDone;
    /** Number of frequent flyers served since the
     *  last regular passenger was served */
    private int frequentFlyersSinceRP;

    /**
     * Main method
     * @param args optional file name for simulation parameters */
    public static void main(String args[]) {
        AirlineCheckinSim sim = new AirlineCheckinSim();
        sim.enterData();
        sim.runSimulation();
        sim.showStats();
        System.exit(0);
    }

    /*<exercise chapter="4" section="5" type="programming" number="3">*/
    /** Method to read the simulation parameters */
    private void enterData() {
        Scanner in = new Scanner(System.in);
        String reply;
        System.out.print("Expected number of frequent flyer arrivals per hour: ");
        reply = in.nextLine();
        frequentFlyerQueue.setArrivalRate(Double.parseDouble(reply) / 60.0);
        System.out.print("Expected number of regular passenger arrivals per hour: ");
        reply = in.nextLine();
        regularPassengerQueue.setArrivalRate(Double.parseDouble(reply) / 60.0);
        System.out.printf("%s%n%s","Enter the maximum number of frequent flyers",
                "served between regualr passengers ");
        reply = in.nextLine();
        frequentFlyerMax = Integer.parseInt(reply);
        System.out.print("Enter the maximim service time in minutes ");
        reply = in.nextLine();
        maxPocessingTime = Integer.parseInt(reply);
        Passenger.setMaxProcessingTime(maxPocessingTime);
        System.out.print( "Enter the total simulation time in minutes" );
        reply = in.nextLine();
        totalTime = Integer.parseInt(reply);
        System.out.print("Display minute-by-minute trace of simulation (Y or N)" );
        reply = in.nextLine();
        showAll = (reply.charAt(0) == 'Y') || (reply.charAt(0) == 'y');
        /*<exercise chapter="4" section="5" type="programming" number="2">*/
        System.out.print("Set simulation granularity to seconds (Y or N)");
        reply = in.nextLine();
        if ((reply.charAt(0) == 'Y') || (reply.charAt(0) == 'y')) {
            frequentFlyerQueue.setArrivalRate(frequentFlyerQueue.getArrivalRate() / 60.0);
            regularPassengerQueue.setArrivalRate(regularPassengerQueue.getArrivalRate() / 60.0);
            Passenger.setMaxProcessingTime(Passenger.getMaxProcessingTime() * 60);
            totalTime *= 60;
        }
        /*</exercise>*/
    }

    /** Method to start serving a customer */
    private void startServe() {
        if (!frequentFlyerQueue.isEmpty()
                && ((frequentFlyersSinceRP <= frequentFlyerMax)
                || regularPassengerQueue.isEmpty())) {
            // Serve the next frequent flyer.
            frequentFlyersSinceRP++;
            timeDone = frequentFlyerQueue.update(clock, showAll);
        } else if (!regularPassengerQueue.isEmpty()) {
            // Serve the next regular passenger.
            frequentFlyersSinceRP = 0;
            timeDone = regularPassengerQueue.update(clock, showAll);
        } else if (showAll) {
            System.out.println("Time is " + clock + ":  Server is idle");
        }
    }

    /** Method to show the statistics. */
    private void showStats() {
        System.out.println("\nThe number of regular passengers served was "
                + regularPassengerQueue.getNumServed());
        double averageWaitingTime =
                (double) regularPassengerQueue.getTotalWait()
                / (double) regularPassengerQueue.getNumServed();
        System.out.println(" with an average waiting time of "
                + averageWaitingTime);
        System.out.println("The number of frequent flyers served was "
                + frequentFlyerQueue.getNumServed());
        averageWaitingTime =
                (double) frequentFlyerQueue.getTotalWait()
                / (double) frequentFlyerQueue.getNumServed();
        System.out.println(" with an average waiting time of "
                + averageWaitingTime);
        System.out.println("Passengers in frequent flyer queue: "
                + frequentFlyerQueue.size());
        System.out.println("Passengers in regular queue: "
                + regularPassengerQueue.size());

    }

    /** Method to run the simulation */
    private void runSimulation() {
        for (clock = 0; clock < totalTime; clock++) {
            frequentFlyerQueue.checkNewArrival(clock, showAll);
            regularPassengerQueue.checkNewArrival(clock, showAll);
            if (clock >= timeDone) {
                startServe();
            }
        }
    }

}
