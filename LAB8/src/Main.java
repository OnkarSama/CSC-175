public class Main {

    public static void main(String[] args) {

        PersonalComputer highEnd = new PersonalComputer("Ryzen 9 7900X", "ASUS X670E PRO WIFI", "Corsair Vengeance RGB 32GB", "NVIDIA GeForce RTX 4090", "Seagate BarraCuda 2TB", "Samsung 990 PRO 1TB");

        PersonalComputer midEnd = new PersonalComputer("Ryzen 7 3700X", "MSI MAG B550 PRO WIFI", "Crucial Ballistic 16GB", "NVIDIA GeForce RTX 3060", "Seagate BarraCuda 2TB", "Crucial 500GB");

        highEnd.toString();

        midEnd.toString();


    }


}
