package oonbardingmodulesrevisit.collectionslearn.comparator;

public class PlayerClass implements Comparable<PlayerClass> {
    private String name;
    private Integer score;

    @Override
    public String toString() {
        return "PlayerClass{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public PlayerClass(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(PlayerClass o1) {
        return this.getName().compareTo(o1.getName());
    }
}
