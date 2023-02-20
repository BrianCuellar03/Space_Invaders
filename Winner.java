import java.awt.Color;
import java.awt.Graphics;

public class Winner extends GraphicsObject {
    int x;
    int y;

    public Winner(int x, int y){
        super(x, y);
    }

    public void draw(Graphics g){
        g.setColor(new Color(0, 204, 0));
        g.fillRect(x,y,600, 600);
        g.setColor(new Color(0, 0, 0));
        g.drawString("Winner!!!", 200, 200);
    }
}