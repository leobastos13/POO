package aula06;

class Conjunto {
    private int[] elementos;
    private int tamanho;

    public Conjunto() {
        elementos = new int[10];
        tamanho = 0;
    }

    public void insert(int n) {

        if (contains(n)) {
            return;
        }

        if (tamanho == elementos.length) {
            int[] novoArray = new int[elementos.length * 2];

            for (int i = 0; i < tamanho; i++) {
                novoArray[i] = elementos[i];
            }
            elementos = novoArray;   
        }
        elementos[tamanho] = n;
        tamanho++;
    }

    public boolean contains(int n) {

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i] == n) {
               return true; 
            }   
        }
        return false;
    }

    public void remove(int n) {

        for (int i = 0; i < tamanho; i++) {

            if (elementos[i] == n) {
                elementos[i] = elementos[--tamanho];
                elementos[tamanho] = 0;
                return;
            }
        }
    }

    public void empty() {
        elementos = new int[10];
        tamanho = 0;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < tamanho; i++) {
            s += elementos[i] + " ";
        }
        return s;
    }

    public int size() {
        return tamanho;
    }

    Conjunto combine(Conjunto add) {
        Conjunto resultado = new Conjunto();

        for (int i = 0; i < tamanho; i++) {
            resultado.insert(elementos[i]);
        }

        for (int i = 0; i < add.tamanho; i++) {
            resultado.insert(add.elementos[i]);
        }
        return resultado;
    }

    Conjunto subtrate(Conjunto dif) {
        Conjunto resultado = new Conjunto();

        for (int i = 0; i < tamanho; i++) {

            if (!dif.contains(elementos[i])) {
                resultado.insert(elementos[i]);
            }
        }
        return resultado;
    }

    Conjunto intersect(Conjunto inter) {
        Conjunto resultado = new Conjunto();

        for (int i = 0; i < tamanho; i++) {

            if (inter.contains(elementos[i])) {
                resultado.insert(elementos[i]);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Conjunto c1 = new Conjunto();
        c1.insert(4); c1.insert(7); c1.insert(6); c1.insert(5);
        Conjunto c2 = new Conjunto();
        int[] test = { 7, 3, 2, 5, 4, 6, 7};
        for (int el : test) c2.insert(el);
        c2.remove(3); c2.remove(5); c2.remove(6);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("Número de elementos em c1: " + c1.size());
        System.out.println("Número de elementos em c2: " + c2.size());
        System.out.println("c1 contém 6?: " + ((c1.contains(6) ? "sim" : "não")));
        System.out.println("c2 contém 6?: " + ((c2.contains(6) ? "sim" : "não")));
        System.out.println("União:" + c1.combine(c2));
        System.out.println("Interseção:" + c1.intersect(c2));
        System.out.println("Diferença:" + c1.subtrate(c2));
        c1.empty();
        System.out.println("c1:" + c1);
         }
}
