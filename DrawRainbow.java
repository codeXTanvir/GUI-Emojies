import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawRainbow extends JPanel
{
  private final static Color RED = new Color(255, 0, 0);
  private final static Color ORANGE = new Color(255, 165, 0);
  private Color[] colors = { Color.WHITE, Color.WHITE, RED, ORANGE, Color.YELLOW,Color.GREEN, Color.BLUE, Color.BLUE, Color.MAGENTA };

  public DrawRainbow()
  {
    setBackground(Color.WHITE); 
  }
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);

    int radius = 20; 
 
    int centerX = getWidth() / 2;
    int centerY = getHeight() - 10;

    for (int counter = colors.length; counter > 0; counter--)
    {
         g.setColor(colors[counter - 1]);
         g.fillArc(centerX - counter * radius,
         centerY - counter * radius,
         counter * radius * 2, counter * radius * 2, 0, 360);
         
    }
  }
}
   
    

 


