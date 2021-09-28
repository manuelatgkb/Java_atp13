package modulo1;

public class MetodosMedia{
    public static void main(String[] args) {
        cabecalho();
        somar();
        
    }

    public static void cabecalho(){
        System.out.println("_________________Cálculo de Média ____________________") 
    }

    public static int somar(int n1, int n2){
       int resultado = n1 + n2;
       return resultado;
    }

    public static double mediaAritmética(int n1, int n2, int n3,int n4) {
        double resultado = Double.parseDouble(n1 + n2 + n3 + n4)/4;
        return resultado;
    }
        
    }
}