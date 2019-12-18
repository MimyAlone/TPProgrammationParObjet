import java.awt.geom.Point2D;



class Rectangle {
//Champs
	Point2D.Double origin, corner;
//Constructeurs

	Rectangle(double x1, double y1, double x2, double y2){
		this.origin = new Point2D.Double(x1,y1);
		this.corner  = new Point2D.Double(x2,y2);
	}

	Rectangle(Point2D.Double origin, Point2D.Double corner){
		this.origin = origin;
		this.corner = corner;
	}
//methodes
	double largeur(){
		if(Math.abs(origin.getX() - corner.getX()) < Math.abs(origin.getY() - corner.getY())){
			return Math.abs(origin.getX() - corner.getX());
		}else{
			return Math.abs(origin.getY() - corner.getY());
		}
	}
	double longueur(){
		if(Math.abs(origin.getX() - corner.getX()) < Math.abs(origin.getY() - corner.getY())){
			return Math.abs(origin.getY() - corner.getY());
		}else{
			return Math.abs(origin.getX() - corner.getX());
		}
	}
	double surface(){
		return (Math.abs(origin.getY() - corner.getY())* Math.abs(origin.getX() - corner.getX()));
	}
	double perimetre(){
		return (Math.abs(origin.getY() - corner.getY())*2+2* Math.abs(origin.getX() - corner.getX()));
	}
	
	public String toString(){
        return "(" + origin + " ," + corner + ")" ;
	}
}
