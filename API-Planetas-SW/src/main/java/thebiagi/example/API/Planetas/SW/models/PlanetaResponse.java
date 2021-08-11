package thebiagi.example.API.Planetas.SW.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect
public class PlanetaResponse {
    private Integer count;
    private String next;
    private String previous;
    private List<PlanetaSW> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<PlanetaSW> getResults() {
        return results;
    }

    public void setResults(List<PlanetaSW> results) {
        this.results = results;
    }
}
