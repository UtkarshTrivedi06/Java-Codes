import java.io.IOException;

public class IOExceptionCode {
    public static void main(String[] args) throws IOException {

        IOChild c = new IOChild();
        IOParent p = new IOParent();

        c.readFile();
        p.readFile();
    }
}

class IOParent {
    void readFile() throws IOException {
        System.out.println("Reading File in Parent");
    }
}

class IOChild extends IOParent {

    @Override
    void readFile() throws IOException {
        System.out.println("Reading File in Child");
    }
}