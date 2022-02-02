import processing.core.PApplet;

public class TryProcessing extends PApplet {


    public static final int WIDTH = 320;
    public static final int HEIGHT1 = 100;
    public static final int HEIGHT2 = 200;
    public static final int HEIGHT3 = 300;
    public static final int HEIGHT4 = 400;
    int x=0;
    int y=0;
    int z=0;
    int a=0;

    @Override
    public void settings() {
        super.settings();
        size(648,488);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
       // plainWhite();
        ellipse(x, HEIGHT1,10,10);
        x++;
        ellipse(y, HEIGHT2,10,10);
        y=y+2;
        ellipse(z, HEIGHT3,10,10);
        z=z+3;
        ellipse(a, HEIGHT4,10,10);
        a=a+4;
    }

    private void plainWhite() {
        background(255);
    }

    public static void main(String[] args)
    {
        PApplet.main("TryProcessing", args);


    }
}
