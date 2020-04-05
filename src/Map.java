import javax.swing.*;
import java.awt.*;

/**
 * map class used for lunch map on JFrame
 * @author Amir Sabbagh
 * @version 0.0
 */
public class  Map extends JPanel {
    //game system for lunch game
    private GameSystem gameSystem;

    /**
     * Constructor for make new map
     * @param gameSystem manager of Map and game
     */
    public Map(GameSystem gameSystem) {
        this.gameSystem=gameSystem;
    }
    /**
     * Paint component method for make map and write details on it
     * @param g Graphics of map
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.white);
        int x = 50, y = 50, k = 1;
        g.drawString("P  E  N  T  A  G  O", 153, 45);
        g.drawString("1", 45, 45);
        g.drawString("2", 350,45 );
        g.drawString("3", 45,360);
        g.drawString("4", 350, 360);

        for (int j = 0; j < 6; j++) {

            x = 50;
            k--;
            for (int i = 0; i < 6; i++) {
                k++;
                if (k % 2 == 0) {

                    g.setColor(Color.red);
                    g.fillRect(x, y, 50, 50);
                } else {
                    g.setColor(Color.yellow);
                    g.fillRect(x, y, 50, 50);
                }
                x += 50;
            }
            y += 50;
        }
        g.setColor(Color.black);
        g.fillRect(50, 199, 300, 2);
        g.fillRect(199, 50, 2, 300);

        g.fillRect(50, 50, 3, 300);
        g.fillRect(50, 50, 300, 3);
        g.fillRect(350, 50, 3, 300);
        g.fillRect(50, 350, 302, 3);

        for (Piece piece : gameSystem.getPieces())
            if (piece.getType())
                g.drawString("\u25cb ", piece.getX(), piece.getY());
            else
                g.drawString("\u25cf", piece.getX(), piece.getY());
    }

    /**
     * getter method for game system
     * @param gameSystem game system is manager of game
     */
    public void setGameSystem(GameSystem gameSystem) {
        this.gameSystem = gameSystem;
    }
}
