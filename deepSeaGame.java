import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
public class deepSeaGame implements ActionListener, MouseListener{
    JFrame frame;
	JTextField aircnt;
    JTextField curPlayer;
	JButton dive;
	JButton returnToSub;
    JButton pickUp;
    JButton drop;
    JButton rollDice;
    JButton player1;
    JButton player2;
    JButton player3;
    JButton player4;
    JButton [] buttons;
	JPanel panel;
    JPanel panelText;
    Font myFont = new Font("SansSerif",Font.BOLD,30);
    private int xPos;
    private int yPos;
    private int clickCount;
    public deepSeaGame(){
        xPos = 0;
        yPos = 0;


        buttons = new JButton[9];

        frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,1000);
        frame.setVisible(true);
        frame.setResizable(false);

        aircnt = new JTextField();
        aircnt.setBounds(5,5,300,50);
        aircnt.setFont(myFont);
        aircnt.setText("Submarine has 25 air left");

        curPlayer = new JTextField();
        curPlayer.setBounds(5,5,300,50);
        curPlayer.setFont(myFont);
        curPlayer.setText("Submarine has 25 air left");

        dive = new JButton("Dive");
        returnToSub = new JButton("Return to Sub");
        pickUp = new JButton("Pick up tresure");
        rollDice = new JButton("Roll Dice");
        drop = new JButton("Drop Treasure");
        player1 = new JButton("Player1");
        player2 = new JButton("Player2");
        player3 = new JButton("Player3");
        player4 = new JButton("Player4");


        buttons[0]= dive;
        buttons[1]= returnToSub;
        buttons[2]= pickUp;
        buttons[3]= rollDice;
        buttons[4]= drop;
        buttons[5]= player1;
        buttons[6]= player2;
        buttons[7]= player3;
        buttons[8]= player4;

        
        for (int i = 0; i<buttons.length;i++){
            buttons[i].addActionListener(this);
            buttons[i].setFont(myFont);
            buttons[i].setFocusable(false);
        }


        panel = new JPanel();
        panel.setBounds(50,100,10,10);
        panel.setLayout(new GridLayout(3,3,10,10));

        panelText = new JPanel();
        panelText.setBounds(50,100,10,10);
        panelText.setLayout(new GridLayout(1,2,10,10));

        panelText.add(curPlayer);
        panelText.add(aircnt);

        for (int i = 0; i<buttons.length;i++){
            panel.add(buttons[i]);
        }

        frame.add(panelText,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.SOUTH);
        frame.addMouseListener(this);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        
    }
    public void constantPos(MouseEvent e){
        xPos = e.getX();
        yPos = e.getY();
    }
    public void mouseClicked(MouseEvent e) {  
        clickCount++;
        System.out.println(clickCount);
        constantPos(e);
        System.out.println("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        System.out.println("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        System.out.println("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        System.out.println("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        System.out.println("Mouse Released");  
    }
    
      
}
