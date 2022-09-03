import java.util.Serializable;

public class SerializableSample implements Serializable{

    private String name;
    private String phoneNumber;

    public SerializableSample( String name, String phoneNumber ){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "SerializableSample{" +
        "name=' "+ name +'\''
        "PhoneNumber="+ phoneNumber +
        "}";
    }
}
