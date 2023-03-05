package main;
/**
 * Some constants to controll the snake aplication.
 */

public interface SnakeConst {

    /**
     * The name of the window
     */
    public static final String WINDOW_TITLE = "Snake";

    /**
     * The default x position of the game window.
     */
    public static final int DEFAULT_WINDOW_X = 100;

    /**
     * The default y position of the game window.
     */
    public static final int DEFAULT_WINDOW_Y = 100;

    /**
     * The default width of the game window.
     */
    public static final int DEFAULT_WINDOW_WIDTH = 960 + 14;

    /**
     * The default height of the game window.
     */
    public static final int DEFAULT_WINDOW_HEIGHT = 576 + 37;

    public static final int ORIGINAL_TILE_SIZE = 16;

    public static final int SCALE = 3;

    public static final int TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE;

    public static final int SCREEN_COL = 20;

    public static final int SCREEN_ROW = 12;

    public static final int CANVAS_WIDTH = TILE_SIZE * SCREEN_COL;

    public static final int CANVAS_HEIGHT = TILE_SIZE * SCREEN_ROW;

    /**
     * Default media path.
     */
    public static final String MEDIA_PATH = "media\\";

    /**
     * Icon name.
     */
    public static final String ICON_NAME = "snakeicon.png";

    /**
     * Background icon path.
     */
    public static final String BACKGROUND_ICON_PATH = "tile.png";

    /**
     * Snake head looking up path.
     */
    public static final String SNAKE_HEAD_UP_PATH = "snakeheadup.png";

    /**
     * Snake head looking down path.
     */
    public static final String SNAKE_HEAD_DOWN_PATH = "snakeheaddown.png";

    /**
     * Snake head looking left path.
     */
    public static final String SNAKE_HEAD_LEFT_PATH = "snakeheadleft.png";

    /**
     * Snake head looking right path.
     */
    public static final String SNAKE_HEAD_RIGHT_PATH = "snakeheadright.png";

    /**
     * Snake body horizontal path.
     */
    public static final String SNAKE_BODY_HORIZONTAL_PATH = "snakebodyhorizontal.png";

    /**
     * Snake body vertical path.
     */
    public static final String SNAKE_BODY_VERTICAL_PATH = "snakebodyvertical.png";

    /**
     * Snake body up right path.
     */
    public static final String SNAKE_BODY_UP_RIGHT_PATH = "snakeicon.png";

    /**
     * Snake body right down path.
     */
    public static final String SNAKE_BODY_RIGHT_DOWN_PATH = "snakebodyrightdown.png";

    /**
     * Snake body down left path.
     */
    public static final String SNAKE_BODY_DOWN_LEFT_PATH = "snakeicon.png";

    /**
     * Snake body left up path.
     */
    public static final String SNAKE_BODY_LEFT_UP_PATH = "snakeicon.png";

    /**
     * Snake tail looking up path.
     */
    public static final String SNAKE_TAIL_UP_PATH = "snaketailup.png";

    /**
     * Snake tail looking down path.
     */
    public static final String SNAKE_TAIL_DOWN_PATH = "snaketaildown.png";

    /**
     * Snake tail looking left path.
     */
    public static final String SNAKE_TAIL_LEFT_PATH = "snaketailleft.png";

    /**
     * Snake tail looking right path.
     */
    public static final String SNAKE_TAIL_RIGHT_PATH = "snaketailright.png";

    public static final int MOVE_DELAY = 100;
}