import java.awt.Color;
import java.util.Random;

public class Turtle extends Critter {
    private static final String SPECIES_NAME = "Tu";
    /*
     * Default Constructor - makes critter called "Tu"
     * */
    public Turtle(){
        super(SPECIES_NAME);
    }
   /*
    * returns color of the critter
    * @return green
    */
    @Override
    public Color getColor(){
        return Color.GREEN;
    }
    /*
     * returns the direction that the turtle makes 
     * @return west
     */
    @Override
    public Direction getMove(){
        return Direction.WEST;
    }
    /*
     * returns if the turtle wants to eat or not
     * @return true or false
     */
    @Override
    public boolean eat(){
        Direction [] directions = {Direction.NORTH,Direction.SOUTH, Direction.EAST,Direction.WEST,Direction.CENTER};
        for (int i =0; i < directions.length;i++){
            if (info.getNeighbor(directions[i]).equals(" ") ||info.getNeighbor(directions[i]).equals("Tu" ) || info.getNeighbor(directions[i]).equals(".")){
                return true;
            }
        }
        return false;
    }
    /*
     * returns the type of attack that the turtle will use
     */
    @Override
    public Attack getAttack(String opponent){
        Random random = new Random();
        if (random.nextInt(100) <= 50){
            return Attack.ROAR;
        }
        else {
            return Attack.FORFEIT;
        }
    }
}
