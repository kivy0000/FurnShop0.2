package com.hspedu.furn;

import com.hspedu.furn.bean.Furn;
import com.hspedu.furn.mapper.FurnMapper;
import com.hspedu.furn.serivce.FurnService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 */
@SpringBootTest
public class ApplicationTest {

    //装配Mapper接口对象-是代理对象，在讲解Mybatis时，讲过的, 可以快速回顾
    @Resource
    private FurnMapper furnMapper;

    //装配Service对象
    @Resource
    private FurnService furnService;

    @Test
    public void testFurnMapper() {
        System.out.println("furnMapper--" + furnMapper.getClass());
        Furn furn = furnMapper.selectById(4);
        System.out.println("furn--" + furn);
    }
    @Test
    public void testFurnService() {
        List<Furn> furns = furnService.list();
        for (Furn furn : furns) {
            System.out.println("furn--" + furn);
        }
    }
}
