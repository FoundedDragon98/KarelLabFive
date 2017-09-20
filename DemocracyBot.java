
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        for(int i=0; i<5; i++) {
            move();
            if(nextToABeeper()) {
                while(nextToABeeper()) {
                    pickBeeper();
                }
            }
            faceNorth();
            move();
            if(nextToABeeper()) {
                while(nextToABeeper()) {
                    pickBeeper();
                }
            }
            faceSouth();
            move();
            move();
            if(nextToABeeper()) {
                while(nextToABeeper()) {
                    pickBeeper();
                }
            }
            faceNorth();
            move();
            faceEast();
            move();
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

