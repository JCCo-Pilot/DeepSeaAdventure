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
	private ArrayList<Treasure> ruins;
	private Graphics graph;
	private boolean result;
	public submarineJPanel(ArrayList<Treasure> r) {
		ruins = r;
		result = true;
		try {
			image = ImageIO.read(new File("submarine.png"));
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
		graph.drawImage(image,0,10,400,100,null);
		refresh();
	}
	public void refresh(){
		if (result){
			graph.drawRect(410,10,100,100);
		}
	}
}
