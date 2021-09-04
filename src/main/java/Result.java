import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.Map;

public class Result {
    private StarWarsCharacter[][] results;
    Map<String, Object> details;

    public Result(StarWarsCharacter[][] results) {
        this.results = results;
    }
    public Result() {
    }
    public StarWarsCharacter[][] getResults() {
        return results;
    }

    public void setResults(StarWarsCharacter[][] results) {
        this.results = results;
    }

}
