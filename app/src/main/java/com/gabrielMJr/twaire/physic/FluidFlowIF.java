package com.gabrielMJr.twaire.physic;

public interface FluidFlowIF {
    public abstract String fFluidFlow(double volume, double time);
    public abstract String sFluidFlow(double area, double velocidade);
    public abstract String tFluidFlow(double raio, double velocidade, int resultOrStep);
    public abstract String time(double volume, double fluidFlow);
    public abstract String volume(double tempo, double fluidFlow);
    public abstract String fSpeed(double fFluidFlow, double area);
    public abstract String sSpeed(double fluidFlow, double raio, int resultOrStep);
    public abstract String area(double fluidFlow, double velocidade);
    public abstract String ray(double fluidFlow, double velocidade, int resultOrStep);
}
