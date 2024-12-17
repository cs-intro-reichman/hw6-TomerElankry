import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
		String fileName = args[0];
		int n = Integer.parseInt(args[2]);
		int m = Integer.parseInt(args[3]);
		// Reads the input image and creates an empty output image
		Color[][] sourceImng = Runigram.read(fileName);
		// Creates a canvas in which both images will be displayed, one after the other.
		// Next, displays the input image, and pauses for a few seconds. 
		// Finally, displays the output image.
		// (Notice that both images have the same dimensions).
		Runigram.setCanvas(sourceImng);
		Runigram.display(sourceImng);
		StdDraw.pause(300); 
		Runigram.display(Runigram.scaled(sourceImng, n, m));							
		//// This function is similar to the main function of Editor1.java			
	}
}

