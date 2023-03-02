import javax.swing.*;

public class snake implements SnakeConst, WindowConstants{

    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon(MEDIA_PATH + ICON_NAME);
        snakeCanvas gameCanvas = new snakeCanvas();

        //Creates a new window with the set attributes.
        JFrame window = new JFrame(WINDOW_TITLE);
        window.setIconImage(icon.getImage());
        window.setResizable(false);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setBounds(DEFAULT_WINDOW_X, DEFAULT_WINDOW_Y, DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);

        window.add(gameCanvas);

        window.setVisible(true);
        gameCanvas.start();
    }
}