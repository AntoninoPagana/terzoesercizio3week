public class Main {
    public static void main(String args[]){
        Forma forma = new Forma();
        forma.calcolaArea();

        Rettangolo rettangolo = new Rettangolo();
        rettangolo.calcolaArea(10, 7);

        Triangolo triangolo = new Triangolo();
        triangolo.calcolaArea(10, 5);
    }
}
