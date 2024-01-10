import java.util.*;

public class Dictionary {
    Map<Character, Set<String>> map;
    Dictionary(){
        map = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, new LinkedHashSet<>());
        }
    }
    public void insert(String word){
        if (word.isEmpty() || !Character.isLetter(word.charAt(0))) {
            System.out.println("Invalid input. Word must start with a character.");
            return;
        }
        Character c = word.toLowerCase().charAt(0);
        Set<String> wordsSet = map.get(c);
        wordsSet.add(word);
    }

    public void printMap() {
        for (Map.Entry<Character, Set<String>> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Words: " + entry.getValue());
        }
    }

    public void printSet(Character c){
        if (!Character.isLetter(c)) {
            System.out.println("Invalid input. Word must start with a character.");
            return;
        }
        System.out.println(map.get(c));;
    }

    public List<String> search(String substring) {

        List<String> result = new ArrayList<>();
        for (Map.Entry<Character, Set<String>> entry : map.entrySet()) {
            for (String word : entry.getValue()) {
                if (word.toLowerCase().contains(substring.toLowerCase())) {
                    result.add(word);
                }
            }
        }
        if(result.isEmpty()){
            System.out.println("there is no string contains this substring !");
        }
            return result;
    }

    public void remove(String substring) {
        for (Map.Entry<Character, Set<String>> entry : map.entrySet()) {
            entry.getValue().removeIf(word -> word.toLowerCase().contains(substring.toLowerCase()));
        }
    }


    public void insertAll(List<String> words){
        for(String word : words){
            if (word.isEmpty() || !Character.isLetter(word.charAt(0))) {
                System.out.println("Invalid input. Word must start with a character.");
                return;
            }
        }

        for( String word : words){
            Character c = word.toLowerCase().charAt(0);
            Set<String> wordsSet = map.get(c);
            wordsSet.add(word);
        }
    }


}
