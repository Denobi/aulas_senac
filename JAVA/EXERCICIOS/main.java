
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {
    static ArrayList<Integer> primos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();
    public static void main(String[] args) {
        //ex1(); //soma
        //ex2(); //area circulo
        //ex3(); //diferença de numeros
        //ex4(); //ganho por hora
        //ex5(); //mercado de peças
        //ex6(); //areas das formas
        //ex7(); //horas
        //ex8(); //possitivo ou negativo
        //ex9(); //impar ou par
        //ex10(); //multiplo ou não multiplo
        //ex11(); //hora inicial e final do jogo
        //ex12(); //código preço dos produtos
        //ex13(); //intervalo de numeros
        //ex14(); //grafico x y
        //ex15(); //imposto
        //ex16(); //o maior numero
        //ex17(); //se o terceiro é maior
        //ex18(); //nota e classificação
        //ex19(); //o valor tres não está entre outro valor
        //ex20(); //altura e peso M F
        //ex21(); //salario bonificação
        //ex22(); //IMC
        //ex23(); //Triangulos
        //ex24(); //mini calculadora
        //ex25(); //horas jogadas
        //ex26(); // media com recuperação
        //ex27(); //premio
        //ex28(); //senha
        //ex29(); //plano cartesiano
        //ex30(); //posto de gasolina
        //ex31(); //soma teste for
        //ex32(); //impares for
        //ex33(); //in out 10, 20
        //ex34(); //media ponderada 
        //ex35(); //divisão tres conjuntos
        //ex36(); //fatorial
        //ex37(); //divisiveis for
        //ex38(); //tabela for
        //lista três
        //ex39(); //divisiveis por tres
        //ex40(); //multiplos de 10
        //ex41(100); //soma até 100
        //ex42(); //soma até número definido 
        //ex43(1, 15);
        //ex44();
        //ex45();
        //ex46();
        //ex47();
        //ex48();
        //ex49();
        //ex50();
        //ex51();
        //ex52();
        //estudos array
        //ex53();
        //ex54();
        //ex55();
        //ex56();
        //ex57();
        //ex58();
        //ex59();
        //ex60();
        //ex61();
        //ex62();
        //ex63(); //exercicios array
        //ex64();
        //ex65();
        //ex66();
        //ex67();
        //ex68();
        //ex69();
        //ex70();
        //ex71();
        //ex72();
        //ex73();
        //ex74();
        //ex75();
        

    }
    public static void ex1() {
        int valor, valor2, soma;
        System.out.println("Digite dois valores para soma: ");
        valor = sc.nextInt();
        valor2 = sc.nextInt();

        soma = valor + valor2;
        System.out.println("O valor da sua soma é: " +soma);
    }
//-------------------------------------------------------------------------
    public static void ex2() {
        double  raio, area;
        System.out.println("Digite o valor do raio; ");
        raio = sc.nextDouble();
        area = Math.PI * raio * raio;

        System.out.println("A area do circulo é: " +area);
    }
// ------------------------------------------------------------------------
    public static void ex3() {
        int A, B, C, D, diferença;
        

        System.out.println("Informe os 4 valores: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferença = A * B - C * D;

        System.out.println("A diferença dos valores citados é de: " +diferença);
    }
// -----------------------------------------------------------------------------
    public static void ex4() {
        int horas, numero;
        double salario, valorHora;

        System.out.println("Digite o númeor do funcionario: ");
        numero = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        horas = sc.nextInt();

        System.out.println("Digite o valor que recebe por hora: ");
        valorHora = sc.nextDouble();

        salario = valorHora * horas;
        System.out.println("Número: " +numero);
        System.out.println("Salário: " +salario);
}
// ---------------------------------------------------------------------------------
    public static void ex5() {
        int numPeça1, qttPeça1,numPeça2, qttPeça2;
        double valorPeça1, valorPeça2, valorTotal;

        System.out.println("Digite o código da peça 1: ");
        numPeça1 = sc.nextInt();

        System.out.println("Digite a quantidade da peça 1: ");
        qttPeça1 = sc.nextInt();

        System.out.println("Digite o valor unitário: ");
        valorPeça1 = sc.nextDouble();

        System.out.println("Digite o código da peça 2: ");
        numPeça2 = sc.nextInt();

        System.out.println("Digite a quantidade da peça 2:");
        qttPeça2 = sc.nextInt();

        System.out.println("Digite o valor unitário da peça 2: ");
        valorPeça2 = sc.nextDouble();

        valorTotal = valorPeça1 * qttPeça1 + qttPeça2 * valorPeça2;
        
        System.out.println("Valor a pagar: " +valorTotal);
        
    }
// ----------------------------------------------------------------------------------
    public static void ex6() {
        double A, B, C, areaTri, areaCir, areatra, areaqua, arearetan;

        System.out.println("Informe os três valores para cálculo: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTri = A * C / 2.0;
        areaCir = Math.PI * C * C;
        areatra = (A + B) / 2 * C;
        areaqua = B * B;
        arearetan = A * B;

        System.out.println("TRIANGULO: " + areaTri + "\n");
        System.out.println("CIRCULO: " + areaCir + "\n");
        System.out.println("TRAPEZIO: " + areatra + "\n");
        System.out.println("QUADRADO: " + areaqua + "\n");
        System.out.println("RETANGULO: " + arearetan + "\n");
    }
// ----------------------------------------------------------------------------------
    public static void ex7() {
        int hora;

       System.out.println("Que horas são?");
       hora = sc.nextInt();

       if (hora < 12) {
        System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
            } else {
                System.out.println("Boa noite!");
                }
       }
// ----------------------------------------------------------------------------------
       public static void ex8() {
        int valor;
        System.out.println("Digite um valor: ");
        valor = sc.nextInt();

        if (valor < 0) {
            System.out.println("Valor negativo");
            } else {
                System.out.println("Valor positivo");
            
        }
       }
// -----------------------------------------------------------------------------------
        public static void ex9() { 
            int valor;
            System.out.println("Digite um valor: ");
            valor = sc.nextInt();

            if (valor % 2 == 0) {
                System.out.println("PAR");
                } else {
                    System.out.println("IMPAR");
            }
    }
// --------------------------------------------------------------------------------------
    public static void ex10() {
        int A, B;
        System.out.println("Digite os valores: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println(" é múltiplo ");
        
         } else {
            System.out.println(" não é múltiplo ");
        }
    }
// ---------------------------------------------------------------------------------------
    public static void ex11() {
        int horain, horafin;
        System.out.println("Digite a hora inicial e final do jogo: ");
        horain = sc.nextInt();
        horafin = sc.nextInt();

        int duração;
        if (horain < horafin) {
            duração = horafin - horain;
        }
        else {
            duração = 24 - horain + horafin;
        }
        System.out.println("O jogo durou " + duração + " horas");
}
// -------------------------------------------------------------------------------------------
    public static void ex12(){
        double codigo, preço, qtt;
        
        System.out.println("Digite o código do produto que deseja: \n1 cachorro quente \n2 X salada \n3 X Bacon \n4 Torrada simples \n5 Refrigerante ");
        codigo = sc.nextDouble();

        if (codigo == 1) {
            System.out.println("Quantos itens deseja desse produto?");
            qtt = sc.nextDouble();
            preço = qtt * 4.0;
        
        } else if (codigo == 2) {
            System.out.println("Quantos itens deseja desse produto?");
            qtt = sc.nextDouble();
            preço = qtt * 4.5;
            
        } else if (codigo == 3) {
            System.out.println("Quantos itens deseja desse produto?");
            qtt = sc.nextDouble();
            preço = qtt * 5.0;
            
        } else if (codigo == 4) {
            System.out.println("Quantos itens deseja desse produto?");
            qtt = sc.nextDouble();
            preço = qtt * 2.0;
            
        } else {
            System.out.println("Quantos itens deseja desse produto?");
            qtt = sc.nextDouble();
            preço = qtt * 1.5;
        }
        System.out.println("O valor total é de R$" + preço);
    }
// ---------------------------------------------------------------------------------
    public static void ex13() {
        double numero;
        System.out.println("Digite um número: ");
        numero = sc.nextDouble();

        if (numero < 0 || numero > 100) {
            System.out.println("O número digitado está fora do intervalo");

        } else if (numero <= 25) {
            System.out.println("O número digitado está no intervalo de 0 a 25");
            
        } else if (numero <= 50){
            System.out.println("O número digitado está no intervalo de 25 a 50");

        } else if (numero <= 75) {
            System.out.println("O número digitado está no intervalo de 50 a 75");
            
        } else {
            System.out.println("O número digitado está no intervalo de 75 a 100");
        }
    }
// ----------------------------------------------------------------------------------
    public static void ex14() {
        double X, Y;
        
        System.out.println("Informe os valores que deseja saber a origem");
        X = sc.nextDouble();
        Y = sc.nextDouble();

        if (X > 0 && Y > 0) {
            System.out.println("O valor se encontra no ponto Q1");

        } else if (X < 0 && Y > 0) {
            System.out.println("O valor se encontra no ponto Q2");

        } else if (X < 0 && Y < 0) {
            System.out.println("O valor se encontra no ponto Q3");

        } else if (X > 0 && Y < 0) {
            System.out.println("O valor se encontra no ponto Q4");
            
        } else {
            System.out.println("O valor se encontra no ponto de origem");
        }
    }
// ----------------------------------------------------------------------------
    public static void ex15 (){

        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
// ----------------------------------------------------------------------------------------
    public static void ex16 () { 
        int numero1, numero2;

        System.out.println("Informe dois numeros: ");
        numero1 = sc.nextInt(); 
        numero2 = sc.nextInt();

        if (numero1 < numero2) {
            System.out.println("O número dois é maior");
        } else if (numero1 > numero2) {
            System.out.println("O número um é maior");
        } else
        System.out.println("Os números são iguais");    
    }
// ------------------------------------------------------------------------------------------
    public static void ex17() {
        int numero1, numero2, numero3;
        System.out.println("Informe três números: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();
        
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println("O número um é o menor");
            } else if (numero2 < numero1 && numero2 < numero3) {
                System.out.println("O número dois é o menor");
                } else
                System.out.println("O número três é o menor");
                
    }
// -------------------------------------------------------------------------------------------
    public static void ex18() {
        String nomeA, classificação;
        int nota1, nota2, nota3, nota4;
        double media;

        System.out.println("Informe o nome do aluno");
        nomeA = sc.next();
            System.out.println("Informe as quatro notas do aluno");
            nota1 = sc.nextInt();
            nota2 = sc.nextInt();
            nota3 = sc.nextInt();
            nota4 = sc.nextInt();

            media = (nota1 + nota2 + nota3 + nota4) / 4;
            if (media < 20 ) {
                classificação = "Péssimo";
            
            } else if (media > 20 && media < 40) {
                classificação = "Ruim";
                
            } else if (media > 40 && media < 60) {
                classificação = "Regular";

            } else if (media > 60 && media < 80) {
                classificação = "Bom";
                
            } else {
                classificação = "Ótimo";
            }
            System.out.println("O aluno " + nomeA + " obteve a média " + media + " e está classificado como "  +classificação);
    }
// --------------------------------------------------------------------------------------------------------------
    public static void ex19() {
        int valor1, valor2, valor3;
        System.out.println("Informe três valores: ");
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();

        if (valor1 > valor2 && valor1 < valor3) {
            System.out.println("O valor 3 não está ente os dois primeiros");
            
        } else if (valor2 > valor1 && valor2 < valor3) {
            System.out.println("O valor 3 não está ente os dois primeiros");

            
        } else {
            System.out.println("O valor 3 está ente os dois primeiros");
        }
        
    }
// ------------------------------------------------------------------------------------------------------------------
    public static void ex20() {
        double altura, peso;
        String sexo;

        System.out.println("Informe o Sexo (F feminino, M masculino):");
        sexo = sc.next();
        System.out.println("Informe a Altura (Informe em centímetros):");
        altura = sc.nextDouble();


        if (sexo == ("M")) {
            peso =  52 + (0.75 * (altura - 152.4));

        } else if (sexo == ("F"));
            peso = 52 + (0.67 * (altura - 152.4));

            System.out.printf("O peso ideal para %s é %.2f.", sexo, peso);
                    }
// ---------------------------------------------------------------------------------------------------------------------
    public static void ex21() {
        double salario, nvsalario, bonificação, auxilioesc;
        
        System.out.println("Informe o salário atual: ");
        salario = sc.nextDouble();

        if (salario <= 2000.00) {
            bonificação = salario * 0.10;
        
        } else if (salario <= 3000.00) {
            bonificação = salario * 0.8;

        } else {
            bonificação = salario * 0.05;
            
        }
         if (salario <= 2500.00) {
            auxilioesc = 350.00;
         } else {
            auxilioesc = 300.00;
         }        
         nvsalario = salario + bonificação + auxilioesc;
         System.out.printf("O novo salário é %.2f", nvsalario);
    }
// -------------------------------------------------------------------------------------------------------------------------
    public static void ex22() {
        double peso, altura, IMC;
        String classificação;
        System.out.println("Informe o peso: ");
        peso = sc.nextDouble();
        System.out.println("Informe a altura: ");
        altura = sc.nextDouble();
        altura = altura / 100;
        IMC = peso / (altura * altura);

        if (peso <= 16) {
            classificação = "Magreza Severa";

            } else if (IMC >= 16 && IMC <= 17) {
                classificação = "Magreza Moderada";
                
                } else if (IMC >= 17 && IMC <= 18.5) {
                    classificação = "Magreza leve";
                    
                    } else if (IMC >= 18.5 && IMC <= 25) {
                        classificação = "Normal";
                    
                        } else if (IMC >= 25 && IMC <= 30) {
                            classificação = "Obesidade leve";
                            
                            } else if (IMC >= 30 && IMC <= 40) {
                                classificação = "Obesidade Severa";
                                
                                } else {
                                    classificação = "Obesidade Mórbida";
                                } 
                                System.out.println(" a classificação é: " +classificação);
        
    }
// ------------------------------------------------------------------------------------------------------
    public static void ex23() {
        int X, Y, Z;
        String tipo="";
        System.out.println("Informe o valor de X: ");
        X = sc.nextInt();
        System.out.println("Informe o valor de Y: ");
        Y = sc.nextInt();
        System.out.println("Informe o valor de Z: ");
        Z = sc.nextInt();

        if (X + Y > Z) {
            if (X == Y && Y == Z && X == Z) {
                tipo = "Triângulo Equilátero";
            } else if (X == Y || X == Z || Y == Z) {
                tipo ="Triângulo Isósceles";
            } else if (X != Y && Y != Z && X != Z) {
                tipo = "Triângulo Escaleno";
            }
            System.out.printf("O tipo do triangulo é: "  +tipo);

        } else {
            System.out.println("Não é um triângulo");
        }
    }   
// ----------------------------------------------------------------------------------------------------------------
    public static void ex24() {
        int opção;
        System.out.println("****Menu de opções****");
        System.out.println("1. Somar dois números \n2 Raiz quadrada de um número \n3 Elevar um número a uma potência");
        System.out.println("****Digite a opção desejada****");
        opção = sc.nextInt();

        if (opção == 1) {
            System.out.println("Informe o primeiro número: ");  
            int n1 = sc.nextInt();
            System.out.println("Informe o segundo número: ");
            int n2 = sc.nextInt();
            System.out.println("A soma dos números é: " + (n1 + n2));
        } else if (opção == 2) {
            System.out.println("Informe o número: ");
            int n1 = sc.nextInt();
            System.out.println("A raiz quadrada do número é: " + Math.sqrt(n1));
        } else if (opção == 3) {
            System.out.println("Informe o número: ");
            int n1 = sc.nextInt();
            System.out.println("Informe a potência: ");
            int n2 = sc.nextInt();
            System.out.println("O número elevado a potência é: " + Math.pow(n1, n2));
            
        } else
        System.out.println("Opção inválida");
            
        }
// --------------------------------------------------------------------------------------------------
        public static void ex25() {
            int horain, horafin, minutoin, minutofin;
            int duraçaohora, duraçaominuto;
            System.out.println("Informe a hora de início (hora e minuto): ");
            horain = sc.nextInt();
            minutoin = sc.nextInt();
            System.out.println("Informe a hora de fim (hora e minuto): ");
            horafin = sc.nextInt();
            minutofin = sc.nextInt();

            if (horafin < horain) {
                horafin += 24;
            } duraçaohora = horafin - horain;
            duraçaominuto = minutofin - minutoin;
            if (duraçaominuto < 0) {
                duraçaominuto += 60;
                duraçaohora--;
                
            } 
            System.out.println("A duração é: " + duraçaohora + " horas e " + duraçaominuto + " minutos");
} 
// -------------------------------------------------------------------------------------------------------
        public static void ex26() {
            int n1, n2, n3, media, recuperaçao, novamed;
            System.out.println("Informe as notas: ");
            n1 = sc.nextInt();
            n2 = sc.nextInt();  
            n3 = sc.nextInt();
            media = (n1 + n2 + n3) / 3;
            if (media >= 6) {
                System.out.println("Aprovado");
            
        } else if (media < 5) {
                System.out.println("Reprovado");
        } else if (media > 5 && media < 6) {
            System.out.println("Recuperação");
            System.out.println("Insira a nota da recuperação: ");
            recuperaçao = sc.nextInt();
            novamed = (media + recuperaçao) / 2;
            if (novamed >= 6) {
                System.out.println("Aprovado");
                } else {
                    System.out.println("Reprovado");
                    }
        }
        
    }
// ---------------------------------------------------------------------------------------------------------
    public static void ex27() {
        int n1, n2, n3, n4, aulas, presenças;
        double media;
        boolean premioex, premiocam, premiosque, premiocan;
        System.out.println("Informe as notas: ");   
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        n4 = sc.nextInt();
        System.out.println("Informe o número de aulas: ");
        aulas = sc.nextInt();
        System.out.println("Informe o número de presenças: ");
        presenças = sc.nextInt();
        media = (n1 + n2 + n3 + n4) / 4;
        premioex = media > 80 && presenças == aulas;
        premiocam = media > 80 || presenças  == aulas;
        premiosque = media >= 70 && media <= 80 && presenças >= 0.9 * aulas;
        premiocan = (media >= 70 && media <= 80) || presenças >= 0.9 * aulas;
        if (premioex) {
            System.out.println("Premiado com excursão");
    }
    if (premiocam) {    
        System.out.println("Premiado com camiseta");
        }
        if (premiosque) {
            System.out.println("Premiado com squeeze");
            }
            if (premiocan) {    
                System.out.println("Premiado com caneta");
                }
                if (!premioex &&!premiocam &&! premiosque &&! premiocan) {
                    System.out.println("O aluno não ganhou nenhum prêmio");
                }
                }
// ----------------------------------------------------------------------------------------
    public static void ex28() {
        int senha;
        System.out.println("Informe a senha: ");
        senha = sc.nextInt();

        while (senha != 5093) {
            System.out.println("Senha inválida. Tente novamente: ");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
    }
// -----------------------------------------------------------------------------
    public static void ex29() {
        int X, Y;
        System.out.println("Informe as coordenadas X e Y");
        X = sc.nextInt();
        Y = sc.nextInt();

        
        while (X != 0 && Y != 0 ) {
            if (X > 0 && Y > 0) {
                
                System.out.println("Primeiro");
            
            } else if (X < 0 && Y > 0) {  
                System.out.println("Segundo");
            
            } else if (X < 0 && Y < 0) {
                System.out.println("Terceiro");
            
            } else {
            System.out.println("Quarto");
        }
        X = sc.nextInt();
        Y = sc.nextInt();

    }   
    
    
    }
// ----------------------------------------------------------------------------------------
    public static void ex30(){
        int alcool = 0, gasolina = 0, diesel = 0, tipo;
        System.out.println("Informe o tipo de combustível que mais prefere: ");
        System.out.println("1 - Álcool");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Fim");
        tipo = sc.nextInt();

        
        while (tipo != 4) {
            if (tipo == 1) {
                alcool = alcool + 1;
            
            } else if (tipo == 2) {
                gasolina = gasolina + 1;
                
            } else  if (tipo == 3) {
                diesel = diesel + 1;
            }
            
            tipo = sc.nextInt();
        }
        System.out.println("Muito obrigado");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        }
// -----------------------------------------------------------------------------------------------
    public static void ex31(){
        int N;
        System.out.println("Informe um número inteiro: ");
        N = sc.nextInt();
        int soma = 0;
        for (int i=0; i<6; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }
        System.out.println("Soma: " + soma);
    }
// -----------------------------------------------------------------------------------------------
    public static void ex32() {
       int x;
       System.out.println("Informe um número inteiro: ");
       x = sc.nextInt();
       
       for (int i=1; i<=x; i++){
         if (i % 2 != 0) {
            System.out.println(i);
         }
         
        }
    
    }
// -------------------------------------------------------------------------------------------------
    public static void ex33() {
        int N;
        System.out.println("Informe um número inteiro: ");
        N = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            if (x <= 20 && x >= 10) {
                in = in + 1;
                } else {
                    out = out + 1;
                
            }

        }
        System.out.println("Dentro: " + in);
        System.out.println("Fora: " + out);
    }
// -----------------------------------------------------------------------------------------------------
    public static void ex34() {
        int n;
        double a, b, c;
        System.out.println("Informe o número de notas do aluno: ");
        n = sc.nextInt();
        

        for (int i =0; i <n; i++){
            System.out.println("Informe quais são as notas: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;
            
            System.out.println("Média: " + media);
        }

    }
// -------------------------------------------------------------------------------------------------------
    public static void ex35() {
        int n;
        int num1, num2, divi;
        System.out.println("Informe o número de pares de números: ");
        n = sc.nextInt();

        for (int i = 0; i<n; i++){
            System.out.println("Informe os pares de números: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            
            if (num2 == 0) {
                System.out.println("Divisão impossível!");
                
            } else {
                divi = num1 / num2;
            System.out.println("Divisão: " + divi);
            }
            

        }

    }
// ---------------------------------------------------------------------------------------------------------
    public static void ex36() {
        int n;
        System.out.println("Informe o número do fatorial que deseja: ");
        n = sc.nextInt();
        int fatorial =  1;
        for (int i = 1; i<=n; i++){
            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
    }
// -------------------------------------------------------------------------------------------------------
    public static void ex37() {
        int n;
        System.out.println("Informe o número que deseja: ");
        n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            if (n % i == 0) {
                System.out.println(i);
                
            }

        }
    }
-------------------------------------------------------------
    public static void ex38(String[] args) {
        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            int pri = i;
            int seg = i*i;
            int ter = i * i * i;
            System.out.println(pri + " " + seg + " " + ter);

        }
    }
------------------------------------------------------------
    public static void ex39() {
        for (int i = 50; i<=9500; i++){
            if (i % 3 == 0) {
                System.out.println(i);
                
            } 
        }

    }
--------------------------------------------------------------
    public static void ex40() {
    for (int i = 1; i <= 250; i++){
        if (i % 10 == 0){
            System.out.println("São Multiplos " +i);

    }
    }
}
-----------------------------------------------------------------
    public static void ex41(int ate) {
        int valor = 0;
        for (int i = 0; i <= ate; i++){
            valor = i + valor;
            System.out.println("Soma dos números: " + valor);
        }
    
    }
-----------------------------------------------------------------
    public static void ex42() {
        int valor;
        System.out.println("Digite um valor ao qual deseja a soma: ");
        valor = sc.nextInt();
        ex41(valor);
    
    }
-----------------------------------------------------------------
    public static void ex43(int in, int tm) {
        int soma = 0, valor = 5 * in;
        for (int i = in; i <= tm; i++){
            soma += valor;
            valor += 5;
        }
        System.out.println(soma);
    }
    ---------------------------------------------------------------
    public static void ex44() {
        int in, tm;
        System.out.println("Digite o valor inicial: ");
        in = sc.nextInt();
        System.out.println("Digite o valor final: ");
        tm = sc.nextInt();
        ex43(in, tm);
    }
--------------------------------------------------------------------
    public static void ex46() {
        double salarioIn = 1000.00;
        double aumento = 0.015;
        for (int ano = 2011; ano <= 2024; ano++){
            salarioIn += salarioIn * aumento;
            aumento *= 2;
            System.out.println("Salário em " + ano + ": R$ " + salarioIn);
        }
    }
-------------------------------------------------------------------
    public static void ex47() {
        double salarioCarlos, salarioJoao, aplicacaoCarlos, aplicacaoJoao;
        System.out.println("Informe o salario do Carlos: ");
        salarioCarlos = sc.nextDouble();

        salarioJoao = salarioCarlos / 3.0;
        aplicacaoCarlos = salarioCarlos * 0.02;
        aplicacaoJoao = salarioJoao * 0.05;
        int mes = 0;

        while (aplicacaoCarlos > aplicacaoJoao){
            mes++;
            aplicacaoCarlos += aplicacaoCarlos * 0.02;
            aplicacaoJoao += aplicacaoJoao * 0.05;

        }
        System.out.println(mes);
    }
// -----------------------------------------------------------------------------------
    public static void ex48() {
     int somaPositivo;
     somaPositivo = 0;
     int somaNegati;
     somaNegati = 0;
     int num;
     while (true) {
        System.out.println("Informe um número (0 para sair): ");
        num = sc.nextInt();
        if (num == 0) {
            break;
            }
            if (num > 0) {
                somaPositivo += num;
                } else {
                    somaNegati += num;
                    }
                    }
                    System.out.println("Soma dos positivos: " + somaPositivo);
                    System.out.println("Soma dos negativos: " + somaNegati);

        
     }
    // ----------------------------------------------------------------------------------
    public static void ex49() {
        int nota;
        System.out.println("Informe a nota do aluno: ");
        nota = sc.nextInt();

        while (true) {
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Informe novamente: ");
                nota = sc.nextInt();
        } else {
            if (nota >=6) {
                System.out.println("Aprovado");
            } else {
                if (nota >= 5 || nota < 6) {
                    System.out.println("Recuperação");
           
                }
            }
        }
    }
    }
// ------------------------------------------------------------------------------------
    public static void ex50() {
        int opção;
        String classificação; 
        do {
            System.out.println("---- Menu de opções ----");
            System.out.println("1 - Imposto");
            System.out.println("2 - Novo salário");
            System.out.println("3 - Classificação");
            System.out.println("4 - Sair");
            opção = sc.nextInt();
    
            double salario, imposto, salarionv;
    
            switch (opção) {
                case 1:
                    System.out.println("Informe o salário: ");
                    salario = sc.nextDouble();
                    if (salario <= 1500) {
                        imposto = salario * 0.05;
                    } else if (salario > 1500 && salario <= 3000) {
                        imposto = salario * 0.10;
                    } else {
                        imposto = salario * 0.15;
                    }
                    System.out.printf("O imposto a ser pago é de %.2f%n", imposto);
                    break;
                case 2:
                    System.out.println("Informe salário do funcionário: ");
                    salario = sc.nextDouble();
                    if (salario > 4500) {
                        salarionv = salario + 250;
                    } else if (salario > 3000.01 && salario <= 4500) {
                        salarionv = salario + 200;
                    } else if (salario > 2000 && salario <= 3000) {
                        salarionv = salario + 150;
                    } else {
                        salarionv = salario + 130;
                    }
                    System.out.printf("O novo salário é de %.2f%n", salarionv);
                    break;
                case 3:
                    System.out.println("Informe salário do funcionário: ");
                    salario = sc.nextDouble();
                    if (salario > 3000) {
                        classificação = "A"; 
                    } else {
                        classificação = "B"; 
                    }
                    System.out.printf("A classificação é %s%n", classificação);
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o sistema!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        } while (opção != 4);
    }
// ---------------------------------------------------------------------------------------
    public static void ex51() {
        int n1 = 2; 
        int n2 = 7;
        int n3 = 3;
        int termos;
        System.out.println("Informe o numero de termos (4 ou mais)");
        termos = sc.nextInt();
        System.out.printf("%d, %d, %d", n1, n2, n3);
        for (int i = 4; i <= termos; i++) {
            n1 *= n2; 
            System.out.printf(", %d", n1);
            i++;
            if (i <= termos) {
                n2 = 3;
                System.out.printf(", %d", n2);
                i++;
                if (i <= termos) {
                    n3= 4;
                    System.out.printf(", %d", n3);
                }
            }
        }
    }
// --------------------------------------------------------------------------------------
    public static void ex52() {
        double idade, mdidade, peso, perc80, altura, medaltura = 0;
        int qt18 = 0, qt80 = 0;
        for (int time = 1; time <= 5; time++) {
            System.out.printf("Time %d%n", time);
            mdidade = 0;
            for (int jogd = 1; jogd <= 15; jogd++){
            System.out.printf("Jogador %d do time %d%n", jogd, time);
            idade = rand.nextInt(16, 30);
            mdidade += idade;
            if (idade < 18) {
                qt18++;
                
            }
            peso = rand.nextDouble(60, 100);
            if (peso > 80) {
                qt80++;
                }
                altura = rand.nextDouble(1.6, 2.0);
                medaltura += altura;
    }
    mdidade /=15;
    System.out.printf("media de idade do time %d = %f%n", time, mdidade);
    
}
System.out.printf("Jogadores com menos de 18 anos: %d%n", qt18);
medaltura /= 75;
System.out.printf("MÃ©dia de altura dos jogadores: %.2f%n", medaltura);
perc80 = qt80 / 75.0 * 100;
System.out.printf("Percentual de jogadores com +80Kg: %.2f", perc80);
}
// -----------------------------------------------------------------------------------
    public static void ex53() {
        int n;
        System.out.println("Informe quantidade de números que deseja digitar: ");
        n = sc.nextInt();

        int [] valores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Informe os valores: ");
            valores[i] = sc.nextInt();
            } for (int i = 0; i <n; i++) {
                if (valores[i] < 0) {
                    System.out.println("O valor " + valores[i] + " é negativo");
                    
                }
            }
}
// -----------------------------------------------------------------------------------
    public static void ex54() {
        int n;
        System.out.println("Informe quantidade de números que deseja digitar: ");
        n = sc.nextInt();

        int [] valores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Informe os valores: ");
            valores[i] = sc.nextInt();
    }
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += valores[i];
            System.out.println("Soma = " +soma);
        }
        int media = soma / n;
        System.out.println("Valores = ");
        for (int i = 0; i < n; i++) {
            System.out.print(valores[i] + " ");
            }
            System.out.println("\nMédia = " + media);
    
}
// --------------------------------------------------------------------------------
    public static void ex55() {
        int n, nmenores;
        double alturatotal, medaltura, pcMenores;
        System.out.println("Informe quantas pessoas serão digitadas: ");
        n = sc.nextInt();

        String [] nomes = new String[n];;
        int [] idades = new int[n]; 
        double [] altura = new double[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Informe os dados da pessoa\n", i+1);
            System.out.println("Informe o nome da pessoa: ");
            nomes[i] = sc.next();
            System.out.println("Informe a idade da pessoa: ");
            idades[i] = sc.nextInt();
            System.out.println("Informe a altura da pessoa: ");
            altura[i] = sc.nextDouble();

        }
        nmenores = 0;
        alturatotal = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                nmenores++;
            }
            alturatotal = alturatotal + altura[i];
    }
            medaltura = alturatotal / n;
            pcMenores = ((double) nmenores / n) * 100;
            System.out.printf("\nAltura media: " +medaltura);
            System.out.printf("\nPessoas com menos de 16 anos: \n" +pcMenores);

            for (int i = 0; i<n; i++) {
                if (idades[i] < 16) {
                    System.out.printf("%s", nomes[i]);
                    
                }
            }
                
            }
