public class App {
    public static void main(String[] args) throws Exception {
        float[] teste = {10.5f , 20.0f , 30.5f , 40.0f};

        System.out.println("Media: "+ model.Utilidade.media(teste));
        System.out.println("Soma: "+ model.Utilidade.soma(teste));
        System.out.println("Menor: "+ model.Utilidade.menor(teste));
        System.out.println("Maior: "+ model.Utilidade.maior(teste));
        System.out.println("Maior entre 7 e 12: "+ model.Utilidade.max( 7, 12));
        System.out.println("Desvio Padrão: "+model.Utilidade.desviopadrao(teste));
    }
}
