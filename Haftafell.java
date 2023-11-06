package rpgdoscara;

/**
 * 
 */
import java.util.Random;

import java.util.Scanner;

import java.util.ArrayList;
/**
 * Classe do nosso projeto integrador: RPG Corporativo para educação corporativa.
 * @author juans
 */
public class Haftafell {
        /**
         * Gera um randomizador
         */
    static Random Random = new Random();
    /**
     * Usado para poder escrever no console, ou seja, receber dados do usuário
     */
    static Scanner entrada = new Scanner(System.in);
    
    /**
     * Classe que executa o RPG
     * @param args 
     */
    public static void main(String[] args) {
        menu(); // Começa a rodar o jogo a partir do menu!
    }
/**
 * Classe que contêm o primeiro capitulo do jogo
 */
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
        System.out.println("Quando as visões finalmente se dissiparam, a entidade misteriosa se apresentou: \n\"Sou Ygris, a Guardiã da Matemática Divina. \nMinha missão é zelar pelo conhecimento sagrado e, se possível, restaurar a harmonia em Haftafell.\"");
        enter(entrada);
        System.out.println("O protagonista, ainda tentando processar as informações, finalmente reuniu coragem para fazer outra pergunta: \n\"Como vim parar aqui? Por que fui escolhido?\"");
        enter(entrada);
        System.out.println("Ygris sorriu, revelando um brilho de esperança em seus olhos. \n\"Você foi escolhido, meu jogador, porque é a personificação de uma antiga profecia. \nHá muito tempo, os deuses antigos previram a chegada de alguém que poderia trazer de volta a Matemática Divina e enfrentar a ameaça sombria que busca destruir nosso mundo, nossos Deuses não puderam interferir diretamente nessa influência, se sentiram incapazes diante da lei universal. \nO destino é incerto, afinal cada ser vivo escreve o seu. \nPor muito tempo acreditamos ter sido um erro entregar esse conhecimento\".");
        enter(entrada);
        System.out.println("Ygris estende a mão, e um pergaminho mágico com runas brilhantes apareceu em sua palma. \n\"Você deve buscar as Runas Primordiais, fragmentos de conhecimento que podem desvendar os segredos da Matemática Divina. \nA primeira runa o aguarda na cidade de Midland, onde você encontrará aliados e desafios.\"");
        enter(entrada);
        System.out.println("Com determinação, você pega o pergaminho e se preparou para a jornada à frente. \nO destino de Haftafell repousava sobre seus ombros, irá enfrentar o desconhecido em busca da Matemática Divina e da salvação de seu novo mundo.");
        enter(entrada);
    }
/**
 * Classe que contêm a mecânica de apertar enter para que os dialogos continuem
 * @param entrada 
 */
    static void enter(Scanner entrada) {
        System.out.println("Enter...");
        entrada.nextLine(); // Aguarda até que o usuário pressione Enter
    }
    /**
     * Classe que gera as opções de turno do personagem principal
     */
    static void combatePersonagem() { //Decisões do turno do personagem
        int decisao = Random.nextInt(5);
        
        
        System.out.println("== Seu turno ==");
        System.out.println("1 - Golpear");
        System.out.println("2 - Curar");
        
        System.out.println("===============");
        int escolha = entrada.nextInt();
        switch (escolha) {
            case 1 -> {
                System.out.println("Voce escolheu golpear");
                ataquePersonagem(danoPersonagem());
            }
            case 2 ->{
                System.out.println("Voce escolheu curar");
                curarPersonagem();
                
            }
            
            default -> System.out.println("Você não escolheu um número válido");
        }
        
    }
    static int danoPersonagem(){
        int danoPersonagem = Random.nextInt(13, 24);
        return danoPersonagem;
    }
    static int danoInimigo(){
        int danoInimigo = Random.nextInt(13, 24);
        return danoInimigo;
    }
    /**
     * Classe que gera o turno do oponente, com uma randomização nas ações do inimigo (bot)
     */
    static void combateInimigo() { //Randomificação das decisões do inimigo
        int decisao = Random.nextInt(5);//Randomificação das decisões do inimigo, escolhe um número de 0 a 4
        switch (decisao) {//Randomificação das decisões do inimigo
            case 0,1, 3 -> {
                System.out.println("O inimigo escolheu golpear");
                ataqueMiniBoss(danoInimigo());
            }
            case 2, 4-> {
                System.out.println("O inimigo escolheu curar");
                curarInimigo();
                
            }                
           
        }
    }
    
/**
 * Classe que mostra os cápitulos da historia para selecionar
 */
    static void escolha() { //Tela ao selecionar a opção capitulos do menu.
        /**
 * Classe que mostra os cápitulos da historia para selecionar
 */
        System.out.println("1 - Cápitulo 1");
        System.out.println("2 - Cápitulo 2");
        System.out.println("3 - Capitulo 3");
      
        int escolha = entrada.nextInt();

        switch (escolha) { // Escolha dos capitulos
            case 1 -> {
                System.out.println("Você está entrando no primeiro capitulo do jogo, chamado de Prólogo, boa sorte!");
                historiaCapitulo1();
            }
            case 2, 3 -> System.out.println("Ainda não temos esses capitulos XD");
        }
        // Escolha dos capitulos
            }
    /**
     * Classe que roda após o usuário escolher a opção Golpear. Ela gera uma pergunta que o aliado deve responder corretamente para dar um dano aleatorio maior que 13 e menor que 24.
     */
    static void ataquePersonagem(int a) {
      
       
        int vidaCriatura = 50;
        
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
        vidaCriatura = vidaCriatura - a;
        if (vidaCriatura <= 0)
            vidaCriatura = 0;
        else 
            System.out.format("A vida do inimigo está em %d\n", vidaCriatura);
        }
        else 
        System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta ) + " você errou o ataque no inimigo");
    }
/**
 * Classe que roda se o bot randomizaar a opção Golpear, ela gera uma pergunta para o usuário que deve responde-la corretamente para que ele desvie do ataque, se errar a pergunta, ele toma o dano inteiro.
 */
    static void ataqueMiniBoss(int a) { //Execucao da ação do inimigo Golpear
        int vidaPersonagem = 50;
        
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
        vidaPersonagem= vidaPersonagem - a;       
        System.out.format("Sua vida atual é %d\n", vidaPersonagem);
}
    }

    /**
     * Classe que gera o menu inicial do jogo!
     */
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
    /**
     * Classe que gera o combate, ou seja, fica intercalando entre o turno do oponente e o do personagem principal, sempre verificando se algum dos dois já está morto, ou seja, vida menor ou igual a 0.
     */
    static void combate() {
        int vidaCriatura = 50;
        int vidaPersonagem = 50;
        
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
    /**
     * Classe que ocorre após o usuario escolher Curar no seu turno, ela tem 3 poções que acabam.
     */
    static void curarPersonagem(){
        
        int vidaPersonagem = 50;
        int healthPotion = 3;
        
        if (healthPotion == 0 || healthPotion < 0) {
                    System.out.println("Voce nao tem mais pocoes disponiveis, se fudeu");
                } else {
                 vidaPersonagem+=24;   
                 healthPotion -=1;
                System.out.format("Sua vida atual e %d\n", vidaPersonagem);
                System.out.format("Voce so tem mais %d pocoes\n", healthPotion);
                }
    }
    /**
     * Classe que roda após o bot randomizar a opção Curar no seu turno, ele tem 3 poções.
     */
    static void curarInimigo(){
        
        int vidaCriatura = 50;
        
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