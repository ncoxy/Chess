<<<<<<< HEAD
public class Board{

	public board(){
		int[][] board = {{16,15,14,13,12,14,15,16}
						 {11,11,11,11,11,11,11,11}
						 {0,0,0,0,0,0,0,0}
						 {0,0,0,0,0,0,0,0}
						 {0,0,0,0,0,0,0,0}
						 {0,0,0,0,0,0,0,0}
						 {1,1,1,1,1,1,1,1}
						 {6,5,4,3,2,4,5,6}};

		
	}

}
=======
	import java.applet.*;
	import java.awt.*;
	import java.util.*;

	public class board extends Applet
	{
		public void drawBoard() {
			paint(g);
		}

	    public void paint(Graphics g) {
	        int w=getWidth();
	        int h=getHeight();
	        int y=0;
	        for(int j=1;j<=4;j++) {


	        for(int i=0;i<=w;i=i+w/8) {



	            g.setColor(Color.BLACK);
	            g.fillRect(i,y,w/8,h/8);
	            i=i+w/8;
	            g.setColor(Color.WHITE);
	            g.fillRect(i,y,w/8,h/8);

	        }
	            y=y+h/8;
	        for( int i=0;i<=w;i=i+w/8) {
	            g.setColor(Color.WHITE);
	            g.fillRect(i,y,w/8,h/8);
	            i=i+w/8;
	            g.setColor(Color.BLACK);
	            g.fillRect(i,y,w/8,h/8);
	        }
	            y=y+h/8;
	    }

	     }
	}
>>>>>>> 33965aa07cbf89456fb9768c8329d42d01a6b667
