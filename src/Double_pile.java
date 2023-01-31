public class Double_pile {
    int[] p = new int[100];
    int taille1 = 0;
    int taille2 = 0;

    public Double_pile(){}

    public boolean full(){
        return taille1 + taille2 == 100;
    }

    public boolean push(boolean one, int elem){
        if (full()) {
            return false;
        }

        if (one) {
            p[taille1] = elem;
            taille1++;
        } else {
            p[100 - 1 - taille2] = elem;
            taille2++;
        }

        return true;
    }

    public int top(boolean one){
        if (one) {
            return p[taille1];
        } else {
            return p[100 - taille2];
        }
    }

    public int pop(boolean one){
        if (one) {
            taille1--;

            return p[taille1];
        } else {
            taille2--;

            return p[taille2];
        }
    }

    public int length(boolean one){
        if (one) {
            return taille1;
        } else {
            return taille2;
        }
    }

    public void print(){
        String s1 = "Pile one: (";
        String s2 = "Pile two: (";

        for (int i = 0; i < taille1 - 1; i++){
            s1 = s1.concat(String.valueOf(p[i]));
            s1 = s1.concat(", ");
        }

        for (int j = 0; j < taille2 - 1; j++){
            s2 = s2.concat(String.valueOf(p[100 - 1 - j]));
            s2 = s2.concat(", ");
        }

        System.out.println(s1.concat(String.valueOf(p[taille1 - 1])).concat(")"));
        System.out.println(s2.concat(String.valueOf(p[100 - taille2])).concat(")"));
    }
}
