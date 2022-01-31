package HW9;

import java.util.Collection;

public interface CustomCollection {

    boolean add(String str);
    boolean addAll(String[] strArr);
    boolean addAll(Collection strColl);
    boolean delete (int index);
    boolean delete (String str);
}
