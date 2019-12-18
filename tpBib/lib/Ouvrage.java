package lib;
public class Ouvrage implements Comparable<Ouvrage> {
//variables d'instance	
	protected String titre, auteur;
	protected boolean emprunte;
	protected int compteur; // nombre d'emprunts

//methodes et constructeurs
// fournies
	public void retourner() {
		emprunte = false ; // pour simplifier
	}
	public int getCompteur() {
		return compteur;
	}
// a programmer :
	public String toString1(){
        return "Titre : " + this.titre + " Auteur : " + this.auteur + " Nbemprunts : " + this.compteur;
	}
	
	public String toString(){
        return toString1() + "\n";
	}

	public void emprunter() throws NonDisponibleException {
        if(this.emprunte == false){
            this.emprunte = true;
            this.compteur += 1;
        }else{
            throw new NonDisponibleException();
        }
	}
	//provoque l'exception NonDisponibleException s'il est deja emprunt'e

	public Ouvrage(String tit, String aut){
        this.titre = tit;
        this.auteur = aut;
        this.emprunte = false;
        this.compteur = 0;
	}
	
	public int compareTo(Ouvrage ouv){
        return this.getCompteur() - ouv.getCompteur();
	}
	
	public String getTitre(){
        return this.titre;
    }
}
