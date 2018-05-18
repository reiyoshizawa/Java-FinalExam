package Day3;

/**
 * a
 *
 */
public class Coin {
    // 0: HEADS, 1: TAILS
    private final int HEADS = 0;
    private int face;

    public Coin(){
        this.face = 0;
    }

    public void flip(){
        int f = (int)(Math.random() * 2);
        this.face = f;
    }

    public boolean isHeads(){
        return this.face == HEADS;
    }

}
