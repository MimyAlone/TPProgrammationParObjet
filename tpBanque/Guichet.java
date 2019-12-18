import java.util.Scanner;

public class Guichet {
	static Scanner in = new Scanner(System.in);
	// creation d'une banque :
	static Banque bank = new Banque();

	public static void main(String[] args) {
		int choix = 0, nberreurs = 0;
		do {
			menu();
			System.out.print("votre choix? ");
			choix = in.nextInt();
			try{
                switch (choix) {
                case 1: // etat des comptes
                    bank.etat();
                    break;
                case 2: // creer un compte
                    menuNouveauCompte();
                    break;
                case 3: // creer un compte Epargne
                    menuNouveauCompteEpargne();
                    break;
                case 4: // crediter un compte
                    menuCrediter();
                    break;
                case 5: // debiter un compte
                    menuDebiter();
                    break;
                case 6: // afficher les interets d'un compte epargne
                    menuinterets();
                    break;
                case 7: // echeancer un compte epargne
                    menuEcheancer();
                    break;
                case 8: // faire un virement
                    menuVirement();
                    break;
                case 9: // faire echance fin annee
                    menuEcheanceFinAnnee();
                    break;
                case 0: // quitter
                }
            }catch(CompteInexistant ex){
                System.out.printf("Compte Inexistant");
                nberreurs ++;
            }catch(NEstPasUnCompteEpargne ex){
                System.out.printf("Ce n est pas un compte epargne");
                nberreurs ++;
            }
		} while (choix != 0);
        System.out.printf("Nombre d'erreurs comptees : %d\n",nberreurs);
		System.out.println("au revoir");
	}

	static void menu() {
		System.out.println(
				"\n1: etat des comptes\n2: creer un compte\n3: creer un compte epargne\n4: crediter un compte\n5: debiter un compte\n6: afficher les interets d'un compte epargne\n7: echeancer un compte epargne\n8: faire un virement\n9: faire echeance fin annee\n0: quitter");
	}

	// creer un compte
	static void menuNouveauCompte() {
		int num;
		num = bank.ouvrirCompte();
		System.out.println("numero= " + num);
	}
	
	// creer un compte Epargne
	static void menuNouveauCompteEpargne() {
		int num;double taux;
		System.out.print("\nTaux du compte epargne? ");
		taux = in.nextDouble();
		num = bank.ouvrirCompteEpargne(taux);
		System.out.println("numero= " + num);
	}

	// crediter un compte
	static void menuCrediter() throws CompteInexistant {
		int num;
		System.out.print("\nnumero du compte? ");
		num = in.nextInt();
		System.out.print("somme? ");
		bank.crediter(num, in.nextDouble());
	}

	// debiter un compte
	static void menuDebiter() throws CompteInexistant {
		int num;
		System.out.print("\nnumero du compte? ");
		num = in.nextInt();
		System.out.print("somme? ");
		bank.debiter(num, in.nextDouble());
	}
	
	// afficher les interets d'un compte epargne
	static void menuinterets() throws CompteInexistant, NEstPasUnCompteEpargne{
        int num;
		System.out.print("\nnumero du compte? ");
		num = in.nextInt();
		System.out.printf("interets du compte : %f\n",bank.interets(num));
    }
    
    // echeancer un compte epargne
    static void menuEcheancer() throws CompteInexistant, NEstPasUnCompteEpargne{
        int num;
		System.out.print("\nnumero du compte? ");
		num = in.nextInt();
		bank.echeance(num);
    }
    
    // faire un virement
    
    static void menuVirement() throws CompteInexistant{
        int num1, num2;Double montant;
		System.out.print("\nnumero du compte origine? ");
		num1 = in.nextInt();
		System.out.print("\nnumero du compte Destination? ");
		num2 = in.nextInt();
		System.out.print("\nMontant a virer? ");
		montant = in.nextDouble();
		
		bank.virement(num1,num2,montant);
    }
    
    static void menuEcheanceFinAnnee(){
        bank.echeanceFinAnnee();
    }
    
}
