import ij.ImagePlus;
import ij.process.ImageProcessor;
import ij.plugin.filter.PlugInFilter;
import java.awt.Color;

public class Histogram_Green implements PlugInFilter {

	public int setup(String arg, ImagePlus img) {
			return DOES_RGB;
		}
		
		public void run(ImageProcessor ip) {
			Color color;
			int[] Hist_arr = new int[256]; // 
			double[] Hist = new double[256];
			int w = ip.getWidth();
			int h = ip.getHeight();
			
			for (int v = 0; v < h; v++) {
				for (int u = 0; u < w; u++) {
					color = new Color(ip.getPixel(u, v));
					Hist_arr[color.getGreen()] = Hist_arr[color.getGreen()] + 1;
				}
			}
			
			 for (int i = 0; i < 256; i++) {
				 if(i == 0)
					 Hist[0] = Hist_arr[0];
				 
				 else 
					 Hist[i] = Hist[i - 1] + Hist_arr[i];
		           }
			
			 for (int i = 0; i < 256; i++) {
				 ij.IJ.log(String.valueOf(Hist[i]/Hist[255]) + ", ");
		           }
			}
		}
