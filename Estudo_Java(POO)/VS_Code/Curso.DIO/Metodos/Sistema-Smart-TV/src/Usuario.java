public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

       // System.out.println("TV ligada? " + smartTv.ligado);
        
       // System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligado);

       // smartTv.aumentarVolume();
       // smartTv.aumentarVolume();
       // smartTv.aumentarVolume();
       // smartTv.diminuirVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(22);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligado);
    }
}
