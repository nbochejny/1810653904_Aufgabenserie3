public class Aufgabe4_Rekursion { //Rekursion=Funktion ruft sich selbst auf / Fibonacci= 0+1=1,1+1=2,1+2=3,2+3=5,3+5=8,... (Wachstumsfolge)
    public static void main(String[] args) {
        System.out.println("Ite= " +Ite(20));
        System.out.println("Rek= " + Rek(20));
    }

    private static int Rek(int i) {
        if (i==0) {
            return i;
        }
        if (i==1){
            return i;
        }
        else{
            return Rek(i - 2) + Rek(i - 1);
        } //Speichert jeden Schritt bis zur Lösung, langsamer
    }
    private static int Ite(int i){
        if (i<=1){
            return i;
        }
        else{
            int k=3;
            int konst1=1;
            int konst2=2;
            while (k<=i){
                konst1 = konst1+konst2; //Jeden Durchgang wird ko1+ko2 gerechnet solange i kleiner k(+1)
                k++;
                if(k==i){ //Sobald k=i gibt ko1 zurück
                    return konst1;
                }
                konst2 = konst2+konst1; //Obiges ko1+ko2 solange i kleiner k(+1)
                k++;
            }
            return konst2;
        } //Schneller, weniger speicherverbrauch


    }
}

