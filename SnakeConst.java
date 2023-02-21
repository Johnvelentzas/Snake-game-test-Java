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
     * Background icon name.
     */
    public static final String BACKGROUND_ICON_NAME = "tile.png";
}