package EstruturaSequencial;

import java.util.Scanner;

public class ListaSequencial {

    Scanner scanner = new Scanner(System.in);

    // Criar um algoritmo que leia um número inteiro e apresente na tela o seu
    // antecedente e o seu sucessor.
    public void ex1() {
        int num;

        System.out.println("Informe um numero:");
        num = scanner.nextInt();
        System.out.printf("O antecessor é: %d\n", num - 1);
        System.out.printf("O sucessor é: %d", num + 1);

        scanner.close();
    }

    // Criar um algoritmo que lê dois números inteiros e imprime os números
    // consecutivos desses números. (Por exemplo: se o usuário digitar 2 e ­9, a
    // saída deverá ser 3 e ­8, porque 3 é consecutivo de 2. –8 é consecutivo de
    // –9).
    public void ex2() {
        int num;

        System.out.println("informe um número:");
        num = scanner.nextInt();
        System.out.printf("O numero consecutivo de %d é %d", num, num + 1);
        scanner.close();
    }

    // Criar um algoritmo que leia dois números inteiros e apresenta na tela a soma,
    // subtração, multiplicação e divisão dos respectivos números.
    public void ex3() {

        int num1, num2;

        System.out.println("Informe um númeor: ");
        num1 = scanner.nextInt();

        System.out.println("Informe outro número: ");
        num2 = scanner.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("%d x %d = %d\n", num1, num2, (num1 * num2));
        System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));

        scanner.close();
    }

    // EstruturaSequencial;//Criar um algoritmo que leia dois números inteiros e
    // apresente na tela o resto da divisão do primeiro pelo segundo número.
    public void ex4() {

        Integer num1, num2;

        System.out.println("Informe o primeiro núemro:");
        num1 = scanner.nextInt();

        System.out.println("Informe o primeiro núemro:");
        num2 = scanner.nextInt();

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        scanner.close();
    }

    // Criar um algoritmo que leia a idade de uma pessoa expressa em anos e
    // apresente na tela esta idade expressa em meses e dias.
    public void ex5() {

        int anos, meses, dias;

        System.out.println("Informe sua idade em anos: ");
        anos = scanner.nextInt();

        meses = anos * 12;
        dias = anos * 360;

        System.out.printf("Idade em dias: %d\nIdade em meses: %d\nIdade em anos: %d\n", dias, meses, anos);
        scanner.close();
    }

    // Criar um algoritmo que leia a idade de uma pessoa expressa em anos, mês e
    // dias e apresente na tela a idade dessa pessoa expressa apenas em dias.
    // Considerar ano com 365 dias e mês com 30 dias
    public void ex6() {

        int anos, meses, dias;
        System.out.println("Informe sua idade");
        System.out.println("Anos: ");
        anos = scanner.nextInt();
        System.out.println("Meses: ");
        meses = scanner.nextInt();
        System.out.println("Dias: ");
        dias = scanner.nextInt();

        dias += (anos * 365) + (meses * 30);

        System.out.printf("Você tem %d dias de idade.", dias);

        scanner.close();
    }

    // Criar um algoritmo que leia a idade de uma pessoa expressa em dias e
    // apresente na tela a idade dessa pessoa expressa em anos, meses e dias.
    // Considerar ano com 365 dias e mês com 30 dias.
    public void ex7() {

        int idade, anos, meses, dias;
        System.out.println("Informe sua idade em dias: ");
        idade = scanner.nextInt();

        anos = idade / 365;
        meses = (idade % 365) / 30;
        dias = (idade % 365) % 30;

        System.out.printf("Você tem\n%d Anos\n%d Meses\n%d Dias\n", anos, meses, dias);
        scanner.close();
    }

    // Criar um algoritmo que receba uma determinada hora (hora e minutos separados)
    // e apresente na tela a hora em minutos.
    public void ex8() {

        int horas, min, totalmin;

        System.out.println("Informe as horas");
        System.out.println("Horas: ");
        horas = scanner.nextInt();
        System.out.println("Minutos: ");
        min = scanner.nextInt();

        totalmin = (horas * 60) + min;

        System.out.printf("%d h e %d min= %d minutos\n", horas, min, totalmin);

        scanner.close();
    }

    // Criar um algoritmo que leia o tempo de duração de um evento em uma fábrica
    // expressa em segundos e apresente-o na tela expresso em horas, minutos e
    // segundos.
    public void ex9() {

        int totalseg, min, horas, seg;
        System.out.println("Informe a hora em segundos: ");
        totalseg = scanner.nextInt();

        horas = totalseg / 3600;
        min = (totalseg % 3600) / 60;
        seg = (totalseg % 3600) % 60;

        System.out.printf("%d Horas - %d Minutos - %d Segundos", horas, min, seg);

        scanner.close();
    }

    // Criar um algoritmo que leia uma velocidade fornecida em m/s (metros por
    // segundo) e apresente na tela a velocidade em km/h. Para efetuar a conversão,
    // multiplique o valor em m/s por 3.6.
    public void ex10() {

        double ms, km;
        System.out.println("Informe a velocidade em metros/s: ");
        ms = scanner.nextDouble();
        km = ms * 3.6;
        System.out.printf("%.2f M/s correspondem a %.2f Km/h", ms, km);
        scanner.close();
    }

    // Criar um algoritmo que leia uma distância e o total de litros de combustível
    // gasto por um automóvel para percorrê-la, calcule e apresente na tela o
    // consumo médio de combustível.
    public void ex11() {
        double dis, cons, media;

        System.out.println("Informe a distancia percorrida: ");
        dis = scanner.nextDouble();
        System.out.println("Informe o consumo de combustivel:");
        cons = scanner.nextDouble();
        media = dis / cons;
        System.out.printf("O consumo médio é %.2f litros de combustivel", media);
        scanner.close();
    }

    // Criar um algoritmo que receba o valor do salário de um funcionário e o valor
    // do salário mínimo e apresente na tela quantos salários mínimos ganha esse
    // funcionário.
    public void ex12() {

        double s, sm, qs;
        System.out.println("Informe o seu salario:");
        s = scanner.nextDouble();
        System.out.println("Informe o valor do salario minimo:");
        sm = scanner.nextDouble();
        qs = s / sm;
        System.out.printf("Você recebe %.2f salarios minimos", qs);
        scanner.close();
    }

    // Criar um algoritmo que receba três notas de um aluno e apresente na tela a
    // média aritmética entre essas notas.
    public void ex13() {

        double n1, n2, n3, m;
        System.out.println("Informe a primeira nota:");
        n1 = scanner.nextDouble();
        System.out.println("Informe a segunda nota:");
        n2 = scanner.nextDouble();
        System.out.println("Informe a terceira nota:");
        n3 = scanner.nextDouble();
        m = (n1 + n2 + n3) / 3;
        System.out.printf("A sua média é %.2f", m);

        scanner.close();
    }

    // Criar um programa que calcule e apresente na tela a área de um retângulo.
    // Fórmula: .
    public void ex14() {

        double b, h, a;
        System.out.println("Informe o tamanho da base");
        b = scanner.nextDouble();
        System.out.println("Informe a altura:");
        h = scanner.nextDouble();
        a = b * h;
        System.out.printf("A área do retangulo é %.2f", a);
        scanner.close();
    }

    // Criar um programa que calcule e apresenta na tela a área de um triângulo.
    // Fórmula: .
    public void ex15() {

        double b, h, a;
        System.out.println("Informe o tamanho da base");
        b = scanner.nextDouble();
        System.out.println("Informe a altura:");
        h = scanner.nextDouble();
        a = (b * h) / 2;
        System.out.printf("A área do triangulo é %.2f", a);
        scanner.close();
    }

    // Criar um algoritmo que calcule e apresente na tela o volume de uma esfera de
    // raio R, em que R é um dado fornecido pelo usuário. O volume de uma esfera é
    // dado por .
    public void ex16() {

        double r, v;
        System.out.println("Informe o raio:");
        r = scanner.nextDouble();
        v = 4 / 3 * Math.PI * Math.pow(r, 3.0);
        System.out.printf("O volume é: %.2f", v);

        scanner.close();
    }

    // Criar um algoritmo que calcule e apresente na tela a área de um trapézio.
    // Fórmula: .
    public void ex17() {

        double bma, bme, h, a;
        System.out.println("Informe a base menor:");
        bme = scanner.nextDouble();
        System.out.println("Informe a base maior:");
        bma = scanner.nextDouble();
        System.out.println("Informe a altura:");
        h = scanner.nextDouble();
        a = ((bme + bma) * h) / 2;
        System.out.printf("A area é %.2f", a);

        scanner.close();
    }

    // Criar um algoritmo que calcule e apresente na tela o volume de uma caixa
    // retangular, utilizando a fórmula: .
    public void ex18() {

        double c, l, a, v;
        System.out.println("Informe o comprimento:");
        c = scanner.nextDouble();
        System.out.println("Informe a largura:");
        l = scanner.nextDouble();
        System.out.println("Informe a altura:");
        a = scanner.nextDouble();
        v = c * l * a;
        System.out.printf("O volume é %.2f", v);
        scanner.close();
    }

    // Criar um algoritmo que lê dois números, a base e o expoente, e imprime a
    // potência (base elevada ao expoente). Dica: use a função matemática
    // ​Math.pow()​. Exemplo: 5 elevado ao cubo ficaria Math.pow(5, 3) ​. Você pode
    // trocar esses números por variáveis.
    public void ex19() {

        double base, expo, potencia;

        System.out.println("Informe a base:");
        base = scanner.nextDouble();
        System.out.println("Informe o expoente:");
        expo = scanner.nextDouble();
        potencia = Math.pow(base, expo);
        System.out.printf("A potencia é %.2f", potencia);

        scanner.close();
    }

    // Criar um algoritmo que lê dois números e imprime a soma dos quadrados dos
    // dois números. O quadrado de um número A é representado por .
    public void ex20() {
        double num1, num2, soma;

        System.out.println("Informe o primeiro numero:");
        num1 = Math.pow(scanner.nextDouble(), 2);
        System.out.println("Informe o segundo numero:");
        num2 = Math.pow(scanner.nextDouble(), 2);
        soma = num1 + num2;
        System.out.printf("A soma dos quadrados é: %.2f", soma);
        scanner.close();
    }

    // Criar um algoritmo que apresenta o valor da conversão em real (R$) de um
    // valor lido em dólar (US$). O algoritmo deve solicitar o valor da cotação do
    // dólar e também a quantidade de dólares disponível com o usuário.

    public void ex21() {
        double qd, cot, re;

        System.out.println("Informe a quantidade de dolares:$ ");
        qd = scanner.nextDouble();
        System.out.println("Informe a cotação do dolar:R$ ");
        cot = scanner.nextDouble();
        re = qd * cot;
        System.out.printf("$ %.2f = R$ %.2f", qd, re);
        scanner.close();
    }

    // Criar um algoritmo que leia três valores inteiros e apresente na tela o valor
    // da soma dos quadrados dos três valores lidos.
    public void ex22() {
        double num1, num2, num3, soma;

        System.out.println("Informe o primeiro numero:");
        num1 = Math.pow(scanner.nextDouble(), 2);
        System.out.println("Informe o segundo numero:");
        num2 = Math.pow(scanner.nextDouble(), 2);
        System.out.println("Informe o terceiro numero:");
        num3 = Math.pow(scanner.nextDouble(), 2);
        soma = num1 + num2 + num3;
        System.out.printf("A soma dos quadrados é: %.2f", soma);
        scanner.close();
    }

    // Criar um algoritmo que leia os dias letivos de uma instituição qualquer,
    // calcule e apresenta na tela a quantidade máxima de faltas que um aluno pode
    // possuir. Um aluno pode faltar até 25% dos dias letivos.

    public void ex23() {
        double dl, qf;

        System.out.println("Informe a quantidade de dias letivos:");
        dl = scanner.nextDouble();
        qf = dl + (dl * 0.25) - dl;
        System.out.printf("Você pode ter %.0f faltas", qf);
        scanner.close();
    }

    // Criar um algoritmo que leia o valor correspondente ao salário mensal de um
    // trabalhador e também o valor do percentual de reajuste a ser atribuído ao
    // salário. Apresente na tela o valor do novo salário.
    public void ex24() {
        double sb, rea, ns;

        System.out.println("Informe o seu salario R$ ");
        sb = scanner.nextDouble();
        System.out.println("Informe o percentual de reajuste %");
        rea = scanner.nextDouble();
        ns = sb + (sb * (rea / 100));
        System.out.printf("Seu salario reajustado é R$ %.2f", ns);
        scanner.close();
    }

    // Criar um algoritmo que leia a metragem (altura e base) de um muro e o valor
    // do metro quadrado cobrado pelo pedreiro, calcule e apresente na tela o custo
    // da mão-de-obra para levantá-lo.
    public void ex25() {
        Double h, b, obra, total;

        System.out.println("Informe a altura do muro:");
        h = scanner.nextDouble();
        System.out.println("Informe a base do muro:");
        b = scanner.nextDouble();
        System.out.println("Informe o valor da mão de obra:");
        obra = scanner.nextDouble();
        total = (h * b) * obra;
        System.out.printf("O total da mão de obra sera R$ %.2f", total);

        scanner.close();
    }

    // Sabe-se que de carpete custa R$ 35,00. Criar um algoritmo que leia o
    // comprimento e a largura de uma sala, em metros, calcule e apresente na tela o
    // valor que será gasto para forrar todo o seu piso.
    public void ex26() {
        double comprimento, largura, total;

        System.out.println("Informe o comprimento da sala:");
        comprimento = scanner.nextDouble();
        System.out.println("Informe a largura da sala:");
        largura = scanner.nextDouble();
        total = (largura * comprimento) * 35.00;
        System.out.printf("O total gato para forrar todo o piso sera R$ %.2f", total);
        scanner.close();
    }

    // O custo ao consumidor, de um carro novo, é a soma do custo de fábrica com a
    // porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
    // Supondo que a porcentagem do distribuidor seja de 28% e os impostos de 45%,
    // criar um algoritmo que leia o custo de fábrica de um carro e apresenta na
    // tela o custo final ao consumidor.
    public void ex27() {

        double vcarro, total;
        System.out.println("Informe o valor de fabrica do carro:");
        vcarro = scanner.nextDouble();
        total = vcarro + (vcarro * 0.73);
        System.out.printf("O valor final do carro é de R$ %.2f", total);

        scanner.close();
    }

    // Uma revendedora de carros usados paga a seus funcionários vendedores, um
    // salário fixo por mês, mais uma comissão em reais também fixa para cada carro
    // vendido e mais 5% do valor das vendas por ele efetuadas. Criar um algoritmo
    // que leia o número de carros por ele vendidos, o valor total de suas vendas, o
    // salário fixo e o valor que recebe por carro vendido, calcule e apresente na
    // tela o salário mensal do vendedor.vendedor
    public void ex28() {
        double quantVenda, vTotal, vVenda, salarioF, comi, salarioM;

        System.out.println("Informe o salario fixo do funcionario:");
        salarioF = scanner.nextDouble();
        System.out.println("Informe a comissão por carro vendido:");
        comi = scanner.nextDouble();
        System.out.println("Informe a quantidade de carros vendidos:");
        quantVenda = scanner.nextDouble();
        System.out.println("Informe o valor da venda:");
        vVenda = scanner.nextDouble();
        vTotal = vVenda * quantVenda;
        salarioM = salarioF + (vTotal * 0.05) + comi;
        System.out.printf("O salario mensal do funcionario é R$ %.2f", salarioM);

        scanner.close();
    }

    // Uma conta telefônica é composta dos seguintes custos:
    // Assinatura ==> R$ 17,90;
    // Minutos Chamada Local ==> R$ 0,04 por minuto;
    // Minutos Chamada Celular ==> R$0,20 por minuto;
    // Interurbanos.
    // Criar um algoritmo que calcule o valor total a ser pago sabendo será
    // fornecida a quantidade de impulsos e de chamadas para celular. O valor gasto
    // em interurbanos foi de R$ 34,29. Apresentar na tela os custos e o valor total
    // a ser pago.
    public void ex29() {
        Double minutoL, minutoC, total;

        System.out.println("Informe os minutos em chamada local:");
        minutoL = scanner.nextDouble() * 0.04;
        System.out.println("Informe os minutos em chamada pra celular:");
        minutoC = scanner.nextDouble() * 0.20;
        total = 17.90 + minutoL + minutoC + 34.29;
        System.out.printf("O total da fatura a ser pago é R$ %.2f", total);

        scanner.close();
    }

    // Criar um algoritmo que efetue o cálculo da quantidade de litros de
    // combustível gastos em uma viagem, utilizando-se um automóvel que faz 12 Km
    // por litro. Para realizar o cálculo, o algoritmo deve ler o tempo gasto na
    // viagem e a velocidade média durante a mesma. Desta forma, será possível obter
    // a distância percorrida com a fórmula: . Tendo o valor da distância, basta
    // calcular a quantidade de litros de combustível utilizada na viagem com a
    // fórmula: . O algoritmo deve apresentar na tela os valores de velocidade
    // média, tempo gasto na viagem, à distância percorrida e a quantidade de litros
    // utilizados na viagem.viagem
    public void ex30() {
        double tempo, velocidade, distancia, litrosUsados;

        System.out.println("informe a velocidade media durante a viagem:");
        velocidade = scanner.nextDouble();
        System.out.println("Informe o tempo gasto na viagem:");
        tempo = scanner.nextDouble();
        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;
        System.out.printf(
                "Velocidade media da viagem: %.2f Km/h\nTempo gasto: %.2f Horas/Min\nDistancia percorrida: %.2f Km\nQuantidade de combustivel consumida: %.2f Litros",
                velocidade, tempo, distancia, litrosUsados);
        scanner.close();
    }

    // Criar um algoritmo que leia um valor L e calcula a área de um quadrado de
    // lado L
    public void ex31() {
        double lado, area;
        System.out.println("Informe o valor do lado do quadrado:");
        lado = scanner.nextDouble();
        area = lado * lado;
        System.out.printf("A area do quadrado é %.2f", area);
    }

    // Criar um algoritmo que leia três números decimais: A, B e C. Em seguida,
    // calcule e mostre:
    // a área do triângulo retângulo que tem A por base e C por altura.
    // a área do círculo de raio C. (π = 3.14159).
    // a área do trapézio que tem A e B por bases e C por altura.
    // a área do quadrado que tem lado B.
    // a área do retângulo que tem lados A e B.
    // o perímetro do retângulo que tem lados A e B.
    public void ex32() {
        double a, b, c, triangulo, circulo, trapezio, quadrado, retanguloA, retanguloP;
        System.out.println("Informe o valor A:");
        a = scanner.nextDouble();
        System.out.println("Informe o valor B:");
        b = scanner.nextDouble();
        System.out.println("Informe o valor C:");
        c = scanner.nextDouble();

        triangulo = (a * c) / 2;
        System.out.printf("Área do triangulo retangulo = %.2f\n", triangulo);

        circulo = Math.PI * (Math.pow(c, 2));
        System.out.printf("Área do circulo = %.2f\n", circulo);

        trapezio = ((a + b) * c) / 2;
        System.out.printf("Área do trapezio= %.2f\n", trapezio);

        quadrado = b * b;
        System.out.printf("Área do quadrado = %.2f\n", quadrado);

        retanguloA = a * b;
        System.out.printf("Área do retangulo = %.2f\n", retanguloA);

        retanguloP = (a + b) * 2;
        System.out.printf("Perimetro do retangulo  = %.2f\n", retanguloP);

    }

    // Criar um algoritmo que leia os dois lados ​A e ​B de um triângulo retângulo e calcula a hipotenusa do triângulo. Para esse caso, considere que hipotenusa =   . Dica: nesse programa, você deve usar a função matemática ​Math.sqrt() ​.
    public void ex33(){
        double a,b,h;
        System.out.println("Informe o tamanho de A:");
        a = Math.pow(scanner.nextDouble(),2);
        System.out.println("Informe o tamanho de B:");
        b = Math.pow(scanner.nextDouble(),2);
        h = Math.sqrt(a+b);
        System.out.printf("A hipotenusa do triangulo é: %.2f",h);
    }

    // Criar um algoritmo que leia quatro números e imprime a ​média aritmética​ dos quatro números.
    public void ex34(){
        double n1,n2,n3,n4,media;
        System.out.println("Informe o primeiro número:");
        n1 = scanner.nextDouble();
        System.out.println("Informe o segundo número:");
        n2 = scanner.nextDouble();
        System.out.println("Informe o terceiro número:");
        n3 = scanner.nextDouble();
        System.out.println("Informe o quarto número:");
        n4 = scanner.nextDouble();
        media = (n1+n2+n3+n4) / 4;
        System.out.printf("A média entre os números é: %.2f",media);
    }

    // Criar um algoritmo que leia o número de cadastro de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre na tela o número de cadastro e o salário do funcionário.
    public void ex35(){
        double numCad, ht, vh, s;
        System.out.println("Informe o numero de cadastro");
        numCad = scanner.nextDouble();
        System.out.println("Informe as horas trabalhadas:");
        ht = scanner.nextDouble();
        System.out.println("Infome o valor da hora trabalhada:");
        vh = scanner.nextDouble();
        s = ht * vh;
        System.out.printf("Numero de cadastro: %.0f\nSalario: R$ %.2f",numCad,s);
    }

    // Criar um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e imprimir o total a receber no final do mês
    public void ex36(){
        String nome;
        double sf,tv,s;
        System.out.println("Informe o nome do vendedor:");
        nome = scanner.nextLine();
        System.out.println("Informe o salario fixo:");
        sf = scanner.nextDouble();
        System.out.println("Informe o total de vendas:");
        tv = scanner.nextDouble();
        s = sf +(tv * 0.15);
        System.out.printf("Vendedor: %s\nSalario: R$ %.2f",nome,s);
    }

}