// -----------------------------------------------------------------------------------------
    public static void ex56() {
        int n, qtdpares;
        System.out.println("Informe quantos valores serão digitadas: ");
        n = sc.nextInt();
        int [] valor = new int [n];
        for (int i = 0; i < n; i++){
            System.out.println("Digite os números: ");
            valor[i] = sc.nextInt();
        }
        System.out.println("\nNúmeros pares");
        qtdpares = 0;

        for (int i = 0; i<n; i++){
            if (valor[i] % 2 == 0){
                System.out.println(valor[i]);
                qtdpares++;

        }
        
    }
    System.out.printf("\nQuantidade de números pares = %d\n", qtdpares);
}
// ---------------------------------------------------------------------------------------
    public static void ex57() {
        int n, maior, posmaior;
        System.out.println("Informe quantos valores serão digitadas: ");
        n = sc.nextInt();

        int [] valor = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Digite os números: ");
            valor[i] = sc.nextInt();
        }
        System.out.println("\nMaior valor: ");
        maior = valor[0];
        posmaior = 0;
        for (int i = 1; i<n; i++){
            if (valor[i] > maior){
                maior = valor[i];
                posmaior = i;
    }

}
        System.out.printf("MAIOR VALOR = %d\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
        
}
// -----------------------------------------------------------------------------------------
    public static void ex58() {
        int n;

	    System.out.print("Quantos valores vai ter cada vetor? ");
	    n = sc.nextInt();

	    int[] a = new int[n];
	    int[] b = new int[n];
	    int[] c = new int[n];

	    System.out.println("Digite os valores do vetor A:");

	    for (int i=0; i<n; i++) {
			a[i] = sc.nextInt();
	    }

	    System.out.println("Digite os valores do vetor B:");

	    for (int i=0; i<n; i++) {
	        b[i] = sc.nextInt();
	    }

	    for (int i=0; i<n; i++) {
	        c[i] = a[i] + b[i];
	    }

	    System.out.println("VETOR RESULTANTE:");

	    for (int i=0; i<n; i++) {
	    	System.out.printf("%d\n", c[i]);
	    }

		sc.close();
	}
