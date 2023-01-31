public class Pile_bonus<T> extends Pile{
    T[] p = (T[]) new Object[100];

    public void push(T elem){
        p[taille] = elem;
        taille++;
    }

    public T top() { return p[taille - 1]; }

    public T pop(){
        taille--;

        return p[taille];
    }
}
