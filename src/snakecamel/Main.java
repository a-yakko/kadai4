package snakecamel;

public class Main {

	public static void main(String[] args) {
		System.out.println(SnakeCamelUtil.capitalize(""));
		System.out.println(SnakeCamelUtil.capitalize("a"));
		System.out.println(SnakeCamelUtil.capitalize("xyz"));
		System.out.println(SnakeCamelUtil.uncapitalize(""));
		System.out.println(SnakeCamelUtil.uncapitalize("A"));
		System.out.println(SnakeCamelUtil.uncapitalize("Xyz"));
		System.out.println(SnakeCamelUtil.snakeToCamelcase(""));
		System.out.println(SnakeCamelUtil.snakeToCamelcase("A"));
		System.out.println(SnakeCamelUtil.snakeToCamelcase("Xyz"));

	}

}
