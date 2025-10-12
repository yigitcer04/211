public class Stopwatch {
    private long startTime;
    private long endTime;
    private boolean running;

    public void start() {
        if (running) {
            throw new IllegalStateException("Stopwatch already running");
        }
        running = true;
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        if (!running) {
            throw new IllegalStateException("Stopwatch not started");
        }
        endTime = System.currentTimeMillis();
        running = false;
    }

    public long getElapsedTime() {
        if (running) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }

    public boolean isRunning() {
        return running;
    }
}
