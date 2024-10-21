import java.awt.Color;
import java.util.Random;
public class Leopard extends Feline {
    protected static int confidence;
    private static final String SPECIES_NAME = "Lpd";

    public Leopard(){
        super();
        displayName = SPECIES_NAME;
    }

    @Override
    public Color getColor(){
        return Color.RED;
    }

    @Override
    public Direction getMove(){
        Random randodirec = new Random();
        int direction = randodirec.nextInt(4);

        Direction [] directions = {Direction.NORTH,Direction.SOUTH, Direction.EAST,Direction.WEST};
        for (int i =0; i < directions.length;i++){
            if (info.getNeighbor(directions[i]).equals(".")||info.getNeighbor(directions[i]).equals("Patrick")){
                return directions[i];
            }
            else if(info.getNeighbor(directions[i]).equals("Patrick")){
                return directions[i];
            }
        }

        if(direction == 0){
            return Direction.NORTH;
        }
        else if(direction == 1){
            return Direction.EAST;
        }
        else if(direction == 2){
             return Direction.SOUTH;
        }
        else{
            return Direction.WEST;
        }
    }

    @Override
    public boolean eat(){
        Random random = new Random();
        int eat = random.nextInt(10) + 1;
        if (confidence >= eat){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void win(){
        if (confidence < 10){
            confidence +=1;
        }
    }

    @Override 
    public void lose(){
        if (confidence > 0){
            confidence -= 1;
        }
    }

    @Override 
    public void reset(){
        confidence = 0;
    }
    
    @Override
    public Attack getAttack(String opponent){
        if (opponent.equals("Tu") || confidence > 5){
            return Attack.POUNCE;
        }
        else {
            return generateAttack(opponent);
        }
    } 

    protected Attack generateAttack(String opponent){
        Random random = new Random();
        int attack = random.nextInt(3);
        if (opponent.equals("Patrick")){
            return Attack.FORFEIT;
        }
        else {
            if (attack == 0){
                return Attack.POUNCE;
            }
            else if (attack == 1){
                return Attack.SCRATCH;
            }
            else {
                return Attack.ROAR;
            }
        }
    }
}
