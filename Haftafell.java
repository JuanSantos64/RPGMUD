package rpgdoscara;

/**
 * authors: Cleiton, Caique, Henrique, Juan e Maicon Acompanhe o projeto em
 * nosso GitHub: https://github.com/JuanSantos64/Grupo-6---Turma-A
 */
import java.util.Random;

import java.util.Scanner;

import java.util.ArrayList;

/**
 * Classe do nosso projeto integrador: RPG Corporativo para educação
 * corporativa.
 *
 * @author juans
 */
public class Haftafell {

    // Variaveis Estaticas
    static int vidaCriatura = 50;
    static int healthPotionEnemy = 3;
    static int vidaPersonagem = 50;
    static int healthPotion = 3;
    // Variaveis Estaticas

    // Objetos Estaticos 
    static Random Random = new Random();
    static Scanner entrada = new Scanner(System.in);
    // Objetos Estaticos

    // Cores para o terminal
    static final String fim = "\u001B[0m";
    static final String red = "\u001B[31m";
    static final String green = "\u001B[32m";
    static final String yellow = "\u001B[33m";
    static final String cyan = "\u001B[36m";
    // Cores para o terminal

    /**
     * Classe que executa o RPG
     *
     * @param args
     */
    public static void main(String[] args) {
        menu(); // Começa a rodar o jogo a partir do menu!
        finalDoJogo();
    }
    /**
     * Classe que contêm o primeiro capitulo do jogo
     */
    public static void historiaCapitulo1() { // Inicia o começo da Historia do RPG
        String nome;
        System.out.println("Olá! Nosso código funciona com um sistema que é necessário apertar enter para que apareca o proximo dialogo. ");
        enter(entrada);
        System.out.println("Você acorda em um quarto em branco. Ele não tem começo nem fim. \nA claridade faz seus olhos se incomodarem, mas logo se acostumam. \nVocê se encontra confuso por não saber onde está e nem quem é.");
        enter(entrada);
        System.out.println("Uma luz azul contorna o ar. Runas aparecem diante de você. \nElas lembram números, mas \"estão escritas de formas diferentes?\"");
        enter(entrada);
        System.out.println("Os números se juntam com letras e você começa a interpretá-las.");
        enter(entrada);
        System.out.println("“Em eras ancestrais, quando a magia da matemática era desvelada,\ntecemos os fios do conhecimento para desvendar os segredos dos números divinos. \nE assim nasceram os \"Conjuntos Místicos\", onde os números se agrupavam em esferas mágicas. \nDentro delas, encontrávamos os Numéricos Naturais, Inteiros, Racionais, Irracionais e Reais. \nQual destes conjuntos os números místicos pertence o número PI??\n"
                + "Estranhamente você sabe a resposta e responde sussurando:");
        System.out.println(cyan + "Digite a resposta: " + fim);
        String resposta = entrada.next();
        String respostaparaVerificação = resposta.toLowerCase();
        if (respostaparaVerificação.equals("irracionais")) {
            System.out.println("É, e pensar que eu iria encontrar a matemática em um lugar como esse.");

        } else {
            System.out.println("“Irracionais”. É, e pensar que eu iria encontrar a matemática em um lugar como esse.");
            enter(entrada);
        }
        System.out.println("“Ah, que surpresa! Imaginar que um humano vindo da Terra Distante seria capaz de decifrar a língua sagrada.”");
        enter(entrada);
        System.out.println("No fundo da sala, surge um ser que você não havia percebido.\nAo tentar encarar seu rosto, seu corpo é tomado por uma agonia profunda, \numa entidade inimaginável envolta em uma aura de luz.");
        enter(entrada);
        System.out.println("Tomado pelo medo, você pergunta:\n"
                + "“Onde estou? Quem é você?");
        enter(entrada);
        System.out.println("O Ser cai em gargalhada respondendo:\n"
                + "-“Quem sou eu?’ Que espetáculo! Uma pergunta interessante … Primeiro me diga, quem é você?");
        System.out.println("Digite seu nome: ");
        nome = entrada.next();
        System.out.println("Ao falar o seu nome você entra em hipnose, e uma voz explica com detalhes o presente o passado desse mundo.");
        enter(entrada);
        System.out.println("Bem-vindo ao mundo de Haftafell!");
        enter(entrada);
        System.out.println(nome + ", o escolhido…");
        enter(entrada);
        System.out.println("O mundo de Haftafell, um lugar vasto e misterioso, repleto de magia e maravilhas. \nEm Haftafell, a Matemática é considerada a linguagem sagrada perdida, \num conhecimento tão poderoso que se acredita ter sido dado aos mortais por deuses antigos.");
        enter(entrada);
        System.out.println("Há milênios, Haftafell era um mundo em equilíbrio,\ngovernado por deuses antigos que haviam concedido aos mortais o conhecimento da Matemática Divina.\nEssa linguagem sagrada permitia que as quatro raças - elfos, anões, fadas e humanos - \nmoldassem a realidade de acordo com seus desejos, \ncriando uma era de prosperidade e harmonia.");
        enter(entrada);
        System.out.println("No entanto, essa paz foi abalada quando um grupo de mortais ambiciosos, conhecido como a \"Entidade Sombria\", \nroubou segredos profundos da Matemática Divina e começou a usá-los para fins egoístas. \nA ganância e a busca pelo poder levaram a uma guerra devastadora entre as raças, \nque resultou na perda do conhecimento da Matemática Divina e na obliteração dos elfos, \nanões e fadas restando assim apenas a raça dos humanos.");
        enter(entrada);
        System.out.println("Os deuses antigos, horrorizados com o abuso de seu presente, \nselaram a Matemática Divina em artefatos mágicos indecifráveis, runas e hieróglifos e se retiraram do mundo, \npela primeira vez os deuses desistiram deixando o mundo em um estado de desordem e conflito.");
        enter(entrada);
        System.out.println("No presente da campanha, Haftafell é um lugar dividido, \ncom as raças ainda se recuperando das cicatrizes da guerra passada.\nA Matemática Divina é considerada uma lenda, \numa linguagem perdida que poucos acreditam ser possível de dominar novamente.");
        enter(entrada);
        System.out.println("No entanto, uma profecia ancestral ressurge, \npredizendo o retorno da Matemática Divina e o surgimento de heróis destinados a desvendar seus segredos \ne enfrentar uma ameaça sombria que deseja usá-la para destruir o mundo. \nÉ nesse cenário que os jogadores entram em cena, \nescolhidos pelas circunstâncias e pelo destino para reverter o curso da história, \nreconciliar as raças e impedir a catástrofe iminente.");
        enter(entrada);
        System.out.println("O passado tumultuado de Haftafell, marcado pela ascensão e queda da Matemática Divina, \nestabelece o cenário para a jornada dos jogadores em busca do conhecimento perdido \ne a luta para proteger o mundo de uma nova ameaça, \nenquanto lidam com os traumas e preconceitos do passado.");
        enter(entrada);
        System.out.println("O " + nome + " estava imerso em pensamentos, tentando assimilar tudo o que havia aprendido sobre Haftafell e a Matemática Divina. \nA entidade misteriosa que estava agora diante dele parecia estar aguardando uma resposta a sua pergunta: \"Quem é você?\"");
        enter(entrada);
        System.out.println("Com uma sensação de déjà vu, o protagonista respondeu mais uma vez, pronunciando seu nome. \nUma onda de calma o envolveu enquanto imagens do passado de Haftafell se desenrolavam diante de seus olhos.");
        enter(entrada);
        System.out.println("Ele viu as quatro raças antigas coexistindo harmoniosamente, \ncompartilhando o conhecimento da Matemática Divina para criar maravilhas que desafiavam a compreensão. \nA imagem de elfos graciosos, anões mestres da tecnologia, fadas encantadas \ne humanos sábios e trabalhadores dançou em sua mente.");
        enter(entrada);
        System.out.println("Em seguida, \nas imagens se transformaram em visões da guerra, com a Entidade Sombria ameaçando tudo o que era belo em Haftafell. \nO caos que se seguiu e a perda da Matemática Divina assolaram o mundo, deixando cicatrizes profundas em sua alma.");
        enter(entrada);
        System.out.println("Quando as visões finalmente se dissiparam, a entidade misteriosa se apresentou: \n\"Sou Ygris, a Guardiã da Matemática Divina. \nMinha missão é zelar pelo conhecimento sagrado e, se possível, restaurar a harmonia em Haftafell.\"");
        enter(entrada);
        System.out.println("O protagonista, ainda tentando processar as informações, finalmente reuniu coragem para fazer outra pergunta: \n\"Como vim parar aqui? Por que fui escolhido?\"");
        enter(entrada);
        System.out.println("Ygris sorriu, revelando um brilho de esperança em seus olhos. \n\"Você foi escolhido, meu jogador, porque é a personificação de uma antiga profecia. \nHá muito tempo, os deuses antigos previram a chegada de alguém que poderia trazer de volta a Matemática Divina \ne enfrentar a ameaça sombria que busca destruir nosso mundo, \nnossos Deuses não puderam interferir diretamente nessa influência, se sentiram incapazes diante da lei universal. \nO destino é incerto, afinal cada ser vivo escreve o seu. \nPor muito tempo acreditamos ter sido um erro entregar esse conhecimento\".");
        enter(entrada);
        System.out.println("Ygris estende a mão, e um pergaminho mágico com runas brilhantes apareceu em sua palma. \n\"Você deve buscar as Runas Primordiais, fragmentos de conhecimento que podem desvendar os segredos da Matemática Divina. \nA primeira runa o aguarda na cidade de Midland, onde você encontrará aliados e desafios.\"");
        enter(entrada);
        System.out.println("Com determinação, você pega o pergaminho e se preparou para a jornada à frente. \nO destino de Haftafell repousava sobre seus ombros, \nirá enfrentar o desconhecido em busca da Matemática Divina e da salvação de seu novo mundo.");
        enter(entrada);
    }

