public interface Managable {

    boolean add(Object o);
    boolean add(int index, Object o);
    boolean delete (Object o);
    Object get(int index);
    boolean contain(Object o);
    boolean equals (Object[] str);
    boolean clear();
    int size();
}
