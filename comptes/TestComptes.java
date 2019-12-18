import Java.util.Scanner;
public class TestComptes
{
	static void debitInteractif(Compte c)
	{
		Scanner scan = new Scanner();
		System.out.printf("Montant a crediter : ");
		double cre = 
	}


	public static void main(String[] args)
	{
		Compte unCompte = new Compte(100);

		CompteEpargne unCE = new CompteEpargne(200,1);

		System.out.printf("%s\n",unCompte);
		unCompte.debiter(5);
		System.out.printf("%s\n",unCompte);


		System.out.printf("%s\n",unCE);
		unCE.debiter(5);
		System.out.printf("%s\n",unCE);

	}
}
