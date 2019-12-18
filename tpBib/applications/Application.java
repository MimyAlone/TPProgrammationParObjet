package applications;
import lib.*;
public class Application {
 public static void main(String[] argv) {

	Bibliotheque bib = new Bibliotheque();

	//Ranger des ouvrages:
    bib.add("I101",new Ouvrage("C","Kernighan"));
    bib.add("L202",new Ouvrage("Germinal","Zola"));
    bib.add("S303",new Ouvrage("Parapente","Ali Gali"));
    bib.add("I345",new Ouvrage("Java","Eckel"));
    bib.add("Z627",new Revues("mot","sup",20191001,"1"));
    bib.add("E326",new Revues("tout","pet",20191010,"2"));
    bib.add("T874",new Revues("fasc","torp",20191015,"3"));
    bib.add("Y563",new Revues("qze","Tar",20190901,"4"));
    bib.listing();

    try{
        bib.emprunter("L202");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.emprunter("S303");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.emprunter("L202");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.retourner("L202");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.retourner("L404");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.emprunter("P808");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.emprunter("I345");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.emprunter("L202");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
     
     
     
     try{
        bib.emprunter("Z627");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR 1 n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.emprunter("E326");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR 2 n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.emprunter("T874");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR 3 n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    try{
        bib.emprunter("Y563");
    }catch(NonDisponibleException ex){
        System.out.printf("ERREUR 4 n'est pas disponible\n");
    }catch(OuvrageInconnuException ex){
        System.out.printf("ERREUR n'est pas connu\n");
    }
    
    System.out.printf("Nb emprunt : "+ bib.totalEmprunts()+"\n");

    System.out.println("Ouvrages non triés :\n" + bib.getOuvrages());
    
    System.out.println("Ouvrages triés :\n" + bib.getOuvragestries());
    System.out.printf(" \n\n\n");
    
    
    System.out.println("Revues non triés :\n" + bib.getRevues());
    System.out.println("Revues triés :\n" + bib.getRevuestries());
//     System.out.println(bib.getRevues());
    
	//Permettre a l'utilisateur d'emprunter/retourner un ouvrage
	//en demandant son code.
// 	do {
// 			System.out.print("votre choix? ");
// 			choix = in.nextInt();
// 			switch (choix) {
//                 case 1: // emprunter
//                     
//                     break;
//                 case 2:
                    
                    
	//Transformer les exceptions en message d'erreur.
 }
}
