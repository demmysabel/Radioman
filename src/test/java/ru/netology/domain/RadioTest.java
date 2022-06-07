package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldRadioStationTurnOn1() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);


        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationTurnOn10() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);


        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationTurnOn9() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);


        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationTurnOnLowerThan0() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);


        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);

    }

    @Test
    public void shouldRadioStationTurnOn0() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);


        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.increaseStation();

        int expected = 5;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(4);
        radio.decreaseStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.decreaseStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnNewStation10() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(10);

        int expected = 10;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseNewStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(-1);

        int expected = 19;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseNewStation() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(100);

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnNextNewStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(11);
        radio.increaseStation();

        int expected = 12;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnOnNextNewStation() {
        Radio radio = new Radio(100);
        radio.setCurrentStation(99);
        radio.increaseStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnOnPreviousNewStation() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(30);
        radio.decreaseStation();

        int expected = 29;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnOnPreviousNewStation() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(0);
        radio.decreaseStation();

        int expected = 19;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNewVolumeTurnOn30() {
        Radio radio = new Radio();

        radio.setCurrentVolume(30);


        int expected = 30;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNewVolumeTurnOn100() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);


        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnVolumeMoreThan100() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioVolumeTurnOn0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRadioVolumeTurnOnLower0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);


        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(45);
        radio.decreaseVolume();

        int expected = 44;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}
