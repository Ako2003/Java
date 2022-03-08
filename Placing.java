class Placing extends Board{
    private static int col;
    private static int i;
    private static int j;

    public Placing(int col, int i, int j) {
        super(col, i, j);
        this.col = col;
        this.i = i;
        this.j = j;
    }
    public void Place(int col, int i, int j){
        this.col = col;
        this.j = j;
        this.i = i;
        if(i==1 && j < col){
            System.out.println('Q');
        } 
    }

    public static void main(String[] args) {
        Placing queen = new Placing(col, i, j);
    }
}