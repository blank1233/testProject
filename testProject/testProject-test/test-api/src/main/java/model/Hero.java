package model;

public class Hero extends BasicsAttribute {



    private Skill skill;

    public Hero() {
        super();
    }

    public Hero(String name, Integer blood, Integer aggressivity, Integer defense, Integer speed, Skill skill) {
        super(name, blood, aggressivity, defense, speed);
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
