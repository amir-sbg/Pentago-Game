/**
 * console map class for print map on console
 */
public class ConsoleMap {
    //game system for lunch game
    private GameSystem gameSystem;

    /**
     * Constructor for make new console map
     *
     * @param gameSystem manager of Map and game
     */
    public ConsoleMap(GameSystem gameSystem) {
        this.gameSystem = gameSystem;
    }

    /**
     *display method for lunch map and print it
     */
    public void display() {
        System.out.println("_______________________");
        for (int i = 75; i <= 326; i += 50) {
            for (int j = 75; j <= 326; j += 50) {
                boolean b = false;
                for (Piece piece : gameSystem.getPieces()) {
                    if (piece.getX() == j && piece.getY() == i) {
                        if (piece.getType())
                            System.out.print(" \u25cb ");
                        else
                            System.out.print(" \u25cf ");
                        b = true;
                    }
                }
                if (!b)
                    System.out.print(" . ");

                if (j == 175)
                    System.out.print("  |  ");
            }
            System.out.println();
            if (i == 175)
                System.out.println("-----------|-----------");
        }
        System.out.println("_______________________");
    }

    public void setGameSystem(GameSystem gameSystem) {
        this.gameSystem = gameSystem;
    }
}