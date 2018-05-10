package snakecamel;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void スネークからキャメル１() {
		String expected = "Ab";
		String actual = SnakeCamelUtil.snakeToCamelcase("ab");
		
		assertThat(actual,is(expected));
	}
	@Test
	public void スネークからキャメル２() {
		String expected = "AbCdEfg";
		String actual = SnakeCamelUtil.snakeToCamelcase("ab_cd_efg");
		
		assertThat(actual,is(expected));
	}
	

	@Test
	public void キャメルからスネーク１() {
		String expected = "ab";
		String actual = SnakeCamelUtil.camelToSnakecase("Ab");
		
		assertThat(actual,is(expected));
	}
	@Test
	public void キャメルからスネーク２() {
		String expected = "ab_cd_efg";
		String actual = SnakeCamelUtil.camelToSnakecase("AbCdEfg");
		
		assertThat(actual,is(expected));
	}

}
