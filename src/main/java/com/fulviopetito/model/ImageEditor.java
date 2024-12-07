package com.fulviopetito.model;

/**
 * @author: Fulvio Petito
 * Interface to handle image editing
 */

 public interface ImageEditor
 {
    void loadImage(String inputPath);
    void saveImage(String outputPath);
    void applyChange();
 }