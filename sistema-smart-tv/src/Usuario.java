public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("NOVO STATUS ---> TV está ligada? " + smartTv.ligada);

        System.out.println("Canal: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal: " + smartTv.canal);
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.descerCanal();
        System.out.println("Canal: " + smartTv.canal);

    }
}
