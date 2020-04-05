/**
 * locations of pieces in map
 * @author Amir Sabbagh
 * @version 0.0
 */
public class Locations {
    //plate number in map
    private int plate;
    //number of location in a plate
    private int numberInPlate;
    //x in map
    private int X;
    //y in map
    private int Y;

    /**
     * Constructor for make new location
     * @param x xLocation in map
     * @param y yLocation in map
     */
    public Locations(int x, int y) {
        this.X = x;
        this.Y = y;
        if (x > 200) {
            if (y > 200)
                plate = 4;
            else
                plate = 2;
        } else {
            if (y > 200)
                plate = 3;
            else
                plate = 1;
        }
       int t=x+y;
        //if(plate==1)t=t-0;
        if(plate==2){ t=t-150;x=x-150;}
        if(plate==3) t=t-150;
        if(plate==4) {t=t-300;x=x-150;}

        if(t==150 && x== 75)numberInPlate=1;
        if(t==200 && x== 75)numberInPlate=4;
        if(t==200 && x==125)numberInPlate=2;
        if(t==250 && x== 75)numberInPlate=7;
        if(t==250 && x==125)numberInPlate=5;
        if(t==250 && x==175)numberInPlate=3;
        if(t==300 && x==125)numberInPlate=8;
        if(t==300 && x==175)numberInPlate=6;
        if(t==350 && x==175)numberInPlate=9;
    }

    /**
     * second constructor for locations bye the use of numberInPlate and plate
     * @param numberInPlate number of piece in plate
     * @param plate number of plate in map
     * @param voidNumber Void number for make difference between inputs of first constructor and second one
     */
    public Locations(int numberInPlate,int plate,int voidNumber){
        this.numberInPlate=numberInPlate;
        this.plate=plate;
int xStart=75,yStart=75;
        if(plate==1){xStart= 75;yStart= 75;}
        if(plate==2){xStart=225;yStart= 75;}
        if(plate==3){xStart= 75;yStart=225;}
        if(plate==4){xStart=225;yStart=225;}


         if(numberInPlate==1){xStart+=  0;yStart+=  0;}
         if(numberInPlate==2){xStart+= 50;yStart+=  0;}
         if(numberInPlate==3){xStart+=100;yStart+=  0;}
         if(numberInPlate==4){xStart+=  0;yStart+= 50;}
         if(numberInPlate==5){xStart+= 50;yStart+= 50;}
         if(numberInPlate==6){xStart+=100;yStart+= 50;}
         if(numberInPlate==7){xStart+=  0;yStart+=100;}
         if(numberInPlate==8){xStart+= 50;yStart+=100;}
         if(numberInPlate==9){xStart+=100;yStart+=100;}

         this.X=xStart;
         this.Y=yStart;
    }

    /**
     * getter method for number in plate
     * @return
     */
    public int getNumberInPlate() {
        return numberInPlate;
    }

    /**
     * getter method for plate number in plate
     * @return
     */
    public int getPlate() {
        return plate;
    }

    /**
     * getter method
     * @return
     */
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    /**
     * setter method for edit location
     * @param x xLocation in map
     * @param y yLocation in map
     */
    public void setXandY(int x,int y){
        this.X = x;
        this.Y = y;
        if (x > 200) {
            if (y > 200)
                plate = 4;
            else
                plate = 2;
        } else {
            if (y > 200)
                plate = 3;
            else
                plate = 1;
        }
        int t=x+y;
        //if(plate==1)t=t-0;
        if(plate==2){ t=t-150;x=x-150;}
        if(plate==3) t=t-150;
        if(plate==4) {t=t-300;x=x-150;}

        if(t==150 && x== 75)numberInPlate=1;
        if(t==200 && x== 75)numberInPlate=4;
        if(t==200 && x==125)numberInPlate=2;
        if(t==250 && x== 75)numberInPlate=7;
        if(t==250 && x==125)numberInPlate=5;
        if(t==250 && x==175)numberInPlate=3;
        if(t==300 && x==125)numberInPlate=8;
        if(t==300 && x==175)numberInPlate=6;
        if(t==350 && x==175)numberInPlate=9;

    }

    /**
     * setter method for edit location
     * @param plate number of plate in map
     * @param numberInPlate number of location in plate
     */
    public void setPlateandNumberInPlate(int plate, int numberInPlate){
        this.numberInPlate=numberInPlate;
        this.plate=plate;
        int xStart=75,yStart=75;
        if(plate==1){xStart= 75;yStart= 75;}
        if(plate==2){xStart=225;yStart= 75;}
        if(plate==3){xStart= 75;yStart=225;}
        if(plate==4){xStart=225;yStart=225;}


        if(numberInPlate==1){xStart+=  0;yStart+=  0;}
        if(numberInPlate==2){xStart+= 50;yStart+=  0;}
        if(numberInPlate==3){xStart+=100;yStart+=  0;}
        if(numberInPlate==4){xStart+=  0;yStart+= 50;}
        if(numberInPlate==5){xStart+= 50;yStart+= 50;}
        if(numberInPlate==6){xStart+=100;yStart+= 50;}
        if(numberInPlate==7){xStart+=  0;yStart+=100;}
        if(numberInPlate==8){xStart+= 50;yStart+=100;}
        if(numberInPlate==9){xStart+=100;yStart+=100;}

        this.X=xStart;
        this.Y=yStart;

    }
}
