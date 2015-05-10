package sample;

import javafx.scene.Node;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

abstract class AbstraktRute {
    boolean spiller, finde, godbit;
    int x, y;
    Rectangle rekt;

    AbstraktRute(int n, int m, int str){
        x=n;
        y=m;
        this.rekt = new Rectangle(str,str);
        rekt.setStroke(Paint.valueOf("lightblue"));
        rekt.setFill(Paint.valueOf("Black"));
    }

    void flytt(int xDif, int yDif){
        x=x+xDif;
        y=y+yDif;
    }

    public void setNode(int xdiff,int ydiff) {
        x=x+xdiff;
        y=y+ydiff;
    }

    public Node getNode(){return rekt;}
    int getX(){return x;}
    int getY(){return y;}

}
