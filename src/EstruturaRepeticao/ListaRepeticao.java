package EstruturaRepeticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class ListaRepeticao {
    Scanner scanner = new Scanner(System.in);

    // Criar um algoritmo que apresente o quadrado dos números inteiros de 15 a 200.
    public void ex01() {
        for (int i = 15; i <= 200; i++) {
            System.out.printf(" %d ^ 2 = %d \n", i, (i * i));
        }
    }

    // Criar um algoritmo que apresente na tela os números de 1 a 50 em ordem
    // decrescente.
    public void ex02() {
        for (int i = 50; i >= 0; i--) {
            System.out.println(i);
        }
    }

    // Criar um algoritmo que calcule e apresente na tela a tabuada do 8 (1 a 10).
    public void ex03() {
        System.out.println("Tabuada de 8");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("8 x %d = %d\n", i, (i * 8));
        }
    }

    // Criar um algoritmo que leia um número inteiro positivo e apresente na tela a
    // sua tabuada (1 a 10).
    public void ex04() {
        int n;
        System.out.println("Informe um numero para saber sua tabuada:");
        n = scanner.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }
    }

    // Criar um algoritmo que apresente na tela o total da soma dos cem primeiros
    // números inteiros positivos (1 + 2 + 3 + ... + 98 + 99 + 100).
    public void ex05() {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.printf("Soma: %d", soma);
    }

    // Criar um algoritmo que apresente os valores da conversão de polegadas para
    // centímetros, de 3 em 3, iniciando a contagem em 1 polegada e terminando em 13
    // polegadas. Uma polegada equivale a aproximadamente 2,54 centímetros.
    public void ex06() {
        for (int i = 1; i <= 13; i++) {
            double cm = i * 2.54;
            System.out.println(cm);
        }
    }

    // O número 3025 possui a seguinte característica: e . Criar um algoritmo que
    // apresente na tela todos os números de quatro algarismos que possuem a
    // característica citada.
    public void ex07() {
        for (int i = 1000; i < 9999; i++) {
            int n1 = i / 100;
            int n2 = i % 100;
            int soma = n1 + n2;
            int quad = soma * soma;
            if (i == quad) {
                System.out.println(i);
            }
        }
    }

    // Criar um algoritmo que leia um número inteiro e apresente na tela o seu
    // fatorial. (Dica: 5! = 5x4x3x2x1 = 120).
    public void ex08() {
        int n1, f = 1;
        System.out.println("Informe um numero para saber o seu fatorial:");
        n1 = scanner.nextInt();
        for (int i = 1; i <= n1; i++) {
            f *= i;
        }
        System.out.printf("%d ! = %d", n1, f);
    }

    // Criar um algoritmo que leia um valor N e apresente na tela todos os valores
    // inteiros entre 1 e N. Considere que o valor de N será sempre maior que zero.
    public void ex09() {
        int n;
        System.out.println("informe um numero:");
        n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(i);
        }
    }

    // Criar um algoritmo que efetue a leitura de 10 valores numéricos inteiros e,
    // ao final, apresente na tela a soma e a média dos valores lidos.
    public void ex10() {
        int n, soma = 0;
        double media;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe o %d° numero:\n", i + 1);
            n = scanner.nextInt();
            soma += n;
        }
        media = soma / 10;
        System.out.printf("Soma: %d\nMédia: %.2f", soma, media);
    }

    // Criar um algoritmo que leia o número de horas trabalhadas diárias (NH) de um
    // funcionário por um período de 20 dias (ele trabalhou todos os 20 dias) e
    // apresente na tela o total de horas trabalhadas por ele nesse período.
    public void ex11() {
        int ht, soma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.printf("Informe o número de horas trabalhadas no %d° dia:\n ", i + 1);
            ht = scanner.nextInt();
            soma += ht;
        }
        System.out.printf("Total de horas trabalhadas: %d\n", soma);
    }

    // Um professor possui 3 turmas, e cada turma possui 5 alunos. Criar um
    // algoritmo que leia a nota dos alunos de cada uma das turmas e apresente a
    // média das notas por turma.
    public void ex12() {
        double media = 0, notas = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Informe as notas da %d° turma:\n", (i));
            for (int j = 0; j < 5; j++) {
                System.out.printf("Informe a nota do %d° aluno:\n", (j + 1));
                notas += scanner.nextDouble();

            }
            media = notas / 5;
            System.out.printf("A media da %d° turma é %.2f\n", (i), media);
            notas -= notas;
        }
    }

    // Criar um algoritmo que apresente na tela a tabuada dos números de 1 a 9.
    public void ex13() {
        System.out.println("\nTabuada do número 9");
        for (int i = 0; i < 9; i++) {
            System.out.printf(" 9 x %d = %d\n", i, (9 * i));
        }
    }

    // Criar um algoritmo que leia um número inteiro e repita a operação de
    // multiplicar o número por 3 (apresentando o novo valor) até que o número seja
    // maior que 100. Por exemplo, se o usuário informar 5, o algoritmo deve
    // apresentar na tela a seguinte sequência: 5 15 45 135.
    public void ex14() {
        int n;
        System.out.println("Informe um numero para multiplicar por 3:");
        n = scanner.nextInt();
        for (int i = n; i <= 100; i *= 3) {
            System.out.printf("%d\n", i);
        }
    }

    // O quadrado de um número natural N é dado pela soma dos N primeiros números
    // ímpares consecutivos. Por exemplo, , , , , etc. Criar um algoritmo que leia
    // um número inteiro positivo maior que zero, calcule e apresente na tela seu
    // quadrado usando a soma de ímpares ao invés de produto.
    public void ex15() {
        int n, quad = 0;
        System.out.println("Informe um numero para saber o quadrado:");
        n = scanner.nextInt();
        for (int i = 1; i <= n * 2; i += 2) {
            quad += i;
        }
        System.out.printf("%d ^ 2 = %d", n, quad);
    }

    // Uma loja está levantando o valor total de todas as mercadorias em estoque.
    // Criar um algoritmo que permita a entrada dos seguintes dados:
    // o número total de mercadorias no estoque;
    // o valor de cada mercadoria.
    // Ao final, apresentar na tela o valor total em estoque e a média dos valores
    // das mercadorias.
    public void ex16() {
        double media, vm, mt, soma = 0;
        System.out.println("Informe o total de produtos no estoque:");
        mt = scanner.nextInt();
        System.out.println("Informe o valor da mercadoria:");
        vm = scanner.nextDouble();

        for (int i = 0; i < mt; i++) {
            soma = i * vm;
        }
        media = soma / mt;
        System.out.printf("Valor total: R$ %.2f\nMédia: R$ %.2f\n", soma, media);
    }

    // Um número inteiro é perfeito se o dobro dele é igual à soma de todos os seus
    // divisores. Por exemplo, como os divisores de 6 são 1, 2, 3 e 6 e 1 + 2 + 3 +
    // 6 = 12, 6 é perfeito. A matemática ainda não sabe se a quantidade de números
    // perfeitos é ou não finita. Criar um algoritmo que leia um número inteiro
    // positivo N e apresente na tela a lista de todos os números inteiros positivos
    // perfeitos menores N.
    public void ex17() {
        int n;
        System.out.println("Informe um numero:");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Criar um algoritmo que leia um número inteiro positivo e apresente na tela o
    // número de algarismos deste número.
    public void ex18() {
        int n, x = 0;
        System.out.println("Informe um numero:");
        n = scanner.nextInt();
        do {
            x += 1;
            n /= 10;
        } while (n != 0);
        System.out.printf("O numero %d %s", x, x > 1 ? "algarismos" : "algarismo");
    }

    // Criar um algoritmo que apresente na tela os valores da conversão de graus
    // Celsius em Fahrenheit, de 10 em 10, iniciando a contagem em 10 graus em
    // terminando em 200 graus. A fórmula de conversão é: ​.
    public void ex19() {
        for (double i = 10; i <= 200; i += 10) {
            double f = i * 1.8 + 32;
            System.out.printf("%.2f C° = %.2f F°\n", i, f);
        }
    }

    // Criar um algoritmo que apresente na tela os valores da conversão de graus
    // Fahrenheit em Celsius, de 2 em 2, iniciando a contagem em 50 graus e
    // terminando em 66 graus. A fórmula de conversão é: .
    public void ex20() {
        for (double i = 2; i <= 66; i += 2) {
            double c = (i - 32) * 5 / 9;
            System.out.printf("%.2f F° = %.2f C°\n", i, c);
        }
    }

    // Criar um algoritmo que leia dois números inteiros (positivos e maiores que
    // zero) e apresente na tela o resultado da multiplicação dos números. Não
    // utilize o operador de multiplicação "*". Use para a solução deste problema
    // estrutura de repetição (laço).
    public void ex21() {
        int n1, n2, soma = 0;
        System.out.println("Informe primeiro numero:");
        n1 = scanner.nextInt();
        System.out.println("Informe segundo numero:");
        n2 = scanner.nextInt();
        for (int i = 1; i <= n2; i++) {
            soma += n1;
        }
        System.out.printf("%d x %d = %d\n", n1, n2, soma);
    }

    // Criar um algoritmo que leia dois números inteiros (positivos e maiores que zero) e apresente na tela o resultado inteiro da divisão do primeiro pelo segundo número. Não utilize qualquer operador de divisão nem qualquer função para obter o resultado inteiro da divisão. Use para a solução deste problema estrutura de repetição (laço).
    public void ex22(){
       int n1, n2, soma = 0;
        System.out.println("Informe primeiro numero:");
        n1 = scanner.nextInt();
        System.out.println("Informe segundo numero:");
        n2 = scanner.nextInt();
        for (int i = n1; i >= n2; i -= n2) {
            soma ++;
        }
        System.out.printf("%d / %d = %d\n", n1, n2, soma);
    }

    // Criar um algoritmo que leia uma base e um expoente e apresente na tela o valor da potência da base pelo expoente. Considere apenas a entrada de valores inteiros e positivos (maiores que zero). Não utilize qualquer função para calcular a potência. Use para a solução deste problema estrutura de repetição (laço).
    public void ex23(){
        int n1, n2, soma = 1;
        System.out.println("Informe primeiro numero:");
        n1 = scanner.nextInt();
        System.out.println("Informe segundo numero:");
        n2 = scanner.nextInt();
        for (int i = 1; i <= n2; i++) {
            soma *= n1;
        }
        System.out.printf("%d ^ %d = %d\n", n1, n2, soma);
    }

    // Criar um algoritmo que apresente na tela a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ... etc., caracterizando-se pela soma de um termo posterior com o seu anterior subseqüente.
    public void ex24(){
        int n1 = 1, n2 = 0;
        System.out.println(n1);
        for(int i = 0; i < 15;i++){
            n1+=n2;
            n2 = n1 - n2;
            System.out.println(n1);
        }
    }

    // Criar um algoritmo que apresente todos os números inteiros divisíveis por 4 existentes na faixa de 1 a 200.
    public void ex25(){
        for(int  i = 0; i <= 200; i++){
            if( i % 4 ==  0){
                System.out.println(i);
            }
        }
    }

     // Criar um algoritmo que apresente todos os números inteiros ímpares, existentes na faixa de 0 a 25.
     public void ex26(){
        for( int i = 1 ; i <= 25; i+=2){
           System.out.println(i);
        }
     }
     
     // Criar um algoritmo que apresente a média dos números inteiros divisíveis por 5 existentes na faixa de 0 a 136.
     public void ex27(){
        for(int  i = 0; i <= 136; i++){
            if( i % 5 == 0){
                System.out.println(i);
            }
        }
     }

    //  Criar um algoritmo que apresente a média dos números inteiros divisíveis por 7 existentes na faixa de 0 a 128.
    public void ex28(){
        double media,soma = 0;
        for(int  i = 0; i <= 128; i++){
            if( i % 7 == 0){
                soma+=i;
            }
        }
        media = soma / 128;
        System.out.printf("Media: %.2f",media);
    }

    // Criar um algoritmo que conte de 1 a 100 e a cada múltiplo de 10 apresenta a mensagem Múltiplo de 10.
    public void ex29(){
        for(int i = 0; i <= 100; i++){
            if(i % 10 == 0){
                System.out.printf("%d é multiplo de 10\n",i);
           }
        }
    }

    // Criar um algoritmo que apresente o resultado da soma e da média aritmética dos valores inteiros pares situados na faixa numérica de 50 a 70.
    public void ex30(){
        double soma = 0, media;
        for(int i = 0; i  <=70;i+=2){
            soma+=i;
        }
        media = soma / 70;
        System.out.printf("Soma = %.0f\nMedia = %.2f\n",soma,media);
    }

    // Criar um algoritmo que leia 15 números inteiros e apresente a soma dos números divisíveis por 3.
    public void ex31(){
        int n,soma = 0;
        for(int i = 0; i <= 15;i++){
            System.out.printf("Informe o %d° numero:",(i+1));
            n = scanner.nextInt();
            if(n % 3 == 0){
                soma+=i;
            }
        }
        System.out.printf("Soma: %d",soma);
    }

    // Criar um algoritmo que leia a idade de 10 pessoas e apresente a quantidade de pessoas maiores de idade (Uma pessoa é maior de idade se sua idade for maior ou igual a 18 anos).
    public void ex32(){
        int n, m = 0;
        for(int i = 0; i <= 10;i++){
            System.out.printf("Informe a idade da  %d° pessoa:",(i+1));
            n = scanner.nextInt();
            if(n >= 18){
                m++;
            }
        }
        System.out.printf("Pessoas maiores de 18 anos: %d",m);
    }

    // Criar um algoritmo que leia 15 valores inteiros positivos e apresente a soma dos valores menores que 40.
    public void ex33(){
        int n, soma= 0;
        for(int i = 0; i < 15;i++){
            System.out.printf("Informe o %d° valor:\n",(i+1));
            n = scanner.nextInt();
            if(n < 40){
                soma+=i;
            }
        }
        System.out.printf("Soma: %d",soma);
    }
    
    // Criar um algoritmo que leia 10 valores inteiros e apresente a quantidade de números negativos.
    public void ex34(){
        int n, neg= 0;
        for(int i = 0 ; i < 10;i++){
            System.out.printf("Informe o %d° valor:\n",(i+1));
            n = scanner.nextInt();
            if(n< 0){
                neg++;
            }
        }
        System.out.printf("Quantidade de números negativos: %d",neg);
    }

    // Criar um algoritmo que leia 10 valores inteiros e apresente na tela quantos destes valores estão no intervalo [10,20] e quantos deles estão fora deste intervalo.
    public void ex35(){
        int n, cont= 0;
        for(int i = 0 ; i < 10;i++){
            System.out.printf("Informe o %d° valor:\n",(i+1));
            n = scanner.nextInt();
            if(n > 10 && n < 20){
                cont++;
            }
        }
        System.out.printf("Quantidade de números entre 10 e 20: %d",cont);
    }


}
