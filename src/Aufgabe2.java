/*
    Aufgabe 2) Rekursion mit Strings
*/
public class Aufgabe2 {
    
    private static String insertIndex(String s) {
        if (s.length() == 0) return s;
        if (s.length() == 1) return s.length() - 1 + s;
        return insertIndex(s.substring(0, s.length() - 1)) + (s.length() - 1) + s.charAt(s.length() - 1);}
    
    private static String mixStrings(String s1, String s2) {
        s2 += s2.charAt(0);
        if(s1.length()==0)return"";
        return "" + s1.charAt(0) + s2.charAt(0) + mixStrings(s1.substring(1), s2.substring(1));

    }
    
    private static String shiftMinCharLeft(String s) {
        if (s.length() <= 1) return s;
        String newString = shiftMinCharLeft(s.substring(0,s.length()-1));
        
        if(newString.charAt(0) > s.charAt(s.length()-1))
            return s.charAt(s.length()-1) + s.substring(0,s.length()-1);
        else
            return newString + s.charAt(s.length()-1);
    }
    
    public static void main(String[] args) {
        System.out.println(insertIndex("Hallo"));
        System.out.println(insertIndex("Fahrkarten!"));
        System.out.println(insertIndex(""));
        
        System.out.println(mixStrings("GROSS", "klein"));
        System.out.println(mixStrings("ABC", "klein"));
        System.out.println(mixStrings("GROESSER", "klein"));
        
        System.out.println(shiftMinCharLeft("xdbycfjadfmk"));
        System.out.println(shiftMinCharLeft("bcdefghijklmnoa"));
        System.out.println(shiftMinCharLeft(""));
    }
}


