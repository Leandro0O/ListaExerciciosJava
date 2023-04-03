package Vetores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListaVetores {
    Scanner scanner = new Scanner(System.in);

    // Criar um programa que leia 8 elementos inteiros em um vetor A. Construir um
    // vetor B do mesmo tipo e tamanho com os elementos do vetor A multiplicados por
    // 3. O elemento B[0] recebe o elemento A[0] * 3, o elemento B[1] recebe o
    // elemento A[1] * 3 e assim por diante, até a posição 7 do vetor. Apresentar os
    // elementos do vetor B.
    public void ex01() {
        int a[] = new int[8];
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Informe o %d° elemento:\n", (i + 1));
            a[i] = scanner.nextInt();
        }

        for (int j = 0; j < b.length; j++) {
            b[j] = a[j] * 3;
        }

        for (int i : b) {
            System.out.println(i);
        }
    }

    // Criar um programa que leia um vetor de 7 posições de valores inteiros, conte
    // quantos valores estão na faixa [10,20] e substitua os valores que estão nesta
    // faixa pelo número 0 (zero). Apresentar na tela a quantidade de valores
    // modificados e o vetor modificado.
    public void ex02() {
        int count = 0;
        int v[] = new int[7];
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Informe o %d° elemento:\n", (i + 1));
            v[i] = scanner.nextInt();
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] > 10 && v[i] < 20) {
                v[i] = 0;
                count++;
            }
        }
        System.out.printf("Itens modificados: %d", count);
    }

    // Criar um programa que leia um vetor de 10 posições de valores inteiros e em
    // seguida leia dois valores inteiros X e Y quaisquer correspondentes a duas
    // posições no vetor. Ao final apresentar na tela a soma dos valores encontrados
    // nas posições X e Y.
    public void ex03() {
        Random random = new Random();
        int soma, n1, n2;
        int v[] = new int[10];
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Informe o %d° elemento:\n", (i + 1));
            v[i] = scanner.nextInt();
        }
        n1 = v[random.nextInt(0, v.length)];
        n2 = v[random.nextInt(0, v.length)];
        soma = n1 + n2;
        System.out.printf("%d + %d = %d\n", n1, n2, soma);

    }

    // Criar um programa que leia um vetor de 12 posições de valores inteiros e em
    // seguida leia um valor inteiro X qualquer. Fazer uma busca do valor de X no
    // vetor lido e informar a posição em que foi encontrado ou se não foi
    // encontrado.
    public void ex04() {
        int v[] = new int[5];
        int n, pos = 0;
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Informe o %d° elemento:\n", (i + 1));
            v[i] = scanner.nextInt();
        }
        System.out.println("Informe um numero para saber sua posição no verto:");
        n = scanner.nextInt();
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                pos = i;
                System.out.printf("%d encontrado na posição %d", n, pos);
            }
        }
    }

    // Criar uma função que copie o conteúdo de um vetor em um segundo vetor. A
    // função deve retornar o vetor copiado.
    public void ex05() {
        int v1[] = { 12, 44, 22, 18, 90, 16, 23 };
        int v2[] = new int[v1.length];
        v2 = v1.clone();
        for (int i : v2) {
            System.out.println(i);
        }
    }

    // Criar uma função que some o conteúdo de dois vetores e armazene o resultado
    // em um terceiro vetor. A função deve retornar o terceiro vetor.
    public void ex06() {
        int v1[] = { 12, 44, 22, 18, 90, 16, 23 };
        int v2[] = { 28, 12, 32, 999, 22, 76, 2 };
        int v3[] = new int[v1.length];
        for (int i = 0; i < v3.length; i++) {
            v3[i] = v1[i] + v2[i];
        }
        for (int i : v3) {
            System.out.println(i);
        }
    }

    // Criar uma função para unir dois vetores de mesmo tamanho e mesmo tipo em um
    // terceiro vetor com dobro do tamanho. A função deve retornar o terceiro vetor.
    public void ex07() {
        List<Integer> v1 = new ArrayList<Integer>(Arrays.asList(12, 44, 22, 18, 90, 16, 23));
        List<Integer> v2 = new ArrayList<Integer>(Arrays.asList(28, 12, 32, 999, 22, 76, 2));
        List<Integer> v3 = new ArrayList<>();
        v3.addAll(v1);
        v3.addAll(v2);
        for (int i : v3) {
            System.out.println(i);
        }
    }

    // Criar um programa que leia um vetor de 10 elementos de inteiro e apresente a
    // soma dos valores que estão nos índices pares do vetor.
    public void ex08() {
        int v[] = new int[10];
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Informe o %d° elemento:\n", (i + 1));
            v[i] = scanner.nextInt();
        }
        for (int i = 0; i < v.length; i += 2) {
            soma += v[i];
        }
        System.out.printf("Soma: %d\n", soma);
    }

    // Criar um programa que leia um vetor de 16 posições de valores inteiros e
    // troque os 8 primeiros valores pelos 8 últimos valores e vice-versa. Ao final
    // apresentar na tela os dados do vetor obtido.
    public void ex09() {
        int v[] = new int[16];
        int x, y=15;
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Informe o %d° elemento:\n", (i + 1));
            v[i] = scanner.nextInt();
        }

        System.out.println("Vetor original:");
        for(int i : v){
            System.out.printf("\n%d-", i);
        }

        for(int i = 0; i < 8; i++){
            x = v[y];
            v[i] = v[y];
            y--;
        }
        System.out.println("\nVetor modificado:");
        for(int i : v){
            System.out.printf("\n%d-", i);
        }
    }

    // Criar um programa que leia dois vetores de 4 posições de valores inteiros. Criar outro vetor preenchendo-o nas posições pares com os valores do primeiro vetor e nas posições ímpares com os valores do segundo vetor. Apresentar na tela os dados do vetor criado.
    public void ex10(){
        int[] v1 = { 23, 1, 5, 6 };
        int[] v2 = { 2, 9, 4, 10 };
        int[] v3 = new int[v1.length + v2.length];

        for( int i = 0; i < v3.length;i ++){
            if(i % 2 == 0){
                v3[i] = v1[i/2];
            }else{
                v3[i] = v2[i/2];
            }
        }
        Arrays.stream(v3).forEach(i -> System.out.println(i));
    }

    
}
