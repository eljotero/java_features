package com.example.patternMatchingForInstanceof;

import com.example.patternMatchingForInstanceof.withDisplayName.DisplayNamed;
import com.example.patternMatchingForInstanceof.withNameShapes.Named;

public class ShapeDisplayNameResolver {

    public String resolveShape(Shape shape) {
        if (shape instanceof DisplayNamed displayNamed) {
            return displayNamed.getDisplayName();
        } else if (shape instanceof Named named) {
            return "This is " + named.getName() + " name!";
        }
        return "";
    }
}

// TIP: shape can be DisplayNamed or Named
// if shape is DisplayNamed use getDisplayName method
// if shape is Named use getName method and format it to expected display string
