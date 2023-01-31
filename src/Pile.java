public class Pile {
    int[] p = new int[100];
    int taille = 0;

    public Pile(){}

    public void push(int elem){
        p[taille] = elem;
        taille++;
    }

    public Object top() { return p[taille - 1]; }

    public Object pop(){
        taille--;

        return p[taille];
    }

    public int length(){
        return taille;
    }

    // Sentez-vous libre de modifier pour que cela fit avec votre code
    public void print(){
        System.out.print('(');

        for (int i = 0; i < taille - 1; i++){
            System.out.print(p[i]);
            System.out.print(", ");
        }

        System.out.print(p[taille - 1]);
        System.out.println(')');
    }
}