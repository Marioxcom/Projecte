package Projecte.utils;

public class TimeOrder {
    private long duration;
    private long start;

    public TimeOrder(long duration) {
        this.duration = duration * 1000;
        this.start = System.currentTimeMillis();
    }

    public long remainingTime() {
        long now = System.currentTimeMillis();
        long remaining = duration - (now - start);

        return remaining > 0 ? remaining / 1000 : 0;
    }

    public boolean isExpired() {
        return remainingTime() <= 0;
    }
}
