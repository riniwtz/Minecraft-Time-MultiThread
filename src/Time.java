public class Time implements Runnable {
    private final int MAX_GAME_TICKS = 24000;
    private int days = 0;
    private int gameTicks = 0;

    // Thread field override
    @Override
    public void run() {
        // System
        while (true) {
            // Game ticks limit is 24000
            if (gameTicks <= MAX_GAME_TICKS) {
                // Adds 1 game tick per 50 milliseconds.
                // This is calculated from official Minecraft time of 1 second is equivalent to 20 ticks
                // 1 second divided to 20 ticks = 0.05 seconds or 50 milliseconds per 1 game tick
                gameTicks += 1;

                // Pauses the current thread by 0.05 seconds or 50 milliseconds
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                // Increments whole day of Minecraft world
                // This is used for /time query command
                ++days;
            }
        }
    }

    // Encapsulation method of getting from private variable
    public int getGameTicks() {
        return gameTicks;
    }

}
