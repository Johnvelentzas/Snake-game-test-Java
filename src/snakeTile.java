public class snakeTile {

    private int x, y;
    private int direction;

    public snakeTile(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public static final int UP = 1;

    public static final int DOWN = 2;

    public static final int LEFT = 3;

    public static final int RIGHT = 4;
}