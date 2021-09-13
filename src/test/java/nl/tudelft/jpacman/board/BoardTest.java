package nl.tudelft.jpacman.board;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BoardTest {
    int MAX_WIDTH = 1;
    int MAX_HEIGHT = 1;

    @Test
    void TestWidth() {
        BasicSquare[][] grid = {{mock(BasicSquare.class)}};
        Board board = new Board(grid);
        assertThat(board.getWidth()).isEqualTo(MAX_WIDTH);
    }

    @Test
    void TestHeight() {
        BasicSquare[][] grid = {{mock(BasicSquare.class)}};
        Board board = new Board(grid);
        assertThat(board.getHeight()).isEqualTo(MAX_HEIGHT);
    }

    @Test
    void TestSquareAt() {
        BasicSquare[][] grid = new BasicSquare[1][1];
        Board board = new Board(grid);
        assertThat(board.squareAt(0, 0)).isNull();
    }
}
