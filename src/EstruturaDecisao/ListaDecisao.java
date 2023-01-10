package EstruturaDecisao;

import java.util.Scanner;



public class ListaDecisao{

    Scanner scanner = new Scanner(System.in);
    
    // Criar um algoritmo que lê um número e verifica se ele é negativo. Se for negativo, imprimir na tela a mensagem "Numero negativo".
    public void ex1(){
        Integer num;
        
        System.out.println("Informe um número:");
        num = scanner.nextInt();
        if(num < 0){
            System.out.printf("%d é negativo",num);
        }
       
    }

    // Criar um algoritmo que leia dois números L e R. O programa deve verificar a maior área entre um quadrado de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo".
    public void ex2(){
        Double quadrado,circulo;
        System.out.println("Informe o lado do quadrado:");
        quadrado = Math.pow(scanner.nextDouble(),2);
        System.out.println("Informe o raio do circulo:");
        circulo = Math.PI*Math.pow(scanner.nextDouble(), 2);
        if(circulo > quadrado){
            System.out.println("A área do circulo é maior");
        }else{
            System.out.println("A área do quadrado é maior");
        }
    }

    // Criar um algoritmo que leia três números e imprime o maior deles.
    public void ex3(){
        int num1,num2,num3;
        System.out.println("Informe o primeiro numero:");
        num1 = scanner.nextInt();
        System.out.println("Informe o segundo numero:");
        num2 = scanner.nextInt();
        System.out.println("Informe o terceiro numero:");
        num3 = scanner.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.printf("%d é o maior numero\n",num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.printf("%d é o maior numero\n",num2);
        }else{
            System.out.printf("%d é o maior numero",num3);
        }
    }

    // Criar um algoritmo que leia um valor e apresente na tela se esse valor é positivo ou negativo (considere o valor zero como positivo).
    public void ex4(){
        Integer num;
        
        System.out.println("Informe um número:");
        num = scanner.nextInt();
        if(num < 0){
            System.out.printf("%d é negativo",num);
        }else{
            System.out.printf("%d é positivo",num);
        }
    }

    // Criar um algoritmo que leia dois números e imprime a divisão do maior pelo menor.
    public void ex5(){
        Integer num1, num2;
        System.out.println("Informe o primeiro número:");
        num1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        num2 = scanner.nextInt();
        if(num1 > num2){
            System.out.printf("%d / %d = %d",num1,num2,(num1/num2));
        }else if(num2 > num1){
            System.out.printf("%d / %d = %d",num2,num1,(num2/num1));
        }
    }

    // Criar um algoritmo que leia uma velocidade e caso o valor lido seja maior que 70 apresentar na tela Multado.
    public void ex6(){
        Double v;
        System.out.println("Informe a velocidade:");
        v = scanner.nextDouble();
        if(v > 70){
            System.out.println("Multado");
        }
    }

    // Criar um algoritmo que leia uma velocidade, caso o valor lido for maior que 70 apresentar na tela a mensagem Multado, caso contrário apresentar na tela a mensagem Não Multado.
    public void ex7(){
        Double v;
        System.out.println("Informe a velocidade:");
        v = scanner.nextDouble();
        if(v > 70){
            System.out.println("Multado");
        }else{
            System.out.println("Não multado");
        }
    }

    // Uma empresa decide dar aumento de 15% aos funcionários cujo salário é inferior a 500 reais. Criar um algoritmo que leia o salário de um funcionário e apresente na tela o valor do salário reajustado ou o valor do salário informado caso ele não tenho direito ao reajuste.
    public void ex8(){
        System.out.println("Informe o valor do salario:");
        Double s = scanner.nextDouble();
        if(s > 500){
            
            System.out.printf("Salario: R$ %.2f",s);

        }else{
            s = s + (s* 0.15);
            System.out.printf("Salario: R$ %.2f");
        }
    }

    // Criar um algoritmo que leia o valor de uma conta de luz e, caso o valor seja maior que R$ 50,00 e menor que R$ 500,00 apresente na tela a mensagem Você está gastando muito. Caso contrário não exiba mensagem nenhuma.
    public void ex9(){
        System.out.println("Informe o valor da conta de luz:");
        Double luz = scanner.nextDouble();
        if(luz > 50 && luz < 500){
            System.out.println("Voce esta gastando muito");
        }
    }

    // Criar um algoritmo que leia o valor total de vendas do mês de um determinado vendedor e o seu nome, e apresente na tela o nome do vendedor quando o valor da venda estiver entre R$ 1.000,00 e R$ 5.000,00.
    public void ex10(){
        String nome;
        Double vendas;
        System.out.println("Informe o nome do vendedor:");
        nome = scanner.nextLine();
        System.out.println("Informe o valor total de vendas no mes:");
        vendas = scanner.nextDouble();
        if(vendas >= 1000 && vendas <= 5000){
            System.out.printf("Vendedor: %s\nTotal vendas: R$ %.2f",nome,vendas);
        }
    }

    // Criar um algoritmo que leia um valor numérico inteiro positivo ou negativo e apresentar o valor lido como sendo um valor positivo, ou seja, se o valor lido for menor que zero, ele deve ser multiplicado por -1.
    public void ex11(){
        int num;
        System.out.println("Digite um número:");
        num = scanner.nextInt();
        String r = num > 0 ? "positivo" : "negativo";
        System.out.printf("%d é %s", num,r);
    }



}