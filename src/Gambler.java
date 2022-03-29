import acm.graphics.GLabel;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Gambler extends GraphicsProgram {

    //initializing and assigning global values and labels
    public int playerBalance = 1000;
    public GLabel playerBalanceLabel = new GLabel(playerBalance + " CR");
    public final int LABEL_SPACING = 10;
    public int[] wheelSpinValues= {
            1,100,1000,10000,0,-400,-600,-1000,750
    };
    public int wheelSpinLandingValue = 0;

    //initializing and assigning private labels
    private GLabel playerCrLabel = new GLabel("Player Credits:");

    @Override
    public void init(){
        setupGame();
    }

    private void setupGame(){
        add(playerCrLabel, 30,30);
        add(playerBalanceLabel, playerCrLabel.getX() + playerCrLabel.getWidth() + LABEL_SPACING,30);
        playerBalanceLabel.setVisible(true);
    }

    private void spinWheel(){
        wheelSpinLandingValue = RandomGenerator.getInstance().nextInt(0, wheelSpinValues.length-1);
    }

    public static void main(String[] args) {
        Gambler x = new Gambler();
        x.start();
    }

}
