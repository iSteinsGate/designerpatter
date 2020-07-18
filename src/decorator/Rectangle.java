package decorator;

import sun.security.provider.SHA;

/**
 * @author: tsinghui
 * @date: 2020-07-18 13:30
 **/
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
