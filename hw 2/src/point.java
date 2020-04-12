
public class point {

    private int X;
    private int Y;
    private double C;

    public point(int X1,int Y1,double C1){
        C1= Math.pow(Math.pow(X1,2)+Math.pow(Y1,2),0.5);
        this.X=X1;
        this.Y=Y1;
        this.C=C1;
    }
    public double getC(){
         return C;
    }
    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }

    public void setC(double C){
        this.C=C;
    }
    public void setX(int X){
        this.X=X;
    }
    public void setY(int Y){
        this.Y=Y;
    }

}
