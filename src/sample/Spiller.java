package sample;

import javafx.scene.paint.Paint;

public class Spiller extends AbstraktRute{
    Spiller(int n, int m, int str){
        super(n, m, str);
        rekt.setFill(Paint.valueOf("Red"));
    }
}
