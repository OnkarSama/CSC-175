public class Anime {

    private String animeName;
    private int numOfSeasons;
    private int numOfEpisodesPerSeason;

    /**
     *
     * @param animeName name of the anime
     * @param numOfSeasons number of seasons in the anime
     * @param numOfEpisodesPerSeason number of Episodes per season
     */
    public Anime(String animeName, int numOfSeasons, int numOfEpisodesPerSeason) {
        this.animeName = animeName;
        this.numOfSeasons = numOfSeasons;
        this.numOfEpisodesPerSeason = numOfEpisodesPerSeason;
    }

    /**
     *
     * @return number of seasons set by constructor
     */
    public int getNumOfSeasons() {
        return numOfSeasons;
    }

    /**
     *
     * @return number of episodes set by constructor
     */
    public int getNumOfEpisodesPerSeason() {
        return numOfEpisodesPerSeason;
    }

    /**
     *
     * @return anime name set by constructor
     */
    public String getAnimeName() {
        return animeName;
    }

    /**
     *
     * @return the Anime to string
     */
    public String toString() {
        return getAnimeName() + " has " + getNumOfSeasons() + " seasons and each season has " + getNumOfEpisodesPerSeason() + " episodes.";
    }


}
