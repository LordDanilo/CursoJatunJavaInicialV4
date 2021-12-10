public class Ejercicio6{
    public String intercambiarValores(int a, int b, int c){
        int aux = a;
        a = b;
        b = aux;
        
        aux = a;
        a = c;
        c = aux;
        
        String res = a+" "+b+" "+c;
        return res;
    }
}
