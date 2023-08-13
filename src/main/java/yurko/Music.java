package yurko;

public interface Music {
    String getSong();

    default void init() {
        System.out.println(this.getClass() + " was initialized.");
    }
    default void destroy() {
        System.out.println(this.getClass() + " was destroyed.");
    }
}
