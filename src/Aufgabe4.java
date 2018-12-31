/*
    Aufgabe 4) Rekursion und Zeichnen mit StdDraw
*/
public class Aufgabe4 {
    
    //constant circle radius
    private static final int RADIUS = 10;

    private static void printCirclesInLine(int val, int x, int y) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    private static void printShape(int val, int max, int y) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Angabe
    }

    public static void main(String[] args) {
        int pixelWidth = 200;
        int pixelHeight = 760;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);

        //Erzeugt Abbildung 2a
        printShape(1, 10, RADIUS);
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2b
        printShape(1, 5, RADIUS);
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2c
        printShape(1, 1, RADIUS);
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2d
        printShape(3, 9, RADIUS);

    }
}

