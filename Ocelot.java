import java.awt.Color;

public class Ocelot extends Leopard {
  
    private static final String SPECIES_NAME = "Oce";

    public Ocelot(){
        super();
        displayName = SPECIES_NAME;
    }

    @Override 
    public Color getColor(){
        return Color.LIGHT_GRAY;
    }

    @Override
    protected Attack generateAttack(String opponent){
        if (opponent.equals("Fe") || opponent.equals("Lion") || opponent.equals("Lpd")){
            return Attack.SCRATCH;
        }
        else {
            return Attack.POUNCE;
        }
    }

}
