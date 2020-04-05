/**
 * piece class for store a piece and its details
 * @author Amir Sabbagh
 * @version 0.0
 */
public class Piece extends Locations{
    //true : red piece     false : black piece
    private boolean type;

    /**
     * constructor for make new piece
     * @param plate plate number in map
     * @param numberInPlate umber of location in a plate
     * @param type true : red piece     false : black piece
     */
    public Piece(int plate,int numberInPlate,boolean type){
    super(numberInPlate,plate,0);
    this.type=type;
}

    /**
     * getter method for type of piece
     * @return true : red piece     false : black piece
     */
    public boolean getType(){
    return type;
    }
}
