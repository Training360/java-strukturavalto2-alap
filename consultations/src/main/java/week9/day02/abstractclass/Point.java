package week9.day02.abstractclass;

public final class Point {

    private final long x;
    private final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public long getDistance(Point otherPoint){
       return  (long) Math.sqrt(Math.pow(x-otherPoint.x,2)+Math.pow(y-otherPoint.y,2));
    }


}
