
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int beepers;
    public boolean foundTreasure;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    //1 beeper means karel should go north, 2 means east, 3 means south, 4 means west
    public void findTreasure() {
        foundTreasure = false;
        while(foundTreasure == false) {
            while(!nextToABeeper()) {
                move();
            }
            if(nextToABeeper()) {
                while(nextToABeeper()) {
                    pickBeeper();
                    beepers++;
                }
                if(beepers == 1) {
                    faceNorth();
                }
                else if(beepers == 2) {
                    faceEast();
                }
                else if(beepers == 3) {
                    faceSouth();
                }
                else if(beepers == 4) {
                    faceWest();
                }
                else if(beepers == 5) {
                    foundTreasure = true;
                }
                beepers = 0;
            }
        }
    }
    public void faceNorth() {
        while(!facingNorth()) {
            turnLeft();
        }
    }
    public void faceSouth() {
        while(!facingSouth()) {
            turnLeft();
        }
    }
    public void faceEast() {
        while(!facingEast()) {
            turnLeft();
        }
    }
    public void faceWest() {
        while(!facingWest()) {
            turnLeft();
        }
    }
}

