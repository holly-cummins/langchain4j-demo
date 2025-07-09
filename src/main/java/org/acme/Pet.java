package org.acme;

public record Pet(String name, double weight, String description, Food diet, Animal animal, boolean vegetarian) {
}
