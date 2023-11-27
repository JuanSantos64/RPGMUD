package rpgdoscara;




public class Teste {
    public static void main(String[] args) {
        int a = 3; // Verifica se as poções das criaturas e do personagem estão corretos
        int b = 50; // Verifica se a vida das criaturas e do personagem estão corretos
        testa_pocao(a);
        testa_vida(b);
    }
    public static void testa_vida(int a){
        if(Haftafell.vidaPersonagem!=a)
            System.out.println("Tem erro aqui");
        else 
            System.out.println("Ok, passou no teste ;-) ");
        if(Haftafell.vidaCriatura!=a)
            System.out.println("Tem erro aqui");
        else
            System.out.println("Ok, passou no teste ;-) ");
    }
    public static void testa_pocao(int a){
        if (Haftafell.healthPotion != a){
            System.out.println("Tem erro aqui");
        }
        else{
            System.out.println("Ok, passou no teste ;-) ");
        }
        if (Haftafell.healthPotionEnemy != a){
            System.out.println("Tem erro aqui");
        }
        else{
            System.out.println("Ok, passou no teste ;-) ");
        }
        
    }
}
