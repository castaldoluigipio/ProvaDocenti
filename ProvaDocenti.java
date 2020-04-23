
public class ProvaDocenti {
    public static void main(String args[]){
        Persona P1= new Persona("Informatica","Dalla Chiesa","Tessitore","Fabio");
        Persona P2= new Persona("Lab. Informatica","Dalla Chiesa","Orizzonte","Pasquale");
        
        System.out.println("Professore \n");
        P1.stampa();
        System.out.println("\nProfessore \n");
        P2.stampa();
    }
}
