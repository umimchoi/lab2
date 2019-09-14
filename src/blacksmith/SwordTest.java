package blacksmith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwordTest {
	Sword test1,test2,test3,test4,test5;
	// TODO Create Sword for each test case for more convenient
	@BeforeEach
	void setUp() throws  Exception {
		test1 = new Sword(10,20);
		test2 = new Sword(5,5);
		test3 = new Sword(-2,20);
		test4 = new Sword(10,-2);
		test5 = new Sword(-2,-2);
	}

	// TODO Test Sword constructor
	@Test
	void testSword() {
		assertEquals(10, test1.getAttack());
		assertEquals(5, test2.getAttack());
		assertEquals(20, test1.getDurability());
		assertEquals(5, test2.getDurability());
	}

	// TODO Test Sword constructor with negative attack
	@Test
	void testSwordNegativeAttack() {
		assertEquals(0, test3.getAttack());
		assertEquals(0, test5.getAttack());
	}

	// TODO Test Sword constructor with negative durability
	@Test
	void testSwordNegativeDurability() {
		assertEquals(1, test4.getDurability());
		assertEquals(1, test5.getDurability());
	}

	// TODO Test upgrade()
	@Test
	void testUpgrade() {
		test1.upgrade(20);
		assertEquals(30, test1.getAttack());
		assertEquals(21, test1.getDurability());
	}

	// TODO Test upgrade() with negative value
	@Test
	void testUpgradeNegative() {
		test4.upgrade(-10);
		assertEquals(0, test4.getAttack());
		assertEquals(2, test4.getDurability());
	}

	// TODO Test doParry()
	@Test
	void testDoParry() {
		assertEquals(30,test1.doParry(40));
		assertEquals(19, test1.getDurability());
	}

	// TODO Test doParry() with non positive attack
	@Test
	void testDoParryNonPositiveAttack() {
		assertEquals(0,test1.doParry(-3));
		assertEquals(19, test1.getDurability());
	}

	// TODO Test doParry() with attack <= Sword's attack ( fully parried )
	@Test
	void testDoParryFullyParried() {
		assertEquals(0,test1.doParry(10));
		assertEquals(19, test1.getDurability());
	}

	// TODO Test isBroken()
	@Test
	void testIsBroken() {
		test2.doParry(20);
		test2.doParry(2);
		test2.doParry(4);
		test2.doParry(26);
		test2.doParry(10);
		assertTrue(test2.isBroken());
	}

}
