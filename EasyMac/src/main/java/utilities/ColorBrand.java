/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.awt.Color;
/**
 *
 * @author melissa
 */
public enum ColorBrand {
    /**
     * The brown color for this branding
     */
    BRAND_BROWN(208, 101, 17),

    /**
     * The dark blue color for this branding
     */
    BRAND_DARKBLUE(34, 75, 154),

    /**
     * The yellow color for this branding
     */
    BRAND_YELLOW(232, 208, 51),

    /**
     * The light blue color for this branding
     */
    BRAND_LIGHTBLUE(97, 119, 160),

    /**
     * The white color for this branding
     */
    BRAND_WHITE(244, 245, 246);    

    private final int r;
    private final int g;
    private final int b;
    private final String rgb;

    private ColorBrand(final int r, final int g, final int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.rgb = r + ", " + g + ", " + b;
    }

    /**
     * Get the RGB value
     * @return int
     */
    public String getRGB() {
        return rgb;
    }

    /**
     * Get red component of a color
     * @return int
     */
    public int getRed() {
        return r;
    }

    /**
     * Get green component of a color
     * @return int
     */
    public int getGreen() {
        return g;
    }

    /**
     * Get blue component of color
     * @return int
     */
    public int getBlue() {
        return r;
    }

    //Or even these

    /**
     *
     * @return
     */
    public Color getColor() {
        return new Color(r, g, b);
    }

    /**
     * Return the alpha and RGB value
     * @return  int
     */
    public int getARGB() {
        return 0xFF000000 | ((r << 16) & 0x00FF0000) | ((g << 8) & 0x0000FF00) | b;
    }
    
}
