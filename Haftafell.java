package javaapplication2;

/**
 *                                         ******ESSE PROJETO FOI FEITO PARA SER RODADO NA IDE Apache NetBeans IDE 19******
 * Ol?, tudo bem? Se voc? estiver tentando entender esse c?digo e n?o estiver conseguindo entender ou quer um guia para navegar por ele aqui est?:
 * 
* 
*                                                                  FUN??ES DE INTERFACE DE MENU --- Linha 104
*                                                                      menu() --- Linha 110
*                                                                      instrucoes() --- Linha 144
*                                                                      jogar() --- Linha 152
*                                                                      cr?ditos() --- Linha 179
*                                                                  FUN??ES DE CAP?TULOS --- Linha 187
*                                                                      historiaCapitulo1() --- Linha 193
*                                                                      historiaCapitulo2() --- Linha 268
*                                                                      historiaCapitulo2Cena1() --- Linha 303
*                                                                      historiaCapitulo2Cena2() --- Linha 435
*                                                                      enter() --- Linha 474
*                                                                  FUN??ES DE DESAFIO --- Linha 479
*                                                                      desafio1() --- Linha 485
*                                                                      desafio2() --- Linha 507
*                                                                      desafio3() --- Linha 529
*                                                                      desafio4() --- Linha 548
*                                                                      desafio5() --- Linha 570
*                                                                      desafio6() --- Linha 591
*                                                                  FUN??ES DE COMBATE --- Linha 605
*                                                                      danoPersonagem() --- Linha 614
*                                                                      danoInimigo() --- Linha 625
*                                                                      combatePersonagemFacil() --- Linha 636
*                                                                      combatePersonagemMedio() --- Linha 667
*                                                                      combatePersonagemDificil() --- Linha 697
*                                                                      combateInimigoFacil() --- Linha 730
*                                                                      combateInimigoMedio() --- Linha 751 
*                                                                      combateInimigoDificil() --- Linha 772 
*                                                                      ataquePersonagemFacil() --- Linha 796
*                                                                      ataquePersonagemMedio() --- Linha 962
*                                                                      ataquePersonagemDificil() --- Linha 1141
*                                                                      ataqueMiniBossFacil() --- Linha 1295
*                                                                      ataqueMiniBossMedio() --- Linha 1456
*                                                                      ataqueMiniBossDificil() --- Linha 1628
*                                                                      combateFacil() --- Linha 1775
*                                                                      combateMedio() --- Linha 1828
*                                                                      combateDificil() --- Linha 1890
*                                                                      curarPersonagem() --- Linha 1946
*                                                                      curarInimigo() --- Linha 1963
 * 
 * 
 * 1 -"FUN??ES DE INTERFACE DE MENU" - As primeiras fun??es aparente s?o as fun??es para que o menu ocorra sem erros, sinta-se livre para explorar.
 * 
 * 2 - "FUN??ES DE CAP?TULOS" - As proximas fun??es que aparecem s?o as fun??es que cont?m a historia do jogo, dividida em cap?tulos e cenas dentro dos cap?tulos e a fun??o para pular o di?logo.
 * 
 * 3 - "FUN??ES DE DESAFIO" - Logo depois, temos as fun??es responsaveis para o uso dos desafios durante a hist?ria do RPG
 * 
 * 4 - "FUN??ES DE COMBATE" -  Nosso ultimo conjunto de fun??es s?o relacionadas ao combate feito por turno que ocorre durante a historia.
 * 
 * Esse foi um breve indice para que se possa navegar mais precisamente pelo c?digo!
 * 
 * Acompanhe o projeto e uma breve explica??o sobre ele no nosso reposit?rio do GitHub: 
 * https://github.com/JuanSantos64/Grupo-6---Turma-A
 */
import java.util.Random;

import java.util.Scanner;

import java.util.ArrayList;