// ----------------------------------------------------------------------------------------
    public static void ex59() {
        int n, somapares = 0, npares = 0;
	    double mediapares;

	    System.out.print("Quantos elementos vai ter o vetor? ");
	    n = sc.nextInt();

	    int[] vetor = new int[n];

	    for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        vetor[i] = sc.nextInt();
	    }

	    for (int i=0; i<n; i++) {
	        if (vetor[i] % 2 == 0) {
	            somapares = somapares + vetor[i];
	            npares++;
	        }
	    }

	    if (npares == 0) {
	    	System.out.println("NENHUM NUMERO PAR");
	    }
	    else {
	        mediapares = (double)somapares / npares;

	        System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
	    }

		sc.close();
	}
// ------------------------------------------------------------------------------
    public static void ex60() {
        int n, maioridade, posicaomaior;

	    System.out.print("Quantas pessoas voce vai digitar? ");
	    n = sc.nextInt();

	    String[] nomes = new String[n];
	    int[] idades = new int[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
	    }

	    maioridade = idades[0];
	    posicaomaior = 0;

	    for (int i=1; i<n; i++) {
	        if (idades[i] > maioridade) {
	            maioridade = idades[i];
	            posicaomaior = i;
	        }
	    }

	    System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);

		sc.close();
	}
