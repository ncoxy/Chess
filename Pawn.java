import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class Pawn extends Piece {
	private Color color;
	private Image white;
	private Image black;
	private int x;
	private int y;
	public Pawn(Color color, int x, int y) {
		super(color,x,y);
	
	 }
}