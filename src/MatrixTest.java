import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @org.junit.jupiter.api.Test
    void getWidth() {
    }


    @org.junit.jupiter.api.Test
    void getWidth_OK_5x5() {
        int width = 5;
        int height = 5;
        Matrix matrix = new Matrix(width, height);
        Assertions.assertEquals(width, matrix.getWidth());
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
    }

    @org.junit.jupiter.api.Test
    void getWidth_NEGATIVE() {
        int width = -1;
        int height = 5;
        Assertions.assertThrows(NegativeArraySizeException.class, () -> {
            new Matrix(width, height);
        });
    }

    @org.junit.jupiter.api.Test
    void fill() {
    }

    @org.junit.jupiter.api.Test
    void fill_test() {
        int width = 5;
        int height = 5;
        Matrix matrix = new Matrix(width, height);
        
    }

    @org.junit.jupiter.api.Test
    void count() {
    }

    @org.junit.jupiter.api.Test
    void found() {
    }

    @org.junit.jupiter.api.Test
    void _toString() {
    }
}