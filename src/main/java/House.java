import java.util.HashMap;


public class House {

    HashMap<Integer,String> map = new HashMap<Integer,String>();

    public House() {
        map.put(0, "malt that lay in the house that Jack built.");
        map.put(1, "This is the house that Jack built.");
        map.put(2, "This is the malt that lay in the house that Jack built.");
        map.put(3, "rat/ate");
        map.put(4, "cat/killed");
        map.put(5, "dog/worried");
        map.put(6, "cow with the crumpled horn/tossed");
        map.put(7, "maiden all forlorn/milked");
        map.put(8, "man all tattered and torn/kissed");
        map.put(9, "priest all shaven and shorn/married");
        map.put(10, "rooster that crowed in the morn/woke");
        map.put(11, "farmer sowing his corn/kept");
        map.put(12, "horse and the hound and the horn/belonged to");

    }

    public String verse(int verseNumber) {


        if (verseNumber == 1) return map.get(1);
        
        if (verseNumber == 2) return map.get(2);

        StringBuilder builder = new StringBuilder();

        builder.append("This is the ");

        for (int i = verseNumber; i > 2; i--) {
            String currLine = map.get(i);
            String[] tokens = currLine.split("/");
            
            builder.append(String.format("%s that %s the ", tokens[0], tokens[1]));
        }

        builder.append(map.get(0));
        
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
        int finalVerseIndex = map.size()-1;
        
        for (int i = 1; i <= finalVerseIndex; i++) {
            builder.append(verse(i));
            if (i != finalVerseIndex) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }    
}