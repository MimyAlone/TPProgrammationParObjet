class ProgressionGeometrique extends Progression{

	ProgressionGeometrique(double premierterme,double raison){
		super(premierterme,raison);
	}

	void next(){
		this.rangdernier += 1;
		this.termes[rangdernier] = this.termes[rangdernier -1] * this.raison;
	}

}
