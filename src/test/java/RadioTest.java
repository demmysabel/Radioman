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
    public void shouldRadioVolumeTurnOn10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);


        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioVolumeTurnOn1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);


        int expected = 1;
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
    public void shouldRadioVolumeTurnOnLower0() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioVolumeTurnOnMoreThan10() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(4);
        service.increaseVolume();

        int expected = 5;

        assertEquals(expected, service.getCurrentVolume());
    }

    @Test
    void shouldNotIncreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(10);
        service.increaseVolume();

        int expected = 10;

        assertEquals(expected, service.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(4);
        service.decreaseVolume();

        int expected = 3;

        assertEquals(expected, service.getCurrentVolume());
    }

    @Test
    void shouldNotDecreaseVolume() {
        Radio service = new Radio();

        service.setCurrentVolume(0);
        service.decreaseVolume();

        int expected = 0;

        assertEquals(expected, service.getCurrentVolume());
    }

}

