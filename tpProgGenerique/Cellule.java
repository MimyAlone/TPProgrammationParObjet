class Cellule<E>{
    E element;
    Cellule suivante;

    Cellule(E elem, Cellule next)
    {
        this.element = elem;
        this.suivante = next;
    }
    
    E getValeur(){
        return this.element;
    }
    
    Cellule getNext(){
        return this.suivante;
    }

}
