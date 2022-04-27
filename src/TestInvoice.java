import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInvoice {
	Invoice invoice = new Invoice(20);

	@Test
	void testIvaReduction() {
		invoice.ivaReduction();
		double actual = invoice.getTotal();
		double expected = 24.2;
		assertEquals(expected, actual);
	}
	
	@Test
	void testTotalIva() {
		invoice.totalIva();
		double actual = invoice.getTotal();
		double expected = 20.8;
		assertEquals(expected, actual);
	}

	@Test
	void testVipDiscount() {
		invoice.vipDiscount();
		double actual = invoice.getTotal();
		double expected = 18;
		assertEquals(expected, actual);
	}
}
