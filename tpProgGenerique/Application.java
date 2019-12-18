class Application{
    void initRectangles(Liste<Rectangle> l){
        r1 = new Rectangle(0,0,1,1);
        r2 = new Rectangle(0,0,2,2);
        r3 = new Rectangle(0,0,3,3);
        r4 = new Rectangle(0,0,4,4);
        l.add(r1);
        l.add(r2);
        l.add(r3);
        l.add(r4);
    }
    
    void initCercles(Liste<Rectangle> l){
        r1 = new Cercle(0,0,1);
        r2 = new Cercle(1,0,2);
        r3 = new Cercle(2,0,3);
        r4 = new Cercle(3,0,4);
        l.add(r1);
        l.add(r2);
        l.add(r3);
        l.add(r4);
    }
    
    
}
