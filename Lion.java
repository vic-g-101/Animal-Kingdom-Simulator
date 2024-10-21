import java.awt.Color;

public class Lion extends Feline {
    private int fightwinCounter;
    private int movementCounter;
    private static final String SPECIES_NAME = "Lion";

    public Lion() {
        super();
        displayName = SPECIES_NAME;
        fightwinCounter = 0;
        movementCounter = 0;
    }


    @Override
    public Color getColor(){
        return Color.YELLOW;
    }

    @Override
    public Direction getMove(){
    movementCounter += 1;
    if(movementCounter <= 5){
        return Direction.EAST;
    }
    else if (movementCounter <= 10 && movementCounter > 5){
        return Direction.SOUTH;
    }
    else if (movementCounter <= 15 && movementCounter > 10 && movementCounter > 5){
        return Direction.WEST;
    }
    else if (movementCounter <=20 && movementCounter > 15 && movementCounter > 10 && movementCounter > 5){
        if( movementCounter == 20){
            movementCounter = 0; 
            return Direction.NORTH;
        }
        return Direction.NORTH;
    }
        return Direction.EAST;
    }

    @Override
    public boolean eat(){
    if(fightwinCounter >= 1){
        fightwinCounter = 0;
        return true;
    }
    else{
        return false;
    }
    }

    @Override
    public void sleep(){
        displayName= "noiL";
        fightwinCounter = 0;
    }

    @Override 
    public void wakeup(){
        displayName = "Lion";

    }

    @Override
    public void win(){
        fightwinCounter+=1;
    }



}
