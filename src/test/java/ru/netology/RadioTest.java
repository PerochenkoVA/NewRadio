package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class RadioTest {
    Radio radio = new Radio();

    @Test
    void increaseVolumeMoreMax() {
        radio.setVolume(90);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void increaseVolume() {
        radio.setVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getVolume());
    }
    @Test
    void nextNumberStationMin(){
        radio.setNumberStation(11);
        radio.nextNumberStation();
        assertEquals(1,radio.getNumberStation());
    }
    @Test
    void prevNumberStationMax(){
        radio.setNumberStation(0);
        radio.prevNumberStation();
        assertEquals(10,radio.getNumberStation());
    }

    @Test
    void increaseVolumeMax() {
        radio.setVolume(100);
        radio.setVolume(101);

        assertEquals(100, radio.getVolume());
    }
    @Test
    void increaseVolumeMin(){
        radio.setVolume(100);
        radio.increaseVolume();
        assertEquals(0,radio.getVolume());
    }



    @Test
    void decreaseVolumeMoreMax() {
        radio.setVolume(106);
        radio.decreaseVolume();
        assertEquals(100, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setVolume(55);
        radio.decreaseVolume();
        assertEquals(54, radio.getVolume());
    }

    @Test
    void decreaseVolumeMax() {
        radio.setVolume(100);

        assertEquals(100, radio.getVolume());
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void decreaseVolumeMin() {
        radio.setVolume(0);

        assertEquals(0, radio.getVolume());
        assertEquals(0, radio.getMinVolume());
    }


    @Test
    void setVolumeMoreMax() {
        radio.setVolume(1002);
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getVolume());
    }

    @Test
    void setMaxVolume() {
        radio.setMaxVolume(100);
        assertEquals(100, radio.getMaxVolume());
    }

    @Test
    void setMinVolume() {
        radio.setMinVolume(0);
        assertEquals(0, radio.getMinVolume());
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
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void numberStationMax() {
        radio.setNumberStation(10);
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
     void prevNumberStationLowMin() {
        radio.setNumberStation(-5);

        assertEquals(0, radio.getNumberStation());
        assertEquals(0, radio.getMinNumberStation());
    }


    @Test
    void nextNumberStationLowMin() {
        radio.setNumberStation(-20);
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
        assertEquals(0, radio.getMinNumberStation());
    }

    @Test
    void setMaxNumberStation() {
        radio.setMaxNumberStation(10);
        assertEquals(10, radio.getMaxNumberStation());
    }

    @Test
    void nextNumberStation (){
        radio.setNumberStation(3);
        radio.nextNumberStation();
        assertEquals(4,radio.getNumberStation());
    }
    @Test
    void prevNumberStation (){
        radio.setNumberStation(6);
        radio.prevNumberStation();
        assertEquals(5,radio.getNumberStation());
    }

}