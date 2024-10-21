import java.util.Random;

public class Feline extends Critter {
    private int moveCount; //counter for getMove method before random direction
    private int eatCount; //counter for eating
    private Direction currDir; //current direction
    private static final String SPECIES_NAME = "Fe";

    public Feline() {
        super(SPECIES_NAME);
        moveCount = 0;
        eatCount = 0;
        currDir = Direction.CENTER;
    }

    /*
     * This mehtod will return the direction that the felione will go
     */
    @Override
    public Direction getMove() {
       
        if (moveCount%5 == 0){
            Random randodirec = new Random();
            int direction = randodirec.nextInt(4);
            if(direction == 0){
                currDir = Direction.NORTH;
            }
            else if(direction == 1){
                currDir = Direction.EAST;
            }
            else if(direction == 2){
                 currDir = Direction.SOUTH;
            }
            else{
                currDir = Direction.WEST;
            }
        }
        moveCount++;
        return currDir;
    }    

    @Override
    public boolean eat() {
        eatCount+=1;
        if(eatCount%3 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public Attack getAttack(String opponent){
       return Attack.POUNCE;
    }
}