    public static void historiaCapitulo2() { // Segundo cápitulo da historia do RPG
        System.out.println("Capítulo 2: A Jornada");
        enter(entrada);
        System.out.println("Após abrir o pergaminho você é teletransportado e se encontra diante da imponente cidade de Midland, uma simples cidade, mas interessante.\nAs ruas movimentadas exalam uma atmosfera agitada, o doce aroma das comidas sendo feitas pelos mercadores te encanta e te faz perder o foco, mas você logo volta a seu caminho. \nO pergaminho aponta para a cidade, você precisa encontrar mais pistas.");
        enter(entrada);
        System.out.println("Tome uma decisão");
        System.out.println(yellow + "Visitar a Biblioteca de Midland: Procurar por textos antigos ou sábios que possam indicar a localização da Runa." + fim);
        System.out.println("");
        System.out.println(yellow + "Conversar com os Habitantes Locais: Buscar informações de boatos ou lendas relacionadas à Matemática Divina." + fim);
        enter(entrada);
        System.out.println("Escolha seu caminho digitando o número correspondente.");
        System.out.println(yellow + "1 - Cena 1: Explorar a Praça Central" + fim);
        System.out.println(yellow + "2 - Cena 2: Conversar com os habitantes locais." + fim);
        int escolha = entrada.nextInt();
        switch (escolha) {
            case 1 -> {
                historiaCapitulo2Cena1();
            }
            case 2 ->
                historiaCapitulo2Cena2();
            default -> {
                System.out.println("Você não digitou uma opção válida, você reiniciará o capitulo 2");
                historiaCapitulo2();
            }
        }

    }
    static void desafio1(){
        System.out.println("=== Desafio ===");
        System.out.println("Quanto é 2020 elevado a 0 ?");
        System.out.println("1 - 0");
        System.out.println("2 - 1");
        System.out.println("3 - 2020");
        int escolhaaa = entrada.nextInt();
        switch (escolhaaa) {
            case 2 ->
                System.out.println("Após resolver o desafio uma luz surge em volta da árvore, \nformando uma espécie de globo, o tempo lá fora parece estar passando devagar...");
            default -> {
                System.out.println("Você errou meu querido, estamos reiniciando a pergunta");
                desafio1();
            }
        }
        
    }
    static void desafio2(){
                        System.out.println("=== Desafio ===");
                System.out.println("Qual a teoria que diz:");
                System.out.println("A soma dos quadrados dos catetos é igual ao quadrado da hipotenusa");
                System.out.println("1 - Teoria de pitágoras");
                System.out.println("2 - Teoria de platão");
                System.out.println("3 - Teoria de aristóteles");
                int escolha = entrada.nextInt();
                 switch (escolha) {
                    case 1 ->
                        System.out.println("Parece realmente conhece sobre o nosso mundo, aqueles que estão acima do céu escolheram bem!");
                    default -> {
                        System.out.println("Errou, você está iniciando novamente a pergunta ");
                        desafio2();
                    }
                }
    }
    static void desafio3(){
                System.out.println("=== Desafio ===");
                System.out.println("Qual o nome da função da seguinte equação:");
                System.out.println("F(x) = (1/3)^x + 69");
                System.out.println("1 - Função Quadrática");
                System.out.println("2 - Função Exponencial");
                System.out.println("3 - Função Logáritma");
                int escolha = entrada.nextInt();
                if (escolha != 2) {
                    System.out.println("Errou, você está iniciando novamente o desafio ");
                    desafio3();
                }
                
    }
    static void desafio4(){
        System.out.println("No meu jardim existe 3 pés de alface, 1 de pepino e 5 de cenoura. Quantos pés eu tenho no total?");
        System.out.println("1 - 3 ");
        System.out.println("2 - 2");
        System.out.println("3 - 9");
        int escolha = entrada.nextInt();
               switch (escolha) {
            case 2:
                System.out.println("Você encontrou uma praça");
                historiaCapitulo2Cena1();
                break;
            default:
                System.out.println("Você errou, estamos reiniciando o desafio");
                desafio1();
                break;
        }
    }
    static void desafio5(){
        System.out.println("Meu avô tem 5 filhos, cada filho tem 3 filhos. Quantos primos eu tenho?");
        System.out.println("1 - 12");
        System.out.println("2 - 15");
        System.out.println("3 - 3");
        int a = entrada.nextInt();
        switch (a){
                    case 1: 
                        System.out.println("Um Gênio, eu diria, você finalmente entendeu!  \nO feiticeiro está se mordendo de raiva, ele não pensava alguém teria o conhecimento da Matemática Divina.");
                        break;
                    default:
                        System.out.println("Errado, reiniciando o desafio");
                        desafio5();
                }
    }
    static void desafio6(){
        System.out.println("Quando eu tinha 8 anos, a minha irmã tinha a metade da minha idade. \nAgora que tenho 54 anos, com quantos anos minha irmã está?");
        System.out.println("1 - 58");
        System.out.println("2 - 51");
        System.out.println("3 - 50");
        int a = entrada.nextInt();
        if (a != 3){
            desafio6();
        }
    }


    /**
     * Classe que contém a historia da decisão existente no segundo capitulo,
     * caso escolhido cena 1
     */
    static void historiaCapitulo2Cena1() {
        System.out.println("Ao caminhar pela praça, \nvocê observa um grupo de crianças brincando com pedras brilhantes desenhadas com símbolos matemáticos. \nIntrigado, você se aproxima e pergunta sobre a Matemática Divina. \nUma das crianças menciona um lago perto da cidade que costuma frequentar, diz a pegou de lá…\"");
        System.out.println(yellow + "1 - Perguntar a localização do lago." + fim);
        System.out.println(yellow + "2 - Seguir a viagem." + fim);
        System.out.println("Escolha: ");
        int escolhaCena1 = entrada.nextInt();
        if (escolhaCena1 == 1) {
            System.out.println("“Ele fica a 200 passos em direção aonde o sol se põe” disse uma pequena menina de vestido e cabelo bagunçado.");
            System.out.println(yellow + "1 - Ir aonde a pequena menina informou." + fim);
            System.out.println(yellow + "2 - Pegar uma pedra mágica para ver melhor..." + fim);
            System.out.println("Escolha: ");
            int escolhaCena1ponto = entrada.nextInt();

        } else {
            System.out.println(yellow + "Pegar uma pedra mágica para ver melhor..." + fim);
        }
        System.out.println("A oeste de Midland, você encontra um grande lago. \nMas que estranho, porque tem uma pequena “ilha” no meio? Com uma grande árvore...");
        System.out.println("Ao continuar caminhando você se depara com um pequeno barco na margem do lago, \numa figura estranha com uma silhueta intimidadora e sombria está sentada no barco olhando em direção a “pequena ilha”. \nAo se aproximar exige ele uma moeda, você não entende muito bem. ");
        System.out.println(yellow + "1 - Entregar uma potion " + fim);
        System.out.println(yellow + "2 - Roubar o barco " + fim);
        int escolhaa = entrada.nextInt();
        switch (escolhaa) {
            case 1 ->
                System.out.println("Ao entregar uma poção, ele te leva até a ilha, lá você vê mais de perto a árvore gigante, ao centro você encontra uma escrita:");
            case 2 ->
                System.out.println("Você vai até a ilha, lá você vê mais de perto a árvore gigante, ao centro você encontra uma escrita:");
        }
        
        desafio1();

        System.out.println("A terra começa a tremer, \num guardiã que estava debaixo do solo, aparece levantando a árvore que está nas suas costas, \nseu corpo é me rochoso, está coberto de musgo…");
        enter(entrada);
        System.out.println("O guardião está desnorteado, ele ataca tudo em sua frente, inclusive você…");
        enter(entrada);
        System.out.println("Em seu corpo, existe uma parte tomada pela escuridão, \no grupo da Entidade Sombria estava tentando fazendo experimentos  com ele…");
        enter(entrada);
        System.out.println("Ele está em agonia, a natureza da Matemática foi mexida…");
        enter(entrada);
        System.out.println("O guardião cai no chão…");
        enter(entrada);
        System.out.println("A luz que você viu saindo da árvore se transformou em um espírito, ele tem uma pequena luz amarela e um formato engraçado.");
        enter(entrada);
        System.out.println("“ Um humano? Pelos Deuses! Por quanto tempo eu dormi? Aqueles malditos, me prenderam por quanto tempo? \nDeviam ter avisado que o escolhido viria até mim?”");
        enter(entrada);
        System.out.println(yellow + "1 - Perguntar mais sobre o espírito" + fim);
        System.out.println(yellow + "2 - Continuar" + fim);
        int escolha = entrada.nextInt();
        switch (escolha) {
            case 1 ->
                System.out.println("Me chamo Landvaettir, mas pode me chamar de Land! \nMe avisaram que o Escolhido viria para esse mundo, estou aqui para te guiar! \nMas primeiro vamos desvendar a Matemática!");
            case 2 ->
                System.out.println("O espírito se chama Land, ele está aqui para te testar! ");
        }
        System.out.println(yellow + "1 - Desvendar escritas antigas!" + fim);
        System.out.println(yellow + "2 - Derrotar um Golem" + fim);
        escolha = entrada.nextInt();
        switch (escolha) {
            case 1 -> {
                desafio2();
                desafio3();
            }
            case 2 ->
                combateFacil();
        }
        System.out.println("Você desbloqueou a “ Visão dos primeiros”!");
        enter(entrada);
        System.out.println("A Matemática tem várias camadas, para ser capaz de manipular a natureza você precisa enxerga-lá! \nIsso vai ajudar.");
        enter(entrada);
        System.out.println("Espírito – O primeiro humano a conseguir o olhar dos ancestrais, \nmeus parabéns, se sinta honrada, com isso você vai enxergar o que humanos normais não conseguem.");
        enter(entrada);
        System.out.println("Vamos testá-la!");
        combateMedio();
        System.out.println("Você conseguiu a primeira Runa, ela dirá que caminho você deve seguir para em encontrar as próximas !");
        enter(entrada);
        System.out.println("Espera!");
        enter(entrada);
        System.out.println("O seu corpo fica paralisado, um fluxo de ar ensurdecedor está te prendendo!!");
        enter(entrada);
        System.out.println("Uma gargalhada é ouvida ao seu redor, é um dos desgraçados da Entidade Sombra, um feiticeiro!");
        enter(entrada);
        System.out.println("“Essa foi fácil, e pensar que você encontraria uma runa para mim pequeno humano... \nMe economizou um tempo enorme, hahaha, mas tempo não é um problema para nós.”");
        enter(entrada);
        System.out.println("Com a Visão dos primeiros ela te traz a capacidade de ver a camada da natureza construída.");
        enter(entrada);
        System.out.println(yellow+"1 - Usar a Visão"+fim);
        System.out.println(yellow+"2 - Tentar se soltar"+fim);
        escolha = entrada.nextInt();
        switch(escolha){
            case 1:
                System.out.println("Ao usar a Visão você consegue enxergar a fórmula que está controlando o vento. \nTente Resolve-la para se desprender.");
                desafio5();
                break;
            case 2:
                System.out.println("Você não consegue sair do fluxo, te falta um conhecimento profundo!");
                desafio5();
                break;   
        }
        System.out.println(yellow+"1 - Atacar o feiticeiro"+fim);
        System.out.println(yellow+"2 - Tentar Prende-lo"+fim);
        escolha = entrada.nextInt();
        switch(escolha){
            case 1: 
                combateDificil();
        System.out.println("Você causou danos nele, chamas surgem queimando o seu corpo!");
        enter(entrada);
        System.out.println("A runa está intacta. Parabéns, jovem mestre, menos um para a conta.");
        enter(entrada);
        break;
            case 2:
                System.out.println("Manipular a matéria ainda é complicado...");
                enter(entrada);
                System.out.println("Vamos tentar criar uma onda de ar e prendê-lo com hastes de minérios.");
                enter(entrada);
                System.out.println("Para isso, você precisa primeiro enfraquece-lo!");
                enter(entrada);
                combateDificil();
                System.out.println("Resolva esse desafio para prende-lo");
                enter(entrada);
                desafio6();
                System.out.println("Você conseguiu prender o desgraçado. \nEle está entrando em desespero por causa da prisão que você criou.");
                enter(entrada);
                System.out.println("A runa está intacta. \nParabéns, jovem mestre, menos um para a conta. Muitos desafios estão por vir, são tempos difíceis...");
                break;
        }
        
        
    }
    
