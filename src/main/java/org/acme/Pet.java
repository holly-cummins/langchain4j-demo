package org.acme;

public record Pet(String name, String type, String colour, String hexColour, double weight, String description,
                  String diet, Animal animal) {
}