// -------------------------------------------------------------------------------------------------
    public static void ex61() {
        int n;
	    double media;

	    System.out.print("Quantos alunos serao digitados? ");
	    n = sc.nextInt();

	    String[] nomes = new String[n];
	    double[] notas1 = new double[n];
	    double[] notas2 = new double[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
	        sc.nextLine();
	        nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
	    }

	    System.out.println("Alunos aprovados:");

	    for (int i=0; i<n; i++) {
	        media = (notas1[i] + notas2[i]) / 2;

	        if(media >= 6.0) {
	            System.out.printf("%s\n", nomes[i]);
	        }
	    }

		sc.close();
	}
// -----------------------------------------------------------------------------------------------
    public static void ex62() {
        int n, qtdhomens, qtdmulheres;
	    double menoraltura, maioraltura, alturafemMedia, alturafemtotal;

	    System.out.print("Quantas pessoas serao digitadas? ");
	    n = sc.nextInt();

	    double[] alturas = new double[n];
	    char[] generos = new char[n];

	    for (int i=0; i<n; i++) {
	    	System.out.printf("Altura da %da pessoa: ", i + 1);
	        alturas[i] = sc.nextDouble();
	        System.out.printf("Genero da %da pessoa: ", i + 1);
	        generos[i] = sc.next().charAt(0);
	    }

	    menoraltura = alturas[0];
	    maioraltura = alturas[0];

	    for (int i=1; i<n; i++) {
	        if (alturas[i] > maioraltura) {
	            maioraltura = alturas[i];
	        }
	        if (alturas[i] < menoraltura) {
	            menoraltura = alturas[i];
	        }
	    }

		qtdhomens = 0;
		qtdmulheres = 0;
		alturafemtotal = 0;
	    for (int i=0; i<n; i++) {
	        if (generos[i]=='M') {
	            qtdhomens++;
	        }
	        else {
	            qtdmulheres++;
	            alturafemtotal = alturafemtotal + alturas[i];
	        }
	    }

	    alturafemMedia = alturafemtotal / qtdmulheres;

	    System.out.printf("Menor altura = %.2f\n", menoraltura);
	    System.out.printf("Maior altura = %.2f\n", maioraltura);
	    System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
	    System.out.printf("Numero de homens = %d\n", qtdhomens);

		sc.close();
	}
