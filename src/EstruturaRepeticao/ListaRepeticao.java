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

    // O número 3025 possui a seguinte característica:  e . Criar um algoritmo que apresente na tela todos os números de quatro algarismos que possuem a característica citada.
    public void ex07(){
        for(int i = 1000; i < 9999; i++){
            int n1 = i/100;
            int n2 = i%100;
            int soma = n1+n2;
            int quad = soma* soma;
            if(i == quad){
                System.out.println(i);
            }
        }
    }

    // Criar um algoritmo que leia um número inteiro e apresente na tela o seu fatorial. (Dica: 5! = 5x4x3x2x1 = 120).
    public void ex08(){
        int n1,f=1;
        System.out.println("Informe um numero para saber o seu fatorial:");
        n1 = scanner.nextInt();
        for(int i = 1; i <= n1; i++){
            f *=i;
        }
        System.out.printf("%d ! = %d", n1,f);
}
    // Criar um algoritmo que leia um valor N e apresente na tela todos os valores inteiros entre 1 e N. Considere que o valor de N será sempre maior que zero.
    public void ex09(){
        int n;
        System.out.println("informe um numero:");
        n = scanner.nextInt();
        for(int i = 1; i < n; i++){
            System.out.println(i);
        }
    }

    // Criar um algoritmo que efetue a leitura de 10 valores numéricos inteiros e, ao final, apresente na tela a soma e a média dos valores lidos.
    public void ex10(){
        int n, soma =0;
        double media;
        for( int i = 0; i < 10; i++){
            System.out.printf("Informe o %d° numero:\n", i + 1);
            n = scanner.nextInt();
            soma += n;
        }
        media = soma/10;
        System.out.printf("Soma: %d\nMédia: %.2f",soma,media);
    }

    // Criar um algoritmo que leia o número de horas trabalhadas diárias (NH) de um funcionário por um período de 20 dias (ele trabalhou todos os 20 dias) e apresente na tela o total de horas trabalhadas por ele nesse período.
    public void ex11(){
        int ht,soma= 0;
        for(int i = 0; i < 20; i++){
            System.out.printf("Informe o número de horas trabalhadas no %d° dia:\n ", i + 1);
            ht = scanner.nextInt();
            soma += ht;
        }
        System.out.printf("Total de horas trabalhadas: %d\n",soma);


    }
}
