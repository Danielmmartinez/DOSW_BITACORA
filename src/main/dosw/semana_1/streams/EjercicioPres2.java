import java.util.List;

public class EjercicioPres2 {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "api", "functional", "code", "git");

        List<String> processedWords = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();


        long totalCount = processedWords.size();

        System.out.println("Palabras resultantes: " + processedWords);
        System.out.println("Cantidad total: " + totalCount);
    }
}