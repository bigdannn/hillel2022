package HW12;

public class Pair {

    private String value;
    private String key;

    Pair(String key, String value){
        this.key  = key;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key + ":" + value ;
    }
}
