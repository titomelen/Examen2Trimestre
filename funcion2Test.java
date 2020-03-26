import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class funcion2Test2 {

	@Test
	@DisplayName("Test de caja negra con valor máximo + 1")
	void testFuncion() {
		assertFalse (funcion2.funcion2(Integer.MAX_VALUE + 1));
	}

}