    public static void finalDoJogo(){
            System.out.println("Obrigado por jogar nosso jogo! Ficamos muito agradecidos que você chegou até o final dele!");
            System.out.println("Espero que tenha gostado e que tenha aprendido algo ;-)");
            System.out.println("Criadores: Caique, Cleiton, Henrique, Juan e Maicon");
    }

    /**
     * Classe que contém a historia da decisão existente no segundo capitulo,
     * caso escolhido cena 2
     */
    static void historiaCapitulo2Cena2() {
        System.out.println("Você decide se aproximar de um grupo de habitantes locais em uma taverna. \nAo mencionar a Matemática Divina, um velho ancião menciona uma antiga ruína nos arredores de Midland, \nconhecida por esconder segredos mágicos, mas “apenas boatos” ");
        System.out.println(yellow + "1 - Partir para a Ruína." + fim);
        System.out.println(yellow + "2 - Perguntar por mais detalhes na Taverna." + fim);
        int escolha = entrada.nextInt();
        switch(escolha){
            case 1:
                System.out.println("Chegando na ruína você encontra uma montanha de pedras, todas enfileiradas formando um arco. \nVocê se aproxima e ao tocar nela.");
        enter(entrada);
        System.out.println("As runas azuis aparecem diante de você.");
        enter(entrada);
        break;
        }
        System.out.println("O ancião começa a contar uma pequena história: \n“A ruína de Alfheim, a terra dos elfos, por muitos invernos atrás, na era primordial, os elfos guardaram seus segredos. \nA capacidade de moldar a natureza em sua volta os fizeram conquistar o segredo de viver em paz e harmonia, \naté a chegada daqueles asquerosos e gananciosos da Entidade Sombria, aqueles malditos, \nachavam que podiam brincar de ser Deuses, cof, cof... Ah!\nO calafrio me disse que você devia ir até lá”");
        enter(entrada);
        System.out.println("Você responde: Calafrio?");
        enter(entrada);
        System.out.println("Ancião: Sim, o da minha espinha, sempre quando digo algo interessante, cof, cof...");
        enter(entrada);
        System.out.println(yellow + "Partir para a Ruína." + fim);
        enter(entrada);
        System.out.println("Chegando na ruína você encontra uma montanha de pedras, todas enfileiradas formando um arco. \nVocê se aproxima e ao tocar nela.");
        enter(entrada);
        System.out.println("As runas azuis aparecem diante de você.");
        enter(entrada);

        desafio4();

    }

    /**
     * Classe que contêm a mecânica de apertar enter para que os dialogos
     * continuem
     *
     * @param entrada
     */
    static void enter(Scanner entrada) {
        entrada.nextLine(); // Aguarda até que o usuário pressione Enter
    }

    /**
     * Classe que gera as opções de turno do personagem principal para o combate
     * facil
     */
    static void combatePersonagemFacil() { //Decisões do turno do personagem

        System.out.println("== Seu turno ==");
        System.out.println(red + "1 - Golpear" + fim);
        System.out.println(green + "2 - Curar" + fim);

        System.out.println("===============");
        int escolha = entrada.nextInt();
        switch (escolha) {
            case 1 -> {
                System.out.println(red + "Voce escolheu golpear" + fim);
                enter(entrada);
                ataquePersonagemFacil(danoPersonagem());
            }
            case 2 -> {
                System.out.println(green + "Voce escolheu curar" + fim);
                enter(entrada);
                curarPersonagem();

            }

            default ->{
                System.out.println("Você não escolheu um número válido");
                combatePersonagemFacil();
            }
        }

    }

    /**
     * Classe que gera as opções de turno do personagem principal para o combate
     * facil
     */
    static void combatePersonagemMedio() { //Decisões do turno do personagem

        System.out.println("== Seu turno ==");
        System.out.println(red + "1 - Golpear" + fim);
        System.out.println(green + "2 - Curar" + fim);

        System.out.println("===============");
        int escolha = entrada.nextInt();
        switch (escolha) {
            case 1 -> {
                System.out.println(red + "Voce escolheu golpear" + fim);
                ataquePersonagemMedio(danoPersonagem());
            }
            case 2 -> {
                System.out.println(green + "Voce escolheu curar" + fim);
                curarPersonagem();

            }

            default ->{
                System.out.println("Você não escolheu um número válido");
                combatePersonagemMedio();
            }
        }

    }

    /**
     * Classe que gera as opções de turno do personagem principal para o combate
     * facil
     */
    static void combatePersonagemDificil() { //Decisões do turno do personagem

        System.out.println("== Seu turno ==");
        System.out.println(red + "1 - Golpear" + fim);
        System.out.println(green + "2 - Curar" + fim);

        System.out.println("===============");
        int escolha = entrada.nextInt();
        switch (escolha) {
            case 1 -> {
                System.out.println(red + "Voce escolheu golpear" + fim);
                ataquePersonagemDificil(danoPersonagem()); // Faz uma pergunta e se for correta da dano no inimigo
            }
            case 2 -> {
                System.out.println(green + "Voce escolheu curar" + fim);
                curarPersonagem(); // Usa uma poção para curar vida do personagem principal, podendo usar apenas 3

            }

            default ->{
                System.out.println("Você não escolheu um número válido");
                combatePersonagemDificil();
            }

        }

    }

    /**
     * Classe que contém a randomificação do dano do personagem se ele acertar a
     * pergunta
     *
     * @return numero int randomizado
     */
    static int danoPersonagem() {
        int danoPersonagem = Random.nextInt(13, 25); // Número entre 13 e 24
        return danoPersonagem;
    }

    /**
     * Classe que contém a randomificação do dano do inimigo se o personagem
     * errar a pergunta
     *
     * @return numero int randomizado
     */
    static int danoInimigo() {
        int danoInimigo = Random.nextInt(13, 25); // Número entre 13 e 24
        return danoInimigo;
    }

    /**
     * Classe que gera o turno do oponente no combate facil, com uma
     * randomização nas ações do inimigo (bot)
     */
    static void combateInimigoFacil() { //Randomificação das decisões do inimigo
        int decisao = Random.nextInt(5);//Randomificação das decisões do inimigo, escolhe um número de 0 a 4
        switch (decisao) {//Randomificação das decisões do inimigo
            case 0, 1, 3 -> {
                System.out.println(red + "O inimigo escolheu golpear" + fim);
                ataqueMiniBossFacil(danoInimigo());
            }
            case 2, 4 -> {
                System.out.println(green + "O inimigo escolheu curar" + fim);
                curarInimigo();

            }

        }
    }

    /**
     * Classe que gera o turno do oponente no combate médio, com uma
     * randomização nas ações do inimigo (bot)
     */
    static void combateInimigoMedio() { //Randomificação das decisões do inimigo
        int decisao = Random.nextInt(5);//Randomificação das decisões do inimigo, escolhe um número de 0 a 4
        switch (decisao) {//Randomificação das decisões do inimigo
            case 0, 1, 3 -> {
                System.out.println(red + "O inimigo escolheu golpear" + fim);
                ataqueMiniBossMedio(danoInimigo());
            }
            case 2, 4 -> {
                System.out.println(green + "O inimigo escolheu curar" + fim);
                curarInimigo();

            }

        }
    }

    /**
     * Classe que gera o turno do oponente no combate dificil, com uma
     * randomização nas ações do inimigo (bot)
     */
    static void combateInimigoDificil() { //Randomificação das decisões do inimigo
        int decisao = Random.nextInt(5);//Randomificação das decisões do inimigo, escolhe um número de 0 a 4
        switch (decisao) {//Randomificação das decisões do inimigo
            case 0, 1, 3 -> {
                System.out.println(red + "O inimigo escolheu golpear" + fim);
                ataqueMiniBossDificil(danoInimigo());
            }
            case 2, 4 -> {
                System.out.println(green + "O inimigo escolheu curar" + fim);
                curarInimigo();

            }

        }
    }

    /**
     * Classe que mostra os cápitulos da historia para selecionar no menu
     * inicial
     */
    static void escolhaCapitulo() { //Tela ao selecionar a opção capitulos do menu.
        /**
         * Classe que mostra os cápitulos da historia para selecionar
         */
        System.out.println("1 - Cápitulo 1");
        System.out.println("2 - Cápitulo 2");
        System.out.println("3 - Voltar ao menu inicial");
        

        int escolha = entrada.nextInt();

        switch (escolha) { // Escolha dos capitulos
            case 1 -> {
                System.out.println("Você está entrando no primeiro capitulo do jogo, chamado de Prólogo, boa sorte!");
                historiaCapitulo1();
            }
            case 2 -> {
                System.out.println("Você está entrando no segundo capitulo do jogo, chamado de A Jornada Inicial, boa sorte!");
                historiaCapitulo2();
            }
            case 3 -> {
                 System.out.println("Voltando para o menu inicial");
                menu();
            }
            default -> {
                System.out.println("Digite um número válido");
                escolhaCapitulo();
            }
            
        }
        // Escolha dos capitulos
    }

    /**
     * Classe que mostra os combates para selecionar no menu inicial
     */
    static void escolhaCombate() { //Tela ao selecionar a opção capitulos do menu.
        /**
         * Classe que mostra os cápitulos da historia para selecionar
         */
        System.out.println("1 - Combate Facil");
        System.out.println("2 - Combate Medio");
        System.out.println("3 - Combate Dificil");
        System.out.println("4 - Voltar ao menu inicial");

        int escolha = entrada.nextInt();

        switch (escolha) { // Escolha dos capitulos
            case 1 -> {
                System.out.println("Você está entrando em combate facil, boa sorte!");
                combateFacil();
            }
            case 2 -> {
                System.out.println("Você está entrando em combate medio, boa sorte!");
                combateMedio();
            }
            case 3 -> {
                System.out.println("Você está entrando em combate dificil, boa sorte!");
                combateDificil();
            }
            case 4 -> {
                System.out.println("Voltando para o menu inicial");
                menu();
            }
            default-> {
                System.out.println("Digite uma opção válida!");
         escolhaCombate();       
            }
        }
        // Escolha dos capitulos
    }

