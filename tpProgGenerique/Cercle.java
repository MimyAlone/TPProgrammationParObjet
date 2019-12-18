import java.awt.geom.Point2D;
import java.lang.Math.*;


class Cercle extends Figure{
//Champs
	Point2D.Double centre;
	Double rayon;
//Constructeurs

	Cercle(double xcentre,double ycentre, double rayon){
		this.centre = new Point2D.Double(xcentre,ycentre);
		this.rayon = rayon;
	}
//methodes
	double surface(){
		return (Math.PI * Math.pow(this.rayon,2));
	}
	double perimetre(){
		return (2 * Math.PI * this.rayon);
	}
	
	public String toString(){
        return "Cercle: (" + this.centre + " ," + this.rayon + ")" ;
	}
}
