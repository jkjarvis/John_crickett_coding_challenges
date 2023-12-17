import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonParser {

    private static void solution1(String input){
        String arrayElementPattern = "(?:\"[\\p{Alnum}\\p{Punct}]*\"|true|false|null|[0-9]+)";
        String arrayPattern = "\\[(?:"+arrayElementPattern+"(?:,\\s*\\n*"+arrayElementPattern+")*)?\\]";

        String keyValuePattern = "\"[\\p{Alnum}\\p{Punct}]+\":\\s(?:\"[\\p{Alnum}\\p{Punct}]+\"|true|false|null|[0-9]+|"+arrayPattern+")";
        String commaSeparatorPattern = "(?:,\\n*\\s*"+keyValuePattern+"\\n*)";
        String patternString = "\\{\\n*\\s*(?:"+keyValuePattern+commaSeparatorPattern+"*)?\\}";

        Pattern pattern = Pattern.compile(patternString, Pattern.DOTALL);

        Matcher matcher = pattern.matcher(input);

        if(!matcher.matches()){
            System.out.println("Invalid JSON");
            System.exit(1);
        }else{
            System.out.println("Valid JSON");
            System.exit(1);
        }
    }

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get(args[0]);

        String input = Files.readString(filePath).trim();

        solution1(input);

    }
}
