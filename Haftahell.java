import java.util.Random;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {
    static Random Random = new Random();
    static Scanner entrada = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        String nome;
        int vidaCriatura = 50;
        int vidaPersonagem = 50;
        int vidaBoss = 100;
        int healthPotion = 3;
        int healthPotionEnemy = 3;
        int danoPersonagem = Random.nextInt(24);
        int danoInimigo = Random.nextInt(24);
        menu();
    }

    public static void historiaCapitulo1() { // Inicia o começo da Historia do RPG
        String nome;
        System.out.println("Olá! Nosso código funciona com um sistema que é necessário apertar enter para que apareca o proximo dialogo,\n voce precisara apertar enter entre os dialogos, sempre que aparecer essa mensagem (Enter...) ");
        enter(entrada);
        System.out.println("Você acorda em um quarto em branco. Ele não tem começo nem fim. A claridade faz seus olhos se incomodarem, mas logo se acostumam. Você se encontra confuso por não saber onde está e nem quem é.");
        enter(entrada);
        System.out.println("Uma luz azul contorna o ar. Runas aparecem diante de você. Elas lembram números, mas \"estão escritas de formas diferentes?\"");
        enter(entrada);
        System.out.println("Os números se juntam com letras e você começa a interpretá-las.");
        enter(entrada);
        System.out.println("“Em eras ancestrais, quando a magia da matemática era desvelada,\n tecemos os fios do conhecimento para desvendar os segredos dos números divinos. \nE assim nasceram os \"Conjuntos Místicos\", onde os números se agrupavam em esferas mágicas. \nDentro delas, encontrávamos os Numéricos Naturais, Inteiros, Racionais, Irracionais e Reais. \nQual destes conjuntos os números místicos pertence o número PI??\n"
                + "Estranhamente você sabe a resposta e responde sussurando:");
        enter(entrada);
        System.out.println("“Irracionais”. É, e pensar que eu iria encontrar a matemática em um lugar como esse.");
        enter(entrada);
        System.out.println("“Ah, que surpresa! Imaginar que um humano vindo da Terra Distante seria capaz de decifrar a língua sagrada.”");
        enter(entrada);
        System.out.println("No fundo da sala, surge um ser que você não havia percebido.\n Ao tentar encarar seu rosto, seu corpo é tomado por uma agonia profunda, uma entidade inimaginável envolta em uma aura de luz.");
        enter(entrada);
        System.out.println("Tomado pelo medo, você pergunta:\n"
                + "“Onde estou? Quem é você?");
        enter(entrada);
        System.out.println("O Ser cai em gargalhada respondendo:\n"
                + "-“Quem sou eu?’ Que espetáculo! Uma pergunta interessante … Primeiro me diga, quem é você?");
        nome = entrada.nextLine();
        System.out.println("Ao falar o seu nome você entra em hipnose, e uma voz explica com detalhes o presente o passado desse mundo.");
        enter(entrada);
        System.out.println("Bem-vindo ao mundo de Haftafell!");
        enter(entrada);
        System.out.println(nome + ", o escolhido…");
        enter(entrada);
        System.out.println("O mundo de Haftafell, um lugar vasto e misterioso, repleto de magia e maravilhas. Em Haftafell, a Matemática é considerada a linguagem sagrada perdida, \num conhecimento tão poderoso que se acredita ter sido dado aos mortais por deuses antigos.");
        enter(entrada);
        System.out.println("Há milênios, Haftafell era um mundo em equilíbrio,\n governado por deuses antigos que haviam concedido aos mortais o conhecimento da Matemática Divina.\n Essa linguagem sagrada permitia que as quatro raças - elfos, anões, fadas e humanos - moldassem a realidade de acordo com seus desejos, \ncriando uma era de prosperidade e harmonia.");
        enter(entrada);
        System.out.println("No entanto, essa paz foi abalada quando um grupo de mortais ambiciosos, conhecido como a \"Entidade Sombria\", \nroubou segredos profundos da Matemática Divina e começou a usá-los para fins egoístas. \nA ganância e a busca pelo poder levaram a uma guerra devastadora entre as raças, \nque resultou na perda do conhecimento da Matemática Divina e na obliteração dos elfos, anões e fadas restando assim apenas a raça dos humanos.");
        enter(entrada);
        System.out.println("Os deuses antigos, horrorizados com o abuso de seu presente, \nselaram a Matemática Divina em artefatos mágicos indecifráveis, runas e hieróglifos e se retiraram do mundo, \npela primeira vez os deuses desistiram deixando o mundo em um estado de desordem e conflito.");
        enter(entrada);
        System.out.println("No presente da campanha, Haftafell é um lugar dividido, com as raças ainda se recuperando das cicatrizes da guerra passada.\n A Matemática Divina é considerada uma lenda, uma linguagem perdida que poucos acreditam ser possível de dominar novamente.");
        enter(entrada);
        System.out.println("No entanto, uma profecia ancestral ressurge, \npredizendo o retorno da Matemática Divina e o surgimento de heróis destinados a desvendar seus segredos e enfrentar uma ameaça sombria que deseja usá-la para destruir o mundo. \nÉ nesse cenário que os jogadores entram em cena, escolhidos pelas circunstâncias e pelo destino para reverter o curso da história, \nreconciliar as raças e impedir a catástrofe iminente.");
        enter(entrada);
        System.out.println("O passado tumultuado de Haftafell, marcado pela ascensão e queda da Matemática Divina, \nestabelece o cenário para a jornada dos jogadores em busca do conhecimento perdido e a luta para proteger o mundo de uma nova ameaça, \nenquanto lidam com os traumas e preconceitos do passado.");
        enter(entrada);
        System.out.println("O " + nome + " estava imerso em pensamentos, tentando assimilar tudo o que havia aprendido sobre Haftafell e a Matemática Divina. \nA entidade misteriosa que estava agora diante dele parecia estar aguardando uma resposta a sua pergunta: \"Quem é você?\"");
        enter(entrada);
        System.out.println("Com uma sensação de déjà vu, o protagonista respondeu mais uma vez, pronunciando seu nome. \nUma onda de calma o envolveu enquanto imagens do passado de Haftafell se desenrolavam diante de seus olhos.");
        enter(entrada);
        System.out.println("Ele viu as quatro raças antigas coexistindo harmoniosamente, compartilhando o conhecimento da Matemática Divina para criar maravilhas que desafiavam a compreensão. \nA imagem de elfos graciosos, anões mestres da tecnologia, fadas encantadas e humanos sábios e trabalhadores dançou em sua mente.");
        enter(entrada);
        System.out.println("Em seguida, as imagens se transformaram em visões da guerra, com a Entidade Sombria ameaçando tudo o que era belo em Haftafell. \nO caos que se seguiu e a perda da Matemática Divina assolaram o mundo, deixando cicatrizes profundas em sua alma.");
        enter(entrada);
    }

    static void enter(Scanner entrada) {
        System.out.println("Enter...");
        entrada.nextLine(); // Aguarda até que o usuário pressione Enter
    }
    static void combatePersonagem() { //Decisões do turno do personagem
        int decisao = Random.nextInt(5);
        int danoPersonagem = Random.nextInt(24);
        int danoInimigo = Random.nextInt(24);
        switch (danoPersonagem) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                danoPersonagem = 13;
                break;
        }
        System.out.println("== Seu turno ==");
        System.out.println("1 - Golpear");
        System.out.println("2 - Curar");
        
        System.out.println("===============");
        int escolha = entrada.nextInt();
        switch (escolha) {
            case 1 -> {
                System.out.println("Voce escolheu golpear");
                ataquePersonagem();
            }
            case 2 ->{
                System.out.println("Voce escolheu curar");
                curarPersonagem();
                
            }
            
            default -> System.out.println("Você não escolheu um número válido");
        }
        
    }
    static void combateInimigo() { //Randomificação das decisões do inimigo
        
        int decisao = Random.nextInt(5);
        int danoPersonagem = Random.nextInt(24);
        int danoInimigo = Random.nextInt(24);
        switch (danoInimigo) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                danoInimigo = 13;
                break;
        }
        switch (decisao) {
            case 0,1, 3 -> {
                System.out.println("O inimigo escolheu golpear");
                ataqueMiniBoss();
            }
            case 2, 4-> {
                System.out.println("O inimigo escolheu curar");
                curarInimigo();
                
            }                
           
        }
    }
    

    static void escolha() { //Tela ao selecionar a opção capitulos do menu.
        System.out.println("1 - Prólogo");
        System.out.println("2 - Cápitulo 1");
        System.out.println("3 - Capitulo 2");
        System.out.println("4 - Capitulo 3");
        System.out.println("5 - Capitulo 4");
        System.out.println("6 - Capitulo 5");
        int escolha = Random.nextInt();

        switch (escolha) { // Escolha dos capitulos
            case 1 -> {
                System.out.println("Você está entrando no primeiro capitulo do jogo, chamado de Prólogo, boa sorte!");
                historiaCapitulo1();
            }
            case 2, 3, 4, 5, 6 -> System.out.println("Ainda não temos esses capitulos XD");
        }
        // Escolha dos capitulos
            }
    static void ataquePersonagem() {
      int danoPersonagem = Random.nextInt(24);
        int danoInimigo = Random.nextInt(24);
        int vidaCriatura = 50;
        int vidaPersonagem = 50;
        ArrayList<String> perguntas = new ArrayList<>();
        for (int i = 1; i <= 20; i ++) {
            perguntas.add("Quanto é " + i + " + " + i + "?");
        }
        int n = perguntas.size();
        Random pergunta = new Random();
        int numPergunta = pergunta.nextInt(n);
        ArrayList<Integer> respostas = new ArrayList<>();
        for (int i = 2; i <= 40; i+=2) {
            respostas.add(i);
        }
        
        System.out.println(perguntas.get(numPergunta));
        System.out.println("Digite a resposta correta! ");
        double num = entrada.nextDouble(); 
        if (respostas.get(numPergunta) == num) {
        System.out.println("Resposta correta, você atacou o inimigo");
        vidaCriatura = vidaCriatura - danoPersonagem;
        if (vidaCriatura <= 0)
            vidaCriatura = 0;
        else 
            System.out.format("A vida do inimigo está em %d\n", vidaCriatura);
        }
        else 
        System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta ) + " você errou o ataque no inimigo");
    }

    static void ataqueMiniBoss() { //Execucao da ação do inimigo Golpear
        int vidaPersonagem = 50;
        int danoInimigo = Random.nextInt(24);
        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo
        for (int i = 1; i <= 20; i ++) {
            perguntas.add("Quanto é " + i + " + " + i + "?");
        }
        
        int n = perguntas.size();
        Random pergunta = new Random(); //Randomificação das perguntas que o inimigo pode executar ao ser randomificado a opção ataque
        int numPergunta = pergunta.nextInt(n);
    
        // A randomificação do array sairá aqui e será escolhido a pergunta
        ArrayList<Integer> respostas = new ArrayList<>(); // Array das respostas das perguntas do inimigo
        for (int i = 2; i <= 40; i+=2) {
            respostas.add(i);
        }
        System.out.println(perguntas.get(numPergunta));
        System.out.println("Digite a resposta correta! ");
        double num = entrada.nextDouble();
        if (respostas.get(numPergunta) == num) 
        System.out.println("Resposta correta, você desviou do golpe do inimigo");
        else {
        System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta ) + " você tomou o dano inteiro do inimigo");
        vidaPersonagem= vidaPersonagem - danoInimigo;       
        System.out.format("Sua vida atual é %d\n", vidaPersonagem);
}
    }

    static void menu() { // Comando que executa o menu do Jogo, primeira coisa que irá aparecer ao jogador
        int escolha;
        do {
            System.out.println(" === Menu === ");
            System.out.println("1 - Iniciar");
            System.out.println("2 - Cápitulos");
            System.out.println("3 - Créditos");
            System.out.println("4 - Combate");
            System.out.println(" ============ ");
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1 ->
                    historiaCapitulo1();
                case 2 ->
                    escolha();
                case 3 ->
                    System.out.println("Caique, Cleiton, Henrique, Juan e Maicon"); // Créditos
                case 4 ->
                    combate(); // Sair do jogo
                default -> System.out.println("Digite um número válido");
            }
        } while (escolha > 0 && escolha >= 5);
    }
    static void combate() {
        int vidaCriatura = 50;
        int vidaPersonagem = 50;
        int danoPersonagem = Random.nextInt(24);
        int danoInimigo = Random.nextInt(24);
        while ((vidaCriatura >0 || vidaPersonagem >0)){
            combatePersonagem();
            if (vidaCriatura <=0 || vidaPersonagem <= 0) 
                break;
            combateInimigo();
            
       
        }
        
        if (vidaPersonagem <= 0)
            System.out.println("Você morreu pro inimigo, seu burro");
        else if (vidaCriatura <= 0)
            System.out.println("Boa, tu matou o fdp");
    }
    static void curarPersonagem(){
        int vidaCriatura = 50;
        int vidaPersonagem = 50;
        int healthPotion = 3;
        int healthPotionEnemy = 3;
        if (healthPotion == 0 || healthPotion < 0) {
                    System.out.println("Voce nao tem mais pocoes disponiveis, se fudeu");
                } else {
                 vidaPersonagem+=24;   
                 healthPotion -=1;
                System.out.format("Sua vida atual e %d\n", vidaPersonagem);
                System.out.format("Voce so tem mais %d pocoes\n", healthPotion);
                }
    }
    static void curarInimigo(){
        int vidaCriatura = 50;
        int vidaPersonagem = 50;
        int healthPotion = 3;
        int healthPotionEnemy = 3;
        if (healthPotionEnemy == 0 || healthPotionEnemy < 0) {
                    System.out.println("O inimigo não tem mais poções");
                } else {
                 vidaCriatura+=24;   
                 healthPotionEnemy -=1;
                System.out.format("A vida atual do inimigo é  %d\n", vidaCriatura);
                System.out.format("O inimigo so tem mais %d pocoes\n", healthPotionEnemy);
                }
    }
    
}