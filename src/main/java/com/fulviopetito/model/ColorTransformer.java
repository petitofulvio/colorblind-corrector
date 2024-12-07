package com.fulviopetito.model;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * @author: Fulvio Petito
 * Implements color change logic for images. It extends ImageEditor interface.
 */

 public class ColorTransformer implements ImageEditor
 {

    //fields
    private BufferedImage image;

    //methods
    @Override
    public void loadImage(String inputPath) throws IOException 
    {
        //validate inputPath
        inputPath = inputPath.toLowerCase();
        if    (inputPath.endsWith(".png")
            || inputPath.endsWith(".jpeg")
            || inputPath.endsWith("jpg"))
            {
                throw new IOException("Path does not lead to image");
            }
        
        File inputFile = new File(inputPath);  //convert from String to File
        setImage(ImageIO.read(inputFile));  //load as BufferedImage into variable image
        System.out.println("The following image has been loaded:" + inputPath);
    }

    @Override
    public void saveImage(String outputPath) throws IOException
    {
        if (getImage() == null) //if no image has been loaded
        {
            throw new IOException("No image loaded");
        }
        
        File outputFile = new File(outputPath);
        ImageIO.write(getImage(), "png", outputFile);
        System.out.println("Image saved successfully: " + outputPath);
    }

    @Override
    public void applyChange() 
    {
        //get image width and heigth
        int width = image.getWidth();
        int height = image.getHeight();
        
        //TODO iterate on each image pixel to check and change color

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'applyChange'");
    }

    //getters and setters
    public BufferedImage getImage()
    {
        return this.image;
    }

    public void setImage(BufferedImage newImage)
    {
        this.image = newImage;
    }
 }