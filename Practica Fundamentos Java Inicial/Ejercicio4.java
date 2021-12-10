public class Ejercicio4{
    public int calcularHojas(int pag){
        int cociente = pag/2;
        int residuo  = pag%2;
        int res = cociente+residuo;
        return res;
    }
}
