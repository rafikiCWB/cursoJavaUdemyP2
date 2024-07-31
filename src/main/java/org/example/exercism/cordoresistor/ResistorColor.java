package org.example.exercism.cordoresistor;

import java.util.LinkedHashMap;
import java.util.Map;

import static java.lang.System.out;

// A gente acha que existe e sofre por causa disso. Q? Existo logo sofro
// Fique sentado com você mesmo com o sentimento que tenta fujir o dia inteiro
class ResistorColor {
    private static final String[] COLOR_CODES = {
            "black", "brown", "red", "orange",
            "yellow", "green", "blue", "violet", "grey", "white"
    };

    public Map<String, Integer> getColorCodeMap() {
        Map<String, Integer> colorCode = new LinkedHashMap<>();
        colorCode.put("black", 0);
        colorCode.put("brown", 1);
        colorCode.put("red", 2);
        colorCode.put("orange", 3);
        colorCode.put("yellow", 4);
        colorCode.put("green", 5);
        colorCode.put("blue", 6);
        colorCode.put("violet", 7);
        colorCode.put("grey", 8);
        colorCode.put("white", 9);

        return colorCode;
    }

    public int colorCode(String color) {
        for (int i = 0; i < COLOR_CODES.length; i++) {
            if (COLOR_CODES[i].equalsIgnoreCase(color)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Invalid color: " + color);
    }

    public String[] colors() {
        // var resistorColor = new ResistorColor();
        // out.println("For percorrido a partir de um Array");
        // Map<String, Integer> colorMap = new LinkedHashMap<>();
        // for (String color : COLOR_CODES) {
        // colorMap.put(color, resistorColor.colorCode(color));
        // }
        // colorMap.forEach((color, code) -> out.println(color + ": " + code));
        //
        // out.println("For percorrido a partir de um Map/LinkedList");
        // for (Map.Entry<String, Integer> entry : getColorCodeMap().entrySet()) {
        // out.println(entry.getKey() + ": " + entry.getValue());
        // }
        return COLOR_CODES;
    }

    public static void main(String[] args) {
        var resistorColor = new ResistorColor();

        out.println("Value of Red: " + resistorColor.colorCode("red")); // Should print: 2

        resistorColor.colors();

        for (String colorCode : COLOR_CODES) {
            out.println(colorCode + ": " + resistorColor.colorCode(colorCode));

        }
    }
}
