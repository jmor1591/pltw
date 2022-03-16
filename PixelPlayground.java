import java.awt.Color;

public class PixelPlayground {
    
    
    public static void main(String[] args)

    {

        Picture beachPic = new Picture("water.jpg");

        beachPic.explore();

        Picture beachPicNoBlue = zeroBlue(beachPic);
        beachPicNoBlue = keepOnlyBlue(beachPic);
        beachPicNoBlue = negate(beachPic);
        beachPicNoBlue = grayScale(beachPic);
        beachPicNoBlue = fixUnderwater(beachPic);
        beachPicNoBlue = mirrorImageHor(beachPic);


        beachPicNoBlue.explore();

    }

    public static Picture zeroBlue(Picture myPicture) {
        Picture newPicture = new Picture(myPicture);
        Pixel[][] newPictureArray = newPicture.getPixels2D();
        //int width = newPicture.getWidth(); //or newPictureArray[0].length
        //int height = newPicture.getHeight(); //or newPictureArray.length

        /*
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                newPictureArray[row][col].setBlue(0);
            }
        }
        */

        for (Pixel[] row : newPictureArray) {
            for (Pixel col : row) {
                col.setBlue(0);
                //col.setGreen(0);
                //col.setRed(0);
            }
        }
        
        return newPicture;
    }

    public static Picture keepOnlyBlue(Picture myPicture) {
        Picture newPicture = new Picture(myPicture);
        Pixel[][] newPictureArray = newPicture.getPixels2D();
        //int width = newPicture.getWidth(); //or newPictureArray[0].length
        //int height = newPicture.getHeight(); //or newPictureArray.length

        /*
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                newPictureArray[row][col].setBlue(0);
            }
        }
        */

        for (Pixel[] row : newPictureArray) {
            for (Pixel col : row) {
                //col.setBlue(0);
                col.setGreen(0);
                col.setRed(0);
            }
        }
        
        return newPicture;
    }

    public static Picture negate(Picture myPicture) {
        Picture newPicture = new Picture(myPicture);
        Pixel[][] newPictureArray = newPicture.getPixels2D();
        //int width = newPicture.getWidth(); //or newPictureArray[0].length
        //int height = newPicture.getHeight(); //or newPictureArray.length

        /*
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                newPictureArray[row][col].setBlue(0);
            }
        }
        */

        for (Pixel[] row : newPictureArray) {
            for (Pixel col : row) {
                col.setBlue(255-col.getBlue());
                col.setGreen(255-col.getGreen());
                col.setRed(255-col.getRed());
            }
        }
        
        return newPicture;
    }

    public static Picture grayScale(Picture myPicture) {
        Picture newPicture = new Picture(myPicture);
        Pixel[][] newPictureArray = newPicture.getPixels2D();
        //int width = newPicture.getWidth(); //or newPictureArray[0].length
        //int height = newPicture.getHeight(); //or newPictureArray.length

        /*
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                newPictureArray[row][col].setBlue(0);
            }
        }
        */

        for (Pixel[] row : newPictureArray) {
            for (Pixel col : row) {
                int average = (col.getBlue() + col.getGreen() + col.getRed()) / 3;
                col.setBlue(average);
                col.setGreen(average);
                col.setRed(average);
            }
        }
        
        return newPicture;
    }

    public static Picture fixUnderwater(Picture myPicture) {
        Picture newPicture = new Picture(myPicture);
        Pixel[][] newPictureArray = newPicture.getPixels2D();
        //int width = newPicture.getWidth(); //or newPictureArray[0].length
        //int height = newPicture.getHeight(); //or newPictureArray.length

        /*
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                newPictureArray[row][col].setBlue(0);
            }
        }
        */

        for (Pixel[] row : newPictureArray) {
            for (Pixel col : row) {
                double mod = 1.1;
                if (col.getBlue() < col.getGreen())
                {
                    col.setRed(col.getRed() * 3);
                    //col.setBlue((int) (col.getBlue() / mod));
                    //col.setGreen((int) (col.getGreen() * mod));
                }
            }
        }
        
        return newPicture;
    }

    public static Picture mirrorImageHor(Picture myPicture) {
        Picture newPicture = new Picture(myPicture);
        Pixel[][] newPictureArray = newPicture.getPixels2D();
        //int width = newPicture.getWidth(); //or newPictureArray[0].length
        //int height = newPicture.getHeight(); //or newPictureArray.length
        Pixel[][] reverseArray = new Pixel[newPictureArray.length][newPictureArray[0].length];
        
        for (int row = 0; row < newPictureArray.length; row++) {
            for (int col = 0; col < newPictureArray[0].length / 2; col++) {
                reverseArray[row][col] = newPictureArray[row][col];
                k++;
            }
        }
        
        
        return newPicture;
    }
}
