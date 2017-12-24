package center.kit.app.classwork.lesson13;
import java.lang.Object;

public class Transport {
    private int numberOfWheels;
    private String baseType;

    public Transport(int numberOfWheels, String baseType){
        this.baseType = baseType;
        this.numberOfWheels = numberOfWheels;
    }

    public boolean equals(Transport transport){
        boolean isEquals = false;
        if (transport != null) {
            if (baseType.equals(transport.baseType) && numberOfWheels == transport.numberOfWheels) {
                return true;
            }
        }
        return isEquals;
    }
    public int hashCode(){
        int result = 99;
        result = 31 * result + numberOfWheels;
        result = 31 * result + baseType.hashCode();
        return result;
    }
}
