public class Boll { 
    private int x = 100;
    private int y= 100;
    private int vx=2;
    private int direction = -1; 
    private int vy=2; 
    private int s=-100;
    private int c=-100;

    public Boll(){

    }

    public void update(){
        x=x+vx; 
        y=y+vy;
        if(x+50>500){
            x=vx*direction;
        } 
        if(s+50>500){
            s=vx*direction;
        }
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    } 
    public int getS(){
        return s;
    } 
    public int getC(){
        return c;
    }

}
