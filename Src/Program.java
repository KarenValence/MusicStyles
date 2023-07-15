public class Program {
    public static void main(String[] args) {
        MusicStyle pop = new PopMusic();
        MusicStyle rock = new RockMusic();
        MusicStyle classic = new ClassicMusic();
        MusicStyle[] styles = new MusicStyle[3];
        styles[0] = pop;
        styles[1] = rock;
        styles [2] = classic;

        for(MusicStyle group : styles) {
            group.playMusic();
        }

    }
}
