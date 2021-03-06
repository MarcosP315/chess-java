package boardgame;

/**
 *
 * @author mpbc3
 */
public class Position {
    private Integer row;
    private Integer column;

    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getColumn() {
        return column;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }
    
    public void setValue(int row, int column){
        this.row = row;
        this.column = column;
    }
    
    @Override
    public String toString(){
        return String.format("%d,%d", row, column);
    }
}
