import javax.swing.*;

public class snake implements SnakeConst, WindowConstants{

    public static void main(String[] args) {

        //Creates a new window with the set attributes.
        JFrame frame = new JFrame(WINDOW_TITLE);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(DEFAULT_WINDOW_X, DEFAULT_WINDOW_Y, DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
        frame.setVisible(true);

        while (true) {
            
        }
    }
}