    /**
     * Classe que roda após o usuário escolher a opção Golpear no combate facil.
     * Ela gera uma pergunta que o aliado deve responder corretamente para dar
     * um dano aleatorio maior que 13 e menor que 24. int a = numero random
     */
    static void ataquePersonagemFacil(int a) {

        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo / personagem
        perguntas.add("35 estudantes estrangeiros vieram ao Brasil. 16 visitaram Manaus; 16, S. Paulo e 11, Salvador. \nDesses estudantes, 5 visitaram Manaus e Salvador e, desses 5, 3 visitaram também São Paulo. \nO número de estudantes que visitaram Manaus ou São Paulo foi:\n"
                + "\n"
                + "A) 29.\n"
                + "\n"
                + "B) 24.\n"
                + "\n"
                + "C) 11.\n"
                + "\n"
                + "D) 8.\n"
                + "\n"
                + "E) 5.");
        perguntas.add("Os senhores A, B e C concorriam à liderança de certo partido político. \nPara escolher o líder, cada eleitor votou apenas em dois candidatos de sua preferência. \nHouve 100 votos para A e B, 80 votos para B e C e 20 votos para A e C. \nEm consequência:\n"
                + "\n"
                + "A) venceu A, com 120 votos.\n"
                + "\n"
                + "B) venceu A, com 140 votos.\n"
                + "\n"
                + "C) A e B empataram em primeiro lugar.\n"
                + "\n"
                + "D) venceu B, com 140 votos.\n"
                + "\n"
                + "E) venceu B, com 180 votos.");
        perguntas.add("Um fabricante de cosméticos decide produzir três diferentes catálogos de seus produtos, visando a públicos distintos. \nComo alguns produtos estarão presentes em mais de um catálogo e ocupam uma página inteira, ele resolve fazer uma contagem para diminuir os gastos com originais de impressão. \nOs catálogos C1, C2 e C3 terão, respectivamente, 50, 45 e 40 páginas. \nComparando os projetos de cada catálogo, ele verifica que C1 e C2 terão 10 páginas em comum; C1 e C3 terão 6 páginas em comum; C2 e C3 terão 5 páginas em comum, das quais 4 também estarão em C1. \nEfetuando os cálculos correspondentes, o fabricante conclui que, para a montagem dos três catálogos, necessitará de um total de originais de impressão igual a:\n"
                + "\n"
                + "A) 135.\n"
                + "\n"
                + "B) 126.\n"
                + "\n"
                + "C) 118.\n"
                + "\n"
                + "D) 114.\n"
                + "\n"
                + "E) 110.");
        perguntas.add("Qual a proposição abaixo é verdadeira?\n"
                + "\n"
                + "a) Todo número inteiro é racional e todo número real é um número inteiro.\n"
                + "b) A intersecção do conjunto dos números racionais com o conjunto dos números irracionais tem 1 elemento.\n"
                + "c) O número 1,83333... é um número racional.\n"
                + "d) A divisão de dois números inteiros é sempre um número inteiro.");
        perguntas.add("Dado o conjunto U = números naturais de 0 até 20. \nSabendo que B = números múltiplos de 3, podemos afirmar que o conjunto B diferenca U  é igual ao conjunto:\n"
                + "\n"
                + "A) {3,6,9,12,15,18}\n"
                + "\n"
                + "B) {1,2,4,5,7,8,10,11,13,14,16,17,19,20}\n"
                + "\n"
                + "C) {0,2,4,6,12,15}\n"
                + "\n"
                + "D) {1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}\n"
                + "\n"
                + "E) {3}");
        perguntas.add("Sobre os conjuntos numéricos, escolha a alternativa incorreta.\n"
                + "\n"
                + "A) Todo número natural é também um número racional.\n"
                + "\n"
                + "B) Um número racional não pode ser irracional.\n"
                + "\n"
                + "C) Todo número negativo é um número inteiro.\n"
                + "\n"
                + "D) O conjunto dos números reais é formado pela união dos números racionais e irracionais.\n"
                + "\n"
                + "E) As dízimas periódicas são consideradas números racionais, portanto são também números reais.");
        perguntas.add("Em uma escola, 300 alunos foram entrevistados sobre as práticas esportivas. \nOs estudantes foram questionados sobre a prática de exercícios fora da escola. \nCom esse questionário, foi possível dividir os estudantes em grupos:\n"
                + "\n"
                + "110 alunos afirmaram que fazem musculação fora da escola;\n"
                + "140 alunos afirmaram que jogam futebol fora da escola; e\n"
                + "80 estudantes afirmaram que praticam outros tipos de atividade física, como corrida e natação.\n"
                + "Sabendo que 40 alunos praticam futebol e musculação, 33 praticam futebol e outra atividade física,  24 praticam musculação e outra atividade física e que 8 estudantes praticam os três.\nO número de estudantes sedentários, ou seja, que não praticam nenhuma das três modalidades, é:\n"
                + "\n"
                + "A) 35.\n"
                + "\n"
                + "B) 42.\n"
                + "\n"
                + "C) 59.\n"
                + "\n"
                + "D) 74.\n"
                + "\n"
                + "E) 95.");
        perguntas.add("Seja A = {2,5}, B = {2,5,6} e C = {6,10}, determine os elementos da operação (A U B) ∩ (B U C).\n"
                + "\n"
                + "A) {2,5,6}\n"
                + "\n"
                + "B) {2,5}\n"
                + "\n"
                + "C) {6,10}\n"
                + "\n"
                + "D) {2,5,6,10}\n"
                + "\n"
                + "E) {2,10}");
        perguntas.add(" Sobre os conjuntos numéricos, julgue as afirmativas a seguir.\n"
                + "\n"
                + "I – A diferença entre o conjunto dos números reais e o conjunto dos números racionais é igual ao conjunto dos números irracionais.\n"
                + "\n"
                + "II – Zero pertence ao conjunto dos números irracionais.\n"
                + "\n"
                + "III – O resultado de | -7,5 | é um número natural.\n"
                + "\n"
                + "Marque a alternativa correta.\n"
                + "\n"
                + "A) Somente a afirmativa I é verdadeira.\n"
                + "\n"
                + "B) Somente a afirmativa II é verdadeira.\n"
                + "\n"
                + "C) Somente a afirmativa III é verdadeira.\n"
                + "\n"
                + "D) Somente as afirmativas I e III são verdadeiras.\n"
                + "\n"
                + "E) Todas as afirmativas são verdadeiras.");
        perguntas.add("A quantidade de elementos do conjunto (A – B) U C, em que A = {2,4,6,8,10,12,14} B = {3,6,8,12} e C = {0,4,7}, é:\n"
                + "\n"
                + "A) 2\n"
                + "\n"
                + "B) 3\n"
                + "\n"
                + "C) 4\n"
                + "\n"
                + "D) 5\n"
                + "\n"
                + "E) 6");
        int n = perguntas.size();
        Random pergunta = new Random();
        int numPergunta = pergunta.nextInt(n);
        ArrayList<Character> respostas = new ArrayList<>(); // Array das respostas das perguntas do inimigo / personagem
        respostas.add('a');
        respostas.add('e');
        respostas.add('c');
        respostas.add('c');
        respostas.add('b');
        respostas.add('c');
        respostas.add('c');
        respostas.add('a');
        respostas.add('a');
        respostas.add('e');

        System.out.println(perguntas.get(numPergunta));
        System.out.println("Digite a resposta correta! ");
        String resposta = entrada.next();
        resposta = resposta.toLowerCase();
        char respostaArray = resposta.charAt(0);

        if (respostas.get(numPergunta) == respostaArray) {
            System.out.println("Resposta correta, você atacou o golem");
            System.out.format("O dano total foi de%s%n%d%s%n\n", red, a, fim);
            vidaCriatura -= a;
            if (vidaCriatura <= 0) {
                vidaCriatura = 0;
            } else {
                System.out.format("A vida do golem está em %s%n%d%s%n\n", red, vidaCriatura, fim);
            }
        } else {
            System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta) + " você errou o ataque no golem");
        }
       
    }

    /**
     * Classe que roda após o usuário escolher a opção Golpear no combate médio.
     * Ela gera uma pergunta que o aliado deve responder corretamente para dar
     * um dano aleatorio maior que 13 e menor que 24. int a = numero random
     */
    static void ataquePersonagemMedio(int a) {

        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo / personagem
        perguntas.add("O valor de x que faz a equação 2^(x+1)=32\n(Dica: Tente colocar os números na mesma base em ambos os lados) "
                + "  é:\n"
                + "\n"
                + "A) 2\n"
                + "\n"
                + "B) 3\n"
                + "\n"
                + "C) 4\n"
                + "\n"
                + "D) 5\n"
                + "\n"
                + "E) 6");
        perguntas.add("Analise a equação a seguir:\n"
                + "\n"
                + "2^(x^2−4)=128\n"
                + " \n"
                + "\n"
                + "Sobre essa equação, podemos afirmar que:\n"
                + "\n"
                + "A) É uma equação polinomial do 1º grau.\n"
                + "\n"
                + "B) É uma equação polinomial do 2º grau.\n"
                + "\n"
                + "C) É uma equação trigonométrica.\n"
                + "\n"
                + "D) É uma equação exponencial.\n"
                + "\n"
                + "E) É uma equação logarítmica.");
        perguntas.add("Encontre o valor de x na equação:\n(Dica: Separe os números exponenciados com os principios da potenciação)"
                + "\n"
                + "3^(x+2)+3^x=2430\n"
                + " \n"
                + "\n"
                + "A) x = 5\n"
                + "\n"
                + "B) x = 4\n"
                + "\n"
                + "C) x = 3\n"
                + "\n"
                + "D) x = 2\n"
                + "\n"
                + "E) x = 1");
        perguntas.add("O conjunto de soluções da equação exponencial 3⋅2x2−4=48\n(Dica: Resolva a equação e reformule o jeito de escrever o resultado que você descobrirá a resposta)"
                + "  é:\n"
                + "\n"
                + "A)x=±2\n"
                + "\n"
                + "B)x=±2√2\n"
                + " \n"
                + "\n"
                + "C)x=±4\n"
                + "\n"
                + "D)x=±4√2\n"
                + " \n"
                + "\n"
                + "E)x=±√6");
        perguntas.add("O montante de determinado capital em um fundo de investimento, após o tempo t em anos, é dado pela fórmula M(t)=C⋅1,5^t\n"
                + "Nessas condições, o tempo necessário para que um capital de R$ 800 investido gere um montante de R$ 4050 é de:\n(Dica: Substitua M(t) e C pelos valores corretos)"
                + "\n"
                + "A) 3 anos\n"
                + "\n"
                + "B) 4 anos\n"
                + "\n"
                + "C) 5 anos\n"
                + "\n"
                + "D) 6 anos\n"
                + "\n"
                + "E) 7 anos");
        perguntas.add("A quantidade de bactérias de uma cultura, depois de t horas, é dada pela expressão Q(t)=Q0*2^t\n"
                + ", em que Q0  é a quantidade inicial de bactérias. Nessas condições, se inicialmente havia 1500 bactérias, após quantas horas haverá 12.000 bactérias?\n(Dica: Substitua Q(t) e Q0 pelos valores corretos)"
                + "\n"
                + "A) 1 hora\n"
                + "\n"
                + "B) 3 horas\n"
                + "\n"
                + "C) 5 horas\n"
                + "\n"
                + "D) 7 horas\n"
                + "\n"
                + "E) 8 horas");
        perguntas.add("Durante um experimento, obteve-se a fórmula para a população de bactérias:\n"
                + "\n"
                + " q(t)=20*2^(3t)\n"
                + "\n"
                + "Em que t é o tempo, em hora, e q(t) é a população, em milhares de bactérias. \nSe a população de bactérias era incialmente de 20 mil, então após quanto tempo ela será dobrada? \n(Dica: Substitua q(t) pela quantidade de bacteria desejada e resolva a questão)\n"
                + "\n"
                + "A) 3 horas\n"
                + "\n"
                + "B) 1 hora\n"
                + "\n"
                + "C) 30 minutos\n"
                + "\n"
                + "D) 20 minutos\n"
                + "\n"
                + "E) 10 minutos");
        perguntas.add("Sabendo que x=(1/5)^(2t+1)\n"
                + " e y=(0,2)^(3t − 2) \n"
                + "O valor de y que faz com que x seja igual a y é: (Dica: Transformte os números em decimais ou frações e iguale uma equação a outra) \n"
                + "\n"
                + "A) -1\n"
                + "\n"
                + "B) 0\n"
                + "\n"
                + "C) 1\n"
                + "\n"
                + "D) 2\n"
                + "\n"
                + "E) 3");
        perguntas.add(" Dada a equação exponencial 3^(x^2−x) = 9.\n"
                + "A soma das soluções dessa equação é: (Dica: Iguale a equação a 0 e some o resultado de x1 + x2) \n"
                + "\n"
                + "A) -1\n"
                + "\n"
                + "B) 0\n"
                + "\n"
                + "C) 1\n"
                + "\n"
                + "D) 2\n"
                + "\n"
                + "E) 3");
        perguntas.add("Utilizamos a potenciação para modelar fenômenos que crescem muito rápido, por exemplo, o crescimento das infecções de um vírus durante uma pandemia. \nSuponha que o número de infectados se inicia em 2 e que cada pessoa infectada infecte outras 3, ou seja, na primeira semana, haverá 6 infectadas, na segunda, 18, e assim sucessivamente. \nSupondo que o ritmo de infecção continue o mesmo por, pelo menos, um ano, então, após quantas semanas, haverá 4374 pessoas infectadas?\n(Dica: Modele a pergunta para uma equação)"
                + "\n"
                + "A) 5 semanas\n"
                + "\n"
                + "B) 6 semanas\n"
                + "\n"
                + "C) 7 semanas\n"
                + "\n"
                + "D) 8 semanas\n"
                + "\n"
                + "E) 9 semanas");
        int n = perguntas.size();
        Random pergunta = new Random();
        int numPergunta = pergunta.nextInt(n);
        ArrayList<Character> respostas = new ArrayList<>(); // Array das respostas das perguntas do inimigo / personagem
        respostas.add('c');
        respostas.add('d');
        respostas.add('a');
        respostas.add('b');
        respostas.add('b');
        respostas.add('b');
        respostas.add('d');
        respostas.add('e');
        respostas.add('c');
        respostas.add('c');

        System.out.println(perguntas.get(numPergunta));
        System.out.println("Digite a resposta correta! ");
        String resposta = entrada.next();
        resposta = resposta.toLowerCase();
        char respostaArray = resposta.charAt(0);

        if (respostas.get(numPergunta) == respostaArray) {
            System.out.println("Resposta correta, você atacou o Land");
            System.out.format("O dano total foi de %s%n%d%s%n\n", red, a, fim);
            vidaCriatura -= a;
            if (vidaCriatura <= 0) {
                vidaCriatura = 0;
            } else {
                System.out.format("A vida do Land está em  %s%n%d %s%n\n", red, vidaCriatura, fim);
            }
        } else {
            System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta) + " você errou o ataque no Land");
        }
    }

    /**
     * Classe que roda após o usuário escolher a opção Golpear no combate
     * dificil. Ela gera uma pergunta que o aliado deve responder corretamente
     * para dar um dano aleatorio maior que 13 e menor que 24. int a = numero
     * random
     */
    static void ataquePersonagemDificil(int a) {

        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo / personagem
        perguntas.add("As raízes da equação 2x2 + bx + c = 0 são 3 e − 4. Nesse caso, o valor de b - c é\n(Dica: Substitua a equação com os dois valores e faça um sistema de subtração entre elas)"
                + "a) −26.\n"
                + "b) −22.\n"
                + "c) −1.\n"
                + "d) 22.\n"
                + "e) 26.");
        perguntas.add("Uma função quadrática f é dada por f(x) = x2 + bx + c, com b e c reais. \nSe f(1) = –1 e f(2) – f(3) = 1, o menor valor que f(x) pode assumir, quando x varia no conjunto dos números reais, é igual a(Dica: Substitua os valores informados nas equações para descobrir o valor de C, depois disso, use a formula do vertice do y para descobrir o resultado)\n"
                + "\n"
                + "a) –12.\n"
                + "b) –6.\n"
                + "c) –10.\n"
                + "d) –5.\n"
                + "e) –9..");
        perguntas.add("f(x) = x^2 - 2kx + 29, para x pertence aos numeros reais\n"
                + "Se f(x) ≥ 4, para todo número real x, o valor mínimo da função f é 4.\n"
                + "Assim, o valor positivo do parâmetro k é:\n(Dica: O número 4 dado na função é o resultado do yx do vertice, substitua os valores da formula pelos valores da função (-delta/4a))"
                + "\n"
                + "a) 5\n"
                + "b) 6\n"
                + "c) 10\n"
                + "d) 15");
        perguntas.add("A água é essencial para a vida e está presente na constituição de todos os alimentos. Em regiões com escassez de água, é comum a utilização de cisternas para a captação e armazenamento da água da chuva. Ao esvaziar um tanque contendo água da chuva, a expressão\n"
                + "\n"
                + "V(t) = - 1 / 43200 * t^2 + 3\n(Dica: Iguale a equação a 0 e aplique os conceitos de equações para resolver, não esqueça de transformar o resultado depois)"
                + "\n"
                + "representa o volume (em m3) de água presente no tanque no instante t (em minutos)\n"
                + "\n"
                + "Qual é o tempo, em horas, necessário para que o tanque seja esvaziado?\n"
                + "\n"
                + "a) 360\n"
                + "b) 180\n"
                + "c) 120\n"
                + "d) 6\n"
                + "e) 3");
        perguntas.add("Quais são as raízes reais da equação x2 – x = 6?\n(Dica: Resolva utilizando os principios da equação)"
                + "\n"
                + "a) Apenas 3\n"
                + "\n"
                + "b) 25 e 3\n"
                + "\n"
                + "c) 25 e – 2\n"
                + "\n"
                + "d) 3 e – 2\n"
                + "\n"
                + "e) Apenas – 2");
        perguntas.add("Um terreno quadrado possui área de 144 metros quadrados e apenas a sua frente ainda não está murada. Quantos metros de muro terão que ser feitos para isolar completamente esse terreno?\n(Dica: Não confunda área com perimetro)"
                + "\n"
                + "a) 144 m\n"
                + "\n"
                + "b) 576 m\n"
                + "\n"
                + "c) 24 m\n"
                + "\n"
                + "d) 18 m\n"
                + "\n"
                + "e) 12 m");
        perguntas.add("A temperatura T de um forno (em graus centígrados) é reduzida por um sistema a partir do instante do desligamento (t = 0) e varia de acordo com a expressão (t em minutos):\n"
                + "\n"
                + "T(t) = – t^2/4 + 400\n"
                + "\n"
                + "\n"
                + "Por motivos de segurança, a trava do forno só é liberada para abertura quando o forno atinge temperatura de 39 °C. Qual o tempo mínimo de espera, em minutos, após desligar o forno, para que a porta possa ser aberta?\n(Dica: Substitua t(t) pelo valor correto e resolva a equação)"
                + "\n"
                + "a) 19,0\n"
                + "\n"
                + "b) 19,8\n"
                + "\n"
                + "c) 20,0\n"
                + "\n"
                + "d) 38,0\n"
                + "\n"
                + "e) 39,0");
        perguntas.add("Qual é a medida de um ângulo interno de um polígono convexo que possui 230 diagonais?\n(Dica: formula para descobrir o numero de lados pelas diagonais (d = (n(n-3))/2) e formula para descobrir a soma dos angulos (S = (n-2) * 180), use-as sabiamente)"
                + "\n"
                + "a) 164,35°\n"
                + "\n"
                + "b) 23°\n"
                + "\n"
                + "c) 1849°\n"
                + "\n"
                + "d) 3780°\n"
                + "\n"
                + "e) 20°");
        perguntas.add("Sejam x1 e x2 as raízes da equação x^2 + 8x + 7. Qual é o valor de x1*x2?\n (Dica: Resolve a equação do segundo grau e multiplique os x's encontrados)"
                + "\n"
                + "a) 7\n"
                + "\n"
                + "b) 17\n"
                + "\n"
                + "c) – 7\n"
                + "\n"
                + "d) – 14\n"
                + "\n"
                + "e) – 8");
        perguntas.add("Qual é a maior das raízes da equação do segundo grau – x^2 – 12x – 35?\n(Dica: Use seus conhecimentos em equação de segundo grau e descubra qual dos dois x's é o maior)"
                + "\n"
                + "a) 5\n"
                + "\n"
                + "b) 7\n"
                + "\n"
                + "c) 12\n"
                + "\n"
                + "d) – 7\n"
                + "\n"
                + "e) – 5");
        int n = perguntas.size();
        Random pergunta = new Random();
        int numPergunta = pergunta.nextInt(n);
        ArrayList<Character> respostas = new ArrayList<>(); // Array das respostas das perguntas do inimigo / personagem
        respostas.add('e');
        respostas.add('d');
        respostas.add('a');
        respostas.add('d');
        respostas.add('d');
        respostas.add('e');
        respostas.add('d');
        respostas.add('a');
        respostas.add('a');
        respostas.add('e');

        System.out.println(perguntas.get(numPergunta));
        System.out.println("Digite a resposta correta! ");
        String resposta = entrada.next();
        resposta = resposta.toLowerCase();
        char respostaArray = resposta.charAt(0);

        if (respostas.get(numPergunta) == respostaArray) {
            System.out.println("Resposta correta, você atacou o feiticeiro");
            System.out.format("O dano total foi de %s%n%d%s%n\n", red, a, fim);
            vidaCriatura -= a;
            if (vidaCriatura <= 0) {
                vidaCriatura = 0;
            } else {
                System.out.format("A vida do feiticeiro está em  %s%n%d %s%n\n", red, vidaCriatura, fim);
            }
        } else {
            System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta) + " você errou o ataque no feiticeiro");
        }
    }

    /**
     * Classe que roda se o bot randomizar a opção Golpear no combate facil, ela
     * gera uma pergunta para o usuário que deve responde-la corretamente para
     * que ele desvie do ataque, se errar a pergunta, ele toma o dano inteiro.
     * int a = numero random
     */
    static void ataqueMiniBossFacil(int a) { //Execucao da ação do inimigo Golpear

        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo / personagem
        perguntas.add("35 estudantes estrangeiros vieram ao Brasil. 16 visitaram Manaus; 16, S. Paulo e 11, Salvador. \nDesses estudantes, 5 visitaram Manaus e Salvador e, desses 5, 3 visitaram também São Paulo. \nO número de estudantes que visitaram Manaus ou São Paulo foi:\n"
                + "\n"
                + "A) 29.\n"
                + "\n"
                + "B) 24.\n"
                + "\n"
                + "C) 11.\n"
                + "\n"
                + "D) 8.\n"
                + "\n"
                + "E) 5.");
        perguntas.add("Os senhores A, B e C concorriam à liderança de certo partido político. \nPara escolher o líder, cada eleitor votou apenas em dois candidatos de sua preferência. \nHouve 100 votos para A e B, 80 votos para B e C e 20 votos para A e C. \nEm consequência:\n"
                + "\n"
                + "A) venceu A, com 120 votos.\n"
                + "\n"
                + "B) venceu A, com 140 votos.\n"
                + "\n"
                + "C) A e B empataram em primeiro lugar.\n"
                + "\n"
                + "D) venceu B, com 140 votos.\n"
                + "\n"
                + "E) venceu B, com 180 votos.");
        perguntas.add("Um fabricante de cosméticos decide produzir três diferentes catálogos de seus produtos, visando a públicos distintos. \nComo alguns produtos estarão presentes em mais de um catálogo e ocupam uma página inteira, ele resolve fazer uma contagem para diminuir os gastos com originais de impressão. \nOs catálogos C1, C2 e C3 terão, respectivamente, 50, 45 e 40 páginas. \nComparando os projetos de cada catálogo, ele verifica que C1 e C2 terão 10 páginas em comum; C1 e C3 terão 6 páginas em comum; C2 e C3 terão 5 páginas em comum, das quais 4 também estarão em C1. \nEfetuando os cálculos correspondentes, o fabricante conclui que, para a montagem dos três catálogos, necessitará de um total de originais de impressão igual a:\n"
                + "\n"
                + "A) 135.\n"
                + "\n"
                + "B) 126.\n"
                + "\n"
                + "C) 118.\n"
                + "\n"
                + "D) 114.\n"
                + "\n"
                + "E) 110.");
        perguntas.add("Qual a proposição abaixo é verdadeira?\n"
                + "\n"
                + "a) Todo número inteiro é racional e todo número real é um número inteiro.\n"
                + "b) A intersecção do conjunto dos números racionais com o conjunto dos números irracionais tem 1 elemento.\n"
                + "c) O número 1,83333... é um número racional.\n"
                + "d) A divisão de dois números inteiros é sempre um número inteiro.");
        perguntas.add("Dado o conjunto U = números naturais de 0 até 20. \nSabendo que B = números múltiplos de 3, podemos afirmar que o conjunto B diferenca U  é igual ao conjunto:\n"
                + "\n"
                + "A) {3,6,9,12,15,18}\n"
                + "\n"
                + "B) {1,2,4,5,7,8,10,11,13,14,16,17,19,20}\n"
                + "\n"
                + "C) {0,2,4,6,12,15}\n"
                + "\n"
                + "D) {1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}\n"
                + "\n"
                + "E) {3}");
        perguntas.add("Sobre os conjuntos numéricos, escolha a alternativa incorreta.\n"
                + "\n"
                + "A) Todo número natural é também um número racional.\n"
                + "\n"
                + "B) Um número racional não pode ser irracional.\n"
                + "\n"
                + "C) Todo número negativo é um número inteiro.\n"
                + "\n"
                + "D) O conjunto dos números reais é formado pela união dos números racionais e irracionais.\n"
                + "\n"
                + "E) As dízimas periódicas são consideradas números racionais, portanto são também números reais.");
        perguntas.add("Em uma escola, 300 alunos foram entrevistados sobre as práticas esportivas. \nOs estudantes foram questionados sobre a prática de exercícios fora da escola. \nCom esse questionário, foi possível dividir os estudantes em grupos:\n"
                + "\n"
                + "110 alunos afirmaram que fazem musculação fora da escola;\n"
                + "140 alunos afirmaram que jogam futebol fora da escola; e\n"
                + "80 estudantes afirmaram que praticam outros tipos de atividade física, como corrida e natação.\n"
                + "Sabendo que 40 alunos praticam futebol e musculação, 33 praticam futebol e outra atividade física,  24 praticam musculação e outra atividade física e que 8 estudantes praticam os três.\nO número de estudantes sedentários, ou seja, que não praticam nenhuma das três modalidades, é:\n"
                + "\n"
                + "A) 35.\n"
                + "\n"
                + "B) 42.\n"
                + "\n"
                + "C) 59.\n"
                + "\n"
                + "D) 74.\n"
                + "\n"
                + "E) 95.");
        perguntas.add("Seja A = {2,5}, B = {2,5,6} e C = {6,10}, determine os elementos da operação (A U B) ∩ (B U C).\n"
                + "\n"
                + "A) {2,5,6}\n"
                + "\n"
                + "B) {2,5}\n"
                + "\n"
                + "C) {6,10}\n"
                + "\n"
                + "D) {2,5,6,10}\n"
                + "\n"
                + "E) {2,10}");
        perguntas.add(" Sobre os conjuntos numéricos, julgue as afirmativas a seguir.\n"
                + "\n"
                + "I – A diferença entre o conjunto dos números reais e o conjunto dos números racionais é igual ao conjunto dos números irracionais.\n"
                + "\n"
                + "II – Zero pertence ao conjunto dos números irracionais.\n"
                + "\n"
                + "III – O resultado de | -7,5 | é um número natural.\n"
                + "\n"
                + "Marque a alternativa correta.\n"
                + "\n"
                + "A) Somente a afirmativa I é verdadeira.\n"
                + "\n"
                + "B) Somente a afirmativa II é verdadeira.\n"
                + "\n"
                + "C) Somente a afirmativa III é verdadeira.\n"
                + "\n"
                + "D) Somente as afirmativas I e III são verdadeiras.\n"
                + "\n"
                + "E) Todas as afirmativas são verdadeiras.");
        perguntas.add("A quantidade de elementos do conjunto (A – B) U C, em que A = {2,4,6,8,10,12,14} B = {3,6,8,12} e C = {0,4,7}, é:\n"
                + "\n"
                + "A) 2\n"
                + "\n"
                + "B) 3\n"
                + "\n"
                + "C) 4\n"
                + "\n"
                + "D) 5\n"
                + "\n"
                + "E) 6");
        int n = perguntas.size();
        Random pergunta = new Random(); //Randomificação das perguntas que o inimigo pode executar ao ser randomificado a opção ataque
        int numPergunta = pergunta.nextInt(n);

        // A randomificação do array sairá aqui e será escolhido a pergunta
        ArrayList<Character> respostas = new ArrayList<>(); // Array das respostas das perguntas do inimigo / personagem
        respostas.add('a');
        respostas.add('e');
        respostas.add('c');
        respostas.add('c');
        respostas.add('b');
        respostas.add('c');
        respostas.add('c');
        respostas.add('a');
        respostas.add('a');
        respostas.add('e');

        System.out.println(perguntas.get(numPergunta));
        System.out.println("Digite a resposta correta! ");
        String resposta = entrada.next();
        resposta = resposta.toLowerCase();
        char respostaArray = resposta.charAt(0);
        if (respostas.get(numPergunta) == respostaArray) {
            System.out.println("Resposta correta, você desviou do golpe do inimigo");
        } else {
            System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta) + " você tomou o dano inteiro do inimigo");
            vidaPersonagem = vidaPersonagem - a;
            System.out.format("Sua vida atual é  %s%n%d %s%n\n", green, vidaPersonagem, fim);
        }
    }

    /**
     * Classe que roda se o bot randomizar a opção Golpear no combate médio, ela
     * gera uma pergunta para o usuário que deve responde-la corretamente para
     * que ele desvie do ataque, se errar a pergunta, ele toma o dano inteiro.
     * int a = numero random
     */
    static void ataqueMiniBossMedio(int a) {

        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo / personagem
        perguntas.add("O valor de x que faz a equação 2^(x+1)=32\n(Dica: Tente colocar os números na mesma base em ambos os lados) "
                + "  é:\n"
                + "\n"
                + "A) 2\n"
                + "\n"
                + "B) 3\n"
                + "\n"
                + "C) 4\n"
                + "\n"
                + "D) 5\n"
                + "\n"
                + "E) 6");
        perguntas.add("Analise a equação a seguir:\n"
                + "\n"
                + "2^(x^2−4)=128\n"
                + " \n"
                + "\n"
                + "Sobre essa equação, podemos afirmar que:\n"
                + "\n"
                + "A) É uma equação polinomial do 1º grau.\n"
                + "\n"
                + "B) É uma equação polinomial do 2º grau.\n"
                + "\n"
                + "C) É uma equação trigonométrica.\n"
                + "\n"
                + "D) É uma equação exponencial.\n"
                + "\n"
                + "E) É uma equação logarítmica.");
        perguntas.add("Encontre o valor de x na equação:\n(Dica: Separe os números exponenciados com os principios da potenciação)"
                + "\n"
                + "3^(x+2)+3^x=2430\n"
                + " \n"
                + "\n"
                + "A) x = 5\n"
                + "\n"
                + "B) x = 4\n"
                + "\n"
                + "C) x = 3\n"
                + "\n"
                + "D) x = 2\n"
                + "\n"
                + "E) x = 1");
        perguntas.add("O conjunto de soluções da equação exponencial 3⋅2x2−4=48\n(Dica: Resolva a equação e reformule o jeito de escrever o resultado que você descobrirá a resposta)"
                + "  é:\n"
                + "\n"
                + "A)x=±2\n"
                + "\n"
                + "B)x=±2√2\n"
                + " \n"
                + "\n"
                + "C)x=±4\n"
                + "\n"
                + "D)x=±4√2\n"
                + " \n"
                + "\n"
                + "E)x=±√6");
        perguntas.add("O montante de determinado capital em um fundo de investimento, após o tempo t em anos, é dado pela fórmula M(t)=C⋅1,5^t\n"
                + "Nessas condições, o tempo necessário para que um capital de R$ 800 investido gere um montante de R$ 4050 é de:\n(Dica: Substitua M(t) e C pelos valores corretos)"
                + "\n"
                + "A) 3 anos\n"
                + "\n"
                + "B) 4 anos\n"
                + "\n"
                + "C) 5 anos\n"
                + "\n"
                + "D) 6 anos\n"
                + "\n"
                + "E) 7 anos");
        perguntas.add("A quantidade de bactérias de uma cultura, depois de t horas, é dada pela expressão Q(t)=Q0*2^t\n"
                + ", em que Q0  é a quantidade inicial de bactérias. Nessas condições, se inicialmente havia 1500 bactérias, após quantas horas haverá 12.000 bactérias?\n(Dica: Substitua Q(t) e Q0 pelos valores corretos)"
                + "\n"
                + "A) 1 hora\n"
                + "\n"
                + "B) 3 horas\n"
                + "\n"
                + "C) 5 horas\n"
                + "\n"
                + "D) 7 horas\n"
                + "\n"
                + "E) 8 horas");
        perguntas.add("Durante um experimento, obteve-se a fórmula para a população de bactérias:\n"
                + "\n"
                + " q(t)=20*2^(3t)\n"
                + "\n"
                + "Em que t é o tempo, em hora, e q(t) é a população, em milhares de bactérias. \nSe a população de bactérias era incialmente de 20 mil, então após quanto tempo ela será dobrada? \n(Dica: Substitua q(t) pela quantidade de bacteria desejada e resolva a questão)\n"
                + "\n"
                + "A) 3 horas\n"
                + "\n"
                + "B) 1 hora\n"
                + "\n"
                + "C) 30 minutos\n"
                + "\n"
                + "D) 20 minutos\n"
                + "\n"
                + "E) 10 minutos");
        perguntas.add("Sabendo que x=(1/5)^(2t+1)\n"
                + " e y=(0,2)^(3t − 2) \n"
                + "O valor de y que faz com que x seja igual a y é: (Dica: Transformte os números em decimais ou frações e iguale uma equação a outra) \n"
                + "\n"
                + "A) -1\n"
                + "\n"
                + "B) 0\n"
                + "\n"
                + "C) 1\n"
                + "\n"
                + "D) 2\n"
                + "\n"
                + "E) 3");
        perguntas.add(" Dada a equação exponencial 3^(x^2−x) = 9.\n"
                + "A soma das soluções dessa equação é: (Dica: Iguale a equação a 0 e some o resultado de x1 + x2) \n"
                + "\n"
                + "A) -1\n"
                + "\n"
                + "B) 0\n"
                + "\n"
                + "C) 1\n"
                + "\n"
                + "D) 2\n"
                + "\n"
                + "E) 3");
        perguntas.add("Utilizamos a potenciação para modelar fenômenos que crescem muito rápido, por exemplo, o crescimento das infecções de um vírus durante uma pandemia. \nSuponha que o número de infectados se inicia em 2 e que cada pessoa infectada infecte outras 3, ou seja, na primeira semana, haverá 6 infectadas, na segunda, 18, e assim sucessivamente. \nSupondo que o ritmo de infecção continue o mesmo por, pelo menos, um ano, então, após quantas semanas, haverá 4374 pessoas infectadas?\n(Dica: Modele a pergunta para uma equação)"
                + "\n"
                + "A) 5 semanas\n"
                + "\n"
                + "B) 6 semanas\n"
                + "\n"
                + "C) 7 semanas\n"
                + "\n"
                + "D) 8 semanas\n"
                + "\n"
                + "E) 9 semanas");
        int n = perguntas.size();
        Random pergunta = new Random();
        int numPergunta = pergunta.nextInt(n);
        ArrayList<Character> respostas = new ArrayList<>(); // Array das respostas das perguntas do inimigo / personagem
        respostas.add('c');
        respostas.add('d');
        respostas.add('a');
        respostas.add('b');
        respostas.add('b');
        respostas.add('b');
        respostas.add('d');
        respostas.add('e');
        respostas.add('c');
        respostas.add('c');

        System.out.println(perguntas.get(numPergunta));
        System.out.println("Digite a resposta correta! ");
        String resposta = entrada.next();
        resposta = resposta.toLowerCase();
        char respostaArray = resposta.charAt(0);

        if (respostas.get(numPergunta) == respostaArray) {
            System.out.println("Resposta correta, você desviou do golpe do inimigo");
        } else {
            System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta) + " você tomou o dano inteiro do inimigo");
            vidaPersonagem = vidaPersonagem - a;
            System.out.format("Sua vida atual é  %s%n%d%s%n\n", green, vidaPersonagem, fim);
        }
    }

    /**
     * Classe que roda se o bot randomizar a opção Golpear no combate dificil,
     * ela gera uma pergunta para o usuário que deve responde-la corretamente
     * para que ele desvie do ataque, se errar a pergunta, ele toma o dano
     * inteiro. int a = numero random
     */
    static void ataqueMiniBossDificil(int a) {

        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo / personagem
        perguntas.add("As raízes da equação 2x2 + bx + c = 0 são 3 e − 4. Nesse caso, o valor de b - c é\n(Dica: Substitua a equação com os dois valores e faça um sistema de subtração entre elas)"
                + "a) −26.\n"
                + "b) −22.\n"
                + "c) −1.\n"
                + "d) 22.\n"
                + "e) 26.");
        perguntas.add("Uma função quadrática f é dada por f(x) = x2 + bx + c, com b e c reais. \nSe f(1) = –1 e f(2) – f(3) = 1, o menor valor que f(x) pode assumir, quando x varia no conjunto dos números reais, é igual a(Dica: Substitua os valores informados nas equações para descobrir o valor de C, depois disso, use a formula do vertice do y para descobrir o resultado)\n"
                + "\n"
                + "a) –12.\n"
                + "b) –6.\n"
                + "c) –10.\n"
                + "d) –5.\n"
                + "e) –9..");
        perguntas.add("f(x) = x^2 - 2kx + 29, para x pertence aos numeros reais\n"
                + "Se f(x) ≥ 4, para todo número real x, o valor mínimo da função f é 4.\n"
                + "Assim, o valor positivo do parâmetro k é:\n(Dica: O número 4 dado na função é o resultado do yx do vertice, substitua os valores da formula pelos valores da função (-delta/4a))"
                + "\n"
                + "a) 5\n"
                + "b) 6\n"
                + "c) 10\n"
                + "d) 15");
        perguntas.add("A água é essencial para a vida e está presente na constituição de todos os alimentos. Em regiões com escassez de água, é comum a utilização de cisternas para a captação e armazenamento da água da chuva. Ao esvaziar um tanque contendo água da chuva, a expressão\n"
                + "\n"
                + "V(t) = - 1 / 43200 * t^2 + 3\n(Dica: Iguale a equação a 0 e aplique os conceitos de equações para resolver, não esqueça de transformar o resultado depois)"
                + "\n"
                + "representa o volume (em m3) de água presente no tanque no instante t (em minutos)\n"
                + "\n"
                + "Qual é o tempo, em horas, necessário para que o tanque seja esvaziado?\n"
                + "\n"
                + "a) 360\n"
                + "b) 180\n"
                + "c) 120\n"
                + "d) 6\n"
                + "e) 3");
        perguntas.add("Quais são as raízes reais da equação x2 – x = 6?\n(Dica: Resolva utilizando os principios da equação)"
                + "\n"
                + "a) Apenas 3\n"
                + "\n"
                + "b) 25 e 3\n"
                + "\n"
                + "c) 25 e – 2\n"
                + "\n"
                + "d) 3 e – 2\n"
                + "\n"
                + "e) Apenas – 2");
        perguntas.add("Um terreno quadrado possui área de 144 metros quadrados e apenas a sua frente ainda não está murada. Quantos metros de muro terão que ser feitos para isolar completamente esse terreno?\n(Dica: Não confunda área com perimetro)"
                + "\n"
                + "a) 144 m\n"
                + "\n"
                + "b) 576 m\n"
                + "\n"
                + "c) 24 m\n"
                + "\n"
                + "d) 18 m\n"
                + "\n"
                + "e) 12 m");
        perguntas.add("A temperatura T de um forno (em graus centígrados) é reduzida por um sistema a partir do instante do desligamento (t = 0) e varia de acordo com a expressão (t em minutos):\n"
                + "\n"
                + "T(t) = – t^2/4 + 400\n"
                + "\n"
                + "\n"
                + "Por motivos de segurança, a trava do forno só é liberada para abertura quando o forno atinge temperatura de 39 °C. Qual o tempo mínimo de espera, em minutos, após desligar o forno, para que a porta possa ser aberta?\n(Dica: Substitua t(t) pelo valor correto e resolva a equação)"
                + "\n"
                + "a) 19,0\n"
                + "\n"
                + "b) 19,8\n"
                + "\n"
                + "c) 20,0\n"
                + "\n"
                + "d) 38,0\n"
                + "\n"
                + "e) 39,0");
        perguntas.add("Qual é a medida de um ângulo interno de um polígono convexo que possui 230 diagonais?\n(Dica: formula para descobrir o numero de lados pelas diagonais (d = (n(n-3))/2) e formula para descobrir a soma dos angulos (S = (n-2) * 180), use-as sabiamente)"
                + "\n"
                + "a) 164,35°\n"
                + "\n"
                + "b) 23°\n"
                + "\n"
                + "c) 1849°\n"
                + "\n"
                + "d) 3780°\n"
                + "\n"
                + "e) 20°");
        perguntas.add("Sejam x1 e x2 as raízes da equação x^2 + 8x + 7. Qual é o valor de x1*x2?\n (Dica: Resolve a equação do segundo grau e multiplique os x's encontrados)"
                + "\n"
                + "a) 7\n"
                + "\n"
                + "b) 17\n"
                + "\n"
                + "c) – 7\n"
                + "\n"
                + "d) – 14\n"
                + "\n"
                + "e) – 8");
        perguntas.add("Qual é a maior das raízes da equação do segundo grau – x^2 – 12x – 35?\n(Dica: Use seus conhecimentos em equação de segundo grau e descubra qual dos dois x's é o maior)"
                + "\n"
                + "a) 5\n"
                + "\n"
                + "b) 7\n"
                + "\n"
                + "c) 12\n"
                + "\n"
                + "d) – 7\n"
                + "\n"
                + "e) – 5");
        int n = perguntas.size();
        Random pergunta = new Random();
        int numPergunta = pergunta.nextInt(n);
        ArrayList<Character> respostas = new ArrayList<>(); // Array das respostas das perguntas do inimigo / personagem
        respostas.add('e');
        respostas.add('d');
        respostas.add('a');
        respostas.add('d');
        respostas.add('d');
        respostas.add('e');
        respostas.add('d');
        respostas.add('a');
        respostas.add('a');
        respostas.add('e');

        System.out.println(perguntas.get(numPergunta));
        System.out.println("Digite a resposta correta! ");
        String resposta = entrada.next();
        resposta = resposta.toLowerCase();
        char respostaArray = resposta.charAt(0);

        if (respostas.get(numPergunta) == respostaArray) {
            System.out.println("Resposta correta, você desviou do golpe do inimigo");
        } else {
            System.out.println("Resposta Incorreta, a resposta correta é " + respostas.get(numPergunta) + " você tomou o dano inteiro do inimigo");
            vidaPersonagem = vidaPersonagem - a;
            System.out.format("Sua vida atual é  %s%n%d%s%n\n", green, vidaPersonagem, fim);
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
                case 1 -> {
                    historiaCapitulo1();
                    historiaCapitulo2();
                }
                case 2 ->
                    escolhaCapitulo();
                case 3 -> {
                    System.out.println("Criadores: ");
                    System.out.println("Caique, Cleiton, Henrique, Juan e Maicon"); // Créditos
                    menu();
                }
                case 4 ->
                    escolhaCombate(); // Sair do jogo
                default ->{
                    System.out.println("Digite um número válido");
                    menu();
                }
            }
        } while (escolha > 0 && escolha >= 5);
    }

    /**
     * Classe que gera o combate facil, ou seja, fica intercalando entre o turno
     * do oponente e o do personagem principal, sempre verificando se algum dos
     * dois morreu, ou seja, vida menor ou igual a 0.
     */
    static void combateFacil() {
        vidaCriatura = 50;
        vidaPersonagem = 50;
        System.out.println("    ______                         __    __               ______      __             \n" +
"   / ____/_____      ______ ______/ /_  / /____  _____   / ____/___  / /__  ____ ___ \n" +
"  / __/ / ___/ | /| / / __ `/ ___/ __ \\/ __/ _ \\/ ___/  / / __/ __ \\/ / _ \\/ __ `__ \\\n" +
" / /___/ /   | |/ |/ / /_/ / /__/ / / / /_/  __/ /     / /_/ / /_/ / /  __/ / / / / /\n" +
"/_____/_/    |__/|__/\\__,_/\\___/_/ /_/\\__/\\___/_/      \\____/\\____/_/\\___/_/ /_/ /_/ \n" +
"                                                                                     ");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠀⠀⣠⣾⣷⡄⢠⣾⣿⣿⣿⣿⣷⡄⢀⣾⣷⣄⠀⠀⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⡇⢀⣤⣤⡄⢠⣤⣤⡀⢸⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⠉⠻⢿⣿⣿⣿⡀⠻⢿⡇⢸⡿⠟⢀⣿⣿⣿⣿⠟⠋⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⣠⡦⠀⠉⠉⠉⣠⣶⣤⣤⣤⣤⣶⣄⠉⠉⠉⠀⢴⣤⡀⠀⠀⠀⠀\n" +
"⠀⠀⠀⣠⣄⠉⠀⠀⠀⠀⠀⠙⢿⣿⣿⣿⣿⡿⠟⠀⠀⠀⠀⠀⠉⣀⣀⡀⠀⠀\n" +
"⠀⠀⣾⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣠⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣷⠀⠀\n" +
"⠀⢰⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⡇⠀\n" +
"⠀⣸⣿⣿⣿⣿⡇⠀⠀⢀⣴⠟⠃⠀⠉⠉⠀⠘⠻⣦⡀⠀⠀⢰⣿⣿⣿⣿⣷⠀\n" +
"⠀⠉⢉⣉⣉⡉⠁⢀⣀⠘⠃⠀⠀⠀⠀⠀⠀⠀⠀⠘⠃⣀⡀⠈⠉⣉⣉⡉⠉⠀\n" +
"⠀⠀⠘⠿⠟⠁⣴⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣦⠈⠻⠿⠃⠀⠀\n" +
"⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣇⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⡿⠀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠀⣠⣶⣦⡌⠻⣿⠀⠀⠀⠀⠀⠀⠀⠀⣿⠟⢁⣴⣶⣤⡀⠀⠀⠀⠀\n" +
"⠀⠀⠀⠀⠘⠛⠛⠛⠋⠀⠙⠁⠀⠀⠀⠀⠀⠀⠀⠛⠀⠙⠛⠛⠛⠃⠀⠀⠀⠀");

        while ((vidaCriatura > 0 || vidaPersonagem > 0)) {
            combatePersonagemFacil();
            if (vidaCriatura <= 0 || vidaPersonagem <= 0) {
                break;
            }
            combateInimigoFacil();
        }

        if (vidaPersonagem <= 0) {
            System.out.println("Você morreu pro golem, você não parece ser o escolhido");
        } else if (vidaCriatura <= 0) {
            System.out.println("Boa, você derrotou o golem");
        }
    }

    /**
     * Classe que gera o combate médio, ou seja, fica intercalando entre o turno
     * do oponente e o do personagem principal, sempre verificando se algum dos
     * dois morreu, ou seja, vida menor ou igual a 0.
     */
    static void combateMedio() {
        vidaCriatura = 50;
        vidaPersonagem = 50;
        System.out.println("    __                    __                              _      _ __      \n" +
"   / /   ____ _____  ____/ /    ____     ___  _________  (_)____(_) /_____ \n" +
"  / /   / __ `/ __ \\/ __  /    / __ \\   / _ \\/ ___/ __ \\/ / ___/ / __/ __ \\\n" +
" / /___/ /_/ / / / / /_/ /    / /_/ /  /  __(__  ) /_/ / / /  / / /_/ /_/ /\n" +
"/_____/\\__,_/_/ /_/\\__,_( )   \\____/   \\___/____/ .___/_/_/  /_/\\__/\\____/ \n" +
"                        |/                     /_/                         ");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&/&&&&&&,&@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&& %&%%%%%%%%#&&&&/&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@&&&&&&%%%##*####(##.((#(%#*.((%&&&%/#&@%@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@&&&%/%(%%/  (/,//*.. ,*//*. .. /## #%%&(&&&@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@&@@%%&& %%.##/,,, ,. .          ., .*/(((###%%#&&&@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@&&&&(/,#((/*.,                      .   /((##%% &&&@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@&&&#%%.#*/* .                             ,,,(.#%%.%&&&@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@&&#&%.#, ,*.                                 .*.(##%%%,&&@@@@@@@@@@@\n" +
"@@@@@@@@@@@&(&&% #(/*.                                    .,***.%%&.&&%@@@@@@@@@\n" +
"@@@@@@@@@@#&&&%%.(/.,                                       .*/( %#%&&&@@@@@@@@@\n" +
"@@@@@@@@@@,&&%%,(* ,                                        ../( #%%&&&@@@@@@@@@\n" +
"@@@@@@@@@@&&&,..(  .                                         ,./*/%%&#&@@@@@@@@@\n" +
"@@@@@@@@@&&&,%%#(*.                                          .*./( %&&&&@@@@@@@@\n" +
"@@@@@@@@@&&%&*%#(* .                                         ..*(#%%&&&@@@@@@@@@\n" +
"@@@@@@@@@@&&#%%,#(*                                           / /#%%&&&@@@@@@@@@\n" +
"@@@@@@@@@@&&&&%.#(/*                                        . /(,/%&&&&@@@@@@@@@\n" +
"@@@@@@@@@@@@&&&(%.//*,.                                      ,(,.%&&&&@@@@@@@@@@\n" +
"@@@@@@@@@@@@&&&%####( ,.                                  ,*(#.%%&&&&@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@&&&/%%%(*/*                               ,.,(.(./%&&&&@&@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@&&&&%%%(/(**  .                     .,*,/.,#*#%%&&&@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@&&&&&%%%###,   . ..           .,.   /,.(#*%%&&&&@@&@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@&&&&&%%%,#(#(,.(/////*,/*,,*((####%%.%&&&&&@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@&@@@@@&&&#%&%%% /%%########/##%%%%%,%&&&&&&@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&%.%%%%%%%%%&&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&%&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        while ((vidaCriatura > 0 || vidaPersonagem > 0)) {
            combatePersonagemMedio();
            if (vidaCriatura <= 0 || vidaPersonagem <= 0) {
                break;
            }
            combateInimigoMedio();
        }

        if (vidaPersonagem <= 0) {
            System.out.println("Você perdeu pro Land, você não provou seu valor");
        } else if (vidaCriatura <= 0) {
            System.out.println("Boa, tu derrotou o Land, você provou seu valor!");
        }
    }

    /**
     * Classe que gera o combate dificil, ou seja, fica intercalando entre o
     * turno do oponente e o do personagem principal, sempre verificando se
     * algum dos dois morreu, ou seja, vida menor ou igual a 0.
     */
    static void combateDificil() {
        vidaCriatura = 50;
        vidaPersonagem = 50;
        System.out.println("    ______     _ __  _           _                   __         ______      __  _     __          __   \n" +
"   / ____/__  (_) /_(_)_______  (_)________     ____/ /___ _   / ____/___  / /_(_)___/ /___ _____/ /__ \n" +
"  / /_  / _ \\/ / __/ / ___/ _ \\/ / ___/ __ \\   / __  / __ `/  / __/ / __ \\/ __/ / __  / __ `/ __  / _ \\\n" +
" / __/ /  __/ / /_/ / /__/  __/ / /  / /_/ /  / /_/ / /_/ /  / /___/ / / / /_/ / /_/ / /_/ / /_/ /  __/\n" +
"/_/    \\___/_/\\__/_/\\___/\\___/_/_/   \\____/   \\__,_/\\__,_/  /_____/_/ /_/\\__/_/\\__,_/\\__,_/\\__,_/\\___/ \n" +
"                                                                                                       ");
        System.out.println("                                        \n" +
"                 @.%.%                  \n" +
"                (@@@@&@&                \n" +
"               ,@@@@@#*,                \n" +
"               .(@@@@@.,                \n" +
"             &@@@. @@(*/@&@             \n" +
"           .@&@& *&&(*%%@&@&@           \n" +
"  **,     #,.*#/@&&*#&&**/(**      *#*# \n" +
"     (/#/%/@@@&..& #*****@@@@%&&&& (    \n" +
"     .. @@@&@&@@@@% .#&&@ (@@@@&&& ,    \n" +
"     *,&&&&@@, &&%%%##*%.   &@&&&@%     \n" +
"     .&@&&@/  @&@&@%%* &&&    %&@@@*    \n" +
"     @&@&&    &&&&@/,,/&&&        @/    \n" +
"    *@&%     &&&&&&(/,/&&&@        ,    \n" +
"   *%,       @@&@&%/(**&&&&         #(  \n" +
"            #&&@&&.//&/&&&&@            \n" +
"            &@@@@@ /,//&&&&&            \n" +
"            &@@@@@.#.(*@&@@@            \n" +
"           &@@@@@@.%*#%@&@@&.           \n" +
"           @@@@@@@,(,*%@&&&&@           \n" +
"           @@&@@@@/&*//&&&&@&           \n" +
"           @&@@@@@@%/&&@&&&&&           \n" +
"           @@@@@@@@ /.&@&&&&%           \n" +
"           @@&@@@*//%&**,&&&&           \n" +
"           /#@%///*%@@*/(,(/#           \n" +
"               ,@&.#(%%@@(              ");
        while ((vidaCriatura > 0 || vidaPersonagem > 0)) {
            combatePersonagemDificil();
            if (vidaCriatura <= 0 || vidaPersonagem <= 0) {
                break;
            }
            combateInimigoDificil();
        }

        if (vidaPersonagem <= 0) {
            System.out.println("Você morreu pro feiticeiro da Ordem Sombria ");
        } else if (vidaCriatura <= 0) {
            System.out.println("Parabéns, escolhido! Você derrotou o feiticeiro da Ordem Sombria");
        }
    }

    /**
     * Classe que ocorre após o usuario escolher Curar no seu turno, ela tem 3
     * poções que acabam.
     */
    static void curarPersonagem() {

        if (healthPotion == 0 || healthPotion < 0) {
            System.out.println("Voce nao tem mais pocoes disponiveis");
            
        } else {
            vidaPersonagem += 24;
            healthPotion -= 1;
            System.out.format("Sua vida atual e  %s%n%d%s%n\n", green, vidaPersonagem, fim);
            System.out.format("Voce so tem mais %d pocoes\n", healthPotion);
        }
    }

    /**
     * Classe que roda após o bot randomizar a opção Curar no seu turno, ele tem
     * 3 poções.
     */
    static void curarInimigo() {
        if (healthPotionEnemy <= 0) {
            System.out.println("O inimigo não tem mais poções");
        } else {
            vidaCriatura += 24;
            healthPotionEnemy -= 1;
            System.out.format("A vida atual do inimigo é   %s%n%d%s%n\n", red, vidaCriatura,fim);
            System.out.format("O inimigo so tem mais %d pocoes\n", healthPotionEnemy);
        }
    }

}
