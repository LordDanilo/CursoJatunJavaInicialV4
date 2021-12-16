public class Ejercicio1{
    public String verificar(int numero){
        String res = "";
        int ultimoDigito = numero%10;
        int primerDigito = numero/100;
        
        if(ultimoDigito == primerDigito){
            res = "SI";
        }else{
            res = "NO";
        }
        return res;
    }
}
