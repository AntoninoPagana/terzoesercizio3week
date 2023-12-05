public class Triangolo extends Forma{

    public void calcolaArea(int base, int altezza){
        int area = (base * altezza) / 2;
        System.out.println("L'area di un triangolo con base " + base + " e altezza " + altezza + " equivale a " + area);
    }
}
