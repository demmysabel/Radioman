package ru.netology.domain;

public class Radio {
    public int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume >0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }

    public void setCurrentVolume(int currentVolume) {

        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int currentStation;

    public void increaseStation() {
        if (currentStation < 10) {
            currentStation = currentStation + 1;
            if (currentStation >= 9) {
                this.currentStation = 0;
            }
        }
    }

    public void decreaseStation() {
        if (currentStation < 10) {
            currentStation = currentStation - 1;
            if (currentStation <= -1) {
                this.currentStation = 9;
            }
        }
    }

    public void setCurrentStation(int currentStation) {

        if (currentStation >= 10) {
            currentStation = 0;
        }

        if (currentStation <= -1) {
            currentStation = 9;
        }

        if (currentStation > 0) {
            this.currentStation = currentStation;
        }

        this.currentStation = currentStation;

    }

    public int getCurrentStation() {
        return currentStation;
    }

}
