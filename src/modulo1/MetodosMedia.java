package modulo1;

public class MetodosMedia{
    public static void main(String[] args) {
        cabecalho();
        int r1 = somar(10, 2);
        int r2 = somar(5, 10);
        int r3 = somar(7, 7);
        int r4 = somar(10, 10);
       double resultadofinal=  mediaAritmetica(r1, r2, r3, r4);
        imprimir("O resultado da média é: " + resultadofinal);
        
    }

    public static void cabecalho(){
        System.out.println("_________________Cálculo de Média ____________________");
    }

    public static int somar(int n1, int n2){
       int resultado = n1 + n2;
       return resultado;
    }

    public static double mediaAritmetica(int n1, int n2, int n3,int n4){
        double resultado = (double)(n1 + n2 + n3 + n4)/4;
        return resultado;
    }

    public static void imprimir(String mensagem) {
        System.out.printf(mensagem);
        
    }
        
}