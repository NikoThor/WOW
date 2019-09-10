public class Main {
    public static void main(String[] args) {
        WoW character1 = new WoW();

        WoW character2 = new WoW();

        character1.setFaction("Alliance");
        character1.setName("Nealth");
        character1.setRace("Human");
        character1.setLevel(32);
        character1.setSpeciality("Rogue");



        character2.setFaction("Alliance");
        character2.setName("Pheonix");
        character2.setRace("human");
        character2.setLevel(14);
        character2.setSpeciality("mage");


        System.out.println(character1.getName() + " " + character1.getRace() + " " + character1.getFaction() + " " + character1.getLevel() + " " + character1.getSpeciality() );

        System.out.println(character2.getName() + " " + character2.getRace() + " " + character2.getFaction() + " " + character2.getLevel() + " " + character2.getSpeciality() );

    }
}
