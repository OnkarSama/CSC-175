public class AnimeMovie extends Anime {

    private int movieLength; // in minutes

    /**
     *
     * @param animeName name of the anime movie
     * @param movieLength length of the anime movie in minutes
     * @param numOfSeasons number of seasons in the anime movie (always 1 for a movie)
     * @param numOfEpisodesPerSeason number of episodes per season (always 1 for a movie)
     */
    public AnimeMovie(String animeName, int movieLength, int numOfSeasons, int numOfEpisodesPerSeason) {
        super(animeName, numOfSeasons, numOfEpisodesPerSeason);
        this.movieLength = movieLength;
    }

    /**
     *
     * @return length of the anime movie in minutes
     */
    public int getMovieLength() {
        return movieLength;
    }

    /**
     *
     * @return the Anime Movie to string
     */
    @Override
    public String toString() {
        return getAnimeName() + " is an anime movie, which is " + getMovieLength() + " minutes long.";
    }
}
