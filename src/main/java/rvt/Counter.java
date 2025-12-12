public class Counter {
    private int counter;
    public Counter(int startvalue){
        this.counter= startvalue;
    }
    public Counter(){
        this(0);
    }

    public int value(){
        return this.counter;
    }
    public void increase(){
        this.counter++;
    }
    public void decrease(){
        this.counter--;
    }
}
