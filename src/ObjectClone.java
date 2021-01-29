import java.util.Objects;

public  class ObjectClone  implements Cloneable {

    private String name; // 1) create  table and makes it  private

@Override// 2) override  method
protected Object clone() throws CloneNotSupportedException{// 3) address to  object   and  use
    return super.clone();                //CloneNotSupportedException to prevent  "CloneNotSupportedException"
}// then return  the original


}