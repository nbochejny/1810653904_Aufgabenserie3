import javax.swing.*;

public class Aufgabe2 {
    public static void main(String[]args){
        partialString(JOptionPane.showInputDialog(null,"Gib was ein"));
    }
    private static void partialString(String a){
        if (a.length()<3){
            //Zählt die Zeichen des Strings (str.length())
            JOptionPane.showMessageDialog(null,
                    "Gib mehr ein!",
                    "FEHLER!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else{
            System.out.println(a.substring(a.length()/2));
            //Substring = Teil des angegebenen Strings, bei ungerader Teilung + Rest
        }
    }
}
