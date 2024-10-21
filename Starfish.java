import java.awt.Color;

public class Starfish extends Critter {
    private static final String SPECIES_NAME = "Patrick";

    /**
     * Default constructor - creates critter with name Patrick
     */
    public Starfish() {
        super(SPECIES_NAME);
    }
    /*
     * Returns the direction of starfish
     * 
     * @return center
     */
    @Override
    public Direction getMove() {
       return Direction.CENTER;
    }

    /**
     * Returns the color of the Starfish
     * 
     * @return Color pink
     */
    @Override 
    public Color getColor() {
        return Color.PINK;
    }
}