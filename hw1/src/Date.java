
public class Date {
    int m;
    int d;
    int y;

    public Date(int m1,int d1,int y1){
        this.m=m1;
        this.d=d1;
        this.y=y1;
    }

    public int getM(){
        return m;
    }
    public void setM(int m){
        if(m>0 && m<13){
            this.m=m;
        }else{
            m=0;
        }
    }
    public int getD(){
        return d;
    }
    public void setD(int d){
        if(d>0 && d<32){
            this.d=d;
        }else{
            d=0;
        }
    }
    public int getY(){
        return y;
    }
    public  void setY(int y){
        this.y=y;
    }

    public void displayDate () {
        System.out.printf ("%d/%d/%d\n", getM(), getD(), getY());
    }
}
