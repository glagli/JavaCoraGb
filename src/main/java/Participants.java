public class Participants {
    private String name;
    private String surname;
    private int age;
    private int dexterity;
    private int strength;
    private boolean PassedDistance = false;

    public Participants(String name, String surname, int age, int dexterity, int strength) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dexterity = dexterity;
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public boolean isPassedDistance() {
        return PassedDistance;
    }

    public void setPassedDistance(boolean passedDistance) {
        PassedDistance = passedDistance;
    }

    public int getStrength() {
        return strength;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return  name +' '+ surname +
                ", Возраст: " + age +
                ", Ловкость: " + dexterity +
                ", Сила: " + strength;
    }
}
