public class WoW {

        String Faction;
        String Race;
        // ændret "class" ( altså en class i wow) til speciality//
        String speciality;
        int level;
        String Name;

    public String getFaction() {
        return Faction;
    }

    public void setFaction(String faction) {
        Faction = faction;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
