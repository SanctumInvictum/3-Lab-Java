package com.BVT2105;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location {
    /**
     * X coordinate of this location.
     **/
    public int xCoord;

    /**
     * Y coordinate of this location.
     **/
    public int yCoord;


    /**
     * Creates a new location with the specified integer coordinates.
     **/
    public Location(int x, int y) {
        xCoord = x;
        yCoord = y;
    }

    /**
     * Creates a new location with coordinates (0, 0).
     **/
    public Location() {
        this(0, 0);
    }

    // Реализуем метод equals, проверяющий совпадает ли наше местоположение с заданным
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Location temp_loc = (Location) obj;
        return xCoord == temp_loc.xCoord && yCoord == temp_loc.yCoord;
    }

    // Реализуем метод hashCode, который вернет нам уникальное значение хэшкода для каждой координаты
    public int hashCode() {
        int result = 53 * 19 + xCoord + yCoord; // использование простых чисел даст нам уникальный хэшкод
        return result;
    }
}