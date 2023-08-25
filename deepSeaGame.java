import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
import java.awt.Graphics;
public class deepSeaGame implements ActionListener, MouseListener, KeyListener{
    JFrame frame;
	
    JTextField aircnt;
    JTextField curPlayer;
    JTextField instruct;
	
    JButton dive;
	JButton returnToSub;
    JButton pickUp;
    JButton drop;
    JButton rollDice;
    JButton player1;
    JButton player2;
    JButton player3;
    JButton player4;

    Player user1;
    Player user2;
    Player user3;
    Player user4;

    JButton [] buttons;
	
    JPanel panel;
    JPanel panelText;
    submarineJPanel submarine;
    //Ruins ruin;
    
    Font myFont = new Font("SansSerif",Font.BOLD,30);
    
    private ArrayList<Treasure> ruins;
    private int xPos;
    private int yPos;
    private int clickCount;
    private int airCount;
    private int currentTurn;
    private int roundnum;
    public deepSeaGame(){
        xPos = 0;
        yPos = 0;
        airCount = 25;
        currentTurn = 1;

        ruins = new ArrayList(32);

        Treasure tier11 = new Treasure(1);
        Treasure tier12 = new Treasure(1);
        Treasure tier13 = new Treasure(1);
        Treasure tier14 = new Treasure(1);
        Treasure tier15 = new Treasure(1);
        Treasure tier16 = new Treasure(1);
        Treasure tier17 = new Treasure(1);
        Treasure tier18 = new Treasure(1);
        Treasure tier21 = new Treasure(2);
        Treasure tier22 = new Treasure(2);
        Treasure tier23 = new Treasure(2);
        Treasure tier24 = new Treasure(2);
        Treasure tier25 = new Treasure(2);
        Treasure tier26 = new Treasure(2);
        Treasure tier27 = new Treasure(2);
        Treasure tier28 = new Treasure(2);
        Treasure tier31 = new Treasure(3);
        Treasure tier32 = new Treasure(3);
        Treasure tier33 = new Treasure(3);
        Treasure tier34 = new Treasure(3);
        Treasure tier35 = new Treasure(3);
        Treasure tier36 = new Treasure(3);
        Treasure tier37 = new Treasure(3);
        Treasure tier38 = new Treasure(3);
        Treasure tier41 = new Treasure(3);
        Treasure tier42 = new Treasure(3);
        Treasure tier43 = new Treasure(3);
        Treasure tier44 = new Treasure(3);
        Treasure tier45 = new Treasure(3);
        Treasure tier46 = new Treasure(3);
        Treasure tier47 = new Treasure(3);
        Treasure tier48 = new Treasure(3);

        ruins.add(tier11);
        ruins.add(tier12);
        ruins.add(tier13);
        ruins.add(tier14);
        ruins.add(tier15);
        ruins.add(tier16);
        ruins.add(tier17);
        ruins.add(tier18);
        ruins.add(tier21);
        ruins.add(tier22);
        ruins.add(tier23);
        ruins.add(tier24);
        ruins.add(tier25);
        ruins.add(tier26);
        ruins.add(tier27);
        ruins.add(tier28);
        ruins.add(tier31);
        ruins.add(tier32);
        ruins.add(tier33);
        ruins.add(tier34);
        ruins.add(tier35);
        ruins.add(tier36);
        ruins.add(tier37);
        ruins.add(tier38);
        ruins.add(tier41);
        ruins.add(tier42);
        ruins.add(tier43);
        ruins.add(tier44);
        ruins.add(tier45);
        ruins.add(tier46);
        ruins.add(tier47);
        ruins.add(tier48);


        user1 = new Player();
        user2 = new Player();
        user3 = new Player();
        user4 = new Player();


        buttons = new JButton[9];

        frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500,1000);
        frame.setVisible(true);
        frame.setResizable(false);

        aircnt = new JTextField();
        aircnt.setBounds(5,5,300,50);
        aircnt.setFont(myFont);
        aircnt.setText("Submarine has "+airCount+ " air left");
        //aircnt.setEditable(false);

        curPlayer = new JTextField();
        curPlayer.setBounds(5,5,300,50);
        curPlayer.setFont(myFont);
        curPlayer.setText("It is Player 1's turn");
        //curPlayer.setEditable(false);

        instruct = new JTextField();
        instruct.setBounds(5,5,300,50);
        instruct.setFont(myFont);
        instruct.setText("Dive Time");
        //instruct.setEditable(false);

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
        panelText.setLayout(new GridLayout(1,3,10,10));

        panelText.add(curPlayer);
        panelText.add(aircnt);
        panelText.add(instruct);

        submarine = new submarineJPanel(ruins);

        //ruin = new Ruins(ruins);

        for (int i = 0; i<buttons.length;i++){
            panel.add(buttons[i]);
        }

        frame.add(panelText,BorderLayout.NORTH);
        frame.add(panel,BorderLayout.SOUTH);
        frame.add(submarine);

        frame.addMouseListener(this);
        frame.addKeyListener(this);
        frame.setVisible(true);

        
    }
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==player1){
            currentTurn = 1;
            curPlayer.setText("Player 1's Turn");
            airCount--;
            //airCount= airCount-1-user1.getNumberOfTreasure();
            aircnt.setText("There is "+airCount+" air left");
            if (airCount<=0){
                aircnt.setText("Everyone died round over");
            }
        }
        if (e.getSource()==player2){
            currentTurn = 2;
            curPlayer.setText("Player 2's Turn");
            airCount= airCount-1-user2.getNumberOfTreasure();
            aircnt.setText("There is "+airCount+" air left");
            if (airCount<=0){
                aircnt.setText("Everyone died round over");
            }
        }
        if (e.getSource()==player3){
            currentTurn = 3;
            curPlayer.setText("Player 3's Turn");
            airCount= airCount-1-user3.getNumberOfTreasure();
            aircnt.setText("There is "+airCount+" air left");
            if (airCount<=0){
                aircnt.setText("Everyone died round over");
            }
        }
        if (e.getSource()==player4){
            currentTurn = 4 ;
            curPlayer.setText("Player 4's Turn");
            airCount= airCount-1-user4.getNumberOfTreasure();
            aircnt.setText("There is "+airCount+" air left");
            if (airCount<=0){
                aircnt.setText("Everyone died round over");
            }
        }
        if (e.getSource()==dive){

        }
        if (e.getSource()==returnToSub){

        }
        if (e.getSource()==pickUp){

        }
        if (e.getSource()==drop){

        }
        if (e.getSource()==rollDice){

        }
        /*if (e.getSource()==pickUp){
            if (currentTurn ==1){
                user1.addTreasure();
            }
        }*/
        submarine.repaint();
        panelText.repaint();
        panel.repaint();
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
    public void keyPressed(KeyEvent e){
        //System.out.println("You pressed key code "+e.getKeyCode());
        //System.out.println("You pressed "+e.getKeyChar());
    }
    public void keyTyped(KeyEvent e){
        
    }
    public void keyReleased(KeyEvent e){

    }
    public void draw(){
        
    }
    public int diceRoll(){
        int dice = (int)(Math.random()*5)+2;
        return dice;
    }
    public int move(){
        int move = diceRoll();
        if (user1.isTurn()){
            move = move-user1.getNumberOfTreasure();
        }
        if (user2.isTurn()){
            move = move-user2.getNumberOfTreasure();
        }
        if (user3.isTurn()){
            move = move-user3.getNumberOfTreasure();
        }
        if (user4.isTurn()){
            move = move-user4.getNumberOfTreasure();
        }
        submarine.repaint();
        return move;
    }
    
      
}
