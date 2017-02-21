package miscellaneous.courses.edx.java.advance.week1;

/**
 * Created by duc on 2/21/17.
 */
public interface ImList<E> {

    public ImList<E> cons(E e);
    public E first();
    public ImList<E> rest();
    public boolean isEmpty();
    public int size();

    public static <E> ImList<E> empty(){
        return new Empty<>();
    }
}
