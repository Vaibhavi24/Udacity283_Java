public class Bishop extends Piece{

    @Override
    public boolean isValidMove(Position newPosition, Position bottomRight) {

        return super.isValidMove(newPosition, bottomRight) && Math.abs(newPosition.col - this.position.col) == Math.abs(newPosition.row - this.position.row);
    }



}
