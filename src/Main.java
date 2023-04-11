import processing.core.PApplet;
public class Main extends PApplet {
    private int x;
    private int y;
    private int size;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public Main() {
        x = 10;
        y = 12;
        size = 14;
    }

    public void settings() {
        size(600, 600);

    }

    public void setup() {

    }

    public void draw() {
        background(204, 229, 255);

        drawImage1(600,600,110,110);
        drawImage1(550,550,110,110);
        drawImage1(500,500,110,110);
        drawImage1(450,450,110,110);
        drawImage1(400,400,110,110);
        drawImage1(350,350,110,110);

        drawImage2(150);
    }

    public void drawImage1(int a, int b, int c, int d) {
        rect(a , b , c , d);//rect
        if(a>100){
            drawImage1(a-2,b-2,c-2,d-2);
            fill(255,255,255);
        }
        drawImage2(a-150);
    }

    public void drawImage2(int diameter) {
        if (diameter % 2 == 0) {
            ellipse(width / 2, height / 2, diameter, diameter);
            fill(204, 229, 255);
        } else {
            ellipse(width / 2, height / 2, diameter, diameter);
            fill(204, 255, 255);
        }
//generate random #'s
    }
}