import java.io.*;

public class FilePartReader {
    File txt = new File("/Users/gergo/codecool/github/oop/filepartreader-testing-with-junit-Gergo1212/src/main/txt/analyze.txt");
    String line = null;
    public FilePartReader() {
    }

    public void setup(String filepath, Integer fromLine, Integer toLine){
        if(toLine < fromLine || fromLine < 1)
            throw new IllegalArgumentException("toLine must be greater than fromLine!");
    }

    public void read() throws IOException {
        FileReader txtReader = new FileReader(txt);
        BufferedReader bf = new BufferedReader(txtReader);
        while((line=bf.readLine() )!= null){
            System.out.println(line);

        }
        //return "a";
    }

    public String readLines(){
        //read()
        return "b";
    }
}