// -----------------------------------------------------------------------------------------------
    public static boolean ex63(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }
        public static void ex64(String[] args) {
            int[] array = new int[10];
            Random random = new Random();
    
            for (int i = 0; i < array.length; i++) {
                int valor;
                do {
                    valor = random.nextInt(100);
                } while (contemValor(array, valor));
    
                array[i] = valor;
            }
    
            // Imprimir array
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    
        public static boolean contemValor(int[] array, int valor) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == valor) {
                    return true;
                }
            }
            return false;
        }
// -----------------------------------------------------------------------------------------------
        public static int[] ex65(int[][] array, int valor) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == valor) {
                        return new int[] {i, j};
                    }
                }
            }
            return null;
        }
// -----------------------------------------------------------------------------------------------
        public class Primos {
            public static void ex66(String[] args) {
                int[] array = new int[100];
                ArrayList<Integer> primos = new ArrayList<>();
        
                // Preencher array com números inteiros
                for (int i = 0; i < array.length; i++) {
                    array[i] = i + 1;
                }
        
                // Encontrar números primos
                for (int i = 0; i < array.length; i++) {
                    if (ePrimo(array[i])) {
                        primos.add(array[i]);
                    }
                }
        
                // Escrever números primos e suas respectivas posições
                for (int i = 0; i < primos.size(); i++) {
                    System.out.println("Primo: " + primos.get(i) + ", Posição: " + (primos.get(i) - 1));
                }
            }
        
            public static boolean ePrimo(int numero) {
                if (numero < 2) {
                    return false;
                }
        
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        return false;
                    }
                }
        
                return true;
            }
        }
