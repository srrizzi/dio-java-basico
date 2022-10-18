public class Usuario {
    public static void main(String[] args) throws Exception {
        int i = 0;
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.online);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.on();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.online);

        smartTv.off();
        System.out.println("Novo Status -> TV ligada ? " + smartTv.online);

        smartTv.moreVolume();
        System.out.println("Novo Status -> Volume: " + smartTv.volume);

        smartTv.lessVolume();
        System.out.println("Novo Status -> Volume: " + smartTv.volume);

        // laço para diminuir o canal
        smartTv.currentChannel(22);
        while(i <= 10)
        {
            smartTv.lessChannel();
            System.out.println("Novo Status -> Canal: " + smartTv.channel);
            i++;
        }
        
        i = 0;
        smartTv.currentChannel(35);
        //laço para aumentar o canal
        while(i <= 8)
        {
            smartTv.moreChannel();
            System.out.println("Novo Status -> Canal: " + smartTv.channel);
            i++;
        }

        //laço para diminuir o volumen
        for(i = 0; i <= 20; i++)
        {
            smartTv.lessVolume();
            System.out.println("Novo Status -> Volume: " + smartTv.volume);
        }

    }
}
