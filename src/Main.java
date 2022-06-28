
/**
 * MCTimeMultiThreading
 * This imitates how Minecraft updates ticks automatically in the background.
 * This application is used for testing purposes and has been completed.
 * It was a successful test working as suppose to be.
 *
 * This test is part of the Minecraft Commands Simulator (MCS) project that was created by Rintaro Iwata since 2021.
 *
 * Created @ 06/29/2022
 * Completed @ 06/29/2022 04:34 AM
 * Author: riniwtz
 * Contact: riniwtzcode@gmail.com
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Our Time class instantiation
        Time time = new Time();

        // Thread instantiation
        Thread timeThread = new Thread(time);

        // Creates and runs a new thread
        timeThread.start();

        // Scanner user input instantiation
        Scanner in = new Scanner(System.in);

        // Loop
        while (true) {
            // Store input to newly created string
            String cmd = in.nextLine();

            // Sample test command
            if (cmd.equals("/time query daytime")) {

                // Gets the game ticks from a field of Time class
                System.out.println("The time is " + time.getGameTicks());
            }
        }
    }
}
