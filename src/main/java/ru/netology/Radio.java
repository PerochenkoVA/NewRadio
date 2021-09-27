package ru.netology;

public class Radio {
    private int numberStation;
    private int maxNumberStation = 10;
    private int minNumberStation = 0;
    private int volume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public void nextNumberStation() {
        if (numberStation >= maxNumberStation) {
            setNumberStation(minNumberStation);
        } else {
            numberStation = numberStation + 1;
        }
    }


    public void prevNumberStation() {
        if (numberStation <= minNumberStation) {
            setNumberStation(maxNumberStation);
        } else {
            numberStation = numberStation - 1;
        }
    }


    public void setNumberStation(int numberStation) {

        if (numberStation < minNumberStation) {
            return;
        }
        if (numberStation > maxNumberStation) {
            return;
        }

        this.numberStation = numberStation;
    }

    public int getNumberStation() {

        return numberStation;
    }

    public void increaseVolume () {
        if (volume >= maxVolume) {
            setVolume(minVolume);
        } else {
            volume = volume + 1;
        }
    }


    public void decreaseVolume () {
        if (minVolume >= volume ) {
            setVolume(maxVolume);
        } else {
            volume=volume-1;
        }
    }

        public void setVolume(int volume) {
        if (volume < minVolume) {
            return;
        }
        if (volume > getMaxVolume()) {
            return;
        }
        this.volume = volume;
    }


    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public void setMaxNumberStation(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation;
    }

    public int getMinNumberStation() {
        return minNumberStation;
    }

    public void setMinNumberStation(int minNumberStation) {
        this.minNumberStation = minNumberStation;
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

}
