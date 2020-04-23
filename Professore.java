
public class Professore{
    public String materia;
    public String scuola;
    
    public Professore(String m, String s){
        materia=m;
        scuola=s;
    }
    
    public void stampa(){
        System.out.println("Materia:" + materia);
        System.out.println("Scuola:" + scuola);
    }
}
