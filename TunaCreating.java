public class TunaCreating {
    private int hour;
    private int minute;
    private int second;

    // Constructors
    public TunaCreating(){
        this(0, 0, 0);
    }
    public TunaCreating(int h){
        this(h, 0, 0);
    }
    public TunaCreating(int h, int m){
        this(h, m, 0);
    }
    public TunaCreating(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    // Setters
    public void SetTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
        hour = ((h >= 0 && h < 24) ? h : 0);
    }
    public void setMinute(int m){
        minute = ((m >= 0 && m < 60) ? m : 0);
    }
    public void setSecond(int s){
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    // Getters
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    // Method to return time in military format
    public String toMilitary(){
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
}
