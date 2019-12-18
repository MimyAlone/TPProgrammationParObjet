import java.util.Scanner;

class TestProgression{

	static void manip(Progression p){
		String a = "y";
		Scanner scan = new Scanner(System.in);
		int sup;

		while(a.equals("y")){
			System.out.print("next (y/n)? ");
			a = scan.next();
			if(a.equals("y")){
				p.next();
				 System.out.print(p.getTerme());
			}
		}
		System.out.print("nb termes supplementaires? ");
		sup = scan.nextInt();
		p.next(sup);
		System.out.print("progression: " + p);
	}

	public static void main(String[] args){

		int premierterme,type;
		double raison;
		Scanner scan = new Scanner(System.in);
		Progression uneSuite;


		System.out.print("Progression arithmetique taper 1 \nProgression Geometrique taper 2\n? ");
		type = scan.nextInt();

		System.out.print("Premier terme? ");
		premierterme = scan.nextInt();
		System.out.print("raison? ");
		raison = scan.nextDouble();

		if(type == 2){
			uneSuite = new ProgressionGeometrique(premierterme, raison);
		}else{
			uneSuite = new ProgressionArithmetique(premierterme,raison);
		}

		manip(uneSuite);
	}

}
