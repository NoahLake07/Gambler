import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class Gambler extends GraphicsProgram {

    //initializing and assigning global values and labels
    public int playerBalance = 1000;
    public GLabel playerBalanceLabel = new GLabel(playerBalance + " CR");
    public final int LABEL_SPACING = 10;

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

    public static void main(String[] args) {
        Gambler x = new Gambler();
        x.start();
    }

}
