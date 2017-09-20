
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int beepers;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        while(nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        if(beepers%2 == 0) {
            faceEast();
        }
        else if(beepers%2 ==1) {
            faceWest();
        }
        move();
        while(nextToABeeper()) {
            pickBeeper();
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

