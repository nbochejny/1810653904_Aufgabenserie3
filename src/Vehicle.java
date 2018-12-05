import javax.swing.*;

public class Vehicle {
    private int power;
    private double weight;
    private String name;

    public Vehicle(int power, double weight, String name){
        this.power = power;
        this.weight = weight;
        this.name = name;
    }
     public String printName(){ //this. Referenz auf das Objekt in dem man sich befindet
         return this.name;
     }
     public void calculatePower(){ //void= kein Rückgabewert
         JOptionPane.showMessageDialog(null, this.power*1.36 + " PS");
     }
}
