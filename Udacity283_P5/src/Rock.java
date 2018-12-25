public class Rock extends Piece {

    private String name;

    public Rock()
    {
        super();

        this.name = "Rock";
    }

    @Override
    public boolean isValidMove(Position newPosition, Position bottomRight) {

        return super.isValidMove(newPosition, bottomRight) && (newPosition.col == this.position.col || newPosition.row == this.position.row);
    }
}
