package lib;
public class Revues extends Ouvrage{
    protected int date;
    protected String numero;
    
    public Revues(String tit, String aut,int date,String num){
        super(tit,aut);
        this.date = date;
        this.numero = num;
	}
    
    public void emprunter() throws NonDisponibleException {
        if(this.emprunte == false && this.date <= Bibliotheque.dateactu -7){
            this.emprunte = true;
            this.compteur += 1;
        }else{
            throw new NonDisponibleException();
        }
	}
	
	public String toString(){
        return super.toString1() + " date : " + this.date + " numero : " + this.numero + "\n";
	}
	
	public int getDate(){
        return this.date;
    }

}
