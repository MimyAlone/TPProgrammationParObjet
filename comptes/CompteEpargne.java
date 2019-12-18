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
		return super.toString() + "\ninterets = " + this.interets();
	}
}
