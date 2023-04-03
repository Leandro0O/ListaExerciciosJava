package Vetores;
import java.util.Random;
import java.util.Scanner;

public class ListaVetores {
    Scanner scanner = new Scanner(System.in);

    // Criar um programa que leia 8 elementos inteiros em um vetor A. Construir um vetor B do mesmo tipo e tamanho com os elementos do vetor A multiplicados por 3. O elemento B[0] recebe o elemento A[0] * 3, o elemento B[1] recebe o elemento A[1] * 3 e assim por diante, até a posição 7 do vetor. Apresentar os elementos do vetor B.
    public void ex01(){
        int  a[]  = new int[8];
        int  b[]  = new int[a.length];
        for(int i = 0; i < a.length; i++){
            System.out.printf("Informe o %d° elemento:\n", (i+1));
            a[i] = scanner.nextInt();
        }

        for(int j = 0; j < b.length; j++){
            b[j] = a[j] * 3;
        }

        for (int i : b) {
            System.out.println(i);
        }
    }

    // Criar um programa que leia um vetor de 7 posições de valores inteiros, conte quantos valores estão na faixa [10,20] e substitua os valores que estão nesta faixa pelo número 0 (zero). Apresentar na tela a quantidade de valores modificados e o vetor modificado.
    public void ex02(){
        int count = 0;
        int v[] = new int[7];
        for( int i = 0; i < v.length; i++){
            System.out.printf("Informe o %d° elemento:\n", (i+1));
            v[i] = scanner.nextInt();
        }

        for (int i = 0; i < v.length;i++) {
            if(v[i] > 10 && v[i] < 20){
                v[i] = 0;
                count++;
            }
        }
        System.out.printf("Itens modificados: %d", count);
    }

    // Criar um programa que leia um vetor de 10 posições de valores inteiros e em seguida leia dois valores inteiros X e Y quaisquer correspondentes a duas posições no vetor. Ao final apresentar na tela a soma dos valores encontrados nas posições X e Y.
    public void ex03(){
        Random random = new Random();
        int soma,n1,n2;
        int v[] = new int[10];
        for( int i = 0; i < v.length; i++){
            System.out.printf("Informe o %d° elemento:\n", (i+1));
            v[i] = scanner.nextInt();
        }
        n1 = v[random.nextInt(0,v.length)];
        n2 = v[random.nextInt(0,v.length)];
        soma = n1+ n2;
        System.out.printf("%d + %d = %d\n",n1,n2,soma);

    }

    // Criar um programa que leia um vetor de 12 posições de valores inteiros e em seguida leia um valor inteiro X qualquer. Fazer uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado. 
    public void ex04(){
        int v [] = new int[5];
        int n,pos = 0;
        for(int i = 0; i < v.length; i++){
            System.out.printf("Informe o %d° elemento:\n", (i+1));
            v[i] = scanner.nextInt();
    }
        System.out.println("Informe um numero para saber sua posição no verto:");
        n = scanner.nextInt();
        for(int i = 0; i < v.length; i++){
            if(v[i] == n){
                pos = i;
                System.out.printf("%d encontrado na posição %d",n,pos);
            }
        }
        
       
}
}
