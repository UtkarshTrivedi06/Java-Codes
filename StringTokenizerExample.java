import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String s1="Java, Python, C++, JavaScript";
        StringTokenizer st = new StringTokenizer(s1,",");
        while(st.hasMoreTokens()){
            System.err.println(st.nextToken());
        }
    }
}
