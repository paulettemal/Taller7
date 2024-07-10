/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author CltControl
 */
public class FooterDecorator extends ReportDecorator {
    public FooterDecorator(ReportGenerator reportGenerator) {
        super(reportGenerator);
    }

    @Override
    public void generate() {
        super.generate();
        System.out.println("Adding Footer to the Report");
    }
}
