public class AnimeCollection {

    private String ownerOfAnimeCollection;
    private Anime[] animeCollection;
    private int numOfCollections;


    /**
     * Constructor for the collection of Anime
     * @param ownerOfAnimeCollection the name of the person that started the collection
     */

    public AnimeCollection(String ownerOfAnimeCollection){
        this.ownerOfAnimeCollection = ownerOfAnimeCollection;
        this.animeCollection = new Anime[100];
        this.numOfCollections = 0;
    }

    /**
     * Adds one anime to the collection of Anime
     * @param anime of data type of Anime of holding the anime name, number of seasons, and number of episodes
     */
    public void addAnime(Anime anime){
        this.animeCollection[numOfCollections] = anime;
        numOfCollections++;
    }

    /**
     * This searches for the anime based on the name of the owner and the name of the Anime
     * @param animeName
     * @return the anime based on the name of the anime and ownerOfAnimeCollection
     */
    public Anime search(String animeName, String ownerOfAnimeCollection) {
        for(int i = 0; i < numOfCollections; i++) {
            if(animeCollection[i].getAnimeName().equals(animeName)){
                return animeCollection[i];
            }
        }
        return null;
    }

}
