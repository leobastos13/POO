package aula12.Ex3;

public class Movie {
    private String name;
    private String score;
    private String rating;
    private String genre;
    private String runningTime;

    public Movie(String name, String score, String rating, String genre, String data) {
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runningTime = data;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }

    public String getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public String getRunningTime() {
        return runningTime;
    }

    @Override
    public String toString() {
        return String.format("Name: %s; Score: %2d; Rating: %s; Genre: %s; Running Time: %2d;\n", this.name, this.score, this.rating, this.genre, this.runningTime);
    }    
}
