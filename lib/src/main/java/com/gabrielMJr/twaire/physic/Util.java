package com.gabrielMJr.twaire.physic;

class Util {
    public static String normalizeIfNegative(Double value) {
		return (value >= 0) ? value.toString() : "(- " + value + ")";
	}
}
