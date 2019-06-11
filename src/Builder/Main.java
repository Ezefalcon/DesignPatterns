package Builder;

public class Main {
    public static void main(String[] args) {
        Swordit s = new Swordit.Builder()
                .setDamage(2)
                .setName("asd")
                .setSpeed(12)
                .build();
    }
}
