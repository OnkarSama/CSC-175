import java.util.Random;

public class MadLibs {

    public static void main(String[] args) {

        String[] subjects = {"My dog Ace", "My grandma", "A bozo", "A clown", "My girlfriend"};
        String[] verbs = {"ate", "farted", "danced with", "wrote a letter to", "jumped over"};
        String[] predicates = {"a hippopotamus", "a tree", "a book", "a banana peel", "the curb"};

        String subject = chooseWord(subjects);
        String verb = chooseWord(verbs);
        String predicate = chooseWord(predicates);

        String sillySentence = subject + " " + verb + " " + predicate + ".";
        System.out.println(sillySentence);
    }

    /**
     * Returns a randomly chosen word from an array of Strings.
     *
     * @param words the array of Strings from which to choose a word
     * @return words[index] a randomly chosen word from the array of Strings.
     * Pre-conditions: the array 'words' is not null and has at least one element.
     * Post-conditions: the array 'words' is unchanged. The returned value is a randomly chosen String from 'words'.
     */
    public static String chooseWord(String[] words) {
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }
}
