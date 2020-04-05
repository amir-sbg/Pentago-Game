import javax.swing.*;
import java.util.Scanner;

/**
 * main class for run game
 * @author Amir Sabbagh
 * @version 0.0
 */
public class Main {
    public static void main(String[] args) {
        GameSystem gameSystem = new GameSystem();
        Map map = new Map(gameSystem);
        JFrame f = new JFrame("\u2606 \u2605  P E N T A G O  \u2605 \u2606");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(470, 450);
        f.setVisible(true);
        f.add(map);
        Scanner input = new Scanner(System.in);
ConsoleMap consoleMap=new ConsoleMap(gameSystem);

        boolean turn = false;
        while (true) {

            if (turn)
                System.out.println("White's Turn,Enter target location ( plate  _  number in plate):");
            else
                System.out.println("Black's Turn,Enter target location ( plate  _  number in plate):");

            gameSystem.add(input.nextInt(), input.nextInt(), turn);

            //
            consoleMap.setGameSystem(gameSystem);
            consoleMap.display();
            //

            map.setGameSystem(gameSystem);
            f.update(map.getGraphics());

if(gameSystem.endGame())
    break;

            if (turn)
                System.out.println("White's Turn,Enter target plate and direction of rotation ( plate number _ direction of rotate     1]\u21b7   2]\u21b6 ");
            else
                System.out.println("Black's Turn,Enter target plate and direction of rotation ( plate number _ direction of rotate     1]\u21b7   2]\u21b6 ");

gameSystem.rotation(input.nextInt(),input.nextInt());

            //
            consoleMap.setGameSystem(gameSystem);
            consoleMap.display();
            //

            map.setGameSystem(gameSystem);
            f.update(map.getGraphics());

            if(gameSystem.endGame())
                break;

            turn=!turn;

        }
    }
}
