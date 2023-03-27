package Funcoes;

import java.util.Scanner;

public class ListaFuncoes {
   
    // Criar uma função que receba dois números inteiros: um valor A e um valor N. A função deve retornar a soma dos N números a partir de A (inclusive). Se N for negativo ou zero, a função deve retornar -1. A função main deve ler dois valores inteiros (para A e N), chamar a função criada e apresentar na tela o dado retornado pela função.
    // Exemplo de cálculo da função: se A for 3 e N for 2, o retorno da função deve ser 7, pois é a soma de 3 + 4.

    public int soma(int n1, int n2){

        if(n1 < 0 || n2 < 0){
            return -1;
        }
        return n1 + n2;
    }
}
