
public class Persona extends Professore {
    public String cognome;
    public String nome;
    
    public Persona(String m, String s, String c, String n){
        super(m,s);
        cognome=c;
        nome=n;
    }
    
    public void setNome(String n){
        nome=n;
    }
    
    public void setCognome(String c){
        cognome=c;
    }
    
     public String getNome(){
        return nome;
     }
     
     public String getCognome(){
        return cognome;
     }
     
     public void stampa(){
         super.stampa();
         System.out.println("Nome:" + nome);
         System.out.println("Cognome:" + cognome);
     }
    
    
}
