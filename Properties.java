public class Properties {
    String delimiter;
    boolean header;

    public Properties(){
        this.delimiter = ",";
        this.header = false;
    }

    public Properties(String delimiter, boolean header){
        this.delimiter = delimiter;
        this.header = header;
    }

    public Properties(String delimiter){
        this(delimiter, false);
    }

    public Properties(boolean header){
        this(",", header);
    }

}
