import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableSampleMain{
    public static void main(String[] args) {
    SerializableSampleMain toWrite = new SerializableSampleMain();
    String fullPath = "/Users/joowonsuh/Documents/workspace/boot camp/Serializable/information"

    SerializableSample sample = new SerialDTO("Joowon Suh", "123-456-7889");
    toWrite.writeObject(fullPath, sample );
    }

    public void writeObject(String path, SerializableSample sample ){
        FileOutputStream fs = null;
        ObjectOutputStream os = null;
        try {
            fs = new FileOutputStream(path);
            os = new ObjectOutputStream(fs);
            os.writeObject(sample);
            System.out.println("Write Success");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (fs != null) {
                try {
                    fs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    }
}