// -----------------------------------------------------------------------------------------------
        public class PreencherArrayBidimensional {
            public static void ex67(String[] args) {
                int[][] array = new int[10][10];
        
                // Preencher array com números inteiros positivos
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (i == j) {
                            array[i][j] = -1;
                        } else {
                            array[i][j] = i + j + 1;
                        }
                    }
                }
        
                // Imprimir array
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
// -----------------------------------------------------------------------------------------------
        public class PreencherArrayTridimensional {
            public static void ex68(String[] args) {
                int[][][] array = new int[5][5][5];
                int cont = 0;
        
                // Preencher array com valores pares
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        for (int k = 0; k < array[i][j].length; k++) {
                            array[i][j][k] = 2 * (i + j + k + 1);
                        }
                    }
                }
        // -----------------------------------------------------------------------------------------------
                // Contar valores divisíveis por 5
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        for (int k = 0; k < array[i][j].length; k++) {
                            if (array[i][j][k] % 5 == 0) {
                                cont++;
                            }
                        }
                    }
                }
        
                System.out.println("Quantidade de valores divisíveis por 5: " + cont);
            }
        }
// -----------------------------------------------------------------------------------------------
        public class CriarArrays {
            public static void ex69(String[] args) {
                int[] array1 = new int[10];
                int[] array2 = new int[20];
        
                // Preencher array1 com valores aleatórios
                for (int i = 0; i < array1.length; i++) {
                    array1[i] = (int) (Math.random() * 100);
                }
        
                // Copiar valores de array1 para array2 e dobrar cada valor
                for (int i = 0; i < array1.length; i++) {
                    array2[i] = array1[i];
                    array2[i + array1.length] = 2 * array1[i];
                }
        
                // Imprimir arrays
                for (int i = 0; i < array1.length; i++) {
                    System.out.print(array1[i] + " ");
                }
                System.out.println();
        
                for (int i = 0; i < array2.length; i++) {
                    System.out.print(array2[i] + " ");
                }
            }
        }
