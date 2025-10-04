import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame() {
        // same as below , GamePanel panel = new GamePanel();

        this.add(new GamePanel()); //creates constructor
        this.setTitle("Snake Game"); //sets title
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the operation once closed
        this.setResizable(false);
        this.pack(); //add componenets to Jframe, takes jframe
        this.setVisible(true);
        this.setLocationRelativeTo(null); //to make it appear in middle
    }
}
