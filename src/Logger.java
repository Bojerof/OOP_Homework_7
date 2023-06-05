import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Logger implements ILog, ISave{
    private String fileName;
    public Logger(String fileName){this.fileName = fileName;}
    @Override
    public void log(String text) {
        LocalDateTime time = LocalDateTime.now();
        save(text + " " + time);
        System.out.println(text + " " + time);
    }
    @Override
    public void save(String text){
        try(FileWriter fileWriter = new FileWriter(fileName, true);) {
            fileWriter.write(text);
            fileWriter.write("\n");
            fileWriter.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
