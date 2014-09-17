package com.canviara;

import org.primefaces.model.chart.PieChartModel;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean
public class chartView implements Serializable {

    private PieChartModel pieModel1;


    @PostConstruct
    public void init() {
        chartData();
    }

    public PieChartModel getpieModel1() {
        return pieModel1;
    }



    private void chartData() {
        pieModel1 = new PieChartModel();

        pieModel1.set("2011-12", 540);
        pieModel1.set("2012-13", 325);
        pieModel1.set("2013-14", 702);
        pieModel1.set("2014-15", 421);

        pieModel1.setTitle("Sales Volume");
        pieModel1.setLegendPosition("w");
    }


}