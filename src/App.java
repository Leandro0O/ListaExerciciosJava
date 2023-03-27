import EstruturaSequencial.ListaSequencial;
import Funcoes.ListaFuncoes;

import java.util.Scanner;

import EstruturaDecisao.ListaDecisao;
import EstruturaRepeticao.ListaRepeticao;
import Funcoes.ListaFuncoes;



public class App {
    public static void main(String[] args) throws Exception {
        ListaSequencial sequencial = new ListaSequencial();
        ListaDecisao decisao = new ListaDecisao();
        ListaRepeticao repeticao = new ListaRepeticao();
        ListaFuncoes funcoes = new ListaFuncoes();

        Scanner scanner = new Scanner(System.in);

        int n1, n2;
        System.out.println("Informe o primeiro numero:");
        n1 = scanner.nextInt();
        System.out.println("Informe o segundo numero:");
        n2 = scanner.nextInt();

        System.out.printf("%d + %d = %d\n", n1, n2, funcoes.soma(n1, n2));
        
    }
}