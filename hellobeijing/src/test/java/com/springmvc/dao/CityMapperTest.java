package com.springmvc.dao;

import com.springmvc.entity.City;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import static org.junit.Assert.*;

public class CityMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private CityMapper mapper;

    @Before
    public void setUp() throws Exception {
        applicationContext =new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        mapper = applicationContext.getBean(CityMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws  Exception{
        City city = new City();
        city.setId(6000);
        city.setName("2");
        city.setCountrycode("PSE");
        city.setDistrict("4");
        city.setPopulation(5);
        int result = mapper.insert(city);
        System.out.println(result);
        assert (result == 1);
    }
}