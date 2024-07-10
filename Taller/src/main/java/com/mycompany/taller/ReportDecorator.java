/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author CltControl
 */
public abstract class ReportDecorator implements ReportGenerator {
    protected ReportGenerator decoratedReportGenerator;

    public ReportDecorator(ReportGenerator reportGenerator) {
        this.decoratedReportGenerator = reportGenerator;
    }

    public void generate() {
        decoratedReportGenerator.generate();
    }
}
