package Builder;

/**
 * This is only a simple example, but you should use builder only in complex objects
 */
public class Swordit{
    private double damage;
    private double speed;
    private String name;

    public Swordit(double damage, double speed, String name) {
        this.damage = damage;
        this.speed = speed;
        this.name = name;
    }

    public static class Builder{
        private double damage;
        private double speed;
        private String name;

        public Builder(){}

        public Builder setDamage(double damage){
            this.damage=damage;
            return this;
        }

        public Builder setSpeed(double speed){
            this.speed=speed;
            return this;
        }

        public Builder setName(String name){
            this.name=name;
            return this;
        }

        public Swordit build(){
            return new Swordit(damage,speed,name);
        }

    }
}
