import java.util.ArrayList;
import java.util.HashSet;

/**
 * game system class for managing game and its functions
 *
 * @author Amir Sabbagh
 * @version 0.0
 */
public class GameSystem {
    // set of pieces
    private HashSet<Piece> pieces;

    /**
     * constructor for make new game system
     */
    public GameSystem() {
        pieces = new HashSet<Piece>();
    }

    /**
     * rotation method for rotate a plate
     *
     * @param plate               number of plate
     * @param directionOfrotation direction of rotete   1)right      2)left
     */
    public void rotation(int plate, int directionOfrotation) {
        switch (directionOfrotation) {
            //right
            case 1:
                for (Piece piece : pieces) {
                    if (piece.getPlate() == plate) {
                        switch (piece.getNumberInPlate()) {
                            case 1:
                                piece.setPlateandNumberInPlate(plate, 3);
                                break;
                            case 2:
                                piece.setPlateandNumberInPlate(plate, 6);
                                break;
                            case 3:
                                piece.setPlateandNumberInPlate(plate, 9);
                                break;
                            case 4:
                                piece.setPlateandNumberInPlate(plate, 2);
                                break;
                            case 5:
                                piece.setPlateandNumberInPlate(plate, 5);
                                break;
                            case 6:
                                piece.setPlateandNumberInPlate(plate, 8);
                                break;
                            case 7:
                                piece.setPlateandNumberInPlate(plate, 1);
                                break;
                            case 8:
                                piece.setPlateandNumberInPlate(plate, 4);
                                break;
                            case 9:
                                piece.setPlateandNumberInPlate(plate, 7);
                                break;

                        }
                    }
                }

                break;
            //left
            case 2:
                for (Piece piece : pieces) {
                    if (piece.getPlate() == plate) {
                        switch (piece.getNumberInPlate()) {
                            case 1:
                                piece.setPlateandNumberInPlate(plate, 7);
                                break;
                            case 2:
                                piece.setPlateandNumberInPlate(plate, 4);
                                break;
                            case 3:
                                piece.setPlateandNumberInPlate(plate, 1);
                                break;
                            case 4:
                                piece.setPlateandNumberInPlate(plate, 8);
                                break;
                            case 5:
                                piece.setPlateandNumberInPlate(plate, 5);
                                break;
                            case 6:
                                piece.setPlateandNumberInPlate(plate, 2);
                                break;
                            case 7:
                                piece.setPlateandNumberInPlate(plate, 9);
                                break;
                            case 8:
                                piece.setPlateandNumberInPlate(plate, 6);
                                break;
                            case 9:
                                piece.setPlateandNumberInPlate(plate, 3);
                                break;

                        }
                    }
                }
                break;


        }
    }

    /**
     * add new piece to set of pieces
     *
     * @param plate         number of plate
     * @param numberInPlate number of piece in plate
     * @param type          true)white     false )black
     */
    public void add(int plate, int numberInPlate, boolean type) {
        boolean OkorNo = false;
        for (Piece piece : pieces)
            if (piece.getPlate() == plate && piece.getNumberInPlate() == numberInPlate)
                OkorNo = true;

        if (!OkorNo)
            pieces.add(new Piece(plate, numberInPlate, type));
        else
            System.out.println("Error!");
    }

    /**
     * end game method for realize conditions of end game (condition : 5 black or 5 white pieces in a line)
     *
     * @return true : end game        false : continue
     */
    public boolean endGame() {
        for (Piece piece : pieces) {
            if (checkSides(piece, -50, 0) + checkSides(piece, 50, 0) + 1 >= 5) {
                if (piece.getType())
                    System.out.println("White player is Winner!");
                else
                    System.out.println("Black player is Winner!");
                return true;
            }
            if (checkSides(piece, -50, -50) + checkSides(piece, 50, 50) + 1 >= 5) {
                if (piece.getType())
                    System.out.println("White player is Winner!");
                else
                    System.out.println("Black player is Winner!");
                return true;
            }
            if (checkSides(piece, 0, -50) + checkSides(piece, 0, 50) + 1 >= 5) {
                if (piece.getType())
                    System.out.println("White player is Winner!");
                else
                    System.out.println("Black player is Winner!");
                return true;
            }
            if (checkSides(piece, 50, -50) + checkSides(piece, -50, 50) + 1 >= 5) {
                if (piece.getType())
                    System.out.println("White player is Winner!");
                else
                    System.out.println("Black player is Winner!");
                return true;
            }
        }
        return false;
    }


    /**
     * it checks one side of a piece and return number of same colors(white or black)
     *
     * @param piece
     * @param lenghtX lenghtX is for length of x steps
     * @param lenghtY lenghtY is for length of y steps
     * @return number of same color pieces in a line
     */
    private int checkSides(Piece piece, int lenghtX, int lenghtY) {
        // ArrayList<Piece> piceS = new ArrayList<Piece>();
        int numberOfPieces = 0;
        int x = piece.getX();
        int y = piece.getY();
        boolean empty = false;
        boolean unType = piece.getType();
        for (Piece piece1 : pieces) {
            if (piece1.getX() == (piece.getX() + lenghtX) && piece1.getY() == (piece.getY() + lenghtY)) {
                empty = true;
                unType = piece1.getType();
                break;
            }
        }
        if (empty == false || unType != piece.getType())
            return 0;

        else {

            while (x < 350 && x > 0 && y > 0 && y < 350) {
                x = x + lenghtX;
                y = y + lenghtY;


                for (Piece piece1 : pieces) {
                    empty = false;
                    if (x == piece1.getX() && y == piece1.getY()) {
                        unType = piece1.getType();
                        empty = true;

                        if (unType == piece.getType()) {
                            numberOfPieces++;
                            break;
                        }

                        if (unType != piece.getType())
                            return numberOfPieces;

                        break;
                    }
                }
                if (!empty) {
                    return numberOfPieces;
                }

            }
        }
        return numberOfPieces;
    }

    /**
     * getter method for set of pieces
     *
     * @return
     */
    public HashSet<Piece> getPieces() {
        return pieces;
    }
}
