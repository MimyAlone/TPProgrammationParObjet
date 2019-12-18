package lib;
import java.util.*;

public class Bibliotheque {
//variables d'instances
	protected Map<String,Ouvrage> ouvrages = new TreeMap<String,Ouvrage>();
    static final int dateactu = 20191016;
    
    
//methodes a programmer	

    public List<Ouvrage> getOuvrages(){
        List<Ouvrage> l= new ArrayList<>();
        l.addAll(ouvrages.values());
        return l;
    }
    
    public List<Ouvrage> getOuvragestries(){
        List<Ouvrage> l= new ArrayList<>();
        l.addAll(ouvrages.values());
        Collections.sort(l);
        return l;
    }
    public List<Revues> getRevuestries(){
        List<Revues> l= new ArrayList<>();
        for(Ouvrage ouv : ouvrages.values())
            if(ouv instanceof Revues) l.add((Revues) ouv);
        Collections.sort(l,new ComparateurTitreDate());
        return l;
    }
    
    public List<Revues> getRevues(){
        List<Revues> l= new ArrayList<>();
        for(Ouvrage ouv : ouvrages.values())
            if(ouv instanceof Revues) l.add((Revues) ouv);
        return l;
    }
    
	public void add(String code, Ouvrage o){
        ouvrages.put(code,o);
	}

	public int totalEmprunts(){
        int nbEmprunts=0;
        Iterator<Ouvrage> iter = ouvrages.values().iterator();
        while (iter.hasNext())
            nbEmprunts = nbEmprunts + iter.next().getCompteur();
        return nbEmprunts;
	}

	public void listing(){
        for(String code : ouvrages.keySet())
            System.out.print(code + ":"+ouvrages.get(code));
	}

	public void emprunter(String code) throws OuvrageInconnuException, NonDisponibleException{
        try{
            ouvrages.get(code).emprunter();
        } catch (NullPointerException ex) {
            throw new OuvrageInconnuException();
        }
	}
	//provoque l'exception OuvrageInconnuException si le code d'ouvrage n'existe pas
	//provoque l'exception NonDisponibleException si l'ouvrage est deja emprunt'e

	public void retourner(String code) throws OuvrageInconnuException {
        try{
            ouvrages.get(code).retourner();
        } catch (NullPointerException ex) {
            throw new OuvrageInconnuException();
        }
	}
	//provoque l'exception OuvrageInconnuException si le code d'ouvrage n'existe pas
}
