import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.deitelChapter7.KnightsTour;

class KnightsTourTest {
	KnightsTour Knight;

	@BeforeEach
	void setUp()  {
		Knight = new KnightsTour();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testKnight() {
		int[] horizontal = {2,2,1,-2,1,1,2,-1};
		int[] vertical = {1,-1,2,1,2,-2,1,2};	
		Knight.moveKnight(horizontal, vertical);
		Knight.showBoard();
	}

}
