import javax.swing.*;

public class Aufgabe2 {
    public static void main(String[]args){
        partialString(JOptionPane.showInputDialog(null,"Gib was ein"));
        //Zuerst Klasse dann . und danach die methode anwählen (Klasse.methode)(int/double variablen einsetzen)
        System.out.println(Taschenrechner.addition(265,401));
        System.out.println(Taschenrechner.addition(2.65,4.01));
        System.out.println(Taschenrechner.subtraction(1000,445));
        System.out.println(Taschenrechner.subtraction(10,4.45));
        System.out.println(Taschenrechner.multiplication(111,6));
        System.out.println(Taschenrechner.multiplication(1.11,6));
        System.out.println(Taschenrechner.division(7215,13));
        System.out.println(Taschenrechner.division(7.215,1.3));
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
