public class Piece {

    public Position position;

    public boolean isValidMove(Position newPosition, Position bottomRight)
    {
        return (newPosition.row >= 0 && newPosition.row < bottomRight.row) && (newPosition.col >=0 && newPosition.col < bottomRight.col);
    }
}
