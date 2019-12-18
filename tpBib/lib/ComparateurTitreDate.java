package lib;
import java.util.*;
public class ComparateurTitreDate implements Comparator<Revues>{
    public int compare(Revues rev1, Revues rev2){
        int dif = rev1.getTitre().compareTo(rev2.getTitre());
        if (dif == 0) dif = rev1.getDate() - rev2.getDate();
        return dif;
    }
}
