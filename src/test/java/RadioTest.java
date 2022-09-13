import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNextRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(2);
        cond.nextRadioStation();

        int expected = 3;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationAsZero() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(9);
        cond.nextRadioStation();

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextRadioStationIfOverLimit() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(10);
        cond.nextRadioStation();

        int expected = 0;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStation() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(2);
        cond.prevRadioStation();

        int expected = 1;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevRadioStationAsNine() {
        Radio cond = new Radio();

        cond.setCurrentRadioStation(0);
        cond.prevRadioStation();

        int expected = 9;
        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseCurrentVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);
        cond.increaseVolume();

        int expected = 1;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeIfTen() {
        Radio cond = new Radio();

        cond.setCurrentVolume(10);
        cond.increaseVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseCurrentVolumeIfOverTen() {
        Radio cond = new Radio();

        cond.setCurrentVolume(11);
        cond.increaseVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinimizeCurrentVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(5);
        cond.minimizeVolume();

        int expected = 4;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotMinimizeCurrentVolume() {
        Radio cond = new Radio();

        cond.setCurrentVolume(0);
        cond.minimizeVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}


