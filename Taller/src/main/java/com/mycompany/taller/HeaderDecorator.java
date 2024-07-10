/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author CltControl
 */
public class HeaderDecorator extends ReportDecorator {
    public HeaderDecorator(ReportGenerator reportGenerator) {
        super(reportGenerator);
    }

    @Override
    public void generate() {
        super.generate();
        System.out.println("Adding Header to the Report");
    }
}
