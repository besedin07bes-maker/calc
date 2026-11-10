import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*@author Besedin */

public class NewClass extends JFrame {
    
    private static NewClass game_game;
    
    public static void main(String[] args) {
        game_game = new NewClass();
        game_game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_game.setLocation(200, 50);
        game_game.setSize(900, 600);
        game_game.setResizable(false);
        game_game.setVisible(true);
    }
    
}

