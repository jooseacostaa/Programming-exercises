package arraysprimos;

public class ArraysPrimos {

    public static int azar(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a;
    }

    public static void main(String[] args) {

        int[] array = new int[10];

        for (int t = 0; t < array.length; t += 1) {
            array[t] = azar(1, 100);
        }

        for (Integer i : array) {
            System.out.print(i + " - ");
        }
        System.out.println("");

        for (int t = 0; t < array.length; t += 1) {

            boolean primo = true;

            for (int i = 2; i < array[t] - 1; i += 1) {

                if (array[t] % i == 0) {
                    primo = false;
                    break;
                }

            }

            if (primo == false) {
                System.out.println(array[t] + " no es primo");
            } else {
                System.out.println(array[t] + " es primo");
            }

        }

    }

}
