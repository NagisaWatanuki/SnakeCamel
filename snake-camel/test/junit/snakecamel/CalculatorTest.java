package junit.snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;


import snakecamel.SnakeCamelUtil;

public class CalculatorTest {

	@Test
	public void スネークケースの文字列をキャメルケースの文字列に変換する() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef";//変換後
		String actual = snake.snakeToCamelcase("abc_def");//変換前
		assertThat(actual,is(expected));
	}
	@Test
	public void キャメルケースの文字列をスネークケースの文字列に変換する() {
		SnakeCamelUtil camel = new SnakeCamelUtil();
		String expected = "abc_def";//正解
		String actual = camel.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));
	}

}