// -----------------------------------------------------------------------------------------------
        public class SubstituirValoresRepetidos {
            public static void ex70(String[] args) {
                int[] array = new int[50];
                boolean[] visitados = new boolean[50];
        
                // Preencher array com números inteiros aleatórios
                for (int i = 0; i < array.length; i++) {
                    array[i] = (int) (Math.random() * 100);
                }
        
                // Substituir valores repetidos por 0
                for (int i = 0; i < array.length; i++) {
                    if (visitados[array[i]]) {
                        array[i] = 0;
                    } else {
                        visitados[array[i]] = true;
                    }
                }
        
                // Imprimir array
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
                }
            }
        }
// -----------------------------------------------------------------------------------------------
        public class EncontrarMaiorMenorMedia {
            public static void ex71(String[] args) {
                int[][] array = new int[10][10];
                int[] estatisticas = new int[3];
        
                // Preencher array com números inteiros aleatórios
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = (int) (Math.random() * 100);
                    }
                }
        
                // Encontrar maior valor, menor valor e média
                estatisticas[0] = Integer.MIN_VALUE;
                estatisticas[1] = Integer.MAX_VALUE;
                estatisticas[2] = 0;
        
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (array[i][j] > estatisticas[0]) {
                            estatisticas[0] = array[i][j];
                        }
                        if (array[i][j] < estatisticas[1]) {
                            estatisticas[1] = array[i][j];
                        }
                        estatisticas[2] += array[i][j];
                    }
                }
        
                estatisticas[2] /= 100;
        
                // Imprimir estatísticas
                System.out.println("Maior valor: " + estatisticas[0]);
                System.out.println("Menor valor: " + estatisticas[1]);
                System.out.println("Média: " + estatisticas[2]);
            }
        }
// -----------------------------------------------------------------------------------------------
        public class SomaMultiplicacao {
            public static void ex72(String[] args) {
                int[][] array = new int[7][7];
                int somaColunasImpares = 0;
                int multiplicacaoLinhasPares = 1;
        
                // Preencher array com números inteiros aleatórios
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] = (int) (Math.random() * 10);
                    }
                }
        
                // Exibir array
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
        
                // Calcular soma das colunas ímpares
                for (int j = 0; j < array[0].length; j++) {
                    if (j % 2 != 0) {
                        for (int i = 0; i < array.length; i++) {
                            somaColunasImpares += array[i][j];
                        }
                    }
                }
        
                // Calcular multiplicação das linhas pares
                for (int i = 0; i < array.length; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < array[i].length; j++) {
                            multiplicacaoLinhasPares *= array[i][j];
                        }
                    }
                }
        
                // Exibir resultados
                System.out.println("Soma das colunas ímpares: " + somaColunasImpares);
                System.out.println("Multiplicação das linhas pares: " + multiplicacaoLinhasPares);
            }
        }
