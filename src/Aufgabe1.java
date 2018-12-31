import java.util.Arrays;

/*
    Aufgabe 1) Rekursion - Diverse Methoden
*/
public class Aufgabe1 {
    
    private static int printAndCountNumbers(int x, int y) {
        System.out.println(x);
        if(x==y)return x;
        return printAndCountNumbers(x+1,y)+x;
}
    
    private static int printAndCountNumbersDes(int x, int y) {
        System.out.println(y);
        if(x==y)return x;
        return printAndCountNumbersDes(x,y-1)+y;
    }
    
    private static int calcMaxSumTriple(int[] array, int i) {
        if(i==array.length-2)return 0;
        return Math.max(array[i]+array[i+1]+array[i+2],calcMaxSumTriple(array,i+1));
    }
    
    private static int calcMaxSumTriple(int[] array) {
        if(array.length==2)return 0;
        int[] newArray=Arrays.copyOf(array,array.length-1);
        return Math.max(array[array.length-1]+array[array.length-2]+array[array.length-3],calcMaxSumTriple(newArray));
    }
    
    private static int findMaxDiff(int[] array, int i) {
        if(i==0)return -1;
        return Math.max(Math.abs(array[i]-array[i-1]),findMaxDiff(array,i-1));
    }
    
    public static void main(String[] args) {
        System.out.println(printAndCountNumbers(10, 20));
        System.out.println();
        System.out.println(printAndCountNumbersDes(5, 15));
        System.out.println();
        
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 3, 8, 2, 7, 4, 3}, 0));
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 1, 8, 7, 3, 4, 3}, 0));
        System.out.println(calcMaxSumTriple(new int[]{7, 5, 3}, 0));
        
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 3, 8, 2, 7, 4, 3}));
        System.out.println(calcMaxSumTriple(new int[]{1, 4, 8, 3, 7, 1, 8, 7, 3, 4, 3}));
        System.out.println(calcMaxSumTriple(new int[]{7, 5, 3}));
        System.out.println();
        
        System.out.println(findMaxDiff(new int[]{5, 50, 7, 1, 20}, 4));
        System.out.println(findMaxDiff(new int[]{5, 8, 7, 1, 20}, 2));
        System.out.println(findMaxDiff(new int[]{5, 14, 5, 1, 2, 1, 20}, 6));
        System.out.println(findMaxDiff(new int[]{1, 1, 1, 1, 1, 1, 1}, 6));
        System.out.println(findMaxDiff(new int[]{2, 4}, 1));
    }
}


