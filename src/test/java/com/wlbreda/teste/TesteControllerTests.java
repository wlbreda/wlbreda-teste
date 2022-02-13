package com.wlbreda.teste;

import com.wlbreda.teste.controllers.TesteController;
import com.wlbreda.teste.models.Param2INT;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TesteControllerTests {

    @Test
    public void compareParamEquals() {
        Param2INT param = new Param2INT();
        param.setPrimeiro(0);
        param.setSegundo(0);
        String actual = new TesteController().compareParam(param);
        String expected = "0 igual a 0";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void compareParamSmaller() {
        Param2INT param = new Param2INT();
        param.setPrimeiro(0);
        param.setSegundo(10);
        String actual = new TesteController().compareParam(param);
        String expected = "0 menor que 10";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void compareParamBigger() {
        Param2INT param = new Param2INT();
        param.setPrimeiro(10);
        param.setSegundo(0);
        String actual = new TesteController().compareParam(param);
        String expected = "10 maior que 0";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void getParamReturn() {
        String str = "PAM";
        String actual = new TesteController().getParam(str);
        String expected = "pega então (" + str + ")";
        Assertions.assertEquals(expected,actual);
    }

}
