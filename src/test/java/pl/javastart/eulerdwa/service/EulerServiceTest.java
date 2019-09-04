package pl.javastart.eulerdwa.service;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import pl.javastart.eulerdwa.service.EulerService;

public class EulerServiceTest {


    @Test
    public void forThirteen_shouldReturnTen() {
        //given
        EulerService euler = new EulerService();
        int x = 13;
        //when
        int calc = euler.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(10));
    }

    @Test
    public void forFifteen_shouldReturnTen() {
        //given
        EulerService euler = new EulerService();
        int x = 15;
        //when
        int calc = euler.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(10));
    }

    @Test
    public void forThirtyFour_shouldReturnFourtyFour() {
        //given
        EulerService euler = new EulerService();
        int x = 34;
        //when
        int calc = euler.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(44));
    }
}