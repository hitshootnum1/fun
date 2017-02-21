package miscellaneous.courses.edx.java.advance.week1;

/**
 * Created by duc on 2/21/17.
 */
public class Empty<E> implements ImList<E> {

    public Empty(){

    }

    @Override
    public ImList<E> cons(E e) {
        return new Cons<E>(e, this);
    }

    @Override
    public E first() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ImList<E> rest() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
