/**************************************************************************
 * Copyright © 2012 by CprosCodedev, Inc. (Non-Profit)                    *
 * @cdvlabs  All Rights Reserved.                                         *
 * http://cproscodedev.com                                                *
 *                                                                        *
 * DISCLAIMER: The authors and developers of this software have used      *
 * their best efforts in preparing it. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/


package com.swingx.plaf.ebonie;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

import java.awt.Insets;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;

import javax.swing.event.PopupMenuListener;
import javax.swing.plaf.synth.SynthConstants;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthPainter;

import java.io.IOException;



/**
 * The painter class for Ebonie Look And Feel
 *
 * EboniePainter class
 *
 * @author Codedev Team Member - Ifeora Okechukwu
 * @version 0.0.1.0
 * @see javax.swing.plaf.synth.SynthPainter
 *
 * This class defines/overrides abstract methods found in SyhtnPainter class in order to
 * define custom visual looks for most basic JComponent objects found in swing 
 */




public class EboniePainter extends SynthPainter {

	static final Stroke THIN_STROKE = new BasicStroke(2);
	static final int STROKE_SIZE = 2;



  @Override  // Painter for JButton

  public void paintButtonBackground(SynthContext context, Graphics g, int x, int y, int w, int h){

        RoundRectangle2D.Double rect = new RoundRectangle2D.Double();
        rect.setRoundRect(x, y, w, h, w/2, h/2);
        //Color col = context.getStyle().getColor(context, ColorType.BACKGROUND);
		Color startColor = (Color) UIManager.get("Button.gradient.startColor");
        Color endColor = (Color) UIManager.get("Button.gradient.endColor");
		GradientPaint grad = new GradientPaint(x + w, y, startColor, x, (y + h), endColor);
        Graphics2D g2 = (Graphics2D)g;
        g2.setPaint(grad);
        g2.fill(rect);
        //g2.fill(new Rectangle2D.Float(x, y, w, h));

  }
  
  @Override  // Painter for JButton - Border

  public void paintButtonBorder(SynthContext context, Graphics g, int x, int y, int w, int h){

        RoundRectangle2D.Double rect = new RoundRectangle2D.Double();
        rect.setRoundRect(x, y, w -1, h - 1, w/2, h/2);
        Graphics2D g2 = (Graphics2D)g;
		Color borderColor = Color.BLACK;
		
		if ((context.getComponentState() & SynthConstants.DEFAULT) != 0){
            if ((context.getComponentState() & SynthConstants.PRESSED) != 0) {
            	borderColor = Color.BLUE;
            } else if ((context.getComponentState() & SynthConstants.DISABLED) != 0) {
            	borderColor = Color.BLACK;
            } else if ((context.getComponentState() & SynthConstants.MOUSE_OVER) != 0) {
            	borderColor = Color.BLUE;
            } else {
            	borderColor = Color.BLACK;
            }
        } else {
            if ((context.getComponentState() & SynthConstants.PRESSED) != 0) {
            	borderColor = Color.PINK;
            } else if ((context.getComponentState() & SynthConstants.DISABLED) != 0) {
            	borderColor = Color.GRAY;
            } else if ((context.getComponentState() & SynthConstants.MOUSE_OVER) != 0) {
            	borderColor = Color.BLUE;
            } else {
            	borderColor = Color.BLACK;
            }
        }
		g2.setColor(borderColor);
        g2.draw(rect);


  }

  
  @Override  // Painter for JTextField

  public void paintTextFieldBorder(SynthContext context, Graphics g, int x, int y, int w, int h){

  Graphics2D g2 = (Graphics2D) g;


  }




  @Override  // Painter for JPopupMenu

  public void paintPopupMenuBackground(SynthContext context, Graphics g, int x, int y,int w, int h){

  Graphics2D g2 = (Graphics2D) g.create();

  


  }


  


  @Override   // Painter for JPanel

  public void paintPanelBorder(SynthContext context, Graphics g, int x, int y, int w, int h){

  Graphics2D g2 = (Graphics2D) g.create();



  }

  @Override  // Painter for JList

  public void paintListBackground(SynthContext context, Graphics g, int x, int y, int w, int h){

  Graphics2D g2 = (Graphics2D) g.create();


  }


  @Override  // Painter for JTabbedPane

  public void paintTabbedPaneBackground(SynthContext context, Graphics g, int x, int y, int w, int h){

  Graphics2D g2 = (Graphics2D) g.create();


  }


  @Override  // Painter for JTextArea

  public void paintTextAreaBorder(SynthContext context, Graphics g, int x, int y, int w, int h){

  Graphics2D g2 = (Graphics2D) g.create();


  }


  @Override  // Painter for JToolBar

  public void paintToolBarContentBackground(SynthContext context, Graphics g, int x, int y, int w, int h){

  Graphics2D g2 = (Graphics2D) g.create();


  }


  @Override  // Painter for JTabbedPane

  public void paintTabbedPaneTabAreaBackground(SynthContext context, Graphics g, int x, int y, int w, int h){

  Graphics2D g2 = (Graphics2D) g.create();


  }



       public SBitPainter() throws IOException {

           super();

           
       }

/**
 * @return
 *
 *
 * @param
 *
 */


       

}