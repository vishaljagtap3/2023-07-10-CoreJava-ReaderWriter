import java.io.*;

public class Util {

    public static void fileReadWriteDemo() {
        String filePath = "/home/vishal/java/new-demos/text_file.txt";

        try {
            FileWriter fileWriter = new FileWriter(new File(filePath));
            fileWriter.write("BitCode Tech".toCharArray());
            fileWriter.write("\nPune, India");
            fileWriter.close();

            FileReader fileReader = new FileReader(filePath);
            char [] data = new char[1024 * 1];
            int count;
            while( (count = fileReader.read(data)) != -1) {
                System.out.println(new String(data, 0, count));
            }
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ioStreamReaderWriterDemo() {
        String filePath = "/home/vishal/java/new-demos/biodata.txt";
        try {
            FileOutputStream fout = new FileOutputStream(filePath);
            OutputStreamWriter writer = new OutputStreamWriter(fout);
            writer.write("BitCode does java and android");
            writer.close();

            InputStreamReader reader = new InputStreamReader(
                    new FileInputStream(filePath)
            );
            char [] data = new char[200];
            int count;
            while((count = reader.read(data)) != -1) {
                System.out.println(new String(data, 0, count));
            }
            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
