public class Main {


    public static void main(String[] args) {

        AnimeCollection animeCollection = new AnimeCollection("Onkar"); // one anime collection with an Owner
        AnimeCollection animeCollection2 = new AnimeCollection("Vira"); // another anime collection with a different Owner

        Anime vinlandSaga = new Anime("Vinland Saga", 2, 24);  // anime object
        Anime demonSlayer = new Anime("Demon Slayer", 3,24);
        Anime vinlandSaga2 = new Anime("Vinland Saga", 2, 14); // anime object


        animeCollection.addAnime(vinlandSaga); // adding vinlandSaga to the collection
        animeCollection.addAnime(demonSlayer);
        animeCollection2.addAnime(vinlandSaga2); // adding vinlandSaga2 to the collection

        Anime anime, anime2, anime3;  // made for return of search() method

        anime = animeCollection.search("Vinland Saga", "Onkar");  // searching for anime with name Vinalnd Saga and owner Onkar
        anime2 = animeCollection2.search("Vinland Saga", "Vira"); // searching for anime with name Vinalnd Saga and owner Vira
        anime3 = animeCollection.search("Demon Slayer", "Onkar");
        System.out.println(anime.toString() + "\n" + anime2.toString() + "\n" + anime3.toString());  // printing the animes to string

    }

}
