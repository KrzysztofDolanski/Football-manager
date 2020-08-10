package main.java.footballClub.peoples;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    String surnamePlayer;
    String namePlayer;
    int team;
    String birthDate;
    int weightPlayer;
    int growthPlayer;
    String positionOnField;
    boolean rightFooted;
    int training;
    int skillsIncrease;


}
