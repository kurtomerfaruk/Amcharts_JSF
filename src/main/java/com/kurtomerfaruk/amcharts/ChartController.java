/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kurtomerfaruk.amcharts;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Omer Faruk KURT
 * @Created on date 31/10/2016 13:23:25
 */
@ManagedBean
@ViewScoped
public class ChartController implements java.io.Serializable {

    private static final long serialVersionUID = 3455105191829156293L;

    private String dataStr;
    private List<Data> dataList;

    public ChartController() {
    }

    public String getDataStr() {
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }

    public List<Data> getDataList() {
        return dataList;
    }

    public void setDataList(List<Data> dataList) {
        this.dataList = dataList;
    }
    
    @PostConstruct
    public void init(){
        dataList = new ArrayList<>();
        
        dataList.add(new Data("Turkey", 100));
        dataList.add(new Data("Brasil", 90));
        dataList.add(new Data("Argentina", 80));
        dataList.add(new Data("Italy", 70));
        dataList.add(new Data("Belgium", 60));
        dataList.add(new Data("Germany", 50));
        dataList.add(new Data("Japan", 75));
        
        dataStr = new Gson().toJson(dataList);
    }
    
}
