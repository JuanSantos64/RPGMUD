package rpgdoscara;




public class Teste {
    public static void main(String[] args) {
        int a = 24; // Verifica se as po����es das criaturas e do personagem est��o corretos
        int b = 24; // Verifica se a vida das criaturas e do personagem est��o corretos
        testa_danoInimigo(a);
        testa_danoPersonagem(b);
    }
    public static void testa_danoInimigo(int a){
        if(Haftafell.danoInimigo() > a)
            System.out.println("Tem erro aqui");
        else 
            System.out.println("Ok, passou no teste ;-) ");
    }
    public static void testa_danoPersonagem(int a){
        if (Haftafell.danoPersonagem() > a){
            System.out.println("Tem erro aqui");
        }
        else{
            System.out.println("Ok, passou no teste ;-) ");
        }
    
        
        
    }
}
