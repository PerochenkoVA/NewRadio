package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {
    Radio radio = new Radio();

    @Test
    void increaseVolumeMoreMax() {
        radio.increaseVolume(101);
        radio.setVolume(101);

        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void increaseVolume() {
        radio.increaseVolume(5);
        radio.setMaxVolume(100);
        radio.setVolume(5);

        assertEquals(5, radio.getVolume());
    }

    @Test
    void increaseVolumeMax() {
        radio.increaseVolume(105);
        radio.setVolume(100);
        radio.setVolume(105);

        assertEquals(105, radio.getVolume());
    }

    @Test
    void increaseVolumeMin() {
        radio.increaseVolume(0);
        radio.setVolume(0);
        assertEquals(0, radio.getVolume());
    }

    @Test
    void increaseVolumeMinElse() {
        radio.increaseVolume(101);
        radio.setVolume(101);
        assertEquals(101, radio.getVolume());
    }

    @Test
    void increaseVolumeIf() {
        radio.increaseVolume(105);
        radio.setMaxVolume(100);
        radio.setVolume(105);
        assertEquals(105,radio.getVolume());
    }

    @Test
    void decreaseVolumeMoreMax() {
        radio.decreaseVolume(106);
        radio.setMinVolume(0);
        radio.setVolume(106);
        assertEquals(106, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        radio.decreaseVolume(55);
        radio.setMinVolume(0);
        radio.setVolume(55);

        assertEquals(55, radio.getVolume());
    }

    @Test
    void decreaseVolumeMax() {
        radio.decreaseVolume(100);
        radio.setMinVolume(0);
        radio.setMaxVolume(100);
        radio.setVolume(100);

        assertEquals(100, radio.getVolume());
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void decreaseVolumeMin() {
        radio.decreaseVolume(0);
        radio.setMinVolume(0);
        radio.setVolume(0);

        assertEquals(0, radio.getVolume());
        assertEquals(0, radio.getMinVolume());
    }


    @Test
    void megaSetVolumeMoreMax() {
        radio.megaSetVolume(102);
        radio.setVolume(98);
        assertEquals(100, radio.getMaxVolume());
        assertEquals(98, radio.getVolume());
    }

    @Test
    void megaSetMaxVolume() {
        radio.megaSetVolume(0);
        radio.setVolume(108);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void megaSetVolumeMinreturn() {
        radio.megaSetVolume(-1);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void megaSetMinVolume() {
        radio.megaSetVolume(0);
        radio.setVolume(-1);
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    void megaSetVolumeVegative() {
        radio.megaSetVolume(0);
        radio.setVolume(-1);
        assertEquals(-1, radio.getVolume());
    }

    @Test
    void nextNumberStationlowMin() {
        radio.setNumberStation(-5);
        radio.nextNumberStation();
        assertEquals(1, radio.getNumberStation());
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void nextNumberStationMoreMax() {
        radio.setNumberStation(50);
        radio.nextNumberStation();
        assertEquals(1, radio.getNumberStation());
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    void nextNumberStationMax() {
        radio.setNumberStation(10);
        radio.nextNumberStation();
        assertEquals(0, radio.getNumberStation());
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    void numberStationMin() {
        radio.setNumberStation(0);
        radio.setMinNumberStation(0);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void numberStationMax() {
        radio.setNumberStation(10);
        radio.setMaxNumberStation(10);
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    void prevNumberStationLowMin() {
        radio.setNumberStation(-5);
        radio.setMinNumberStation(0);

        assertEquals(0, radio.getNumberStation());
        assertEquals(0, radio.getMinNumberStation());
    }


    @Test
    void nextNumberStationLowMin() {
        radio.setNumberStation(-20);
        radio.setMinNumberStation(0);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void setNumberStation() {
        radio.setNumberStation(5);
        radio.setNumberStation(15);
        assertEquals(5, radio.getNumberStation());
    }

    @Test
    void setMinNumberStation() {
        radio.setMinNumberStation(0);
        radio.setMinNumberStation(0);
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void setMaxNumberStation() {
        radio.setMaxNumberStation(10);
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    void nextNumberStation() {
        radio.setNumberStation(3);
        radio.nextNumberStation();
        assertEquals(4, radio.getNumberStation());
    }

    @Test
    void prevNumberStation() {
        radio.setNumberStation(6);
        radio.prevNumberStation();
        assertEquals(5, radio.getNumberStation());
    }

    @Test
    void nextNumberStationMin() {
        radio.setNumberStation(11);
        radio.nextNumberStation();
        assertEquals(1, radio.getNumberStation());
    }

    @Test
    void prevNumberStationMax() {
        radio.setNumberStation(0);
        radio.prevNumberStation();
        assertEquals(10, radio.getNumberStation());
    }
}

