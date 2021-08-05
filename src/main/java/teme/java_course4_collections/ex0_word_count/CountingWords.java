package teme.java_course4_collections.ex0_word_count;

import java.util.*;

class CountingWords {

    static List<String> words(String text) {

        return Arrays.asList(text.split(" "));
    }

    static List<String> words2(String text) {

        String[] words= text.split( " ");
        List<String> cuvinte= new ArrayList<>();
        for(String word:words){
            cuvinte.add(word);

        }
        return cuvinte;
    }

    static int wordsCount(String text) {

        List<String> words = words(text);
        return words.size();
    }

    static Collection<String> sortedWords(String text) {

        List<String> words = words(text);
        Collections.sort(words);
        return words;
    }

    static Collection<String> distinctWords(String text) {
        return new LinkedHashSet<>(words(text));
    }

    static Collection<String> distinctSortedWords(String text) {
        return new TreeSet<>(words(text));
    }

    static Map<String, Long> wordsUsageCount(String text) {

        Map<String, Long> wordsCount = new LinkedHashMap<>();
        List<String> words = words(text);
        for(String word : words){
            if(wordsCount.containsKey(word)){
                long count = wordsCount.get(word);
                count ++;
                wordsCount.put(word, count);
            } else {
                wordsCount.put(word, 1L);
            }
        }
        return wordsCount;
    }

    static Map<String, Long> wordsUsageCountSortedByWord(String text) {
        return null; //TODO
    }

    //some manual tests
    public static void main(String[] args) {

        String text = "Once upon a time in a land far far away there lived a great king whose name was a great mystery";
        System.out.println("initial text: " + text);

        System.out.println("\nall words (initial order): " + words(text));
        System.out.println("word count: " + wordsCount(text));
        System.out.println("all words (sorted): " + sortedWords(text));
        System.out.println("distinct words (initial order): " + distinctWords(text));
        System.out.println("distinct words (sorted): " + distinctSortedWords(text));

        System.out.println("\nword counts (initial order): " + wordsUsageCount(text));
        System.out.println("word counts (sorted by word): " + wordsUsageCountSortedByWord(text));
    }
}
