package by.bsuir.yuli.task1;

public class CountResult {
    private double x;
    private boolean isDegrees;
    private double y;
    public CountResult(double x, double y, boolean isDegrees){
        this.x = x;
        this.y = y;
        this.isDegrees = isDegrees;
    }
    public CountResult(){
        this.x = 0;
        this.y = 0;
        isDegrees = true;
    }
    private void сonvertToDegrees(){
        x *= 180/ Math.PI;
        y *= 180/ Math.PI;
    }
    public double сalculateTask (){
        if(!isDegrees)
            сonvertToDegrees();
        return (1+ Math.sin(x+y) * Math.sin(x+y))/(2+ Math.abs(x-(x*2)/(1+x*x*y*y)))+x;
    }
}
