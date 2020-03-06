import java.util.ArrayList;


public class House {

    ArrayList<String> list = new ArrayList<String>();

    public House() {
        
        list.add("malt that lay in the house that Jack built.");
        list.add("This is the house that Jack built.");
        list.add("This is the malt that lay in the house that Jack built.");
        list.add("rat/ate");
        list.add("cat/killed");
        list.add("dog/worried");
        list.add("cow with the crumpled horn/tossed");
        list.add("maiden all forlorn/milked");
        list.add("man all tattered and torn/kissed");
        list.add("priest all shaven and shorn/married");
        list.add("rooster that crowed in the morn/woke");
        list.add("farmer sowing his corn/kept");
        list.add("horse and the hound and the horn/belonged to");

    }

    public String verse(int verseNumber) {


        if (verseNumber == 1) return list.get(1);
        
        if (verseNumber == 2) return list.get(2);

        StringBuilder builder = new StringBuilder();

        builder.append("This is the ");

        for (int i = verseNumber; i > 2; i--) {
            String currLine = list.get(i);
            String[] tokens = currLine.split("/");
            
            builder.append(String.format("%s that %s the ", tokens[0], tokens[1]));
        }

        builder.append(list.get(0));
        
        return builder.toString();
    }

    public String verses(int startVerse, int endVerse) {

        StringBuilder builder = new StringBuilder();
        
        for (int i = startVerse; i <= endVerse; i++) {
            builder.append(verse(i));
            if (i != endVerse) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }

    public String sing() {
        
        StringBuilder builder = new StringBuilder();
        int finalVerseIndex = list.size()-1;
        
        for (int i = 1; i <= finalVerseIndex; i++) {
            builder.append(verse(i));
            if (i != finalVerseIndex) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }    
}