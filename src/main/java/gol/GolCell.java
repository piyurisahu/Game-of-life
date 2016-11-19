package gol;

/**
 * Created by Piyuri on 11/13/2016.
 */
public class GolCell {
    private boolean alive;
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public GolCell(boolean cellState) {

    }

    public GolCell(boolean state, int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void nextLife() {
    }

    public boolean isAlive() {
        return alive;
    }


}
