package model;

public class BasicsAttribute {


    private String name; //姓名

    private Integer blood; //血量

    private Integer aggressivity; //攻击力

    private Integer defense; //防御力

    private Integer speed; //速度

    public BasicsAttribute() {

    }

    public BasicsAttribute(String name, Integer blood, Integer aggressivity, Integer defense, Integer speed) {
        this.name = name;
        this.blood = blood;
        this.aggressivity = aggressivity;
        this.defense = defense;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(Integer aggressivity) {
        this.aggressivity = aggressivity;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer blood) {
        this.blood = blood;
    }
}
