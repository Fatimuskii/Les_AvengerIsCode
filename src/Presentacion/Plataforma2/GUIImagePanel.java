package Presentacion.Plataforma2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GUIImagePanel extends JPanel{
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Image img;

		  public GUIImagePanel(String img) {
		    this(new ImageIcon(img).getImage());
		  }

		  public GUIImagePanel(Image img) {
		    this.img = img;
		    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		    setPreferredSize(size);
		    setMinimumSize(size);
		    setMaximumSize(size);
		    setSize(size);
		    setLayout(null);
		  }

		  public void paintComponent(Graphics g) {
		    g.drawImage(img, 0, 0, null);
		  }
}
