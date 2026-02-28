package ordenarvector;

public class OrdenarVector {

    public static int azar(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }

    public static void main(String[] args) {

        int[] v = new int[5]; //declaramos e instanciamos el vector 

        for (int t = 0; t < v.length; t += 1) {

            v[t] = azar(1, 100); //con un bucle for rellenamos el vector con números aleatorios

            System.out.println(v[t]); //imprimimos cada vector

        }

        //Ordenar vector
        for (int i = 0; i < v.length - 1; i++) {

            for (int j = 0; j < v.length - 1 - i; j++) {

                if (v[j] > v[j + 1]) {

                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
        
        System.out.println(" ");

        for (int t = 0; t < v.length; t += 1) {

            System.out.println(v[t]);

        }

    }

}
