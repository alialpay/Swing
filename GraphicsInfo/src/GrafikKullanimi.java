
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanimi extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.red);
        
        g.drawRect(100, 10, 30, 40);
        
        g.fillRect(200, 100, 30, 40);
        
        g.setColor(Color.blue);
        
        g.drawOval(200, 200, 30, 30);
        
        g.fillOval(400, 400, 80, 30);
        
        g.setColor(Color.yellow);
        
        g.drawLine(100, 100, 300, 300);
    }
    
    public GrafikKullanimi() {
        
        setBackground(Color.black);
    }

    
    
    
    
    
}
