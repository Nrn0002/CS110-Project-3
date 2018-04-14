import java.awt.Color;
import java.awt.image.PixelGrabber;

public class ImageProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Doggo = null;
		ImageUtils utils = new ImageUtils();
		Color[][] originalImg = utils.loadImage("Src/LennaCV.png");
		Color[][] tab1 = utils.loadImage("Src/Canda2.jpg");

		utils.addImage(originalImg, "Original");
		utils.addImage(ohcanada(tab1,originalImg), "OhCanada");
		utils.addImage(LenaBLACK(originalImg), "Ultraviolence");
		utils.addImage(LenaInverted(originalImg), "Inverted");
		utils.addImage(LenaFun(originalImg), "ShadesofCool");



		
		utils.display();

	}

	public static Color[][] ohcanada(Color[][] Canada, Color[][] Image) {
		Color[][] canada = ImageUtils.cloneArray(Canada);
		Color[][] image = ImageUtils.cloneArray(Image);

		for (int row = 0; row < canada.length; row++) {
			for (int col = 0; col < canada[row].length; col++) {
				Color pixel = canada[row][col];
				
				if (pixel.getGreen() < 100) {
					image[row][col] = new Color(255,9,0);
				}
				
			}
		}
		return image;
	}
	
	public static Color[][] LenaBLACK(Color[][] Image) {
		Color[][] image = ImageUtils.cloneArray(Image);
		Color[][] lenared = ImageUtils.cloneArray(Image);

		for (int row = 0; row < lenared.length; row++) {
			for (int col = 0; col < lenared[row].length; col++) {
				Color pixel = lenared[row][col];
				
				if (pixel.getGreen() >  100 && pixel.getBlue() > 80) {
					image[row][col] = new Color(225,225,225);

				}
				

				if (pixel.getRed() >  105 && pixel.getRed() < 150) {
					image[row][col] = new Color(225,64,64);

				}
				
			
				

				
				if (pixel.getGreen() < 100 && pixel.getBlue() < 80) {
					image[row][col] = new Color(0,0,0);
				}
				
			}
		}
		return image;
	
}
	
	public static Color[][] LenaInverted(Color[][] Image) {
		Color[][] lenainverted = ImageUtils.cloneArray(Image);
		int r = 0;
		int g = 0;
		int b = 0;
		for (int row = 0; row < lenainverted.length; row++) {
			for (int col = 0; col < lenainverted[row].length; col++) {
				r = 255-lenainverted[row][col].getRed();
				g = 255-lenainverted[row][col].getGreen();
				b = 255-lenainverted[row][col].getBlue();

				
				lenainverted[row][col] = new Color(r,g,b);
			}
		}
		return lenainverted; 
	}
	
	public static Color[][] LenaFun(Color[][] Image) {
		Color[][] lenafun = ImageUtils.cloneArray(Image);
		int r = 0;
		int g = 0;
		int b = 0;
		for (int row = 0; row < lenafun.length; row++) {
			for (int col = 0; col < lenafun[row].length; col++) {
				r = lenafun[row][col].getRed();
				g = 25+lenafun[row][col].getGreen()/4;
				b = 25+lenafun[row][col].getBlue()/3;

				
				lenafun[row][col] = new Color(r,g,b);
			}
		}
		return lenafun; 
	}
}
	

