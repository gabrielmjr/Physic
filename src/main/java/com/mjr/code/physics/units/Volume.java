package com.mjr.code.physics.units;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

import static com.mjr.code.physics.Physic.ROUND_SCALE;
import static com.mjr.code.physics.units.Length.KILOMETER;
import static com.mjr.code.physics.units.Length.HECTOMETER;
import static com.mjr.code.physics.units.Length.DECAMETER;
import static com.mjr.code.physics.units.Length.METER;
import static com.mjr.code.physics.units.Length.DECIMETER;
import static com.mjr.code.physics.units.Length.CENTIMETER;
import static com.mjr.code.physics.units.Length.MILLIMETER;
import static com.mjr.code.physics.units.Length.LENGTH_SCALES;
import static com.mjr.code.physics.units.Length.KILOMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.HECTOMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.DECAMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.METER_SYMBOL;
import static com.mjr.code.physics.units.Length.DECIMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.CENTIMETER_SYMBOL;
import static com.mjr.code.physics.units.Length.MILLIMETER_SYMBOL;
import static java.math.RoundingMode.HALF_UP;

public class Volume extends Unit implements IVolume {
    @Deprecated
    private static Volume instance; 

	public static final int CUBE_KILOMETER = 14;
	public static final int CUBE_HECTOMETER = 15;
	public static final int CUBE_DECAMETER = 16;
	public static final int CUBE_METER = 17;
	public static final int CUBE_DECIMETER = 18;
	public static final int CUBE_CENTIMETER =19;
	public static final int CUBE_MILLIMETER = 20;

    private final int UNIT_SCALE = CUBE_KILOMETER;
    private final int MAX_UNIT_SCALE = CUBE_MILLIMETER - UNIT_SCALE;

    protected static final BigDecimal[] VOLUME_SCALES = new BigDecimal[]
	{
		LENGTH_SCALES[KILOMETER].pow(3),
		LENGTH_SCALES[HECTOMETER].pow(3),
		LENGTH_SCALES[DECAMETER].pow(3),
		LENGTH_SCALES[METER].pow(3),
		LENGTH_SCALES[DECIMETER].pow(3),
		LENGTH_SCALES[CENTIMETER].pow(3),
		LENGTH_SCALES[MILLIMETER].pow(3)
	};

	public static final String CUBE_KILOMETER_SYMBOL = KILOMETER_SYMBOL + "³";
	public static final String CUBE_HECTOMETER_SYMBOL = HECTOMETER_SYMBOL + "³";
	public static final String CUBE_DECAMETER_SYMBOL = DECAMETER_SYMBOL + "³";
	public static final String CUBE_METER_SYMBOL = METER_SYMBOL + "³";
	public static final String CUBE_DECIMETER_SYMBOL = DECIMETER_SYMBOL + "³";
	public static final String CUBE_CENTIMETER_SYMBOL = CENTIMETER_SYMBOL + "³";
	public static final String CUBE_MILLIMETER_SYMBOL = MILLIMETER_SYMBOL + "³";

    protected final String[] VOLUME_SYMBOLS = new String[] {
        CUBE_KILOMETER_SYMBOL,
        CUBE_HECTOMETER_SYMBOL,
        CUBE_DECAMETER_SYMBOL,
        CUBE_METER_SYMBOL,
        CUBE_DECIMETER_SYMBOL,
        CUBE_CENTIMETER_SYMBOL,
        CUBE_MILLIMETER_SYMBOL
    };

    public Volume() {
        super();
        setMaxUnit(MAX_UNIT_SCALE);
        unit = CUBE_METER - UNIT_SCALE;
    }

    public Volume(double value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        unit = CUBE_METER - UNIT_SCALE;
    }

    public Volume(String value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        unit = CUBE_METER - UNIT_SCALE;
    }

    public Volume(long value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        unit = CUBE_METER - UNIT_SCALE;
    }

    public Volume(BigDecimal value) {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        unit = CUBE_METER - UNIT_SCALE;
    }

    public Volume(double value, int unit) throws IllegalArgumentException {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        if (isUnitInRange()) {
            this.unit = unit - UNIT_SCALE;
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Volume(String value, int unit) throws IllegalArgumentException {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        if (isUnitInRange()) {
            this.unit = unit - UNIT_SCALE;
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Volume(long value, int unit) throws IllegalArgumentException {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        if (isUnitInRange()) {
            this.unit = unit - UNIT_SCALE;
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit.");
    }

    public Volume(BigDecimal value, int unit) throws IllegalArgumentException {
        super(value);
        setMaxUnit(MAX_UNIT_SCALE);
        if (isUnitInRange()) {
            this.unit = unit - 14;
            return;
        }
        throw new IllegalArgumentException("The unit " + unit + " is not valid as " + getClass().getName() + " unit");
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubeKilometer(double value, int unit) {
		return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_KILOMETER - 14], ROUND_SCALE, HALF_UP), CUBE_KILOMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubeHectometer(double value, int unit) {
		return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_HECTOMETER - 14], ROUND_SCALE, HALF_UP), CUBE_HECTOMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubeDecameter(double value, int unit) {
		return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_DECAMETER - 14], ROUND_SCALE, HALF_UP), CUBE_DECAMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubeMeter(double value, int unit) {
		return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_METER - 14], ROUND_SCALE, HALF_UP), CUBE_METER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubeDecimeter(double value, int unit) {
		return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_DECIMETER - 14], ROUND_SCALE, HALF_UP), CUBE_DECIMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubeCentimeter(double value, int unit) {
		return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_CENTIMETER - 14], ROUND_SCALE, HALF_UP), CUBE_CENTIMETER);
    }

	@Contract("_, _ -> new")
    public static @NotNull Volume toCubeMillimeter(double value, int unit) {
		return new Volume(BigDecimal.valueOf(value).multiply(VOLUME_SCALES[unit - 14]).divide(VOLUME_SCALES[CUBE_MILLIMETER - 14], ROUND_SCALE, HALF_UP), CUBE_MILLIMETER);
    }
    
    @Override
    public Volume toCubeKilometer() {
        return null;
    }

    @Override
    public Volume toCubeHectometer() {
        return null;
    }

    @Override
    public Volume toCubeDecameter() {
        return null;
    }

    @Override
    public Volume toCubeMeter() {
        return null;
    }

    @Override
    public Volume toCubeDecimeter() {
        return null;
    }

    @Override
    public Volume toCubeCentimeter() {
        return null;
    }

    @Override
    public Volume toCubeMillimeter() {
        return null;
    }

    @Override
    public String toString() {
        return value + VOLUME_SYMBOLS[unit];
    }

    @Override
    public boolean equals(Object object) {
        try {
            Volume volume = (Volume) object;
            return volume.toString().equals(toString());
        } catch (ClassCastException e) {
            return false;
        }
    }

    @Override
    public boolean isInInternationalSystem() {
        return unit == (CUBE_METER - UNIT_SCALE);
    }

    @Override
    public String getUnitSymbol() {
        return VOLUME_SYMBOLS[unit];
    }

    @Deprecated
    protected static Volume getInstance() {
		if (!(instance instanceof Volume))
			instance = new Volume();
		return instance;
    }
}
