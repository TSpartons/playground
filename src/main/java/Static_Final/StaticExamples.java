package Static_Final;

public class StaticExamples {

    public static String canYouSeeMe = "You can only see me at the class/object";
    public String iAmAClassVar = "You can only see me when instantiated";

    public static void main(String[] args) {
        StaticExamples staticexamples = new StaticExamples();
        System.out.println(staticexamples.iAmAClassVar);
        System.out.println(staticexamples);
    }
}
