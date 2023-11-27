
# ⚠ Atenção ⚠
Esse projeto foi feito para ser utilizado na IDE Apache NetBeans IDE 19, para melhor experiencia do projeto, utilize-o nessa IDE
# ⚜ Haftafell - RPG
Sejam bem vindos ao nosso RPG!

![Logo](https://media.discordapp.net/attachments/1148430124161699931/1157145409437847672/a-teenager-in-an-all-white-place-looking-at-magical-mathematical-numbers-in-the-air-with-the-color--556842189.png?ex=6556d324&is=65445e24&hm=096d241eacd6ae0d96f8d25f8d08da3d75733bcae16c570174189c51ef2f7d87&=&width=453&height=453)

Nesse jogo, você acompanhará uma narrativa em um mundo imersivo atravez de batalhas emocionantes, com foco no seu aprendizado em matematica, nosso principal objetivo, é tornar o ensinamento da matematica em algum divertido e compreensivo.

## 📖 Um pouco mais sobre a historia do jogo

Nosso jogo se passa na incrivel cidade de Haftafell, onde a matematica evoluiu a tal ponto de poder controlar tudo ao redor do mundo, embarque nessa aventura para poder desvendar os misterios desse mundo e enfrentar a Ordem Oculta, organização que quer roubar todo o poder da matematica dada pelos deuses antigos toda para si.

[Acompanhe a historia completa aqui!](https://github.com/JuanSantos64/Grupo-6---Turma-A/tree/HistóriaRPG)

Agradecimento aos excepcionais profissionais [Caike Jesus](https://www.linkedin.com/in/caike-jesus-5a37921b2) e [Henrique Leal](https://www.linkedin.com/in/henrique-leal-28733b1b5/) pelo desenvolvimento dessa excelente e envolvente historia.

## 🕹 Um pouco mais sobre a mecanica do jogo
Nosso jogo, conta com diversas mecanicas unicas para desenvolver imersão no usuário, nossos excelentes programadores colocaram muito de seus sentimentos no código, tornando o jogo algo unico e incrivel.

- ### ⚙ Mecanicas
#### 💭 Pular Dialogos
Uma das mecanicas desenvolvida foi o pulo de diálogo, para que a historia não aparecesse toda de uma vez para o usuário, a solução foi implementar o seguindo código

```bash
 static void enter(Scanner entrada) {
        entrada.nextLine(); // Aguarda até que o usuário pressione Enter
    }
```

#### ⚔ Combate por turnos

Durante o desenvolvimento do jogo, estivemos pensando a todo momento, como seria o combate do jogo, a solução foi implementar um sistema de turnos entre os combates, esse sistema dará ao usuario 2 opções de ação: Atacar e Curar.

Ao atacar, o usuario terá que responder uma pergunta corretamente para que possa aplicar o dano, no turno da maquina ela também tera essas opções, porém será escolhido de maneira aleátoria.

```bash
        while ((vidaCriatura > 0 || vidaPersonagem > 0)) { // Roda infinitamente até que um dos dois (inimigo ou jogador) tome um dano fatal ou seja, suas vidas chegarem a 0
            combatePersonagemFacil();
            combateInimigoFacil();
        }

        if (vidaPersonagem <= 0) { // Se o jogador morrer, aparece essa mensagem
            System.out.println("Você morreu pro golem, você não parece ser o escolhido");
        } else if (vidaCriatura <= 0) { // Se o inimigo morrer, aparece essa mensagem
            System.out.println("Boa, você derrotou o golem");
        }
```

#### 🖥 Imagem ASCII

Decidimos adicionar imagens ASCII para maior imersão no código com uma previsualização dos inimigos, onde aparece o visual do inimigo e o seu nome logo acima

```bash
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
```
#### 📍 Checkpoint

Durante o decorrer da historia, terão momentos de combate, e caso o usuario perca, utilizamos métodos para que ele não volte ao começo do jogo, mas sim para o começo do capitulo.


Agradecimento aos excepcionais profissionais [Cleiton Fiuza](https://www.linkedin.com/in/cleiton-fiuza-souza-42a553193/), [Juan Santos](https://www.linkedin.com/in/juan-santos-28a001288/) e [Maicon Silva](https://www.linkedin.com/in/maicon-silva-888090212/) pelo desenvolvimento desse excelente e envolvente código.
### 👨‍💻 Conheça os integrantes
Caike Jesus

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/caike-jesus-5a37921b2)

Cleiton Fiuza

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/cleiton-fiuza-souza-42a553193/)

Henrique Leal

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/henrique-leal-28733b1b5/)

Juan Santos

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/juan-santos-28a001288/)

Maicon Silva

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/maicon-silva-888090212/)
## 👨‍🎓 Aprendizados

O desenvolvimento desse RPG foi excepcionalmente emocionante e incrivel, nossa equipe pode adquirir experiencias indispensáveis, como:

- Trabalho em equipe
- Gestão de projeto
- Desenvolvimento de enredo
- Desenvolvimento em Java



![Logo](https://media.discordapp.net/attachments/1148430124161699931/1157144010280935444/RPG_CAPA.png?ex=654d9756&is=653b2256&hm=836fa56b27e4b8c47063ba03111fb30be360db831e180f21ef3f7a1b5c956528&=&width=453&height=453)

#### Obrigado pela leitura ❤ 
