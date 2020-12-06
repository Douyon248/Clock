/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author douyo
 */
public class Clock {
    
    private int hour;
    private int minute;
    private int second;
    
    public Clock() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Clock(Clock clock) {
        this.hour = clock.hour;
        this.minute = clock.minute;
        this.second = clock.second;
    }
  
    public void increaseHour() {

        hour++;
        if (hour == 24)
            hour = 0;
    }
    
    public void increaseMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            increaseHour();
        }
    }
    
  
    public void increaseSecond() {
        second++;
        if (second == 60) {
            second = 0;
            increaseMinute();
        }
    }
    
    public boolean equals(Clock clock) {
        return this.hour == clock.hour &&
                this.minute == clock.minute &&
                this.second == clock.second;
    }

    @Override
    public String toString() { 
        return String.format("%02d:%02d:%02d", hour, minute, second);   
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    
} 
       

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