/**
 * Classe do nosso projeto integrador: RPG Corporativo para educa??o
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

    // Inicio da fun??o Main
    /**
     * Classe que executa o RPG
     *
     * @param args
     */
    public static void main(String[] args) {
        menu(); // Come?a a rodar o jogo a partir do menu!
        cr?ditos(); // Roda os cr?ditos do jogo!
    }
    // Fim da fun??o Main
    
    // *--* 1 - FUN??ES DE INTERFACE DO MENU *--*
    
    // Inicio das fun??es de interface do menu
    /**
     * Classe que gera o menu inicial do jogo!
     */
    static void menu() { // Comando que executa o menu do Jogo, primeira coisa que ir? aparecer ao jogador
        int escolhaMenu; // Inicializa??o da vari?vel
        do { // Inicia o menu mostrando as seguintes informa??es na tela
            System.out.println(" === Menu === ");
            System.out.println("1 - Instru??es");
            System.out.println("2 - Jogar");
            System.out.println("3 - Cr?ditos");
            System.out.println("4 - Sair");
            System.out.println(" ============ ");
            escolhaMenu = entrada.nextInt(); // Armazena a escolha do usu?rio sobre o menu

            switch (escolhaMenu) { // Faz um switch case da escolha para redirecionar o usu?rio para o local desejado
                case 1: 
                    instrucoes();
                break;
                case 2:
                    jogar();
                    break;
                case 3:
                    cr?ditos();
                    menu();
                break;
                case 4:
                    break;
                    default: 
                    System.out.println("Digite um n?mero v?lido");
                    menu();
                break;
            }
        } while (escolhaMenu > 0 && escolhaMenu >= 5);
    }
    /**
     * Classe que cont?m as intru??es do menu
     */
    static void instrucoes(){
                System.out.println("Ol?! Nosso c?digo funciona com um sistema que ? necess?rio apertar enter para que apareca o proximo dialogo. ");
                menu();
    }
    
    /**
     * Classe que cont?m o inicio do jogo
     */
    static void jogar(){
        int escolhaJogar; // Inializa??o da vari?vel que ser? utilizado para escolha
        System.out.println("1 - Jogar");
        System.out.println("2 - Capitulo 1");
        System.out.println("3 - Capitulo 2");
        escolhaJogar = entrada.nextInt();
        switch (escolhaJogar){
            case 1:
                historiaCapitulo1();
                historiaCapitulo2();
                break;
            case 2:
                historiaCapitulo1();
                menu();
                break;
            case 3: 
                historiaCapitulo2();
                menu();
                break;
            default:
                jogar();
        }
    }

    /**
     * Classe que cont?m os cr?ditos que ? mostrado ao fim do jogo
     */
    static void cr?ditos() { 
        // Roda os cr?ditos
        System.out.println("Obrigado por jogar nosso jogo! Ficamos muito agradecidos que voc? chegou at? o final dele!");
        System.out.println("Espero que tenha gostado e que tenha aprendido algo ;-)");
        System.out.println("Criadores: Caique, Cleiton, Henrique, Juan e Maicon");
    }
    // Fim das fun??es de interface do menu

    // *--* 2 - FUN??ES DE CAPITULOS *--*
    
    // Inicio das fun??es de capitulos
    /**
     * Classe que cont?m o primeiro capitulo do jogo
     */
    public static void historiaCapitulo1() { // Inicia o come?o da Historia do RPG
        String nomeJogador ; // Inicializa??o da vari?vel que ser? utilizada para armazenar o nome do jogador
        System.out.println("Ol?! Nosso c?digo funciona com um sistema que ? necess?rio apertar enter para que apareca o proximo dialogo. ");
        enter(entrada); // Chamada da fun??o que pula o di?logo ao apertar enter
        System.out.println("Voc? acorda em um quarto em branco. Ele n?o tem come?o nem fim. \nA claridade faz seus olhos se incomodarem, mas logo se acostumam. \nVoc? se encontra confuso por n?o saber onde est? e nem quem ?.");
        enter(entrada);
        System.out.println("Uma luz azul contorna o ar. Runas aparecem diante de voc?. \nElas lembram n?meros, mas \"est?o escritas de formas diferentes?\"");
        enter(entrada);
        System.out.println("Os n?meros se juntam com letras e voc? come?a a interpret?-las.");
        enter(entrada);
        System.out.println("?Em eras ancestrais, quando a magia da matem?tica era desvelada,\ntecemos os fios do conhecimento para desvendar os segredos dos n?meros divinos. \nE assim nasceram os \"Conjuntos M?sticos\", onde os n?meros se agrupavam em esferas m?gicas. \nDentro delas, encontr?vamos os Num?ricos Naturais, Inteiros, Racionais, Irracionais e Reais. \nQual destes conjuntos os n?meros m?sticos pertence o n?mero PI??\n"
                + "Estranhamente voc? sabe a resposta e responde sussurando:");
        System.out.println(cyan + "Digite a resposta: " + fim);
        String resposta = entrada.next(); // Armazena a resposta do usu?rio sobre a pergunta acima
        String respostaparaVerifica??o = resposta.toLowerCase(); // Coloca a resposta do usu?rio para caracteres minusculos
        if (respostaparaVerifica??o.equals("irracionais")) { // Verifica se a resposta est? correta
            System.out.println("?, e pensar que eu iria encontrar a matem?tica em um lugar como esse.");
        } else {
            System.out.println("?Irracionais?. ?, e pensar que eu iria encontrar a matem?tica em um lugar como esse.");
            enter(entrada);
        }
        System.out.println("?Ah, que surpresa! Imaginar que um humano vindo da Terra Distante seria capaz de decifrar a l?ngua sagrada.?");
        enter(entrada);
        System.out.println("No fundo da sala, surge um ser que voc? n?o havia percebido.\nAo tentar encarar seu rosto, seu corpo ? tomado por uma agonia profunda, \numa entidade inimagin?vel envolta em uma aura de luz.");
        enter(entrada);
        System.out.println("Tomado pelo medo, voc? pergunta:\n"
                + "?Onde estou? Quem ? voc??");
        enter(entrada);
        System.out.println("O Ser cai em gargalhada respondendo:\n"
                + "-?Quem sou eu?? Que espet?culo! Uma pergunta interessante ? Primeiro me diga, quem ? voc??");
        System.out.println("Digite seu nome: ");
        nomeJogador  = entrada.next(); // Armazena o nome do jogador
        System.out.println("Ao falar o seu nome voc? entra em hipnose, e uma voz explica com detalhes o presente o passado desse mundo.");
        enter(entrada);
        System.out.println("Bem-vindo ao mundo de Haftafell!");
        enter(entrada);
        System.out.println(nomeJogador  + ", o escolhido?"); 
        enter(entrada);
        System.out.println("O mundo de Haftafell, um lugar vasto e misterioso, repleto de magia e maravilhas. \nEm Haftafell, a Matem?tica ? considerada a linguagem sagrada perdida, \num conhecimento t?o poderoso que se acredita ter sido dado aos mortais por deuses antigos.");
        enter(entrada);
        System.out.println("H? mil?nios, Haftafell era um mundo em equil?brio,\ngovernado por deuses antigos que haviam concedido aos mortais o conhecimento da Matem?tica Divina.\nEssa linguagem sagrada permitia que as quatro ra?as - elfos, an?es, fadas e humanos - \nmoldassem a realidade de acordo com seus desejos, \ncriando uma era de prosperidade e harmonia.");
        enter(entrada);
        System.out.println("No entanto, essa paz foi abalada quando um grupo de mortais ambiciosos, conhecido como a \"Entidade Sombria\", \nroubou segredos profundos da Matem?tica Divina e come?ou a us?-los para fins ego?stas. \nA gan?ncia e a busca pelo poder levaram a uma guerra devastadora entre as ra?as, \nque resultou na perda do conhecimento da Matem?tica Divina e na oblitera??o dos elfos, \nan?es e fadas restando assim apenas a ra?a dos humanos.");
        enter(entrada);
        System.out.println("Os deuses antigos, horrorizados com o abuso de seu presente, \nselaram a Matem?tica Divina em artefatos m?gicos indecifr?veis, runas e hier?glifos e se retiraram do mundo, \npela primeira vez os deuses desistiram deixando o mundo em um estado de desordem e conflito.");
        enter(entrada);
        System.out.println("No presente da campanha, Haftafell ? um lugar dividido, \ncom as ra?as ainda se recuperando das cicatrizes da guerra passada.\nA Matem?tica Divina ? considerada uma lenda, \numa linguagem perdida que poucos acreditam ser poss?vel de dominar novamente.");
        enter(entrada);
        System.out.println("No entanto, uma profecia ancestral ressurge, \npredizendo o retorno da Matem?tica Divina e o surgimento de her?is destinados a desvendar seus segredos \ne enfrentar uma amea?a sombria que deseja us?-la para destruir o mundo. \n? nesse cen?rio que os jogadores entram em cena, \nescolhidos pelas circunst?ncias e pelo destino para reverter o curso da hist?ria, \nreconciliar as ra?as e impedir a cat?strofe iminente.");
        enter(entrada);
        System.out.println("O passado tumultuado de Haftafell, marcado pela ascens?o e queda da Matem?tica Divina, \nestabelece o cen?rio para a jornada dos jogadores em busca do conhecimento perdido \ne a luta para proteger o mundo de uma nova amea?a, \nenquanto lidam com os traumas e preconceitos do passado.");
        enter(entrada);
        System.out.println("O " + nomeJogador  + " estava imerso em pensamentos, tentando assimilar tudo o que havia aprendido sobre Haftafell e a Matem?tica Divina. \nA entidade misteriosa que estava agora diante dele parecia estar aguardando uma resposta a sua pergunta: \"Quem ? voc??\"");
        enter(entrada);
        System.out.println("Com uma sensa??o de d?j? vu, o protagonista respondeu mais uma vez, pronunciando seu nome. \nUma onda de calma o envolveu enquanto imagens do passado de Haftafell se desenrolavam diante de seus olhos.");
        enter(entrada);
        System.out.println("Ele viu as quatro ra?as antigas coexistindo harmoniosamente, \ncompartilhando o conhecimento da Matem?tica Divina para criar maravilhas que desafiavam a compreens?o. \nA imagem de elfos graciosos, an?es mestres da tecnologia, fadas encantadas \ne humanos s?bios e trabalhadores dan?ou em sua mente.");
        enter(entrada);
        System.out.println("Em seguida, \nas imagens se transformaram em vis?es da guerra, com a Entidade Sombria amea?ando tudo o que era belo em Haftafell. \nO caos que se seguiu e a perda da Matem?tica Divina assolaram o mundo, deixando cicatrizes profundas em sua alma.");
        enter(entrada);
        System.out.println("Quando as vis?es finalmente se dissiparam, a entidade misteriosa se apresentou: \n\"Sou Ygris, a Guardi? da Matem?tica Divina. \nMinha miss?o ? zelar pelo conhecimento sagrado e, se poss?vel, restaurar a harmonia em Haftafell.\"");
        enter(entrada);
        System.out.println("O protagonista, ainda tentando processar as informa??es, finalmente reuniu coragem para fazer outra pergunta: \n\"Como vim parar aqui? Por que fui escolhido?\"");
        enter(entrada);
        System.out.println("Ygris sorriu, revelando um brilho de esperan?a em seus olhos. \n\"Voc? foi escolhido, meu jogador, porque ? a personifica??o de uma antiga profecia. \nH? muito tempo, os deuses antigos previram a chegada de algu?m que poderia trazer de volta a Matem?tica Divina \ne enfrentar a amea?a sombria que busca destruir nosso mundo, \nnossos Deuses n?o puderam interferir diretamente nessa influ?ncia, se sentiram incapazes diante da lei universal. \nO destino ? incerto, afinal cada ser vivo escreve o seu. \nPor muito tempo acreditamos ter sido um erro entregar esse conhecimento\".");
        enter(entrada);
        System.out.println("Ygris estende a m?o, e um pergaminho m?gico com runas brilhantes apareceu em sua palma. \n\"Voc? deve buscar as Runas Primordiais, fragmentos de conhecimento que podem desvendar os segredos da Matem?tica Divina. \nA primeira runa o aguarda na cidade de Midland, onde voc? encontrar? aliados e desafios.\"");
        enter(entrada);
        System.out.println("Com determina??o, voc? pega o pergaminho e se preparou para a jornada ? frente. \nO destino de Haftafell repousava sobre seus ombros, \nir? enfrentar o desconhecido em busca da Matem?tica Divina e da salva??o de seu novo mundo.");
        enter(entrada);
    }

    /**
     * Classe que cont?m o segundo capitulo do jogo
     */
    public static void historiaCapitulo2() { // Segundo c?pitulo da historia do RPG
        int escolhaCapitulo2; // Inicializa??o da var?avel que ser? utilizada para as escolhas desse cap?tulo
        System.out.println("Cap?tulo 2: A Jornada");
        enter(entrada);
        System.out.println("Ap?s abrir o pergaminho voc? ? teletransportado e se encontra diante da imponente cidade de Midland, uma simples cidade, mas interessante.\nAs ruas movimentadas exalam uma atmosfera agitada, o doce aroma das comidas sendo feitas pelos mercadores te encanta e te faz perder o foco, mas voc? logo volta a seu caminho. \nO pergaminho aponta para a cidade, voc? precisa encontrar mais pistas.");
        enter(entrada);
        System.out.println("Tome uma decis?o");
        System.out.println(yellow + "Visitar a Biblioteca de Midland: Procurar por textos antigos ou s?bios que possam indicar a localiza??o da Runa." + fim);
        System.out.println("");
        System.out.println(yellow + "Conversar com os Habitantes Locais: Buscar informa??es de boatos ou lendas relacionadas ? Matem?tica Divina." + fim);
        enter(entrada);
        System.out.println("Escolha seu caminho digitando o n?mero correspondente.");
        System.out.println(yellow + "1 - Cena 1: Explorar a Pra?a Central" + fim);
        System.out.println(yellow + "2 - Cena 2: Conversar com os habitantes locais." + fim);
        escolhaCapitulo2 = entrada.nextInt(); // Armazena a escolha
        switch (escolhaCapitulo2) { // Faz um switch case da escolha do jogador
            case 1 -> {
                historiaCapitulo2Cena1();
            }
            case 2 ->
                historiaCapitulo2Cena2();
            default -> {
                System.out.println("Voc? n?o digitou uma op??o v?lida, voc? reiniciar? o capitulo 2");
                historiaCapitulo2();
            }
        }

    }
    // Fim das fun??es de capitulos

    /**
     * Classe que cont?m a historia da decis?o existente no segundo capitulo,
     * caso escolhido cena 1
     */
    // Inicio das fun??es de cena
    static void historiaCapitulo2Cena1() {
        int escolhaCapitulo2Cena1; // Inicializa??o da vari?vel que ser? utilizada para as escolhas nesse capitulo
        System.out.println("Ao caminhar pela pra?a, \nvoc? observa um grupo de crian?as brincando com pedras brilhantes desenhadas com s?mbolos matem?ticos. \nIntrigado, voc? se aproxima e pergunta sobre a Matem?tica Divina. \nUma das crian?as menciona um lago perto da cidade que costuma frequentar, diz a pegou de l??\"");
        System.out.println(yellow + "1 - Perguntar a localiza??o do lago." + fim);
        System.out.println(yellow + "2 - Seguir a viagem." + fim);
        System.out.println("Escolha: ");
        escolhaCapitulo2Cena1 = entrada.nextInt(); // Armazena a escolha
        if (escolhaCapitulo2Cena1 == 1) { // Verifica qual o n?mero digitado pelo usu?rio
            System.out.println("?Ele fica a 200 passos em dire??o aonde o sol se p?e? disse uma pequena menina de vestido e cabelo bagun?ado.");
            System.out.println(yellow + "1 - Ir aonde a pequena menina informou." + fim);
            System.out.println(yellow + "2 - Pegar uma pedra m?gica para ver melhor..." + fim);
            System.out.println("Escolha: ");
            int escolhaCena1ponto = entrada.nextInt();

        } else {
            System.out.println(yellow + "Pegar uma pedra m?gica para ver melhor..." + fim);
        } 
        System.out.println("A oeste de Midland, voc? encontra um grande lago. \nMas que estranho, porque tem uma pequena ?ilha? no meio? Com uma grande ?rvore...");
        System.out.println("Ao continuar caminhando voc? se depara com um pequeno barco na margem do lago, \numa figura estranha com uma silhueta intimidadora e sombria est? sentada no barco olhando em dire??o a ?pequena ilha?. \nAo se aproximar exige ele uma moeda, voc? n?o entende muito bem. ");
        System.out.println(yellow + "1 - Entregar uma potion " + fim);
        System.out.println(yellow + "2 - Roubar o barco " + fim);
        escolhaCapitulo2Cena1 = entrada.nextInt();
        switch (escolhaCapitulo2Cena1) {
            case 1 ->
                System.out.println("Ao entregar uma po??o, ele te leva at? a ilha, l? voc? v? mais de perto a ?rvore gigante, ao centro voc? encontra uma escrita:");
            case 2 ->
                System.out.println("Voc? vai at? a ilha, l? voc? v? mais de perto a ?rvore gigante, ao centro voc? encontra uma escrita:");
        }

        desafio1();

        System.out.println("A terra come?a a tremer, \num guardi? que estava debaixo do solo, aparece levantando a ?rvore que est? nas suas costas, \nseu corpo ? me rochoso, est? coberto de musgo?");
        enter(entrada);
        System.out.println("O guardi?o est? desnorteado, ele ataca tudo em sua frente, inclusive voc??");
        enter(entrada);
        System.out.println("Em seu corpo, existe uma parte tomada pela escurid?o, \no grupo da Entidade Sombria estava tentando fazendo experimentos  com ele?");
        enter(entrada);
        System.out.println("Ele est? em agonia, a natureza da Matem?tica foi mexida?");
        enter(entrada);
        System.out.println("O guardi?o cai no ch?o?");
        enter(entrada);
        System.out.println("A luz que voc? viu saindo da ?rvore se transformou em um esp?rito, ele tem uma pequena luz amarela e um formato engra?ado.");
        enter(entrada);
        System.out.println("? Um humano? Pelos Deuses! Por quanto tempo eu dormi? Aqueles malditos, me prenderam por quanto tempo? \nDeviam ter avisado que o escolhido viria at? mim??");
        enter(entrada);
        System.out.println(yellow + "1 - Perguntar mais sobre o esp?rito" + fim);
        System.out.println(yellow + "2 - Continuar" + fim);
        escolhaCapitulo2Cena1 = entrada.nextInt(); // Armazena a escolha
        switch (escolhaCapitulo2Cena1) { // Verifica qual o n?mero digitado pelo usu?rio
            case 1 ->
                System.out.println("Me chamo Landvaettir, mas pode me chamar de Land! \nMe avisaram que o Escolhido viria para esse mundo, estou aqui para te guiar! \nMas primeiro vamos desvendar a Matem?tica!");
            case 2 ->
                System.out.println("O esp?rito se chama Land, ele est? aqui para te testar! ");
        }
        System.out.println(yellow + "1 - Desvendar escritas antigas!" + fim);
        System.out.println(yellow + "2 - Derrotar um Golem" + fim);
        escolhaCapitulo2Cena1 = entrada.nextInt(); // Armazena a escolha
        switch (escolhaCapitulo2Cena1) { // Verifica qual o n?mero digitado pelo usu?rio
            case 1 -> {
                desafio2();
                desafio3();
            }
            case 2 ->
                combateFacil();
        }
        System.out.println("Voc? desbloqueou a ? Vis?o dos primeiros?!");
        enter(entrada);
        System.out.println("A Matem?tica tem v?rias camadas, para ser capaz de manipular a natureza voc? precisa enxerga-l?! \nIsso vai ajudar.");
        enter(entrada);
        System.out.println("Esp?rito ? O primeiro humano a conseguir o olhar dos ancestrais, \nmeus parab?ns, se sinta honrada, com isso voc? vai enxergar o que humanos normais n?o conseguem.");
        enter(entrada);
        System.out.println("Vamos test?-la!");
        combateMedio();
        System.out.println("Voc? conseguiu a primeira Runa, ela dir? que caminho voc? deve seguir para em encontrar as pr?ximas !");
        enter(entrada);
        System.out.println("Espera!");
        enter(entrada);
        System.out.println("O seu corpo fica paralisado, um fluxo de ar ensurdecedor est? te prendendo!!");
        enter(entrada);
        System.out.println("Uma gargalhada ? ouvida ao seu redor, ? um dos desgra?ados da Entidade Sombra, um feiticeiro!");
        enter(entrada);
        System.out.println("?Essa foi f?cil, e pensar que voc? encontraria uma runa para mim pequeno humano... \nMe economizou um tempo enorme, hahaha, mas tempo n?o ? um problema para n?s.?");
        enter(entrada);
        System.out.println("Com a Vis?o dos primeiros ela te traz a capacidade de ver a camada da natureza constru?da.");
        enter(entrada);
        System.out.println(yellow + "1 - Usar a Vis?o" + fim);
        System.out.println(yellow + "2 - Tentar se soltar" + fim);
        escolhaCapitulo2Cena1 = entrada.nextInt(); // Armazena a escolha
        switch (escolhaCapitulo2Cena1) { // Verifica qual o n?mero digitado pelo usu?rio
            case 1:
                System.out.println("Ao usar a Vis?o voc? consegue enxergar a f?rmula que est? controlando o vento. \nTente Resolve-la para se desprender.");
                desafio5();
                break;
            case 2:
                System.out.println("Voc? n?o consegue sair do fluxo, te falta um conhecimento profundo!");
                desafio5();
                break;
        }
        System.out.println(yellow + "1 - Atacar o feiticeiro" + fim);
        System.out.println(yellow + "2 - Tentar Prende-lo" + fim);
        escolhaCapitulo2Cena1 = entrada.nextInt(); // Armazena a escolha
        switch (escolhaCapitulo2Cena1) { // Verifica qual o n?mero digitado pelo usu?rio
            case 1:
                combateDificil();
                System.out.println("Voc? causou danos nele, chamas surgem queimando o seu corpo!");
                enter(entrada);
                System.out.println("A runa est? intacta. Parab?ns, jovem mestre, menos um para a conta.");
                enter(entrada);
                break;
            case 2:
                System.out.println("Manipular a mat?ria ainda ? complicado...");
                enter(entrada);
                System.out.println("Vamos tentar criar uma onda de ar e prend?-lo com hastes de min?rios.");
                enter(entrada);
                System.out.println("Para isso, voc? precisa primeiro enfraquece-lo!");
                enter(entrada);
                combateDificil();
                System.out.println("Resolva esse desafio para prende-lo");
                enter(entrada);
                desafio6();
                System.out.println("Voc? conseguiu prender o desgra?ado. \nEle est? entrando em desespero por causa da pris?o que voc? criou.");
                enter(entrada);
                System.out.println("A runa est? intacta. \nParab?ns, jovem mestre, menos um para a conta. Muitos desafios est?o por vir, s?o tempos dif?ceis...");
                break;
        }

    }

    /**
     * Classe que cont?m a historia da decis?o existente no segundo capitulo,
     * caso escolhido cena 2
     */
    static void historiaCapitulo2Cena2() {
        int escolhaCapitulo2Cenas2;
        System.out.println("Voc? decide se aproximar de um grupo de habitantes locais em uma taverna. \nAo mencionar a Matem?tica Divina, um velho anci?o menciona uma antiga ru?na nos arredores de Midland, \nconhecida por esconder segredos m?gicos, mas ?apenas boatos? ");
        System.out.println(yellow + "1 - Partir para a Ru?na." + fim);
        System.out.println(yellow + "2 - Perguntar por mais detalhes na Taverna." + fim);
        escolhaCapitulo2Cenas2 = entrada.nextInt(); // Armazena a escolha
        switch (escolhaCapitulo2Cenas2) { // Verifica qual o n?mero digitado pelo usu?rio
            case 1:
                System.out.println("Chegando na ru?na voc? encontra uma montanha de pedras, todas enfileiradas formando um arco. \nVoc? se aproxima e ao tocar nela.");
                enter(entrada);
                System.out.println("As runas azuis aparecem diante de voc?.");
                enter(entrada);
                break;
        }
        System.out.println("O anci?o come?a a contar uma pequena hist?ria: \n?A ru?na de Alfheim, a terra dos elfos, por muitos invernos atr?s, na era primordial, os elfos guardaram seus segredos. \nA capacidade de moldar a natureza em sua volta os fizeram conquistar o segredo de viver em paz e harmonia, \nat? a chegada daqueles asquerosos e gananciosos da Entidade Sombria, aqueles malditos, \nachavam que podiam brincar de ser Deuses, cof, cof... Ah!\nO calafrio me disse que voc? devia ir at? l??");
        enter(entrada);
        System.out.println("Voc? responde: Calafrio?");
        enter(entrada);
        System.out.println("Anci?o: Sim, o da minha espinha, sempre quando digo algo interessante, cof, cof...");
        enter(entrada);
        System.out.println(yellow + "Partir para a Ru?na." + fim);
        enter(entrada);
        System.out.println("Chegando na ru?na voc? encontra uma montanha de pedras, todas enfileiradas formando um arco. \nVoc? se aproxima e ao tocar nela.");
        enter(entrada);
        System.out.println("As runas azuis aparecem diante de voc?.");
        enter(entrada);

        desafio4();

    }
    // Fim das fun??es de cena
    
    // Inicio da fun??o para pular di?logos
    /**
     * Classe que cont?m a mec?nica de apertar enter para que os dialogos
     * continuem
     *
     * @param entrada
     */
    static void enter(Scanner entrada) {
        entrada.nextLine(); // Aguarda at? que o usu?rio pressione Enter
    }
    // Fim da fun??o para pular di?logos

    // *--* 3 - FUN??ES DE DESAFIO *--*
    
    // inicio das fun??es de desafio
     /**
     * Classe que cont?m o primeiro desafio utilizado na historia
     */
    static void desafio1() {
        int escolhaDesafio1; // Inicializa??o da vari?vel que ser? utilizado para escolha
        System.out.println("=== Desafio ===");
        System.out.println("Quanto ? 2020 elevado a 0 ?");
        System.out.println("1 - 0");
        System.out.println("2 - 1");
        System.out.println("3 - 2020");
        escolhaDesafio1 = entrada.nextInt(); // Armazena o que o usu?rio digitou
        switch (escolhaDesafio1) { // Verifica qual op??o foi escolhida
            case 2 ->
                System.out.println("Ap?s resolver o desafio uma luz surge em volta da ?rvore, \nformando uma esp?cie de globo, o tempo l? fora parece estar passando devagar...");
            default -> {
                System.out.println("Voc? errou meu querido, estamos reiniciando a pergunta");
                desafio1();
            }
        }

    }

    /**
     * Classe que cont?m o segundo desafio utilizado na historia
     */
    static void desafio2() {
        int escolhaDesafio2; // Inicializa??o da vari?vel que ser? utilizado para escolha
        System.out.println("=== Desafio ===");
        System.out.println("Qual a teoria que diz:");
        System.out.println("A soma dos quadrados dos catetos ? igual ao quadrado da hipotenusa");
        System.out.println("1 - Teoria de pit?goras");
        System.out.println("2 - Teoria de plat?o");
        System.out.println("3 - Teoria de arist?teles");
        escolhaDesafio2 = entrada.nextInt(); // Armazena o que o usu?rio digitou
        switch (escolhaDesafio2) { // Verifica qual op??o foi escolhida
            case 1 ->
                System.out.println("Parece realmente conhece sobre o nosso mundo, aqueles que est?o acima do c?u escolheram bem!");
            default -> {
                System.out.println("Errou, voc? est? iniciando novamente a pergunta ");
                desafio2();
            }
        }
    }

    /**
     * Classe que cont?m o terceiro desafio utilizado na historia
     */
    static void desafio3() {
        int escolhaDesafio3;// Inicializa??o da vari?vel que ser? utilizado para escolha
        System.out.println("=== Desafio ===");
        System.out.println("Qual o nome da fun??o da seguinte equa??o:");
        System.out.println("F(x) = (1/3)^x + 69");
        System.out.println("1 - Fun??o Quadr?tica");
        System.out.println("2 - Fun??o Exponencial");
        System.out.println("3 - Fun??o Log?ritma");
        escolhaDesafio3 = entrada.nextInt(); // Armazena o que o usu?rio digitou
        if (escolhaDesafio3 != 2) { // Verifica qual op??o foi escolhida
            System.out.println("Errou, voc? est? iniciando novamente o desafio ");
            desafio3();
        }

    }

    /**
     * Classe que cont?m o quarto desafio utilizado na historia
     */
    static void desafio4() {
        int escolhaDesafio4; // Inicializa??o da vari?vel que ser? utilizado para escolha
        System.out.println("No meu jardim existe 3 p?s de alface, 1 de pepino e 5 de cenoura. Quantos p?s eu tenho no total?");
        System.out.println("1 - 3 ");
        System.out.println("2 - 2");
        System.out.println("3 - 9");
        escolhaDesafio4 = entrada.nextInt(); // Armazena o que o usu?rio digitou
        switch (escolhaDesafio4) { // Verifica qual op??o foi escolhida
            case 2:
                System.out.println("Voc? encontrou uma pra?a");
                historiaCapitulo2Cena1();
                break;
            default:
                System.out.println("Voc? errou, estamos reiniciando o desafio");
                desafio1();
                break;
        }
    }

    /**
     * Classe que cont?m o quinto desafio utilizado na historia
     */
    static void desafio5() {
        int escolhaDesafio5; // Inicializa??o da vari?vel que ser? utilizado para escolha
        System.out.println("=== Desafio ===");
        System.out.println("Meu av? tem 5 filhos, cada filho tem 3 filhos. Quantos primos eu tenho?");
        System.out.println("1 - 12");
        System.out.println("2 - 15");
        System.out.println("3 - 3");
        escolhaDesafio5 = entrada.nextInt(); // Armazena o que o usu?rio digitou
        switch (escolhaDesafio5) { // Verifica qual op??o foi escolhida
            case 1:
                System.out.println("Um G?nio, eu diria, voc? finalmente entendeu!  \nO feiticeiro est? se mordendo de raiva, ele n?o pensava algu?m teria o conhecimento da Matem?tica Divina.");
                break;
            default:
                System.out.println("Errado, reiniciando o desafio");
                desafio5();
        }
    }

    /**
     * Classe que cont?m o sexto desafio utilizado na historia
     */
    static void desafio6() {
        int escolhaDesafio6;// Inicializa??o da vari?vel que ser? utilizado para escolha
        System.out.println("=== Desafio ===");
        System.out.println("Quando eu tinha 8 anos, a minha irm? tinha a metade da minha idade. \nAgora que tenho 54 anos, com quantos anos minha irm? est??");
        System.out.println("1 - 58");
        System.out.println("2 - 51");
        System.out.println("3 - 50");
        escolhaDesafio6 = entrada.nextInt(); // Armazena o que o usu?rio digitou
        if (escolhaDesafio6 != 3) { // Verifica se est? correto
            desafio6();
        }
    }
    // Fim das fun??es de desafio

    // *--* 4 - FUN??ES DE COMBATE *--*
    
    // Inicio das fun??es de dano randomica do personagem e do inimigo
    /**
     * Classe que cont?m a randomifica??o do dano do personagem se ele acertar a
     * pergunta
     *
     * @return numero int randomizado
     */
    static int danoPersonagem() {
        int danoPersonagem = Random.nextInt(13, 25); // Randomiza um n?mero entre 13 e 24 para o dano do personagem principal
        return danoPersonagem; // retorna o dano
    }

    /**
     * Classe que cont?m a randomifica??o do dano do inimigo se o personagem
     * errar a pergunta
     *
     * @return numero int randomizado
     */
    static int danoInimigo() {
        int danoInimigo = Random.nextInt(13, 25); // Randomiza um n?mero entre 13 e 24 para o dano do inimigo
        return danoInimigo; // retorna o dano
    }
    // Fim das fun??es de dano randomica do personagem e do inimigo

    // Inicio das fun??es de combate do personagem
    /**
     * Classe que gera as op??es de turno do personagem principal para o combate
     * facil
     */
    static void combatePersonagemFacil() { //Decis?es do turno do personagem
        int escolhaCombatePersonagemFacil; // Inicializa??o da variavel utilizada
        System.out.println("== Seu turno =="); // Mostra as op??es que o usu?rio pode fazer no seu turno
        System.out.println(red + "1 - Golpear" + fim); 
        System.out.println(green + "2 - Curar" + fim);
        System.out.println("===============");
        escolhaCombatePersonagemFacil = entrada.nextInt(); // Armazena o valor na vari?vel
        switch (escolhaCombatePersonagemFacil) { // Verifica as a??es que ser?o tomadas
            case 1 -> { // Personagem vai golpear, chamar a fun??o ataquePersonagemFacil(), com o parametro danoPersonagem()
                System.out.println(red + "Voce escolheu golpear" + fim);
                enter(entrada);
                ataquePersonagemFacil(danoPersonagem());
            }
            case 2 -> { // Personagem vai curar, vai chamar a fun??o curarPersonagem()
                System.out.println(green + "Voce escolheu curar" + fim);
                enter(entrada);
                curarPersonagem();

            }

            default -> { // Reinicia o combatePersonagemFacil() se digitou um n?mero errado
                System.out.println("Voc? n?o escolheu um n?mero v?lido");
                combatePersonagemFacil();
            }
        }
    }

    /**
     * Classe que gera as op??es de turno do personagem principal para o combate
     * facil
     */
    static void combatePersonagemMedio() { //Decis?es do turno do personagem
        int escolhaCombatePersonagemMedio; // Inicializa??o da variavel utilizada
        System.out.println("== Seu turno =="); // Mostra as op??es que o usu?rio pode fazer no seu turno
        System.out.println(red + "1 - Golpear" + fim);
        System.out.println(green + "2 - Curar" + fim);
        System.out.println("===============");
        escolhaCombatePersonagemMedio = entrada.nextInt(); // Armazena o valor na vari?vel
        switch (escolhaCombatePersonagemMedio) { // Verifica as a??es que ser?o tomadas
            case 1 -> { // Personagem vai golpear, chamar a fun??o ataquePersonagemFacil(), com o parametro danoPersonagem()
                System.out.println(red + "Voce escolheu golpear" + fim);
                ataquePersonagemMedio(danoPersonagem());
            }
            case 2 -> { // Personagem vai curar, vai chamar a fun??o curarPersonagem()
                System.out.println(green + "Voce escolheu curar" + fim);
                curarPersonagem();

            }

            default -> { // Reinicia o combatePersonagemFacil() se digitou um n?mero errado
                System.out.println("Voc? n?o escolheu um n?mero v?lido");
                combatePersonagemMedio();
            }
        }

    }

    /**
     * Classe que gera as op??es de turno do personagem principal para o combate
     * facil
     */
    static void combatePersonagemDificil() { //Decis?es do turno do personagem
        int escolhaCombatePersonagemDificil; // Inicializa??o da variavel utilizada
        System.out.println("== Seu turno =="); // Mostra as op??es que o usu?rio pode fazer no seu turno
        System.out.println(red + "1 - Golpear" + fim);
        System.out.println(green + "2 - Curar" + fim);
        System.out.println("===============");
        escolhaCombatePersonagemDificil = entrada.nextInt(); // Armazena o valor na vari?vel
        switch (escolhaCombatePersonagemDificil) { // Verifica as a??es que ser?o tomadas
            case 1 -> { // Personagem vai golpear, chamar a fun??o ataquePersonagemFacil(), com o parametro danoPersonagem()
                System.out.println(red + "Voce escolheu golpear" + fim);
                ataquePersonagemDificil(danoPersonagem()); 
            }
            case 2 -> { // Personagem vai curar, vai chamar a fun??o curarPersonagem()
                System.out.println(green + "Voce escolheu curar" + fim);
                curarPersonagem();

            }

            default -> { // Reinicia o combatePersonagemFacil() se digitou um n?mero errado
                System.out.println("Voc? n?o escolheu um n?mero v?lido");
                combatePersonagemDificil();
            }

        }

    }
    // Fim das fun??es de combate do inimigo

    // Inicio das fun??es de combate do inimigo
    /**
     * Classe que gera o turno do oponente no combate facil, com uma
     * randomiza??o nas a??es do inimigo (bot)
     */
    static void combateInimigoFacil() { //Randomifica??o das decis?es do inimigo
        int randomCombateInimigoFacil; // Inicializa??o da vari?vel
        randomCombateInimigoFacil = Random.nextInt(5);//Randomifica??o das decis?es do inimigo, escolhe um n?mero de 0 a 4
        switch (randomCombateInimigoFacil) { //Randomifica??o das decis?es do inimigo
            case 0, 1, 3 -> { // Inimigo randomizou golpear, vai chamar a fun??o ataqueMiniBossFacil(), com parametro danoInimigo()
                System.out.println(red + "O inimigo escolheu golpear" + fim);
                ataqueMiniBossFacil(danoInimigo());
            }
            case 2, 4 -> { // Inimigo randomizou curar, vai chamar a fun??o curarInimigo()
                System.out.println(green + "O inimigo escolheu curar" + fim);
                curarInimigo();

            }

        }
    }

    /**
     * Classe que gera o turno do oponente no combate m?dio, com uma
     * randomiza??o nas a??es do inimigo (bot)
     */
    static void combateInimigoMedio() { //Randomifica??o das decis?es do inimigo
        int randomCombateInimigoMedio; // Inicializa??o da vari?vel
        randomCombateInimigoMedio = Random.nextInt(5);//Randomifica??o das decis?es do inimigo, escolhe um n?mero de 0 a 4
        switch (randomCombateInimigoMedio) { //Randomifica??o das decis?es do inimigo
            case 0, 1, 3 -> { // Inimigo randomizou golpear, vai chamar a fun??o ataqueMiniBossFacil(), com parametro danoInimigo()
                System.out.println(red + "O inimigo escolheu golpear" + fim);
                ataqueMiniBossMedio(danoInimigo());
            }
            case 2, 4 -> { // Inimigo randomizou curar, vai chamar a fun??o curarInimigo()
                System.out.println(green + "O inimigo escolheu curar" + fim);
                curarInimigo();

            }

        }
    }

    /**
     * Classe que gera o turno do oponente no combate dificil, com uma
     * randomiza??o nas a??es do inimigo (bot)
     */
    static void combateInimigoDificil() { //Randomifica??o das decis?es do inimigo
        int randomCombateInimigoDificil; // Inicializa??o da vari?vel
        randomCombateInimigoDificil = Random.nextInt(5); //Randomifica??o das decis?es do inimigo, escolhe um n?mero de 0 a 4
        switch (randomCombateInimigoDificil) { //Randomifica??o das decis?es do inimigo
            case 0, 1, 3 -> { // Inimigo randomizou golpear, vai chamar a fun??o ataqueMiniBossFacil(), com parametro danoInimigo()
                System.out.println(red + "O inimigo escolheu golpear" + fim);
                ataqueMiniBossDificil(danoInimigo());
            }
            case 2, 4 -> { // Inimigo randomizou curar, vai chamar a fun??o curarInimigo()
                System.out.println(green + "O inimigo escolheu curar" + fim);
                curarInimigo();

            }

        }
    }
    // Fim das fun??es de combate do inimigo

    // Inicio das fun??es de ataque do personagem
    /**
     * Classe que roda ap?s o usu?rio escolher a op??o Golpear no combate facil.
     * Ela gera uma pergunta que o aliado deve responder corretamente para dar
     * um dano aleatorio maior que 13 e menor que 24. int a = numero random
     */
    static void ataquePersonagemFacil(int danoPersonagem) {
        Random pergunta = new Random(); // Inicializa??o do Random
        String resposta;
        int numeroDaPergunta;
        char respostaArray;
        int tamanhoArray;
        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas adicionadas para utilizar no combateFacil()
        perguntas.add("35 estudantes estrangeiros vieram ao Brasil. 16 visitaram Manaus; 16, S. Paulo e 11, Salvador. \nDesses estudantes, 5 visitaram Manaus e Salvador e, desses 5, 3 visitaram tamb?m S?o Paulo. \nO n?mero de estudantes que visitaram Manaus ou S?o Paulo foi:\n"
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
        perguntas.add("Os senhores A, B e C concorriam ? lideran?a de certo partido pol?tico. \nPara escolher o l?der, cada eleitor votou apenas em dois candidatos de sua prefer?ncia. \nHouve 100 votos para A e B, 80 votos para B e C e 20 votos para A e C. \nEm consequ?ncia:\n"
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
        perguntas.add("Um fabricante de cosm?ticos decide produzir tr?s diferentes cat?logos de seus produtos, visando a p?blicos distintos. \nComo alguns produtos estar?o presentes em mais de um cat?logo e ocupam uma p?gina inteira, ele resolve fazer uma contagem para diminuir os gastos com originais de impress?o. \nOs cat?logos C1, C2 e C3 ter?o, respectivamente, 50, 45 e 40 p?ginas. \nComparando os projetos de cada cat?logo, ele verifica que C1 e C2 ter?o 10 p?ginas em comum; C1 e C3 ter?o 6 p?ginas em comum; C2 e C3 ter?o 5 p?ginas em comum, das quais 4 tamb?m estar?o em C1. \nEfetuando os c?lculos correspondentes, o fabricante conclui que, para a montagem dos tr?s cat?logos, necessitar? de um total de originais de impress?o igual a:\n"
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
        perguntas.add("Qual a proposi??o abaixo ? verdadeira?\n"
                + "\n"
                + "a) Todo n?mero inteiro ? racional e todo n?mero real ? um n?mero inteiro.\n"
                + "b) A intersec??o do conjunto dos n?meros racionais com o conjunto dos n?meros irracionais tem 1 elemento.\n"
                + "c) O n?mero 1,83333... ? um n?mero racional.\n"
                + "d) A divis?o de dois n?meros inteiros ? sempre um n?mero inteiro.");
        perguntas.add("Dado o conjunto U = n?meros naturais de 0 at? 20. \nSabendo que B = n?meros m?ltiplos de 3, podemos afirmar que o conjunto B diferenca U  ? igual ao conjunto:\n"
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
        perguntas.add("Sobre os conjuntos num?ricos, escolha a alternativa incorreta.\n"
                + "\n"
                + "A) Todo n?mero natural ? tamb?m um n?mero racional.\n"
                + "\n"
                + "B) Um n?mero racional n?o pode ser irracional.\n"
                + "\n"
                + "C) Todo n?mero negativo ? um n?mero inteiro.\n"
                + "\n"
                + "D) O conjunto dos n?meros reais ? formado pela uni?o dos n?meros racionais e irracionais.\n"
                + "\n"
                + "E) As d?zimas peri?dicas s?o consideradas n?meros racionais, portanto s?o tamb?m n?meros reais.");
        perguntas.add("Em uma escola, 300 alunos foram entrevistados sobre as pr?ticas esportivas. \nOs estudantes foram questionados sobre a pr?tica de exerc?cios fora da escola. \nCom esse question?rio, foi poss?vel dividir os estudantes em grupos:\n"
                + "\n"
                + "110 alunos afirmaram que fazem muscula??o fora da escola;\n"
                + "140 alunos afirmaram que jogam futebol fora da escola; e\n"
                + "80 estudantes afirmaram que praticam outros tipos de atividade f?sica, como corrida e nata??o.\n"
                + "Sabendo que 40 alunos praticam futebol e muscula??o, 33 praticam futebol e outra atividade f?sica,  24 praticam muscula??o e outra atividade f?sica e que 8 estudantes praticam os tr?s.\nO n?mero de estudantes sedent?rios, ou seja, que n?o praticam nenhuma das tr?s modalidades, ?:\n"
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
        perguntas.add("Seja A = {2,5}, B = {2,5,6} e C = {6,10}, determine os elementos da opera??o (A U B) ? (B U C).\n"
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
        perguntas.add(" Sobre os conjuntos num?ricos, julgue as afirmativas a seguir.\n"
                + "\n"
                + "I ? A diferen?a entre o conjunto dos n?meros reais e o conjunto dos n?meros racionais ? igual ao conjunto dos n?meros irracionais.\n"
                + "\n"
                + "II ? Zero pertence ao conjunto dos n?meros irracionais.\n"
                + "\n"
                + "III ? O resultado de | -7,5 | ? um n?mero natural.\n"
                + "\n"
                + "Marque a alternativa correta.\n"
                + "\n"
                + "A) Somente a afirmativa I ? verdadeira.\n"
                + "\n"
                + "B) Somente a afirmativa II ? verdadeira.\n"
                + "\n"
                + "C) Somente a afirmativa III ? verdadeira.\n"
                + "\n"
                + "D) Somente as afirmativas I e III s?o verdadeiras.\n"
                + "\n"
                + "E) Todas as afirmativas s?o verdadeiras.");
        perguntas.add("A quantidade de elementos do conjunto (A ? B) U C, em que A = {2,4,6,8,10,12,14} B = {3,6,8,12} e C = {0,4,7}, ?:\n"
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
        tamanhoArray = perguntas.size(); // Descobrir qual o tamanho do array para utilizar ele como parametro no random
        
        numeroDaPergunta = pergunta.nextInt(tamanhoArray); // N?mero ale?torio para que possa pegar uma pergunta aleat?ria
        ArrayList<Character> respostas = new ArrayList<>(); // Array das respostas das perguntas para ser utilizado no combateFacil()
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

        System.out.println(perguntas.get(numeroDaPergunta)); // Mostra a pergunta pro usu?rio
        System.out.println("Digite a resposta correta! ");
        resposta = entrada.next(); // Armazena a resposta
        resposta = resposta.toLowerCase(); // Transforma em letras minusculas
        respostaArray = resposta.charAt(0); // Pega a primeira letra da resposta

        if (respostas.get(numeroDaPergunta) == respostaArray) { // Verifica se a sua resposta corresponde com a resposta pra essa pergunta no array respostaArray
            System.out.println("Resposta correta, voc? atacou o golem");
            System.out.format("O dano total foi de%s%n%d%s%n\n", red, danoPersonagem, fim); // Mostra qual foi o dano
            vidaCriatura -= danoPersonagem; // Tira a vida o inimigo
            if (vidaCriatura <= 0) { // Verifica se o inimigo est? com vida abaixo de 0
                vidaCriatura = 0;
            } else { // Sen?o, mostra a vida atual do inimigo
                System.out.format("A vida do golem est? em %s%n%d%s%n\n", red, vidaCriatura, fim);
            }
        } else { // Se errou ele mostra a resposta correta e voc? n?o acerta o dano
            System.out.println("Resposta Incorreta, a resposta correta ? " + respostas.get(numeroDaPergunta) + " voc? errou o ataque no golem");
        }

    }

    /**
     * Classe que roda ap?s o usu?rio escolher a op??o Golpear no combate m?dio.
     * Ela gera uma pergunta que o aliado deve responder corretamente para dar
     * um dano aleatorio maior que 13 e menor que 24. int a = numero random
     */
    static void ataquePersonagemMedio(int danoPersonagem) {
        Random pergunta = new Random(); // Inicializa??o do Random
        String resposta;
        int numeroDaPergunta;
        char respostaArray;
        int tamanhoArray;
        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas adicionadas para utilizar no combateMedio()
        perguntas.add("O valor de x que faz a equa??o 2^(x+1)=32\n(Dica: Tente colocar os n?meros na mesma base em ambos os lados) "
                + "  ?:\n"
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
        perguntas.add("Analise a equa??o a seguir:\n"
                + "\n"
                + "2^(x^2?4)=128\n"
                + " \n"
                + "\n"
                + "Sobre essa equa??o, podemos afirmar que:\n"
                + "\n"
                + "A) ? uma equa??o polinomial do 1? grau.\n"
                + "\n"
                + "B) ? uma equa??o polinomial do 2? grau.\n"
                + "\n"
                + "C) ? uma equa??o trigonom?trica.\n"
                + "\n"
                + "D) ? uma equa??o exponencial.\n"
                + "\n"
                + "E) ? uma equa??o logar?tmica.");
        perguntas.add("Encontre o valor de x na equa??o:\n(Dica: Separe os n?meros exponenciados com os principios da potencia??o)"
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
        perguntas.add("O conjunto de solu??es da equa??o exponencial 3?2x2?4=48\n(Dica: Resolva a equa??o e reformule o jeito de escrever o resultado que voc? descobrir? a resposta)"
                + "  ?:\n"
                + "\n"
                + "A)x=?2\n"
                + "\n"
                + "B)x=?2?2\n"
                + " \n"
                + "\n"
                + "C)x=?4\n"
                + "\n"
                + "D)x=?4?2\n"
                + " \n"
                + "\n"
                + "E)x=??6");
        perguntas.add("O montante de determinado capital em um fundo de investimento, ap?s o tempo t em anos, ? dado pela f?rmula M(t)=C?1,5^t\n"
                + "Nessas condi??es, o tempo necess?rio para que um capital de R$ 800 investido gere um montante de R$ 4050 ? de:\n(Dica: Substitua M(t) e C pelos valores corretos)"
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
        perguntas.add("A quantidade de bact?rias de uma cultura, depois de t horas, ? dada pela express?o Q(t)=Q0*2^t\n"
                + ", em que Q0  ? a quantidade inicial de bact?rias. Nessas condi??es, se inicialmente havia 1500 bact?rias, ap?s quantas horas haver? 12.000 bact?rias?\n(Dica: Substitua Q(t) e Q0 pelos valores corretos)"
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
        perguntas.add("Durante um experimento, obteve-se a f?rmula para a popula??o de bact?rias:\n"
                + "\n"
                + " q(t)=20*2^(3t)\n"
                + "\n"
                + "Em que t ? o tempo, em hora, e q(t) ? a popula??o, em milhares de bact?rias. \nSe a popula??o de bact?rias era incialmente de 20 mil, ent?o ap?s quanto tempo ela ser? dobrada? \n(Dica: Substitua q(t) pela quantidade de bacteria desejada e resolva a quest?o)\n"
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
                + " e y=(0,2)^(3t ? 2) \n"
                + "O valor de y que faz com que x seja igual a y ?: (Dica: Transformte os n?meros em decimais ou fra??es e iguale uma equa??o a outra) \n"
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
        perguntas.add(" Dada a equa??o exponencial 3^(x^2?x) = 9.\n"
                + "A soma das solu??es dessa equa??o ?: (Dica: Iguale a equa??o a 0 e some o resultado de x1 + x2) \n"
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
        perguntas.add("Utilizamos a potencia??o para modelar fen?menos que crescem muito r?pido, por exemplo, o crescimento das infec??es de um v?rus durante uma pandemia. \nSuponha que o n?mero de infectados se inicia em 2 e que cada pessoa infectada infecte outras 3, ou seja, na primeira semana, haver? 6 infectadas, na segunda, 18, e assim sucessivamente. \nSupondo que o ritmo de infec??o continue o mesmo por, pelo menos, um ano, ent?o, ap?s quantas semanas, haver? 4374 pessoas infectadas?\n(Dica: Modele a pergunta para uma equa??o)"
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
        tamanhoArray = perguntas.size(); // Descobrir qual o tamanho do array para utilizar ele como parametro no random
       
        numeroDaPergunta = pergunta.nextInt(tamanhoArray); // N?mero ale?torio para que possa pegar uma pergunta aleat?ria
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

        System.out.println(perguntas.get(numeroDaPergunta)); // Mostra a pergunta pro usu?rio
        System.out.println("Digite a resposta correta! ");
        resposta = entrada.next(); // Armazena a resposta
        resposta = resposta.toLowerCase(); // Transforma em letras minusculas
        respostaArray = resposta.charAt(0); // Pega a primeira letra da resposta

        if (respostas.get(numeroDaPergunta) == respostaArray) { // Verifica se a sua resposta corresponde com a resposta pra essa pergunta no array respostaArray
            System.out.println("Resposta correta, voc? atacou o Land");
            System.out.format("O dano total foi de%s%n%d%s%n\n", red, danoPersonagem, fim); // Mostra qual foi o dano
            vidaCriatura -= danoPersonagem; // Tira a vida o inimigo
            if (vidaCriatura <= 0) { // Verifica se o inimigo est? com vida abaixo de 0
                vidaCriatura = 0;
            } else { // Sen?o, mostra a vida atual do inimigo
                System.out.format("A vida do golem est? em %s%n%d%s%n\n", red, vidaCriatura, fim);
            }
        } else { // Se errou ele mostra a resposta correta e voc? n?o acerta o dano
            System.out.println("Resposta Incorreta, a resposta correta ? " + respostas.get(numeroDaPergunta) + " voc? errou o ataque no golem");
        }
    }

    /**
     * Classe que roda ap?s o usu?rio escolher a op??o Golpear no combate
     * dificil. Ela gera uma pergunta que o aliado deve responder corretamente
     * para dar um dano aleatorio maior que 13 e menor que 24. int a = numero
     * random
     */
    static void ataquePersonagemDificil(int danoPersonagem) {
        Random pergunta = new Random(); // Inicializa??o do Random
        String resposta;
        int numeroDaPergunta;
        char respostaArray;
        int tamanhoArray;
        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do personagem usado no combateDificil()
        perguntas.add("As ra?zes da equa??o 2x2 + bx + c = 0 s?o 3 e ? 4. Nesse caso, o valor de b - c ?\n(Dica: Substitua a equa??o com os dois valores e fa?a um sistema de subtra??o entre elas)"
                + "a) ?26.\n"
                + "b) ?22.\n"
                + "c) ?1.\n"
                + "d) 22.\n"
                + "e) 26.");
        perguntas.add("Uma fun??o quadr?tica f ? dada por f(x) = x2 + bx + c, com b e c reais. \nSe f(1) = ?1 e f(2) ? f(3) = 1, o menor valor que f(x) pode assumir, quando x varia no conjunto dos n?meros reais, ? igual a(Dica: Substitua os valores informados nas equa??es para descobrir o valor de C, depois disso, use a formula do vertice do y para descobrir o resultado)\n"
                + "\n"
                + "a) ?12.\n"
                + "b) ?6.\n"
                + "c) ?10.\n"
                + "d) ?5.\n"
                + "e) ?9..");
        perguntas.add("f(x) = x^2 - 2kx + 29, para x pertence aos numeros reais\n"
                + "Se f(x) ? 4, para todo n?mero real x, o valor m?nimo da fun??o f ? 4.\n"
                + "Assim, o valor positivo do par?metro k ?:\n(Dica: O n?mero 4 dado na fun??o ? o resultado do yx do vertice, substitua os valores da formula pelos valores da fun??o (-delta/4a))"
                + "\n"
                + "a) 5\n"
                + "b) 6\n"
                + "c) 10\n"
                + "d) 15");
        perguntas.add("A ?gua ? essencial para a vida e est? presente na constitui??o de todos os alimentos. Em regi?es com escassez de ?gua, ? comum a utiliza??o de cisternas para a capta??o e armazenamento da ?gua da chuva. Ao esvaziar um tanque contendo ?gua da chuva, a express?o\n"
                + "\n"
                + "V(t) = - 1 / 43200 * t^2 + 3\n(Dica: Iguale a equa??o a 0 e aplique os conceitos de equa??es para resolver, n?o esque?a de transformar o resultado depois)"
                + "\n"
                + "representa o volume (em m3) de ?gua presente no tanque no instante t (em minutos)\n"
                + "\n"
                + "Qual ? o tempo, em horas, necess?rio para que o tanque seja esvaziado?\n"
                + "\n"
                + "a) 360\n"
                + "b) 180\n"
                + "c) 120\n"
                + "d) 6\n"
                + "e) 3");
        perguntas.add("Quais s?o as ra?zes reais da equa??o x2 ? x = 6?\n(Dica: Resolva utilizando os principios da equa??o)"
                + "\n"
                + "a) Apenas 3\n"
                + "\n"
                + "b) 25 e 3\n"
                + "\n"
                + "c) 25 e ? 2\n"
                + "\n"
                + "d) 3 e ? 2\n"
                + "\n"
                + "e) Apenas ? 2");
        perguntas.add("Um terreno quadrado possui ?rea de 144 metros quadrados e apenas a sua frente ainda n?o est? murada. Quantos metros de muro ter?o que ser feitos para isolar completamente esse terreno?\n(Dica: N?o confunda ?rea com perimetro)"
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
        perguntas.add("A temperatura T de um forno (em graus cent?grados) ? reduzida por um sistema a partir do instante do desligamento (t = 0) e varia de acordo com a express?o (t em minutos):\n"
                + "\n"
                + "T(t) = ? t^2/4 + 400\n"
                + "\n"
                + "\n"
                + "Por motivos de seguran?a, a trava do forno s? ? liberada para abertura quando o forno atinge temperatura de 39 ?C. Qual o tempo m?nimo de espera, em minutos, ap?s desligar o forno, para que a porta possa ser aberta?\n(Dica: Substitua t(t) pelo valor correto e resolva a equa??o)"
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
        perguntas.add("Qual ? a medida de um ?ngulo interno de um pol?gono convexo que possui 230 diagonais?\n(Dica: formula para descobrir o numero de lados pelas diagonais (d = (n(n-3))/2) e formula para descobrir a soma dos angulos (S = (n-2) * 180), use-as sabiamente)"
                + "\n"
                + "a) 164,35?\n"
                + "\n"
                + "b) 23?\n"
                + "\n"
                + "c) 1849?\n"
                + "\n"
                + "d) 3780?\n"
                + "\n"
                + "e) 20?");
        perguntas.add("Sejam x1 e x2 as ra?zes da equa??o x^2 + 8x + 7. Qual ? o valor de x1*x2?\n (Dica: Resolve a equa??o do segundo grau e multiplique os x's encontrados)"
                + "\n"
                + "a) 7\n"
                + "\n"
                + "b) 17\n"
                + "\n"
                + "c) ? 7\n"
                + "\n"
                + "d) ? 14\n"
                + "\n"
                + "e) ? 8");
        perguntas.add("Qual ? a maior das ra?zes da equa??o do segundo grau ? x^2 ? 12x ? 35?\n(Dica: Use seus conhecimentos em equa??o de segundo grau e descubra qual dos dois x's ? o maior)"
                + "\n"
                + "a) 5\n"
                + "\n"
                + "b) 7\n"
                + "\n"
                + "c) 12\n"
                + "\n"
                + "d) ? 7\n"
                + "\n"
                + "e) ? 5");
        tamanhoArray= perguntas.size();
        numeroDaPergunta = pergunta.nextInt(tamanhoArray);
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

        System.out.println(perguntas.get(numeroDaPergunta)); // Mostra a pergunta pro usu?rio
        System.out.println("Digite a resposta correta! ");
        resposta = entrada.next(); // Armazena a resposta
        resposta = resposta.toLowerCase(); // Transforma em letras minusculas
        respostaArray = resposta.charAt(0); // Pega a primeira letra da resposta

        if (respostas.get(numeroDaPergunta) == respostaArray) { // Verifica se a sua resposta corresponde com a resposta pra essa pergunta no array respostaArray
            System.out.println("Resposta correta, voc? atacou o feiticeiro");
            System.out.format("O dano total foi de%s%n%d%s%n\n", red, danoPersonagem, fim); // Mostra qual foi o dano
            vidaCriatura -= danoPersonagem; // Tira a vida o inimigo
            if (vidaCriatura <= 0) { // Verifica se o inimigo est? com vida abaixo de 0
                vidaCriatura = 0;
            } else { // Sen?o, mostra a vida atual do inimigo
                System.out.format("A vida do golem est? em %s%n%d%s%n\n", red, vidaCriatura, fim);
            }
        } else { // Se errou ele mostra a resposta correta e voc? n?o acerta o dano
            System.out.println("Resposta Incorreta, a resposta correta ? " + respostas.get(numeroDaPergunta) + " voc? errou o ataque no golem");
        }
    }
    // Fim das fun??es de ataque do personagem

    // Inicio das fun??es de ataque do inimigo
    /**
     * Classe que roda se o bot randomizar a op??o Golpear no combate facil, ela
     * gera uma pergunta para o usu?rio que deve responde-la corretamente para
     * que ele desvie do ataque, se errar a pergunta, ele toma o dano inteiro.
     * int a = numero random
     */
    static void ataqueMiniBossFacil(int danoInimigo) { //Execucao da a??o do inimigo Golpear
        Random pergunta = new Random(); // Inicializa??o do Random
        String resposta;
        int numeroDaPergunta;
        char respostaArray;
        int tamanhoArray;
        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo usado no combateFacil()
        perguntas.add("35 estudantes estrangeiros vieram ao Brasil. 16 visitaram Manaus; 16, S. Paulo e 11, Salvador. \nDesses estudantes, 5 visitaram Manaus e Salvador e, desses 5, 3 visitaram tamb?m S?o Paulo. \nO n?mero de estudantes que visitaram Manaus ou S?o Paulo foi:\n"
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
        perguntas.add("Os senhores A, B e C concorriam ? lideran?a de certo partido pol?tico. \nPara escolher o l?der, cada eleitor votou apenas em dois candidatos de sua prefer?ncia. \nHouve 100 votos para A e B, 80 votos para B e C e 20 votos para A e C. \nEm consequ?ncia:\n"
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
        perguntas.add("Um fabricante de cosm?ticos decide produzir tr?s diferentes cat?logos de seus produtos, visando a p?blicos distintos. \nComo alguns produtos estar?o presentes em mais de um cat?logo e ocupam uma p?gina inteira, ele resolve fazer uma contagem para diminuir os gastos com originais de impress?o. \nOs cat?logos C1, C2 e C3 ter?o, respectivamente, 50, 45 e 40 p?ginas. \nComparando os projetos de cada cat?logo, ele verifica que C1 e C2 ter?o 10 p?ginas em comum; C1 e C3 ter?o 6 p?ginas em comum; C2 e C3 ter?o 5 p?ginas em comum, das quais 4 tamb?m estar?o em C1. \nEfetuando os c?lculos correspondentes, o fabricante conclui que, para a montagem dos tr?s cat?logos, necessitar? de um total de originais de impress?o igual a:\n"
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
        perguntas.add("Qual a proposi??o abaixo ? verdadeira?\n"
                + "\n"
                + "a) Todo n?mero inteiro ? racional e todo n?mero real ? um n?mero inteiro.\n"
                + "b) A intersec??o do conjunto dos n?meros racionais com o conjunto dos n?meros irracionais tem 1 elemento.\n"
                + "c) O n?mero 1,83333... ? um n?mero racional.\n"
                + "d) A divis?o de dois n?meros inteiros ? sempre um n?mero inteiro.");
        perguntas.add("Dado o conjunto U = n?meros naturais de 0 at? 20. \nSabendo que B = n?meros m?ltiplos de 3, podemos afirmar que o conjunto B diferenca U  ? igual ao conjunto:\n"
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
        perguntas.add("Sobre os conjuntos num?ricos, escolha a alternativa incorreta.\n"
                + "\n"
                + "A) Todo n?mero natural ? tamb?m um n?mero racional.\n"
                + "\n"
                + "B) Um n?mero racional n?o pode ser irracional.\n"
                + "\n"
                + "C) Todo n?mero negativo ? um n?mero inteiro.\n"
                + "\n"
                + "D) O conjunto dos n?meros reais ? formado pela uni?o dos n?meros racionais e irracionais.\n"
                + "\n"
                + "E) As d?zimas peri?dicas s?o consideradas n?meros racionais, portanto s?o tamb?m n?meros reais.");
        perguntas.add("Em uma escola, 300 alunos foram entrevistados sobre as pr?ticas esportivas. \nOs estudantes foram questionados sobre a pr?tica de exerc?cios fora da escola. \nCom esse question?rio, foi poss?vel dividir os estudantes em grupos:\n"
                + "\n"
                + "110 alunos afirmaram que fazem muscula??o fora da escola;\n"
                + "140 alunos afirmaram que jogam futebol fora da escola; e\n"
                + "80 estudantes afirmaram que praticam outros tipos de atividade f?sica, como corrida e nata??o.\n"
                + "Sabendo que 40 alunos praticam futebol e muscula??o, 33 praticam futebol e outra atividade f?sica,  24 praticam muscula??o e outra atividade f?sica e que 8 estudantes praticam os tr?s.\nO n?mero de estudantes sedent?rios, ou seja, que n?o praticam nenhuma das tr?s modalidades, ?:\n"
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
        perguntas.add("Seja A = {2,5}, B = {2,5,6} e C = {6,10}, determine os elementos da opera??o (A U B) ? (B U C).\n"
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
        perguntas.add(" Sobre os conjuntos num?ricos, julgue as afirmativas a seguir.\n"
                + "\n"
                + "I ? A diferen?a entre o conjunto dos n?meros reais e o conjunto dos n?meros racionais ? igual ao conjunto dos n?meros irracionais.\n"
                + "\n"
                + "II ? Zero pertence ao conjunto dos n?meros irracionais.\n"
                + "\n"
                + "III ? O resultado de | -7,5 | ? um n?mero natural.\n"
                + "\n"
                + "Marque a alternativa correta.\n"
                + "\n"
                + "A) Somente a afirmativa I ? verdadeira.\n"
                + "\n"
                + "B) Somente a afirmativa II ? verdadeira.\n"
                + "\n"
                + "C) Somente a afirmativa III ? verdadeira.\n"
                + "\n"
                + "D) Somente as afirmativas I e III s?o verdadeiras.\n"
                + "\n"
                + "E) Todas as afirmativas s?o verdadeiras.");
        perguntas.add("A quantidade de elementos do conjunto (A ? B) U C, em que A = {2,4,6,8,10,12,14} B = {3,6,8,12} e C = {0,4,7}, ?:\n"
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
        tamanhoArray = perguntas.size();
        numeroDaPergunta = pergunta.nextInt(tamanhoArray);

        // A randomifica??o do array sair? aqui e ser? escolhido a pergunta
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

        System.out.println(perguntas.get(numeroDaPergunta)); // Mostra a pergunta pro usu?rio
        System.out.println("Digite a resposta correta! ");
        resposta = entrada.next(); // Armazena a resposta
        resposta = resposta.toLowerCase();
        respostaArray = resposta.charAt(0);
        if (respostas.get(numeroDaPergunta) == respostaArray) { // Verifica se a resposta corresponde a resposta do array de perguntas
            System.out.println("Resposta correta, voc? desviou do golpe do inimigo");
        } else {
            System.out.println("Resposta Incorreta, a resposta correta ? " + respostas.get(numeroDaPergunta) + " voc? tomou o dano inteiro do inimigo"); // Mostra a resposta certa
            vidaPersonagem -= danoInimigo; // Tira vida do personagem
            System.out.format("Sua vida atual ?  %s%n%d %s%n\n", green, vidaPersonagem, fim);
        }
    }

    /**
     * Classe que roda se o bot randomizar a op??o Golpear no combate m?dio, ela
     * gera uma pergunta para o usu?rio que deve responde-la corretamente para
     * que ele desvie do ataque, se errar a pergunta, ele toma o dano inteiro.
     * int a = numero random
     */
    static void ataqueMiniBossMedio(int danoInimigo) {
        Random pergunta = new Random(); // Inicializa??o do Random
        String resposta;
        int numeroDaPergunta;
        char respostaArray;
        int tamanhoArray;
        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo no combateMedio()
        perguntas.add("O valor de x que faz a equa??o 2^(x+1)=32\n(Dica: Tente colocar os n?meros na mesma base em ambos os lados) "
                + "  ?:\n"
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
        perguntas.add("Analise a equa??o a seguir:\n"
                + "\n"
                + "2^(x^2?4)=128\n"
                + " \n"
                + "\n"
                + "Sobre essa equa??o, podemos afirmar que:\n"
                + "\n"
                + "A) ? uma equa??o polinomial do 1? grau.\n"
                + "\n"
                + "B) ? uma equa??o polinomial do 2? grau.\n"
                + "\n"
                + "C) ? uma equa??o trigonom?trica.\n"
                + "\n"
                + "D) ? uma equa??o exponencial.\n"
                + "\n"
                + "E) ? uma equa??o logar?tmica.");
        perguntas.add("Encontre o valor de x na equa??o:\n(Dica: Separe os n?meros exponenciados com os principios da potencia??o)"
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
        perguntas.add("O conjunto de solu??es da equa??o exponencial 3?2x2?4=48\n(Dica: Resolva a equa??o e reformule o jeito de escrever o resultado que voc? descobrir? a resposta)"
                + "  ?:\n"
                + "\n"
                + "A)x=?2\n"
                + "\n"
                + "B)x=?2?2\n"
                + " \n"
                + "\n"
                + "C)x=?4\n"
                + "\n"
                + "D)x=?4?2\n"
                + " \n"
                + "\n"
                + "E)x=??6");
        perguntas.add("O montante de determinado capital em um fundo de investimento, ap?s o tempo t em anos, ? dado pela f?rmula M(t)=C?1,5^t\n"
                + "Nessas condi??es, o tempo necess?rio para que um capital de R$ 800 investido gere um montante de R$ 4050 ? de:\n(Dica: Substitua M(t) e C pelos valores corretos)"
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
        perguntas.add("A quantidade de bact?rias de uma cultura, depois de t horas, ? dada pela express?o Q(t)=Q0*2^t\n"
                + ", em que Q0  ? a quantidade inicial de bact?rias. Nessas condi??es, se inicialmente havia 1500 bact?rias, ap?s quantas horas haver? 12.000 bact?rias?\n(Dica: Substitua Q(t) e Q0 pelos valores corretos)"
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
        perguntas.add("Durante um experimento, obteve-se a f?rmula para a popula??o de bact?rias:\n"
                + "\n"
                + " q(t)=20*2^(3t)\n"
                + "\n"
                + "Em que t ? o tempo, em hora, e q(t) ? a popula??o, em milhares de bact?rias. \nSe a popula??o de bact?rias era incialmente de 20 mil, ent?o ap?s quanto tempo ela ser? dobrada? \n(Dica: Substitua q(t) pela quantidade de bacteria desejada e resolva a quest?o)\n"
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
                + " e y=(0,2)^(3t ? 2) \n"
                + "O valor de y que faz com que x seja igual a y ?: (Dica: Transformte os n?meros em decimais ou fra??es e iguale uma equa??o a outra) \n"
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
        perguntas.add(" Dada a equa??o exponencial 3^(x^2?x) = 9.\n"
                + "A soma das solu??es dessa equa??o ?: (Dica: Iguale a equa??o a 0 e some o resultado de x1 + x2) \n"
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
        perguntas.add("Utilizamos a potencia??o para modelar fen?menos que crescem muito r?pido, por exemplo, o crescimento das infec??es de um v?rus durante uma pandemia. \nSuponha que o n?mero de infectados se inicia em 2 e que cada pessoa infectada infecte outras 3, ou seja, na primeira semana, haver? 6 infectadas, na segunda, 18, e assim sucessivamente. \nSupondo que o ritmo de infec??o continue o mesmo por, pelo menos, um ano, ent?o, ap?s quantas semanas, haver? 4374 pessoas infectadas?\n(Dica: Modele a pergunta para uma equa??o)"
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
        tamanhoArray = perguntas.size();
        numeroDaPergunta = pergunta.nextInt(tamanhoArray);
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

        System.out.println(perguntas.get(numeroDaPergunta)); // Mostra a pergunta pro usu?rio
        System.out.println("Digite a resposta correta! ");
        resposta = entrada.next(); // Armazena a resposta
        resposta = resposta.toLowerCase();
        respostaArray = resposta.charAt(0);
        if (respostas.get(numeroDaPergunta) == respostaArray) { // Verifica se a resposta corresponde a resposta do array de perguntas
            System.out.println("Resposta correta, voc? desviou do golpe do inimigo");
        } else {
            System.out.println("Resposta Incorreta, a resposta correta ? " + respostas.get(numeroDaPergunta) + " voc? tomou o dano inteiro do inimigo"); // Mostra a resposta certa
            vidaPersonagem -= danoInimigo; // Tira vida do personagem
            System.out.format("Sua vida atual ?  %s%n%d %s%n\n", green, vidaPersonagem, fim);
        }
    }

    /**
     * Classe que roda se o bot randomizar a op??o Golpear no combate dificil,
     * ela gera uma pergunta para o usu?rio que deve responde-la corretamente
     * para que ele desvie do ataque, se errar a pergunta, ele toma o dano
     * inteiro. int a = numero random
     */
    static void ataqueMiniBossDificil(int danoInimigo) {
        Random pergunta = new Random(); // Inicializa??o do Random
        String resposta;
        int numeroDaPergunta;
        char respostaArray;
        int tamanhoArray;
        ArrayList<String> perguntas = new ArrayList<>(); // Array de perguntas do inimigo usado no combateDificil()
        perguntas.add("As ra?zes da equa??o 2x2 + bx + c = 0 s?o 3 e ? 4. Nesse caso, o valor de b - c ?\n(Dica: Substitua a equa??o com os dois valores e fa?a um sistema de subtra??o entre elas)"
                + "a) ?26.\n"
                + "b) ?22.\n"
                + "c) ?1.\n"
                + "d) 22.\n"
                + "e) 26.");
        perguntas.add("Uma fun??o quadr?tica f ? dada por f(x) = x2 + bx + c, com b e c reais. \nSe f(1) = ?1 e f(2) ? f(3) = 1, o menor valor que f(x) pode assumir, quando x varia no conjunto dos n?meros reais, ? igual a(Dica: Substitua os valores informados nas equa??es para descobrir o valor de C, depois disso, use a formula do vertice do y para descobrir o resultado)\n"
                + "\n"
                + "a) ?12.\n"
                + "b) ?6.\n"
                + "c) ?10.\n"
                + "d) ?5.\n"
                + "e) ?9..");
        perguntas.add("f(x) = x^2 - 2kx + 29, para x pertence aos numeros reais\n"
                + "Se f(x) ? 4, para todo n?mero real x, o valor m?nimo da fun??o f ? 4.\n"
                + "Assim, o valor positivo do par?metro k ?:\n(Dica: O n?mero 4 dado na fun??o ? o resultado do yx do vertice, substitua os valores da formula pelos valores da fun??o (-delta/4a))"
                + "\n"
                + "a) 5\n"
                + "b) 6\n"
                + "c) 10\n"
                + "d) 15");
        perguntas.add("A ?gua ? essencial para a vida e est? presente na constitui??o de todos os alimentos. Em regi?es com escassez de ?gua, ? comum a utiliza??o de cisternas para a capta??o e armazenamento da ?gua da chuva. Ao esvaziar um tanque contendo ?gua da chuva, a express?o\n"
                + "\n"
                + "V(t) = - 1 / 43200 * t^2 + 3\n(Dica: Iguale a equa??o a 0 e aplique os conceitos de equa??es para resolver, n?o esque?a de transformar o resultado depois)"
                + "\n"
                + "representa o volume (em m3) de ?gua presente no tanque no instante t (em minutos)\n"
                + "\n"
                + "Qual ? o tempo, em horas, necess?rio para que o tanque seja esvaziado?\n"
                + "\n"
                + "a) 360\n"
                + "b) 180\n"
                + "c) 120\n"
                + "d) 6\n"
                + "e) 3");
        perguntas.add("Quais s?o as ra?zes reais da equa??o x2 ? x = 6?\n(Dica: Resolva utilizando os principios da equa??o)"
                + "\n"
                + "a) Apenas 3\n"
                + "\n"
                + "b) 25 e 3\n"
                + "\n"
                + "c) 25 e ? 2\n"
                + "\n"
                + "d) 3 e ? 2\n"
                + "\n"
                + "e) Apenas ? 2");
        perguntas.add("Um terreno quadrado possui ?rea de 144 metros quadrados e apenas a sua frente ainda n?o est? murada. Quantos metros de muro ter?o que ser feitos para isolar completamente esse terreno?\n(Dica: N?o confunda ?rea com perimetro)"
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
        perguntas.add("A temperatura T de um forno (em graus cent?grados) ? reduzida por um sistema a partir do instante do desligamento (t = 0) e varia de acordo com a express?o (t em minutos):\n"
                + "\n"
                + "T(t) = ? t^2/4 + 400\n"
                + "\n"
                + "\n"
                + "Por motivos de seguran?a, a trava do forno s? ? liberada para abertura quando o forno atinge temperatura de 39 ?C. Qual o tempo m?nimo de espera, em minutos, ap?s desligar o forno, para que a porta possa ser aberta?\n(Dica: Substitua t(t) pelo valor correto e resolva a equa??o)"
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
        perguntas.add("Qual ? a medida de um ?ngulo interno de um pol?gono convexo que possui 230 diagonais?\n(Dica: formula para descobrir o numero de lados pelas diagonais (d = (n(n-3))/2) e formula para descobrir a soma dos angulos (S = (n-2) * 180), use-as sabiamente)"
                + "\n"
                + "a) 164,35?\n"
                + "\n"
                + "b) 23?\n"
                + "\n"
                + "c) 1849?\n"
                + "\n"
                + "d) 3780?\n"
                + "\n"
                + "e) 20?");
        perguntas.add("Sejam x1 e x2 as ra?zes da equa??o x^2 + 8x + 7. Qual ? o valor de x1*x2?\n (Dica: Resolve a equa??o do segundo grau e multiplique os x's encontrados)"
                + "\n"
                + "a) 7\n"
                + "\n"
                + "b) 17\n"
                + "\n"
                + "c) ? 7\n"
                + "\n"
                + "d) ? 14\n"
                + "\n"
                + "e) ? 8");
        perguntas.add("Qual ? a maior das ra?zes da equa??o do segundo grau ? x^2 ? 12x ? 35?\n(Dica: Use seus conhecimentos em equa??o de segundo grau e descubra qual dos dois x's ? o maior)"
                + "\n"
                + "a) 5\n"
                + "\n"
                + "b) 7\n"
                + "\n"
                + "c) 12\n"
                + "\n"
                + "d) ? 7\n"
                + "\n"
                + "e) ? 5");
        tamanhoArray = perguntas.size();
        numeroDaPergunta = pergunta.nextInt(tamanhoArray);
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

        System.out.println(perguntas.get(numeroDaPergunta)); // Mostra a pergunta pro usu?rio
        System.out.println("Digite a resposta correta! ");
        resposta = entrada.next(); // Armazena a resposta
        resposta = resposta.toLowerCase();
        respostaArray = resposta.charAt(0);
        if (respostas.get(numeroDaPergunta) == respostaArray) { // Verifica se a resposta corresponde a resposta do array de perguntas
            System.out.println("Resposta correta, voc? desviou do golpe do inimigo");
        } else {
            System.out.println("Resposta Incorreta, a resposta correta ? " + respostas.get(numeroDaPergunta) + " voc? tomou o dano inteiro do inimigo"); // Mostra a resposta certa
            vidaPersonagem -= danoInimigo; // Tira vida do personagem
            System.out.format("Sua vida atual ?  %s%n%d %s%n\n", green, vidaPersonagem, fim);
        }
    }
    // Fim das fun??es de ataque do inimigo

    // Inicio das fun??es de combate
    /**
     * Classe que gera o combate facil, ou seja, fica intercalando entre o turno
     * do oponente e o do personagem principal, sempre verificando se algum dos
     * dois morreu, ou seja, vida menor ou igual a 0.
     */
    static void combateFacil() { // Roda o loop do turno do combatePersonagemFacil() e combateInimigoFacil() at? que a vida de algum dos dois chegue a 0
        vidaCriatura = 50; // Reinicia a vida perdida do combate anterior
        vidaPersonagem = 50; // Reinicia a vida perdida do combate anterior
        System.out.println("    ______                         __    __               ______      __             \n"
                + "   / ____/_____      ______ ______/ /_  / /____  _____   / ____/___  / /__  ____ ___ \n"
                + "  / __/ / ___/ | /| / / __ `/ ___/ __ \\/ __/ _ \\/ ___/  / / __/ __ \\/ / _ \\/ __ `__ \\\n"
                + " / /___/ /   | |/ |/ / /_/ / /__/ / / / /_/  __/ /     / /_/ / /_/ / /  __/ / / / / /\n"
                + "/_____/_/    |__/|__/\\__,_/\\___/_/ /_/\\__/\\___/_/      \\____/\\____/_/\\___/_/ /_/ /_/ \n"
                + "                                                                                     ");
        System.out.println("                                        \n" +
"                 @@&&&/                 \n" +
"                 &###%&                 \n" +
"         @.@&(  #&&/#%&%. @@@           \n" +
"       @&%%&%%%&&&#(%#@%&%%&@@&         \n" +
"      %&%&(%@%%%#%&#%#%#%%%%%&&@&       \n" +
"   (   @@&@%@&%&(&&##((%(@(%@&@@.       \n" +
" .&@@&@%#%&@&&&&%&&((#&@#&%@%&#%%@&.   ,\n" +
" *&&@&&&#&&@*@@@@&&%%%&#&@&@@&&%&&%&%&@%\n" +
"  &&%&&&.     @&%&@&&&@&@@      %&&&&&#@\n" +
" &&@&@@&      ,&&&&&&&%#&&      @&&%@%& \n" +
" /&%%&%     ,& &%&&@&&&%&*&#      &&%&@,\n" +
" @&%&@       &%%@&&@@@&@%&&&,      &%&, \n" +
" @&&#&%*     &&%&&@@&@&&&@&@@     %(&%. \n" +
"   &%& &   %&&&&&&#&&&@%&@&&@@    %,@@# \n" +
"   #%%&   @@&@&&@@@@&@@&@@&%%&&    #@%/ \n" +
"          @&&&@&@@@@###@@&@#%&&@        \n" +
"         @&%&%&@&@     @@&&@@&&&&@      \n" +
"        &%@@%%&(         @#%&#&&&@      \n" +
"      , &&%@&%            #@#@&&%&      \n" +
"      %&%%%@&/              &%&&@&(     \n" +
"     @@%@@@&.              ,&@@&&@&#    \n" +
"    &@&&&@@                  &@&&&@%    \n" +
"    &&%&&@                    @&&@@     \n" +
"   &@@&#&                      @&&%     \n" +
"   @@@%#@                      @&%&&(  ");

        while ((vidaCriatura > 0 || vidaPersonagem > 0)) { // Roda infinitamente at? que um dos dois (inimigo ou jogador) tome um dano fatal ou seja, suas vidas chegarem a 0
            combatePersonagemFacil();
            combateInimigoFacil();
        }

        if (vidaPersonagem <= 0) { // Se o jogador morrer, aparece essa mensagem
            System.out.println("Voc? morreu pro golem, voc? n?o parece ser o escolhido");
        } else if (vidaCriatura <= 0) { // Se o inimigo morrer, aparece essa mensagem
            System.out.println("Boa, voc? derrotou o golem");
        }
    }

    /**
     * Classe que gera o combate m?dio, ou seja, fica intercalando entre o turno
     * do oponente e o do personagem principal, sempre verificando se algum dos
     * dois morreu, ou seja, vida menor ou igual a 0.
     */
    static void combateMedio() { // Roda o loop do turno do combatePersonagemMedio() e combateInimigoMedio() at? que a vida de algum dos dois chegue a 0
        vidaCriatura = 50; // Reinicia a vida perdida do combate anterior
        vidaPersonagem = 50; // Reinicia a vida perdida do combate anterior
        System.out.println("    __                    __                              _      _ __      \n"
                + "   / /   ____ _____  ____/ /    ____     ___  _________  (_)____(_) /_____ \n"
                + "  / /   / __ `/ __ \\/ __  /    / __ \\   / _ \\/ ___/ __ \\/ / ___/ / __/ __ \\\n"
                + " / /___/ /_/ / / / / /_/ /    / /_/ /  /  __(__  ) /_/ / / /  / / /_/ /_/ /\n"
                + "/_____/\\__,_/_/ /_/\\__,_( )   \\____/   \\___/____/ .___/_/_/  /_/\\__/\\____/ \n"
                + "                        |/                     /_/                         ");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&/&&&&&&,&@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&& %&%%%%%%%%#&&&&/&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@&&&&&&%%%##*####(##.((#(%#*.((%&&&%/#&@%@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@&&&%/%(%%/  (/,//*.. ,*//*. .. /## #%%&(&&&@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@&@@%%&& %%.##/,,, ,. .          ., .*/(((###%%#&&&@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@&&&&(/,#((/*.,                      .   /((##%% &&&@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@&&&#%%.#*/* .                             ,,,(.#%%.%&&&@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@&&#&%.#, ,*.                                 .*.(##%%%,&&@@@@@@@@@@@\n"
                + "@@@@@@@@@@@&(&&% #(/*.                                    .,***.%%&.&&%@@@@@@@@@\n"
                + "@@@@@@@@@@#&&&%%.(/.,                                       .*/( %#%&&&@@@@@@@@@\n"
                + "@@@@@@@@@@,&&%%,(* ,                                        ../( #%%&&&@@@@@@@@@\n"
                + "@@@@@@@@@@&&&,..(  .                                         ,./*/%%&#&@@@@@@@@@\n"
                + "@@@@@@@@@&&&,%%#(*.                                          .*./( %&&&&@@@@@@@@\n"
                + "@@@@@@@@@&&%&*%#(* .                                         ..*(#%%&&&@@@@@@@@@\n"
                + "@@@@@@@@@@&&#%%,#(*                                           / /#%%&&&@@@@@@@@@\n"
                + "@@@@@@@@@@&&&&%.#(/*                                        . /(,/%&&&&@@@@@@@@@\n"
                + "@@@@@@@@@@@@&&&(%.//*,.                                      ,(,.%&&&&@@@@@@@@@@\n"
                + "@@@@@@@@@@@@&&&%####( ,.                                  ,*(#.%%&&&&@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@&&&/%%%(*/*                               ,.,(.(./%&&&&@&@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@&&&&%%%(/(**  .                     .,*,/.,#*#%%&&&@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@&&&&&%%%###,   . ..           .,.   /,.(#*%%&&&&@@&@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@&&&&&%%%,#(#(,.(/////*,/*,,*((####%%.%&&&&&@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@&@@@@@&&&#%&%%% /%%########/##%%%%%,%&&&&&&@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&%.%%%%%%%%%&&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&&&&%&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        while ((vidaCriatura > 0 || vidaPersonagem > 0)) { // Roda infinitamente at? que um dos dois (inimigo ou jogador) tome um dano fatal ou seja, suas vidas chegarem a 0
            combatePersonagemMedio();
            if (vidaCriatura <= 0 || vidaPersonagem <= 0) {
                break;
            }
            combateInimigoMedio();
        }

        if (vidaPersonagem <= 0) { // Se o jogador morrer, aparece essa mensagem
            System.out.println("Voc? perdeu pro Land, voc? n?o provou seu valor");
        } else if (vidaCriatura <= 0) { // Se o inimigo morrer, aparece essa mensagem
            System.out.println("Boa, tu derrotou o Land, voc? provou seu valor!");
        }
    }

    /**
     * Classe que gera o combate dificil, ou seja, fica intercalando entre o
     * turno do oponente e o do personagem principal, sempre verificando se
     * algum dos dois morreu, ou seja, vida menor ou igual a 0.
     */
    static void combateDificil() { // Roda o loop do turno do combatePersonagemDificil() e combateInimigoDificl() at? que a vida de algum dos dois chegue a 0
        vidaCriatura = 50; // Reinicia a vida perdida do combate anterior
        vidaPersonagem = 50; // Reinicia a vida perdida do combate anterior
        System.out.println("    ______     _ __  _           _                   __         ______      __  _     __          __   \n"
                + "   / ____/__  (_) /_(_)_______  (_)________     ____/ /___ _   / ____/___  / /_(_)___/ /___ _____/ /__ \n"
                + "  / /_  / _ \\/ / __/ / ___/ _ \\/ / ___/ __ \\   / __  / __ `/  / __/ / __ \\/ __/ / __  / __ `/ __  / _ \\\n"
                + " / __/ /  __/ / /_/ / /__/  __/ / /  / /_/ /  / /_/ / /_/ /  / /___/ / / / /_/ / /_/ / /_/ / /_/ /  __/\n"
                + "/_/    \\___/_/\\__/_/\\___/\\___/_/_/   \\____/   \\__,_/\\__,_/  /_____/_/ /_/\\__/_/\\__,_/\\__,_/\\__,_/\\___/ \n"
                + "                                                                                                       ");
        System.out.println("                                        \n"
                + "                 @.%.%                  \n"
                + "                (@@@@&@&                \n"
                + "               ,@@@@@#*,                \n"
                + "               .(@@@@@.,                \n"
                + "             &@@@. @@(*/@&@             \n"
                + "           .@&@& *&&(*%%@&@&@           \n"
                + "  **,     #,.*#/@&&*#&&**/(**      *#*# \n"
                + "     (/#/%/@@@&..& #*****@@@@%&&&& (    \n"
                + "     .. @@@&@&@@@@% .#&&@ (@@@@&&& ,    \n"
                + "     *,&&&&@@, &&%%%##*%.   &@&&&@%     \n"
                + "     .&@&&@/  @&@&@%%* &&&    %&@@@*    \n"
                + "     @&@&&    &&&&@/,,/&&&        @/    \n"
                + "    *@&%     &&&&&&(/,/&&&@        ,    \n"
                + "   *%,       @@&@&%/(**&&&&         #(  \n"
                + "            #&&@&&.//&/&&&&@            \n"
                + "            &@@@@@ /,//&&&&&            \n"
                + "            &@@@@@.#.(*@&@@@            \n"
                + "           &@@@@@@.%*#%@&@@&.           \n"
                + "           @@@@@@@,(,*%@&&&&@           \n"
                + "           @@&@@@@/&*//&&&&@&           \n"
                + "           @&@@@@@@%/&&@&&&&&           \n"
                + "           @@@@@@@@ /.&@&&&&%           \n"
                + "           @@&@@@*//%&**,&&&&           \n"
                + "           /#@%///*%@@*/(,(/#           \n"
                + "               ,@&.#(%%@@(              ");
        while ((vidaCriatura > 0 || vidaPersonagem > 0)) { // Roda infinitamente at? que um dos dois (inimigo ou jogador) tome um dano fatal ou seja, suas vidas chegarem a 0
            combatePersonagemDificil();
            if (vidaCriatura <= 0 || vidaPersonagem <= 0) {
                break;
            }
            combateInimigoDificil();
        }

        if (vidaPersonagem <= 0) { // Se o jogador morrer, aparece essa mensagem
            System.out.println("Voc? morreu pro feiticeiro da Ordem Sombria ");
        } else if (vidaCriatura <= 0) { // Se o inimigo morrer, aparece essa mensagem
            System.out.println("Parab?ns, escolhido! Voc? derrotou o feiticeiro da Ordem Sombria");
        }
    }
    // Fim das fun??es de combate

    // Inicio das fun??es de cura
    /**
     * Classe que ocorre ap?s o usuario escolher Curar no seu turno, ela tem 3
     * po??es que acabam.
     */
    static void curarPersonagem() { //Curar o jogador

        if (healthPotion == 0 || healthPotion < 0) { // Verifica se ainda h? po??es para serem utilizadas
            System.out.println("Voce nao tem mais pocoes disponiveis");

        } else {
            vidaPersonagem += 24; // Cura o personagem em 24
            healthPotion -= 1; // Gasta uma po??o
            System.out.format("Sua vida atual e  %s%n%d%s%n\n", green, vidaPersonagem, fim); // Mostra a vida ap?s a cura
            System.out.format("Voce so tem mais %d pocoes\n", healthPotion); // Mostra a quantidade de po??es disponiveis ainda
        }
    }

    /**
     * Classe que roda ap?s o bot randomizar a op??o Curar no seu turno, ele tem
     * 3 po??es.
     */
    static void curarInimigo() { // Curar o inimigo
        if (healthPotionEnemy <= 0) { // Verifica se ainda h? po??es para serem utilizadas
            System.out.println("O inimigo n?o tem mais po??es");
        } else {
            vidaCriatura += 24; // Cura o inimigo em 24
            healthPotionEnemy -= 1; // Gasta uma po??o
            System.out.format("A vida atual do inimigo ?   %s%n%d%s%n\n", red, vidaCriatura, fim); // Mostra a vida ap?s a cura
            System.out.format("O inimigo so tem mais %d pocoes\n", healthPotionEnemy); // Mostra a quantidade de po??es disponiveis ainda
        }
    }
    // Fim das fun??es de cura
}