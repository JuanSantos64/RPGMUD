package RPGdosCara;

import java.util.Random;

import java.util.Scanner;

import java.util.ArrayList;

public class Haftahell {

    static Scanner entrada = new Scanner(System.in);
    static String nome;

    public static void main(String[] args) {
       menu();
        System.out.println("Vc encontra um inimigo, ataque ele!!!");
        perguntas();
    }

    public static void historiaPrologo() { // Inicia o começo da Historia do RPG
        System.out.println("Olá! Nosso código funciona com um sistema que é necessário apertar enter para que apareca o proximo dialogo,\n voce precisara apertar enter entre os dialogos, sempre que aparecer essa mensagem (Enter...) ");
        pressioneEnterParaContinuar(entrada);
        System.out.println("Você acorda em um quarto em branco. Ele não tem começo nem fim. A claridade faz seus olhos se incomodarem, mas logo se acostumam. Você se encontra confuso por não saber onde está e nem quem é.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("Uma luz azul contorna o ar. Runas aparecem diante de você. Elas lembram números, mas \"estão escritas de formas diferentes?\"");
        pressioneEnterParaContinuar(entrada);
        System.out.println("Os números se juntam com letras e você começa a interpretá-las.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("“ Em eras ancestrais, quando a magia da matemática era desvelada,\n tecemos os fios do conhecimento para desvendar os segredos dos números divinos. \nE assim nasceram os \"Conjuntos Místicos\", onde os números se agrupavam em esferas mágicas. \nDentro delas, encontrávamos os Numéricos Naturais, Inteiros, Racionais, Irracionais e Reais. Qual destes conjuntos os números místicos?\n"
                + "Estranhamente você sabe a resposta e responde sussurando:");
        pressioneEnterParaContinuar(entrada);
        System.out.println("“Reais”. É, e pensar que eu iria encontrar a matemática em um lugar como esse.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("“Ah, que surpresa! Imaginar que um humano vindo da Terra Distante seria capaz de decifrar a língua sagrada.”");
        pressioneEnterParaContinuar(entrada);
        System.out.println("No fundo da sala, surge um ser que você não havia percebido.\n Ao tentar encarar seu rosto, seu corpo é tomado por uma agonia profunda, uma entidade inimaginável envolta em uma aura de luz.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("Tomado pelo medo, você pergunta:\n"
                + "“Onde estou? Quem é você?");
        pressioneEnterParaContinuar(entrada);
        System.out.println("O Ser cai em gargalhada respondendo:\n"
                + "-“Quem sou eu?’ Que espetáculo! Uma pergunta interessante … Primeiro me diga, quem é você?");
        nome = entrada.nextLine();
        System.out.println("Ao falar o seu nome você entra em hipnose, e uma voz explica com detalhes o presente o passado desse mundo.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("O mundo de Haftafell, um lugar vasto e misterioso, repleto de magia e maravilhas. Em Haftafell, a Matemática é considerada a linguagem sagrada perdida, \num conhecimento tão poderoso que se acredita ter sido dado aos mortais por deuses antigos.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("Há milênios, Haftafell era um mundo em equilíbrio,\n governado por deuses antigos que haviam concedido aos mortais o conhecimento da Matemática Divina.\n Essa linguagem sagrada permitia que as quatro raças - elfos, anões, fadas e humanos - moldassem a realidade de acordo com seus desejos, \ncriando uma era de prosperidade e harmonia.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("No entanto, essa paz foi abalada quando um grupo de mortais ambiciosos, conhecido como a \"Entidade Sombria\", \nroubou segredos profundos da Matemática Divina e começou a usá-los para fins egoístas. \nA ganância e a busca pelo poder levaram a uma guerra devastadora entre as raças, \nque resultou na perda do conhecimento da Matemática Divina e na obliteração dos elfos, anões e fadas restando assim apenas a raça dos humanos.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("Os deuses antigos, horrorizados com o abuso de seu presente, \nselaram a Matemática Divina em artefatos mágicos indecifráveis, runas e hieróglifos e se retiraram do mundo, \npela primeira vez os deuses desistiram deixando o mundo em um estado de desordem e conflito.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("No presente da campanha, Haftafell é um lugar dividido, com as raças ainda se recuperando das cicatrizes da guerra passada.\n A Matemática Divina é considerada uma lenda, uma linguagem perdida que poucos acreditam ser possível de dominar novamente.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("No entanto, uma profecia ancestral ressurge, \npredizendo o retorno da Matemática Divina e o surgimento de heróis destinados a desvendar seus segredos e enfrentar uma ameaça sombria que deseja usá-la para destruir o mundo. \nÉ nesse cenário que os jogadores entram em cena, escolhidos pelas circunstâncias e pelo destino para reverter o curso da história, \nreconciliar as raças e impedir a catástrofe iminente.");
        pressioneEnterParaContinuar(entrada);
        System.out.println("O passado tumultuado de Haftafell, marcado pela ascensão e queda da Matemática Divina, \nestabelece o cenário para a jornada dos jogadores em busca do conhecimento perdido e a luta para proteger o mundo de uma nova ameaça, \nenquanto lidam com os traumas e preconceitos do passado.");
        pressioneEnterParaContinuar(entrada);
    }

    static void pressioneEnterParaContinuar(Scanner entrada) {
        System.out.println("Enter...");
        entrada.nextLine(); // Aguarda até que o usuário pressione Enter
    }

    static void random() { //Randomificação das decisões do inimigo
        Random dado = new Random();
        int dado20Faces = dado.nextInt(4);
        switch (dado20Faces) {
            case 1, 3 -> {
                System.out.println("O inimigo escolheu golpear");
                perguntas();
            }
            case 2 -> System.out.println("O inimigo escolheu curar");
            case 4 -> System.out.println("O inimigo escolheu fugir");
        }
    }
    

    static void escolha2() { //Tela ao selecionar a opção capitulos do menu.
        System.out.println("1 - Prólogo");
        System.out.println("2 - Cápitulo 1");
        System.out.println("3 - Capitulo 2");
        System.out.println("4 - Capitulo 3");
        System.out.println("5 - Capitulo 4");
        System.out.println("6 - Capitulo 5");
        int escolha = entrada.nextInt();

        switch (escolha) { // Escolha dos capitulos
            case 1 -> {
                System.out.println("Você está entrando no primeiro capitulo do jogo, chamado de Prólogo, boa sorte!");
                historiaPrologo();
            }
            case 2, 3, 4, 5, 6 -> System.out.println("Ainda não temos esses capitulos XD");
        }
        // Escolha dos capitulos
            }


    static void perguntas() { //Execucao da ação do inimigo Golpear 
        ArrayList<Integer> perguntas = new ArrayList<>(); // Array de perguntas do inimigo
        perguntas.add(1);
        perguntas.add(2);
        perguntas.add(3);
        perguntas.add(4);
        perguntas.add(5);
        perguntas.add(6);
        perguntas.add(7);
        perguntas.add(8);
        perguntas.add(9);
        perguntas.add(10);
        perguntas.add(11);
        perguntas.add(12);
        perguntas.add(13);
        perguntas.add(14);
        perguntas.add(15);
        perguntas.add(16);
        perguntas.add(17);
        perguntas.add(18);
        perguntas.add(19);
        perguntas.add(20);
        int n = perguntas.size();
        Random pergunta = new Random(); //Randomificação das perguntas que o inimigo pode executar ao ser randomificado a opção ataque
        int numPergunta = pergunta.nextInt(n);
        switch (numPergunta) { // A randomificação do array sairá aqui e será escolhido a pergunta
        case 0 -> System.out.println("Quanto é 1 + 1?");
        case 1 -> System.out.println("Quanto é 2 + 2?");
        case 2 -> System.out.println("Quanto é 3 + 3?");
        case 3 -> System.out.println("Quanto é 4 + 4?");
        case 4 -> System.out.println("Quanto é 5 + 5?");
        case 5 -> System.out.println("Quanto é 6 + 6?");
        case 6 -> System.out.println("Quanto é 7 + 7?");
        case 7 -> System.out.println("Quanto é 8 + 8?");
        case 8 -> System.out.println("Quanto é 9 + 9?");
        case 9 -> System.out.println("Quanto é 10 + 10?");
        case 10 -> System.out.println("Quanto é 11 + 11?");
        case 11 -> System.out.println("Quanto é 12 + 12?");
        case 12 -> System.out.println("Quanto é 13 + 13?");
        case 13 -> System.out.println("Quanto é 14 + 14?");
        case 14 -> System.out.println("Quanto é 15 + 15?");
        case 15 -> System.out.println("Quanto é 16 + 16?");
        case 16 -> System.out.println("Quanto é 17 + 17?");
        case 17 -> System.out.println("Quanto é 18 + 18?");
        case 18 -> System.out.println("Quanto é 19 + 19?");
        case 19 -> System.out.println("Quanto é 20 + 20?");
    }
    
        // A randomificação do array sairá aqui e será escolhido a pergunta
        ArrayList<Integer> respostas = new ArrayList<>(); // Array das respostas das perguntas do inimigo
        respostas.add(2);
        respostas.add(4);
        respostas.add(6);
        respostas.add(8);
        respostas.add(10);
        respostas.add(12);
        respostas.add(14);
        respostas.add(16);
        respostas.add(18);
        respostas.add(20);
        respostas.add(22);
        respostas.add(24);
        respostas.add(26);
        respostas.add(28);
        respostas.add(30);
        respostas.add(32);
        respostas.add(34);
        respostas.add(36);
        respostas.add(38);
        respostas.add(40);
        System.out.println("Digite a resposta correta! ");
        double num = entrada.nextDouble();
        if (respostas.get(numPergunta) == num) 
        System.out.println("Resposta correta, você desviou do golpe do inimigo");
        else 
        System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta ) + " você tomou o dano inteiro do inimigo");
                
}

    static void menu() { // Comando que executa o menu do Jogo, primeira coisa que irá aparecer ao jogador
        int escolha;
        do {
            System.out.println(" === Menu === ");
            System.out.println("1 - Iniciar");
            System.out.println("2 - Cápitulos");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1 ->
                    historiaPrologo();
                case 2 ->
                    escolha2();
                case 3 ->
                    System.out.println("Caique, Cleiton, Henrique, Juan e Maicon"); // Créditos
                case 4 ->
                    System.out.println("Obrigado por jogar nosso jogo, esperamos voce mais tarde!"); // Sair do jogo
                default -> System.out.println("Digite um número válido");
            }
        } while (escolha > 0 && escolha >= 5);
    }
}

