import java.util.Scanner;

class TestArithmetique{

	public static void main(String[] args){

		int premierterme,sup;
		double raison;
		Scanner scan = new Scanner(System.in);
		String a = "y";

		System.out.print("Premier terme? ");
		premierterme = scan.nextInt();
		System.out.print("raison? ");
		raison = scan.nextDouble();

		ProgressionArithmetique uneSuite = new ProgressionArithmetique(premierterme, raison);

		while(a.equals("y")){
			System.out.print("next (y/n)? ");
			a = scan.next();
			if(a.equals("y")){
				uneSuite.next();
				 System.out.print(uneSuite.getTerme());
			}
		}
		System.out.print("nb termes supplementaires? ");
		sup = scan.nextInt();
		uneSuite.next(sup);
		System.out.print("progression: " + uneSuite);
	}

}
