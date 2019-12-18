class Banque {
    static final int MAX = 1000;
    Compte[] comptes = new Compte[MAX];
    int nbcomptes;
    
    Compte getCompte(int num) throws CompteInexistant
	{
        Compte c;
        try{
            c = this.comptes[num];
        } catch(ArrayIndexOutOfBoundsException ex){
            throw new CompteInexistant();
        } 
        if(c == null) throw new CompteInexistant();
        return c;
    }
    
    Compte getCompteEpargne(int num) throws CompteInexistant, NEstPasUnCompteEpargne
	{
        try{
            return ((CompteEpargne)(this.getCompte(num)));
        } catch(ClassCastException ex){
            throw new NEstPasUnCompteEpargne();
        }
    } 
    
	int ouvrirCompte()
	{
        if(nbcomptes < MAX)
        {
            this.comptes[nbcomptes] = new Compte(0);
            this.nbcomptes++;
        }else{
            System.out.printf("ERREUR : Nombre de comptes maximum atteint\n");
        }
        return (this.nbcomptes - 1);
	}
	
	int ouvrirCompteEpargne(double taux)
	{
        if(nbcomptes < MAX)
        {
            this.comptes[nbcomptes] = new CompteEpargne(0,taux);
            this.nbcomptes ++;
        }else{
            System.out.printf("ERREUR : Nombre de comptes maximum atteint\n");
        }
        return (this.nbcomptes - 1);
	}
	
	void crediter(int num, double x) throws CompteInexistant
	{
        
            getCompte(num).crediter(x);
        
	}
	
	void debiter(int num, double x) throws CompteInexistant
	{
        getCompte(num).debiter(x);
	}
	
	double totalSoldes() throws CompteInexistant
	{
        double t = getCompte(0).solde();
        for(int i=1; i < this.nbcomptes;i++)
        {
            t += getCompte(i).solde();
        }
        return t;
	}
	
	String etat(int num) throws CompteInexistant
	{
        return getCompte(num).toString();
	}
	
	void etat() throws CompteInexistant
	{
        for(int i = 0;i<this.nbcomptes;i++)
        {
            System.out.printf("Compte %d %s\n",i,etat(i));
        }
    }
    
    double interets(int num) throws CompteInexistant, NEstPasUnCompteEpargne
    {
        return ((CompteEpargne)getCompteEpargne(num)).interets();
    }
    
    void echeance(int num) throws CompteInexistant, NEstPasUnCompteEpargne
    {
        ((CompteEpargne)getCompteEpargne(num)).echeance();
    }
    
    void echeanceFinAnnee()
    {
        for(int i = 0;i<this.nbcomptes;i++){
            try{
                ((CompteEpargne)getCompteEpargne(i)).echeance();
            }catch(NEstPasUnCompteEpargne ex){}
            catch(CompteInexistant ex){}
        }
    }
    
    void virement(int numSrc, int numDest, double x) throws CompteInexistant
    {
        getCompte(numSrc).virerVers(x,getCompte(numDest));
    }
}
