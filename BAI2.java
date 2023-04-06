public interface Moveable{
void moveUp();
void moveDown();
void moveLeft();
void moveRight();
}
public class Moveablepoint implements Moveable
{
int x, y;
int xSpeed, ySpeed;
@Override
     public void moveup(){}
    @Override
    public void movedown(){}
    @Override
    public void moveleft(){}
    @Override
    public void moveright(){}
    @Override
    public String toString() {
        return "Moveablepoint{" + "x=" + x + ", y=" + y + ", xspeed=" + xspeed + ", yspeed=" + yspeed + '}';
        }
        class MoveableCircle implements Moveable{
        int radius;
        MoveblePoint center;
        @Override
    public void moveup(){}
@Override
    public void movedown(){}
@Override
    public void moveleft(){}
@Override
    public void moveright(){}
}
@Override
    public String toString() {
        return "MoveableCircle{" + "radius=" + radius + ", center=" + center + '}';
        }
        }
        class main{
         public static void main(String[] args) {
         MoveablePoint mp = new MoveablePoint();
         MoveableCricle mc = new MoveableCricle();
         mc.moveDown();
         }
         }
