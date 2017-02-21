package miscellaneous.courses.edx.java.advance.week1;

/**
 * Created by duc on 2/21/17.
 */
public class Cons<E> implements ImList<E> {

    private E first;
    private ImList<E> rest;
    private int size;

    public Cons(E e, ImList<E> rest){
        first = e;
        this.rest = rest;
    }

    @Override
    public ImList<E> cons(E e) {
        return new Cons(e, this);
    }

    @Override
    public E first() {
        return first;
    }

    @Override
    public ImList<E> rest() {
        return rest;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int size() {
        if(size == 0) size = 1 + rest.size();
        return size;
    }
}
