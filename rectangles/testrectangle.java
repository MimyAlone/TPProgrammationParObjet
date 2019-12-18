import java.util.Scanner;

public class testrectangle{

    static Scanner scan = new Scanner(System.in);

	static Rectangle creerRectangle(){
        System.out.print("Nouveau rectangle : ");
        double o1 = scan.nextDouble();
        double o2 = scan.nextDouble();
        double c1 = scan.nextDouble();
        double c2 = scan.nextDouble();
        
        return (new Rectangle(o1,o2,c1,c2));
	}
	
	static Rectangle max(Rectangle[] t)
	{
        Rectangle max = t[0];
        for(int i=1; i<t.length;i++)
        {
            if(t[i].surface() > max.surface()) max = t[i];
        }
        return max;
	}
	
	
	public static void main(String[] args){
		Rectangle r = new Rectangle(Double.parseDouble(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2]),Double.parseDouble(args[3]));
		System.out.printf("Largeur = %2f \n", r.largeur());
		System.out.printf("Longueur = %2f \n", r.longueur());
		System.out.printf("Surface = %2f \n", r.surface());
		System.out.printf("Perimetre = %2f \n", r.perimetre());
		System.out.printf("%s \n", r);
		
		
		System.out.printf("Nombre de rectangle à créer : ");
        int n = scan.nextInt();
        int i = 0;
        Rectangle[] tab = new Rectangle[n];
        
        for(i = 0;i<n;i++)
        {
            tab[i] = creerRectangle();
        }
        System.out.println(tab);
		for(i = 0;i<n;i++)
        {
            System.out.printf("%s \n", tab[i]);
        }
        
        System.out.printf("Rectangle de surface max : %s \n",max(tab)); 
		
	}
	

}
