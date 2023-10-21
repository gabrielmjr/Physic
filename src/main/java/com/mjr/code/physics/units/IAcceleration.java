package com.mjr.code.physics.units;

public interface IAcceleration {
    Acceleration toKilometerPerSquaredSecond();
	Acceleration toHectometerPerSquaredSecond();
	Acceleration toDecameterPerSquaredSecond();
	Acceleration toMeterPerSquaredSecond();
	Acceleration toDecimeterPerSquaredSecond();
	Acceleration toCentimeterPerSquaredSecond();
	Acceleration toMillimeterPerSquaredSecond();

	Acceleration toKilometerPerSquaredMinute();
	Acceleration toHectometerPerSquaredMinute();
	Acceleration toDecameterPerSquaredMinute();
	Acceleration toMeterPerSquaredMinute();
	Acceleration toDecimeterPerSquaredMinute();
	Acceleration toCentimeterPerSquaredMinute();
	Acceleration toMillimeterPerSquaredMinute();

	Acceleration toKilometerPerSquaredHour();
	Acceleration toHectometerPerSquaredHour();
	Acceleration toDecameterPerSquaredHour();
	Acceleration toMeterPerSquaredHour();
	Acceleration toDecimeterPerSquaredHour();
	Acceleration toCentimeterPerSquaredHour();
	Acceleration toMillimeterPerSquaredHour();
}