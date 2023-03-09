package com.gabrielMJr.twaire.physic.hydrodynamics.fluidflow;

final class FlowRate1
{
    private static FlowRate1 instance;

    private FlowRate1 ()
	{}

    protected String flowRate (double volume, double time)
    {
        return String.valueOf(volume / time);
    }

    protected String flowRate (double volume, String volumeUnit, double time, String timeUnit, String unitOfResult)
    {
        return null;
    }

    public static FlowRate1 getInstance ()
    {
        if (!(instance instanceof FlowRate1))
            instance = new FlowRate1();
        return instance;
    }
}
