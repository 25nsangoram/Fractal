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
        drawImage2(149);
    }

    public void drawImage1(int a, int b, int c, int d) {
        rect(a , b , c , d);//rect
        if(a>100){
            drawImage1(a-2,b-2,c-2,d-2);
            fill(255,255,255);
        }
        drawImage2(a-150);
        drawImage2(99); //delete to go back
    }

    public void drawImage2(int diameter) {
        if (diameter % 2 == 0) {
            ellipse(width / 2, height / 2, diameter, diameter);
            fill(204, 229, 255);
        } else {
            ellipse(width / 2, height / 2, diameter, diameter);
            fill(153,0, 76);
        }
//generate random #'s
    }
    public void drawImage3(int diameter, int x, int y){
            fill(25, 0, 135);
            ellipse(x, y, diameter, diameter);
            fill(62, 0, 179);
            rect(x,y,diameter,diameter);
            fill(107, 0, 215);
            ellipse(x+diameter, y+diameter, diameter, diameter);
            fill(162, 48, 237);
            rect(x + diameter,y +diameter,diameter,diameter);
            fill(195, 100, 250);


    }
    public void keyPressed(){
        if(key == 'c'){
            drawImage3(50, 100, 100);
            fill(255, 204,255);
            drawImage3(50, width - 100,  height -100);
            fill(255, 204,255);
            drawImage3(50, width - 100,  100);
            fill(255, 204,255);
            drawImage3(50, 100,  height -100);
            fill(255, 204,255);
        }
        if (key == 'd') {
            drawImage1(600,600,110,110);
            fill(211, 145, 250);
            drawImage1(550,550,110,110);
            drawImage1(500,500,110,110);
            fill(195, 100, 250);
            drawImage1(450,450,110,110);
            drawImage1(400,400,110,110);
            fill(162, 48, 237);
            drawImage1(350,350,110,110);
        }
    }
}