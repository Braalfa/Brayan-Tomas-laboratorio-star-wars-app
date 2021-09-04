public class StarWarsCharacter {
    public StarWarsCharacter() {
    }

    private String name;
    private String height;
    private String birth_year;

    public StarWarsCharacter(String name, String height, String birth_year) {
        this.name = name;
        this.height = height;
        this.birth_year = birth_year;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }


}
