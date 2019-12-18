class CompteEpargne extends Compte
{
//Attributs
	double taux;

//Constructeur
	CompteEpargne(double credit, double taux)
	{
		super(credit);
		this.taux = taux;
	}

//Methodes
	double interets()
	{
		return taux * this.solde();
	}

	void echeance()
	{
		this.crediter(this.interets());
	}

	void debiter(double x)
	{
		if(this.solde() >= x)super.debiter(x);
	}

	public String toString()
	{
		return super.toString() + " interets = " + this.interets();
	}
	
	void virerVers(double x, Compte dest)
	{
        if(this.solde() >= x)
        {
            super.debiter(x);
            dest.crediter(x);
        }
        else
        {
            System.out.println("ERREUR : solde non-suffisant");
        }
	}
}
