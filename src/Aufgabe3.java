import java.awt.*;

/*
    Aufgabe 3) Rekursion - Kreuzmuster
*/
public class Aufgabe3 {

    private static void drawCrossPattern(int x, int y, int l, boolean c) {
        if(l>=16){
        StdDraw.setPenColor((c)? Color.red:Color.BLUE);
        StdDraw.filledRectangle(x,y,l*0.025,l/2);
        StdDraw.filledRectangle(x,y,l/2,l*0.025);

            drawCrossPattern(x+l/4,y+l/4,l/2,!c);
            drawCrossPattern(x+l/4,y-l/4,l/2,!c);
            drawCrossPattern(x-l/4,y+l/4,l/2,!c);
            drawCrossPattern(x-l/4,y-l/4,l/2,!c); //Version B
        }
    }
    
    public static void main(String[] args) {
        int l =512;
        StdDraw.setCanvasSize(l,l);
        StdDraw.setYscale(-1*l/2,l/2);
        StdDraw.setXscale(-1*l/2,l/2);
        StdDraw.enableDoubleBuffering();
        drawCrossPattern(0,0,l,true);
        StdDraw.show();
    }
}
/*
Zusatzfragen:
1. Weil die Rekursion sonst nicht abbricht und es zu einem Stackoverflow kommt
2. Jein, es gibt keine explizite Limitierung jedoch braucht der Stack immermehr Speicher bis er den zugewiesenen Speicher überschreitet
3. 6 mal
4. 4^5=1024 kleinste Kreuze
5. siehe Version B
 */



