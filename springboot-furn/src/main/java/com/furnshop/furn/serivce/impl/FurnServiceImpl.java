package com.hspedu.furn.serivce.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hspedu.furn.bean.Furn;
import com.hspedu.furn.mapper.FurnMapper;
import com.hspedu.furn.serivce.FurnService;
import org.springframework.stereotype.Service;

/**
 */
@Service
public class FurnServiceImpl
        extends ServiceImpl<FurnMapper, Furn>
        implements FurnService {
}
