
import java.awt.Color;
import java.awt.Graphics;

public class PlayerLaser extends GraphicsObject {
    double speed_y;

    public PlayerLaser(double x, double y,double speed_y){
        super(x,y);
        this.speed_y = speed_y;
    }

    public void draw(Graphics g){
        g.setColor(new Color(255, 255, 204));
        g.fillRect((int)x, (int)y, 2, 5   );
    }

    public void update(int pic_width, int pic_height, int frame) {
        this.y += this.speed_y;
    }
}