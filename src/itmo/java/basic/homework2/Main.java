package itmo.java.basic.homework2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(10000000L, 200000000L));
        System.out.println(calculator.sum(1.0, 2.0));

        System.out.println(calculator.subtract(5, 2));
        System.out.println(calculator.subtract(50000000000L, 200000000L));
        System.out.println(calculator.subtract(5.5, 2.2));

        System.out.println(calculator.multiply(3, 4));
        System.out.println(calculator.multiply(30000L, 4000L));
        System.out.println(calculator.multiply(3.3, 4.4));

        System.out.println(calculator.divide(10, 2));
        System.out.println(calculator.divide(100000000L, 200000L));
        System.out.println(calculator.divide(10.5, 2.5));

        MusicTrack track1 = new MusicTrack();
        System.out.println(track1);

        track1.setTitle("Shape of You");
        track1.setArtist("Ed Sheeran");
        track1.setDuration(233);
        track1.setGenre("Pop");

        System.out.println(track1.getTitle());
        System.out.println(track1.getArtist());
        System.out.println(track1.getDuration());
        System.out.println(track1.getGenre());

        MusicTrack track2 = new MusicTrack("Yesterday", "The Beatles", 125, "Rock");
        System.out.println(track2);
    }
}
