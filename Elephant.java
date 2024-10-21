import java.util.Random;
import java.awt.Color;

public class Elephant extends Critter {
    protected static int goalX;
    protected static int goalY;
    private static final String SPECIES_NAME = "El";
    
    public Elephant(){
        super(SPECIES_NAME);
        goalX = 0;
        goalY = 0;
    }

    @Override
    public Color getColor(){
        return Color.GRAY;
    }

    @Override
    public Direction getMove(){
        Random random = new Random();
        int currentX = info.getX(); //Where the critter is standing in x axis
        int currentY = info.getY(); //Where the critter is standing in y axis
        int width = info.getWidth(); //The width of the board
        int height = info.getHeight(); //The height of the board
        int differenceX = currentX - goalX; // The difference between critter's is and where it wants to go
        int differenceY = currentY - goalY;
        int absDifferenceX = Math.abs(differenceX);
        int absDifferenceY = Math.abs(differenceY);
        if (currentX == goalX && currentY == goalY){
            goalX = random.nextInt(width) + 1;
            goalY = random.nextInt(height) + 1;
        }
        if(absDifferenceX > absDifferenceY){
            if (differenceX > 0){
                return Direction.WEST;
            }
            else{
                return Direction.EAST;
            }
            }
        else if (absDifferenceX == absDifferenceY){
            if (differenceX > 0){
                return Direction.WEST;
            }
            else if (differenceX < 0){
                return Direction.EAST;
            }
            if (differenceY > 0){
                return Direction.NORTH;
            }
            else{
                return Direction.SOUTH;
            }
        }
        else{
            if (differenceY > 0){
                return Direction.NORTH;
            }
            else{
                return Direction.SOUTH;
            }
        }
        }

    @Override
    public boolean eat(){
        return true;
    }

    @Override
    public void mate(){
    incrementLevel(2);
    }

    @Override 
    public void reset(){
        goalX = 0;
        goalY = 0;
    }
}
