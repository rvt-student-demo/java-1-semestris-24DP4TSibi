public class box {
    private final double width;
    private final double height;
    private final double length;

    public box(double width, double height, double length){
        this.width=width;
        this.height=height;
        this.length= length;
    }
    public box(double side){
        this.width=side;
        this.height=side;
        this.length= side;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double getLength(){
        return length;
    }
    public double volume(){
        return width*height+length;
    }
    public double area(){
        return 2*(width*height+width*length*+height*length);
    }
}
}
