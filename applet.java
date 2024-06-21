 import java.io.*;
importjava.awt.*;
importjava.applet.*;
importjava.util.*;
importjava.awt.image.*;
/*
<applet code="Bresenham" width=300 height=300>
</applet>*/
public class Bresenham extends Applet {

BufferedImage image = new BufferedImage(800, 800, BufferedImage.TYPE_INT_ARGB);
WritableRaster raster = image.getRaster();
int array[] = {255, 0, 0, 255};

public void init() {
setSize(300, 200);
repaint();
    }

public void paint(Graphics g) {
int dx, dy, x, y, k;
int x1 = 50, y1 = 50, x2 = 200, y2 = 180;

dx = x2 - x1;
dy = y2 - y1;

int p0 = 2 * dy - dx, p1;

        x = x1;
        y = y1;
raster.setPixel(x, y, array);
System.out.println("k = 0 : " + x + " " + y);

for(k = 1; k <= dx; k++) {
if(p0 < 0) {
                p1 = p0 + (2 * dy);
x++;
            } else {
                p1 = p0 + (2 * dy) - (2 * dx);
x++;
y++;
            }
raster.setPixel(x, y, array);
System.out.println("k = " + k + " : " + x + " " + y);
        }
g.drawImage(image, 0, 0, null);    
    }
}
