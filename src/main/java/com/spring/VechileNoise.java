package com.spring;

public class VechileNoise {
    public VechileNoise(){}

    private Vechicle vechicle;
    public VechileNoise(Vechicle vechicle) {
        this.vechicle = vechicle;
    }
        public void run(){
            vechicle.start();
        }

}
