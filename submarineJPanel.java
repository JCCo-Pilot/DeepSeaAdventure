import java.awt.*;
import java.awt.image.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.imageio.ImageIO.*;
import javax.swing.*;
import java.io.*;
import java.io.File;

import javax.imageio.ImageIO;

public class submarineJPanel extends JPanel{
    private BufferedImage image;
	private BufferedImage tier1;
	private BufferedImage tier2;
	private BufferedImage tier3;
	private BufferedImage tier4;
	private ArrayList<Treasure> ruins;
	private Graphics graph;
	private boolean result;
	public submarineJPanel(ArrayList<Treasure> r) {
		ruins = r;
		result = true;
		try {
			image = ImageIO.read(new File("submarine.png"));
			tier1 = ImageIO.read(new File("tier1treasure.png"));
			tier2 = ImageIO.read(new File("tier2treasure.png"));
			tier3 = ImageIO.read(new File("tier3treasure.png"));
			tier4 = ImageIO.read(new File("tier4treasure.png"));
		}
		catch(Exception E) {
			System.out.println("Error");
			return;
		}
		
	}
	public void setFalse(){
		result = false;
	}
	public void paint(Graphics g) {
		super.paint(g);
		graph = g;
		graph.drawImage(image,0,10,600,150,null);
		refresh();
	}
	public void refresh(){
		int xVal = 630;
		int yVal = 10;
		int width = 150;
		int height = 150;
		// first row
		for (int i = 0; i<ruins.size();i++){
			if (!ruins.get(i).isBlank()&&ruins.get(i).getTier()==1){
				graph.drawImage(tier1,xVal,yVal,width,height,null);
			}
			if (!ruins.get(i).isBlank()&&ruins.get(i).getTier()==2){
				graph.drawImage(tier2,xVal,yVal,width,height,null);
			}
			if (!ruins.get(i).isBlank()&&ruins.get(i).getTier()==3){
				graph.drawImage(tier3,xVal,yVal,width,height,null);
			}
			if (!ruins.get(i).isBlank()&&ruins.get(i).getTier()==4){
				graph.drawImage(tier4,xVal,yVal,width,height,null);
			}
			if (i == 6){
				yVal += 180;
				xVal = 75;
			}
			if (i==17){
				yVal +=180;
				xVal = 75;
			}
			if (i==28){
				yVal +=180;
				xVal = 75;
			}
			if (i!=6&&i!=17&&i!=28){
				xVal +=160;
			}
			
		}
	}
}
