import java.util.Scanner;

public class TestSubjectClassMangaka {

    /**
     * The testsubject loves Manga and Anime,
     * a total weeb, and will add "Desu to any input"
     */

    public static void main(){
        Scanner scanner = new Scanner(System.in);


    }

    public String interact(String statement){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Thats right, ");
        stringBuilder.append(statement + "-desu");
        return stringBuilder.toString();
    }

}
