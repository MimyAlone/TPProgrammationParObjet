class Compte
{
//Attributs
	double credit, debit;

//Constructeur
	Compte(double credit)
	{
		crediter(credit);
		this.debit = 0;
	}

//methodes
	void crediter(double x)
	{
		this.credit += x;
	}

	void debiter(double x)
	{
		this.debit += x;
	}

	double solde()
	{
		return this.credit - this.debit;
	}

	public String toString()
	{
		return "credits = " + this.credit + " debit = " + this.debit + " solde = " + this.solde();
	}
	
	void virerVers(double x, Compte dest)
	{
        this.debiter(x);
        dest.crediter(x);
    }
	
}
