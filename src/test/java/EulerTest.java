import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import pl.javastart.eulerdwa.service.Euler;

public class EulerTest {


    @Test
    public void shouldReturnFor13() {
        //given
        Euler euler = new Euler();
        int x = 13;
        //when
        int calc = euler.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(10));
    }

    @Test
    public void shouldReturnFor15() {
        //given
        Euler euler = new Euler();
        int x = 15;
        //when
        int calc = euler.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(10));
    }

    @Test
    public void shouldReturnFor34() {
        //given
        Euler euler = new Euler();
        int x = 34;
        //when
        int calc = euler.calc(x);
        //then
        Assert.assertThat(calc, CoreMatchers.is(44));
    }
}