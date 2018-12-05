import javax.swing.*;

public class Aufruf {
    public static void main(String[]args){
        Vehicle Car1=new Vehicle(50,666,"Toyota");
        Vehicle Car2=new Vehicle(100,1200,"Audi");

        JOptionPane.showMessageDialog(null, Car1.printName());
        Car1.calculatePower();
        JOptionPane.showMessageDialog(null, Car2.printName());
        Car2.calculatePower();
    }
}
