public class Punto
{
private double x;
private double y;
private String label;

public Punto(double x, double y, String label){
    this.x=x;
    this.y=y;
    this.label=label;
}
public double getX(){return this.x;}
public double gety(){return this.y;}
public String getLabel(){return this.label;}

public void setX(double x){this.x=x;}
public void sety(double y){this.y=y;}
public void setlabel(String label){this.label=label;}

@Override
public String toString(){return "punto "+this.label+"("+this.x+","+this.y+")"+"\n";}


}