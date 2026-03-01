package escapicua;

public class EsCapicua {
    
    public static boolean esCapicua(int n) {
    int original = n;
    int invertido = 0;

    while (n > 0) {
        int digito = n % 10;        // tomo el último dígito
        invertido = invertido * 10 + digito; // lo añado al número invertido
        n = n / 10;                 // quito el último dígito
    }

    return original == invertido;
}

    public static void main(String[] args) {
        
        esCapicua(28);
        
    }
    
}
