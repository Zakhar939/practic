package by.class5;

public interface Electropripiri {
    void work();

    void pilesosit();

    public interface Electropribori {
        void work();

        default void start() {
            System.out.println("Электроприборы");
        }
    }
}