// -----------------------------------------------------------------------------------------------
        public static boolean ex73(int[] array, int valor, int inicio, int fim) {
            for (int i = inicio; i < fim; i++) {
                if (array[i] == valor) {
                    return true;
                }
            }
            return false;
        }
    }


        

// ----------------------------------------------------------------------------------------------------

public class ex3 {

    // Método que converte a idade em anos, meses e dias para dias
    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
        int diasPorAno = 365; // Considerando 365 dias em um ano
        int diasPorMes = 30;  // Considerando 30 dias em um mês

        // Calcula a idade total em dias
        return (anos * diasPorAno) + (meses * diasPorMes) + dias;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função
        int anos = 25;   // Idade em anos
        int meses = 6;   // Idade em meses
        int dias = 15;   // Idade em dias

        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias); // Chama a função
        System.out.println("A idade de " + anos + " anos, " + meses + " meses e " + dias + " dias é equivalente a " + idadeEmDias + " dias.");
    }
}

// ----------------------------------------------------------------------------------------------------------

public class ex4 {

    // Método que verifica se um número é positivo ou negativo
    public static boolean ehPositivo(int numero) {
        // Verifica se o número é maior que zero
        return numero > 0;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função
        int numeroPositivo = 10;  // Número positivo
        int numeroNegativo = -5;  // Número negativo
        int numeroZero = 0;       // Número zero

        System.out.println("O número " + numeroPositivo + " é positivo? " + ehPositivo(numeroPositivo));
        System.out.println("O número " + numeroNegativo + " é positivo? " + ehPositivo(numeroNegativo));
        System.out.println("O número " + numeroZero + " é positivo? " + ehPositivo(numeroZero));
    }
}

// ---------------------------------------------------------------------------------------------------------------

public class ex5 {

    // Método que verifica se um número é par
    public static boolean ehPar(int numero) {
        // Verifica se o número é divisível por 2
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função
        int numeroPar = 8;   // Número par
        int numeroImpar = 7; // Número ímpar

        System.out.println("O número " + numeroPar + " é par? " + ehPar(numeroPar));
        System.out.println("O número " + numeroImpar + " é par? " + ehPar(numeroImpar));
    }
}

// ------------------------------------------------------------------------------------------------------------------

public class ex6 {

    // Método que calcula e retorna o maior entre dois valores
    public static int maior(int a, int b) {
        // Verifica qual dos dois números é maior e retorna
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função
        int valor1 = 15;
        int valor2 = 25;

        int maiorValor = maior(valor1, valor2); // Chama a função
        System.out.println("O maior valor entre " + valor1 + " e " + valor2 + " é: " + maiorValor);
    }
}

// --------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

public class ex7 {

    // Método que calcula e retorna a média aritmética de valores positivos
    public static double calcularMedia() {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 0;

        while (true) {
            System.out.print("Digite um valor positivo (ou -1 para sair): ");
            double valor = scanner.nextDouble();

            if (valor == -1) {
                break;
            }

            if (valor > 0) {
                soma += valor;
                contador++;
            } else {
                System.out.println("Valor inválido. Por favor, digite um valor positivo.");
            }
        }

        if (contador == 0) {
            System.out.println("Nenhum valor positivo foi digitado.");
            return 0;
        }

        double media = soma / contador;
        return media;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função
        double media = calcularMedia();
        System.out.println("A média aritmética dos valores positivos é: " + media);
    }
}

// -------------------------------------------------------------------------------------


import java.util.Scanner;

public class ex8 {

    // Método que imprime o mês correspondente ao número recebido
    public static void imprimirMes(int numero) {
        switch (numero) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Número inválido. Por favor, digite um número entre 1 e 12.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 1 a 12: ");
        int numero = scanner.nextInt();

        // Chama o método para imprimir o mês correspondente
        imprimirMes(numero);
    }
}

// -----------------------------------------------------------------------------------------------------------------------------

public class ex9 {

    // Método que gera um cabeçalho para um relatório
    public static void gerarCabecalho(String nome) {
        // Imprimindo a linha superior
        System.out.println("=====================================================");

        // Imprimindo as informações do relatório
        System.out.println("Senac – Serviço Nacional de Aprendizagem Comercial");
        System.out.println("Curso de Tecnologia em Análise e Desenvolvimento de Sistemas");
        System.out.println("Disciplina de Algoritmos e Programação II");
        System.out.println("Nome: " + nome);

        // Imprimindo a linha inferior
        System.out.println("=====================================================");
    }

    public static void main(String[] args) {
        // Exemplo de uso do método
        String nome = "Fulano de Tal";
        gerarCabecalho(nome);
    }
}

// -----------------------------------------------------------------------------------------------------------------------

public class ex10 {

    // Função que verifica se x é divisível por y
    public static int ehDivisivel(int x, int y) {
        if (y == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return -1; // ou pode lançar uma exceção
        }
        return (x % y == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        // Algoritmo para testar a função
        int x = 10; // número a ser testado
        int y = 2;  // divisor

        int resultado = ehDivisivel(x, y);

        if (resultado == 1) {
            System.out.println(x + " é divisível por " + y);
        } else if (resultado == 0) {
            System.out.println(x + " não é divisível por " + y);
        } else {
            System.out.println("Ocorreu um erro.");
        }
    }
}

// ------------------------------------------------------------------------------------------------------------------------

public class ex11 {

    // Função que converte polegadas para centímetros
    public static double converterPolegadasParaCentimetros(double pol) {
        return pol * 2.54; // Conversão de polegadas para centímetros
    }

    public static void main(String[] args) {
        // Exemplo de uso da função
        double polegadas = 10.0; // Valor em polegadas
        double centimetros = converterPolegadasParaCentimetros(polegadas);

        System.out.println(polegadas + " polegadas é igual a " + centimetros + " centímetros.");
    }
}

// -------------------------------------------------------------------------------------------------------------------------

public class ex12 {

    // Função que converte pés para metros
    public static double converterPesParaMetros(double feet) {
        return feet / 3.281; // Conversão de pés para metros
    }

    public static void main(String[] args) {
        // Exemplo de uso da função
        double pes = 10.0; // Valor em pés
        double metros = converterPesParaMetros(pes);

        System.out.printf("%.2f pés é igual a %.2f metros.%n", pes, metros);
    }
}


    

