package com.example.springbootdemo1.service.impl;

import com.example.springbootdemo1.service.ICalcService;

public class CalcServiceImpl implements ICalcService {
    @Override
    public int increment(int i) {
        return ++i;
    }

    @Override
    public int decrement(int j) {
        return --j;
    }
}
