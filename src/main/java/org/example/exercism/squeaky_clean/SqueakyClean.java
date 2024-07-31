package org.example.exercism.squeaky_clean;

public class SqueakyClean {

  public static String clean(String identifier) {
    if (identifier == null) {
      return null;
    }

    // Step 1: Replace whitespace with underscore
    identifier = identifier.replaceAll("\\s", "_");

    // Step 2: Convert kebab case to camel case
    identifier = convertKebabToCamelCase(identifier);

    // Step 3: Convert leetspeak to normal text
    identifier = convertLeetspeak(identifier);

    // Step 4: Convert characters that aren't letters or underscores
    identifier = identifier.replaceAll("[^a-zA-Z_]", "");

    return identifier;
  }

  private static String convertKebabToCamelCase(String str) {
    StringBuilder result = new StringBuilder();
    boolean convertNext = false;

    for (char c : str.toCharArray()) {
      if (c == '-') {
        convertNext = true;
      } else if (convertNext) {
        result.append(Character.toUpperCase(c));
        convertNext = false;
      } else {
        result.append(c);
      }
    }
    return result.toString();
  }

  private static String convertLeetspeak(String str) {
    return str.replace('0', 'o')
        .replace('3', 'e')
        .replace('1', 'l')
        .replace('7', 't')
        .replace('4', 'a');

  }

}
