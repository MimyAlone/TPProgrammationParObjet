class ProgressionGeometrique{
	static final int MAX = 1000;
	double[] termes = new double[MAX];
	double raison;
	int rangdernier;

	ProgressionGeometrique(double premierterme,double raison){
		this.termes[0] = premierterme;
		this.raison = raison;
		this.rangdernier = 0;
	}

	void next(){
		this.rangdernier += 1;
		this.termes[rangdernier] = this.termes[rangdernier -1] * this.raison;
	}

	void next(int n){
		for(int i = 0; i<n;i++){
			next();
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
