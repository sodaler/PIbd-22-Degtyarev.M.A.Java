import java.awt.Graphics;

public interface ITransport {
    void setPosition(int x, int y, int width, int height);

    void MoveTransport(Direction direction);

    void DrawTransport(Graphics g);
}
