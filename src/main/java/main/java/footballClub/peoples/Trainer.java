package main.java.footballClub.peoples;

import javax.persistence.*;

@Entity
@Table (name="trener")
public class Trainer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String surmaneTrainer;
    String nameTrainer;
    int team;
    String certyficates;

    public Trainer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurmaneTrainer() {
        return surmaneTrainer;
    }

    public void setSurmaneTrainer(String surmaneTrainer) {
        this.surmaneTrainer = surmaneTrainer;
    }

    public String getNameTrainer() {
        return nameTrainer;
    }

    public void setNameTrainer(String nameTrainer) {
        this.nameTrainer = nameTrainer;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public String getCertyficates() {
        return certyficates;
    }

    public void setCertyficates(String certyficates) {
        this.certyficates = certyficates;
    }
}
