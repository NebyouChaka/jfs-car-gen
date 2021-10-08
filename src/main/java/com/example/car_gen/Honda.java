package com.example.car_gen;

public class Honda extends Car{
    public Object acceleratedSpeed;
    private boolean TurboCharged;

    public Honda (String color, int year, int maxSpeed,boolean TurboCharged){
        super(color,year, maxSpeed);
        this.TurboCharged = TurboCharged;
    }

    public static void acceleratedSpeed(Honda civic) {
    }

    public boolean isTurboCharged() {
        return TurboCharged;
    }

    public void setTurboCharged(boolean turboCharged) {
        TurboCharged = turboCharged;
    }
}



