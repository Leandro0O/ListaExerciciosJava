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

    // Criar um algoritmo que leia um número inteiro e apresente na tela o número lido caso ele seja divisível por 4 mas não por 5.
    public void ex12(){
        int num;
        System.out.println("Informe um número:");
        num = scanner.nextInt();
        if ( num % 4 == 0){
            System.out.printf("%d é divisivel por 4",num);
        }
    }   

    // Criar um algoritmo que leia duas variáveis do tipo lógico, caso ambas sejam verdadeiras apresentar na tela Tem Desconto.
    public void  ex13(){
        boolean  boolean1,boolean2;
        System.out.println("Informe verdadeiro(True) ou falso(False):");
        boolean1 = scanner.nextBoolean();
        System.out.println("Informe verdadeiro(True) ou falso(False):");
        boolean2 = scanner.nextBoolean();
        if( boolean1 && boolean2){
            System.out.println("Tem desconto!");
        }
    }

    // Criar um algoritmo que leia um número inteiro e apresente na tela o número lido caso ele seja divisível por 2 e 3. 
    public void ex14(){
        int num;
        System.out.println("Informe um numero:");
        num = scanner.nextInt();
        if ( num % 2 == 0  && num % 3 == 0 ){
            System.out.printf("%d",num);
        }
    }

    // Criar um algoritmo que leia um número inteiro e apresente na tela o número lido caso ele seja divisível por 4 ou 5.
    public void ex15(){
        int num;
        System.out.println("Informe um número:");
        num = scanner.nextInt();
        if ( num % 4 == 0 || num % 5 == 0){
            System.out.println(num);
        }
    }

    // Criar um algoritmo que leia dois números inteiros e apresente uma mensagem indicando se o primeiro número é múltiplo do segundo.
    public void ex16(){
        int n1,n2;
        System.out.println("informe o primeiro número:");
        n1 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        n2 = scanner.nextInt();
        if(n1 % n2 == 0){
            System.out.printf("%d é multiplo de %d",n1,n2);
        }
    }

    // As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. Criar um algoritmo que leia o número de maçãs compradas, calcule e apresente na tela o custo total da compra.
    public void ex17(){
        Integer quant;
        Double valor;
        System.out.println("Informe a quantidade de maçãs compradas:");
        quant = scanner.nextInt();
        if( quant < 12){
            valor = quant * 1.30;
            System.out.printf("Quantidade: %d\nValor R$: %.2f",quant,valor);
        }else{
            valor = quant * 1.00;
            System.out.printf("Quantidade: %d\nValor R$: %.2f",quant,valor);
        }
    }

    // Criar um algoritmo que leia dois valores inteiros (considere que não serão lidos valores iguais) e apresente-os em ordem crescente.
    public void ex18(){
        int n1 , n2;
        System.out.println("Informe o primeiro valor:");
        n1 = scanner.nextInt();
        System.out.println("Informe o segundo valor:");
        n2 = scanner.nextInt();
        if( n1 > n2){
            System.out.printf("%d,%d",n2,n1);
        }else{
            System.out.printf("%d,%d",n1,n2);
        }
    }
    
    // Criar um algoritmo que leia a idade de uma pessoa e apresente na tela uma mensagem de maioridade ou não.
    public void ex19(){
        int age;
        System.out.println("Informe sua idade:");
        age = scanner.nextInt();
        String resp = age >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(resp);
    }

    //     Criar um algoritmo que leia o salário de um funcionário, calcule e apresente o salário reajustado, de acordo com a seguinte regra: 
    // salários até R$ 300, reajuste de 15%; 
    // salários maiores que R$ 300, reajuste de 7,5%.
    public void ex20(){
        Double s;
        System.out.println("Informe o sálario:");
        s = scanner.nextDouble();
        if( s <= 300){
            s = s + (s * 0.15);
            System.out.printf("Salario R$: %.2f",s);
        }else{
            s = s + ( s * 0.075);
            System.out.printf("Salario R$ : %.2f",s);
        }
    }

    // Criar um algoritmo que leia o ano atual e o ano de nascimento de uma pessoa. Apresentar na tela uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
    public void ex21(){
        int anoA,anoN,idade;
        System.out.println("Informe o ano atual:");
        anoA = scanner.nextInt();
        System.out.println("Informe o ano de nascimento:");
        anoN = scanner.nextInt();
        idade = anoA - anoN;
        String resp = idade < 18 ? "Você não pode votar esse ano" : "Você já pode votar esse ano";
        System.out.println(resp);
    }

    //     Uma livraria esta fazendo uma promoção para pagamento à vista em que o comprador pode escolher entre dois critérios de desconto: 
    // Critério A: R$ 0,25 por livro + R$ 7,50 fixo;
    // Critério B: R$ 0,50 por livro + R$ 2,50 fixo.
    // Criar um algoritmo em que o usuário informe a quantidade de livros que deseja comprar e o programa diz qual é a melhor opção de desconto.
    public void ex22(){
        Integer quant;
        System.out.println("Informe a quantidade de livros:");
        quant = scanner.nextInt();
        Double  A , B;
        A = (quant * 0.25) + 7.50;
        B = (quant * 0.50) + 2.50;
        if( A > B ){
            System.out.println("O criterio B um vale mais a pena");
        }else{
            System.out.println("O criterio A vale mais a pena");
        }
    }

    //     Criar um algoritmo que leia a altura e o sexo de uma pessoa (M ou F) e apresente o seu peso ideal, utilizando a seguinte fórmula:
    // para homens: (72.7 * altura) - 58
    // para mulheres: (62.1 * altura) - 44.7
    public void ex23(){
        String sex;
        Double pesoM, pesoF, altura;
        System.out.println("Informe o sexo (M, F):");
        sex =  scanner.nextLine();
        System.out.println("Informe a sua altura:");
        altura = scanner.nextDouble();
        if(sex.equalsIgnoreCase("M")){
            pesoM = (72.7 * altura) - 58;
            System.out.printf("Peso ideal: %.2f Kg",pesoM);
        }else{
            pesoF = (62.1 * altura) - 44.7;
            System.out.printf("Peso ideal: %.2f Kg",pesoF);
        }  
    }

    // Criar um algoritmo que leia a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos), calcule e apresente na tela a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
    public void ex24(){
        Integer i, t, tp;
        System.out.println("Informe o horario de inicio da partida:");
        i = scanner.nextInt();
        System.out.println("Informe o horario de termino da partida:");
        t = scanner.nextInt();
        tp = t- i;
        if(tp < 24){
            System.out.printf("Inicio partida: %d Horas\nTermino da partida: %d H\nTempo total da partida: %d",i,t,tp);
        }
       
    }

    // Criar um algoritmo que efetue o cálculo do reajuste de salário de um funcionário. Considere que o funcionário deve receber um reajuste de 15% caso seu salário seja menor que R$ 500,00. Se o salário for maior ou igual a R$ 500,00 mas menor ou igual a R$ 1.000,00, seu reajuste será de 10%; caso seja ainda maior que R$ 1.000,00, o reajuste deverá ser de 5%.
    public void ex25(){
        Double s;
        System.out.println("Informe o valor do sálario R$:");
        s = scanner.nextDouble();
        if( s < 500){
            s = s + (s * 0.15);
            System.out.printf("Salario: R$ %.2f",s);
        }else if (s  > 500 && s <= 1000){
            s = s + (s * 0.10);
            System.out.printf("Salario: R$ %.2f",s);
        }else{
            s = s + (s * 0.05);
            System.out.printf("Salario: R$ %.2f",s);
        }
    }

    // Criar um algoritmo que leia o peso e a altura de uma pessoa, calcule o seu IMC (Índice de Massa Corporal), e apresente na tela uma mensagem informando se a pessoa está ou não no seu peso ideal, de acordo com a tabela abaixo. A fórmula para calcular o IMC é: 
    public void ex26(){
        Double peso, altura,imc;
        System.out.println("Informe o peso:");
        peso = scanner.nextDouble();
        System.out.println("Informe a altura:");
        altura = scanner.nextDouble();
        imc = peso / (altura * altura);
        if(imc <20){
            System.out.println("Abaixo do peso");
        }else if(imc <=20 && imc < 25){
            System.out.println("Peso ideal");
        }else{
            System.out.println("Acima do peso");
        }
    }

    // Criar um algoritmo que leia o código de origem de um produto e apresente na tela a sua procedência. A procedência obedece a seguinte tabela:
    public void ex27(){
        int cod;
        System.out.println("Informe o codigo do produto:");
        cod = scanner.nextInt();
        if(cod == 5 && cod == 6){
            System.out.println("Nordeste");
        }else if(cod >= 7 && cod <=9){
            System.out.println("Sudeste");
        }else if(cod >= 10 && cod <= 20){
            System.out.println("Centro-Oeste");
        }else if(cod >= 21 && cod <= 30){
            System.out.println("Nordeste");
        }else{
            System.out.println("Codigo invalido");
        }


    }

    

}