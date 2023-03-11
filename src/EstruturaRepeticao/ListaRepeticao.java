package EstruturaRepeticao;

import java.util.Scanner;

public class ListaRepeticao {
    Scanner scanner = new Scanner(System.in);


    // Criar um algoritmo que apresente o quadrado dos números inteiros de 15 a 200.
    public void ex01(){
        for (int i = 15; i <= 200;i++) {
            System.out.printf(" %d ^ 2 = %d \n",i,(i*i));  
        }
    }

    // Criar um algoritmo que apresente na tela os números de 1 a 50 em ordem decrescente.
    public void ex02(){
        for(int i = 50;i>=0;i--){
            System.out.println(i);
        }
    }
    
    // Criar um algoritmo que calcule e apresente na tela a tabuada do 8 (1 a 10).
    public void ex03(){
        System.out.println("Tabuada de 8");
        for(int i = 0;i<=10;i++){
            System.out.printf("8 x %d = %d\n",i,(i*8));
        }
    }

    // Criar um algoritmo que leia um número inteiro positivo e apresente na tela a sua tabuada (1 a 10).
    public void ex04(){
        int n ;
        System.out.println("Informe um numero para saber sua tabuada:");
        n = scanner.nextInt();
        for(int i = 0; i <= 10;i++){
            System.out.printf("%d x %d = %d\n",n,i,(n*i));
        }
    }

    // Criar um algoritmo que apresente na tela o total da soma dos cem primeiros números inteiros positivos (1 + 2 + 3 + ... + 98 + 99 + 100).
    public void ex05(){
        int soma = 0;
        for(int i = 1;i<=100;i++){
            soma+=i;
        }
        System.out.printf("Soma: %d",soma);
    }

    // Criar um algoritmo que apresente os valores da conversão de polegadas para centímetros, de 3 em 3, iniciando a contagem em 1 polegada e terminando em 13 polegadas. Uma polegada equivale a aproximadamente 2,54 centímetros.
    public void ex06(){
        for( int i = 1; i <=13;i++){
            double cm = i * 2.54;
            System.out.println(cm);
        }
    }

}
