abstract class Progression{
	static final int MAX = 1000;
	double[] termes = new double[MAX];
	double raison;
	int rangdernier;

	Progression(double premierterme,double raison){
		this.termes[0] = premierterme;
		this.raison = raison;
		this.rangdernier = 0;
	}

	abstract void next();

	void next(int n){
		for(int i = 0; i<n;i++){
			this.next();
		}
	}

	double getTerme(){
		return this.termes[rangdernier];
	}

	public String toString(){
		String r = "" + this.termes[0];
		for(int i = 0; i <= rangdernier;i++){
			r += this.termes[i] + " ";
		}
		return r;
	}

}
