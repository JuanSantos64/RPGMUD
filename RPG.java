package RPGdosCara;

import java.util.Random;

import java.util.Scanner;

import java.util.ArrayList;

public class RPG {

    static Scanner entrada = new Scanner(System.in);
    static String nome;

    public static void main(String[] args) {

        perguntas();
        int escolha;
        do {
            System.out.println(" === Menu === ");
            System.out.println("1 - Iniciar");
            System.out.println("2 - Cápitulos");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    historiaPrologo();
                    break;
                case 2:
                    escolha2();
                    break;
                case 3:
                    System.out.println("Caique, Cleiton, Henrique, Juan e Maicon");
                    break;
                case 4:
                    System.out.println("Obrigado por jogar nosso jogo, esperamos voce mais tarde!");

            }
        } while (escolha > 0 && escolha >= 5);
    }

    static void historiaPrologo() { // Inicia o começo da Historia do RPG
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

    private static void pressioneEnterParaContinuar(Scanner entrada) {
        System.out.println("Enter...");
        entrada.nextLine(); // Aguarda até que o usuário pressione Enter
    }

    static void random() { //Randomificação das decisões do inimigo
        Random dado = new Random();
        int dado20Faces = dado.nextInt(4);
        switch (dado20Faces) {
            case 1:
                System.out.println("Golpear");
                break;
            case 2:
                System.out.println("Curar");
                break;
            case 3:
                System.out.println("Mágia");
                break;
            case 4:
                System.out.println("Fugir");
                break;
        }
    }

    static void escolha2() { //Tela ao selecionar a opção capitulos do menu.
        System.out.println("1 - Cápitulo 0");
        System.out.println("2 - Cápitulo 1");
        System.out.println("3 - Capitulo 2");
        System.out.println("4 - Capitulo 3");
        System.out.println("5 - Capitulo 4");
        System.out.println("6 - Capitulo 5");
        int escolha = entrada.nextInt();

        switch (escolha) { // Escolha dos capitulos
            case 1:

                historiaPrologo();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Ainda não temos esses capitulos XD");
                break;
        }
    }

    static void perguntas() { // Array de perguntas que o inimigo pode fazer;
        ArrayList<Integer> perguntas = new ArrayList<>();
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
        Random pergunta = new Random(); //Randomificação das perguntas que o inimigo pode executar ao ser randomificado a opção ataque;
        int numPergunta = pergunta.nextInt(n);

        switch (numPergunta) { // A randomificação do array sairá aqui e será escolhido a pergunta
            case 0:
                System.out.println("Quanto é 1 + 1?");
                break;
            case 1:
                System.out.println("Quanto é 2 + 2?");
                break;
            case 2:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 3:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 4:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 5:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 6:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 7:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 8:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 9:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 10:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 11:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 12:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 13:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 14:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 15:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 16:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 17:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 18:
                System.out.println("Quanto é 3 + 3?");
                break;
            case 19:
                System.out.println("Quanto é 3 + 3?");
                break;
        }
    }

}
