/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author CltControl
 */
public class Report {
    private String title;
    private String content;
    private String author;
    private String type; // PDF, Excel, Word

    private Report(ReportBuilder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.author = builder.author;
        this.type = builder.type;
    }

    public void generate() {
        System.out.println("Generating " + type + " Report");
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Author: " + author);
    }

    public static class ReportBuilder {
        private String title;
        private String content;
        private String author;
        private String type;

        public ReportBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public ReportBuilder setContent(String content) {
            this.content = content;
            return this;
        }

        public ReportBuilder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public ReportBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}
